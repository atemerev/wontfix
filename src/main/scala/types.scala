/*
 * Copyright (c) Miriam Laurel Sarl, 2011. Licensed under GNU Affero General Public License Version 3.
 * See LICENSE.txt for more details.
 */

package com.miriamlaurel.wontfix.types

import com.miriamlaurel.wontfix.numbers.Decimal
import java.util.{TimeZone, Date, Locale}
import java.text.SimpleDateFormat
import xml._

sealed abstract class FixValue[+T] {
  def value: T

  override def toString = value.toString
}

/*!## Integer types

Though FIX integers are unbounded and modeled as ASCII strings, we are going to use Scala's Int representation.
Quantities are covered with Decimal type, and for all other purposes the Int should be enough for everyone.
*/

case class Length(override val value: Int) extends FixValue[Int] {

  require(value > 0, "Only positive values are allowed")
}

case class TagNum(override val value: Int) extends FixValue[Int] {

  require(value > 0, "Only positive values are allowed")
}

case class SeqNum(override val value: Int) extends FixValue[Int] {

  require(value > 0, "Only positive values are allowed")
}

case class NumInGroup(override val value: Int) extends FixValue[Int] {

  require(value > 0, "Only positive values are allowed")
}

case class DayOfMonth(override val value: Int) extends FixValue[Int] {

  require(value >= 1 && value <= 31, "Only values of 1..31 are allowed")
}

/*!## "Float" (i.e. Decimal) types

Here we are going to use our very own Decimal implementation. It is based on Scala's BigDecimal, but stripped to
DECIMAL64 representation for performance and convenience purposes. Some useful scaling methods are also added.
*/
case class Qty(override val value: Decimal) extends FixValue[Decimal]

case class Price(override val value: Decimal) extends FixValue[Decimal]

case class PriceOffset(override val value: Decimal) extends FixValue[Decimal]

case class Amt(override val value: Decimal) extends FixValue[Decimal]

case class Percentage(override val value: Decimal) extends FixValue[Decimal] {

  override def toString = (value * 100).toString + "%"
}

/*!## "Char" types. There is only one char-based type, which is a boolean (go figure) */

case class FixBoolean(booleanValue: Boolean) extends FixValue[Char] {

  lazy val value = if (booleanValue) 'Y' else 'N'
}

/*!## "String" types, which are many */

case class MultipleCharValue(chars: Char*) extends FixValue[String] {
  lazy val value = chars.mkString
}

case class MultipleStringValue(strings: String*) extends FixValue[String] {
  require(strings.forall(! _.contains(" ")))

  lazy val value = strings.mkString(" ")
}

case class Country(override val value: String) extends FixValue[String] {
  require(Country.isCountryCode(value))
}

object Country {

  val codes = Locale.getISOCountries;

  def isCountryCode(string: String): Boolean = codes.contains(string)
}

case class Currency(override val value: String) extends FixValue[String] {
  require(Currency.isCurrencyCode(value))
}

object Currency {
  def isCurrencyCode(string: String): Boolean = try {
    java.util.Currency.getInstance(string)
    true
  } catch {
    case e: Exception => false
  }
}

/*! Todo: validate codes with ISO 10383 MIC codes list */
case class Exchange(override val value: String) extends FixValue[String] {
  require(value.matches("""^[A-Z]+$"""))
}

case class MonthYear(year: Int, month: Int, day: Option[Int], week: Option[Int]) extends FixValue[String] {

  require(year >= 0 && year <= 9999, "Year should be 0..9999")
  require(month >= 1 && month <= 12, "Month should be 1..12")
  require(day.isEmpty || day.get >= 1 && day.get <= 31, "Day should be 1..31, if defined")
  require(day.isEmpty || week.isEmpty, "Day and week cannot be both defined")

  def this(year: Int, month: Int) = this(year, month, None, None)
  def this(year: Int, month: Int, day: Int) = this(year, month, Some(day), None)

  lazy val value = {
    val dayString = day match {
      case Some(d) => "%02d".format(d)
      case None => ""
    }
    val weekString = week match {
      case Some(w) => "w%02d".format(w)
      case None => ""
    }
    "%04d%02d".format(year, month) + dayString + weekString
  }
}

/*! Technically we would need to clearly discriminate between .000 and no milliseconds at all, but in Wontfix,
I decided to screw it.
*/
case class UTCTimestamp(timestamp: Date) extends FixValue[String] with UTCUtil {
  lazy val value = if (timestamp.getTime % 1000 == 0) format.format(timestamp)
              else formatMillis.format(timestamp)
}

trait UTCUtil {
  val UTC = TimeZone.getTimeZone("UTC")

  val format = new SimpleDateFormat("yyyyMMdd-HH:mm:ss")
  format.setTimeZone(UTC)

  val formatMillis = new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSS")
  formatMillis.setTimeZone(UTC)
}

case class UTCTimeOnly(hour: Int, minute: Int, second: Int, millis: Int) extends FixValue[String] {
  require(hour >= 0 && hour <= 23, "Hours should be 0..23")
  require(minute >= 0 && minute <= 59, "Minutes should be 0..59")
  require(second >= 0 && second <= 59, "Seconds should be 0..59")
  require(millis >= 0 && millis <= 999, "Millis should be 0..999")

  lazy val value = {
    val millisString = if (millis == 0) "" else ".%03d".format(millis)
    "%02d:%02d:%02d".format(hour, minute, second) + millisString
  }
}

case class LocalMktDate(year: Int, month: Int, day: Int) extends FixValue[String] {
  require(year >= 0 && year <= 9999, "Year should be 0..9999")
  require(month >= 1 && month <= 12, "Month should be 1..12")
  require(day >= 1 && day <= 31, "Day should be 1..31")

  lazy val value = "%04d%02d%02d".format(year, month, day)
}

trait TZUtil {
  def offsetHour(offset: Long): Int = (offset / 3600000).intValue()
  def offsetMinute(offset: Long): Int = ((offset % 3600000) / 60000).intValue()
}

case class TZTimeOnly(hour: Int, minute: Int, second: Int, tz: TimeZone) extends FixValue[String] with TZUtil {

  require(hour >= 0 && hour <= 23, "Hours should be 0..23")
  require(minute >= 0 && minute <= 59, "Minutes should be 0..59")
  require(second >= 0 && second <= 59, "Seconds should be 0..59")

  lazy val value = {
    val timeString = "%02d:%02d:%02d".format(hour, minute, second)
    val offset = tz.getRawOffset
    val offsetString = if (offset == 0) "" else "%+02d".format(offsetHour(offset)) + "%02d".format(offsetMinute(offset))
    timeString + offsetString
  }
}

case class TZTimestamp(timestamp: Date, tz: TimeZone) extends FixValue[String] with TZUtil {
  private val format = if (timestamp.getTime % 1000 == 0) new SimpleDateFormat("yyyyMMdd-HH:mm:ss")
                         else new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSS")
  format.setTimeZone(tz)

  lazy val value = {
    val offset = tz.getRawOffset
    val sign = if (offset >= 0) "+" else "-"
    val timeZoneString = if (tz == TimeZone.getTimeZone("UTC")) "Z"
                         else sign + "%02d:%02d".format(offsetHour(offset), offsetMinute(offset))
    format.format(timestamp) + timeZoneString
  }
}

case class Data(data: Array[Byte]) extends FixValue[String] {

  def this(s: String) = this(s.getBytes)

  lazy val value = data.toString
  def length = data.length
}

case class XMLData(xml: Elem) extends FixValue[String] {

  def this(s: String) = this(XML.load(s))

  lazy val value = xml.toString
}

case class Language(override val value: String) extends FixValue[String] {
  // todo more strict ISO 639-1 check
  require(value.matches("""^[a-z][a-z]$"""), "Only ISO 639-1 language codes are supported")
}

abstract class Pattern[T] extends FixValue[T] {

  require(isValid, "Pattern validation failed")

  def isValid: Boolean
}

case class Tenor(override val value: String) extends Pattern[String] {
  def isValid = value.matches("""^[DMWY]\d+$""")
}

case class FixField(tag: TagNum, value: FixValue[Any]) {

  def this(tagNumber: Int, value: FixValue[Any]) = this(TagNum(tagNumber), value)

  lazy val tagNumber = tag.value

  override def toString = tagNumber.toString + "=" + value.toString
}
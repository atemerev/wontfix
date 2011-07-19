/*
 * WontFIX: A pragmatic Scala FIX engine.
 *
 * Copyright (C) 2011 Miriam Laurel Sarl.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.miriamlaurel.wontfix.types

import com.miriamlaurel.wontfix.numbers.Decimal
import java.util.{TimeZone, Date, Locale}
import java.text.SimpleDateFormat
import xml._
import java.nio.charset.Charset

sealed abstract class FixValue[+T] {
  def value: T

  override def toString = value.toString
}

/*!## Integer types

Though FIX integers are unbounded and modeled as ASCII strings, we are going to use Scala's Int representation.
Quantities are covered with Decimal type, and for all other purposes the Int should be enough for everyone.
*/

class FixInteger(override val value: Int) extends FixValue[Int]
object FixInteger {
  def apply(value: Int) = new FixInteger(value)
}

case class Length(length: Int) extends FixInteger(length) {

  require(length > 0, "Only positive values are allowed")
}

case class TagNum(number: Int) extends FixInteger(number) {
  require(number > 0, "Only positive values are allowed")
}

case class SeqNum(number: Int) extends FixInteger(number) {

  require(number > 0, "Only positive values are allowed")
}

case class NumInGroup(number: Int) extends FixInteger(number) {

  require(number > 0, "Only positive values are allowed")
}

case class DayOfMonth(day: Int) extends FixInteger(day) {

  require(day >= 1 && day <= 31, "Only values of 1..31 are allowed")
}

/*!## "Float" (i.e. Decimal) types

Here we are going to use our very own Decimal implementation. It is based on Scala's BigDecimal, but stripped to
DECIMAL64 representation for performance and convenience purposes. Some useful scaling methods are also added.
*/
class FixFloat(override val value: Decimal) extends FixValue[Decimal]
object FixFloat {
  def apply(value: Decimal) = new FixFloat(value)
}

case class Qty(quantity: Decimal) extends FixFloat(quantity)

case class Price(price: Decimal) extends FixFloat(price)

case class PriceOffset(offset: Decimal) extends FixFloat(offset)

case class Amt(amount: Decimal) extends FixFloat(amount)

case class Percentage(ratio: Decimal) extends FixFloat(ratio) {

  override def toString = (value * 100).toString + "%"
}

/*!## "Char" types. There is only one char-based type, which is a boolean (go figure) */

class FixChar(override val value: Char) extends FixValue[Char]
object FixChar {
  def apply(value: Char) = new FixChar(value)
}

case class FixBoolean(booleanValue: Boolean) extends FixChar(if (booleanValue) 'Y' else 'N')

/*!## "String" types, which are many */

class FixString(override val value: String) extends FixValue[String]
object FixString {
  def apply(value: String) = new FixString(value)
}

case class MultipleCharValue(chars: Char*) extends FixString(chars.mkString(" "))

case class MultipleStringValue(strings: String*) extends FixString(strings.mkString(" ")) {
  require(strings.forall(! _.contains(" ")))
}

case class Country(code: String) extends FixString(code) {
  require(Country.isCountryCode(code))
}

object Country {
  val codes = Locale.getISOCountries;
  def isCountryCode(string: String): Boolean = codes.contains(string)
}

case class Currency(code: String) extends FixString(code) {
  require(Currency.isCurrencyCode(code))
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
case class Exchange(code: String) extends FixString(code) {
  require(code.matches("""^[A-Z]+$"""))
}

case class MonthYear(year: Int, month: Int, day: Option[Int], week: Option[Int]) extends FixString({
  // So, you need a non-trivial second constructor? Can do!
  val dayString = day match {
    case Some(d) => "%02d".format(d)
    case None => ""
  }
  val weekString = week match {
    case Some(w) => "w%02d".format(w)
    case None => ""
  }
  "%04d%02d".format(year, month) + dayString + weekString
}) {

  require(year >= 0 && year <= 9999, "Year should be 0..9999")
  require(month >= 1 && month <= 12, "Month should be 1..12")
  require(day.isEmpty || day.get >= 1 && day.get <= 31, "Day should be 1..31, if defined")
  require(day.isEmpty || week.isEmpty, "Day and week cannot be both defined")

  def this(year: Int, month: Int) = this(year, month, None, None)
  def this(year: Int, month: Int, day: Int) = this(year, month, Some(day), None)

}

/*! Technically we would need to clearly discriminate between .000 and no milliseconds at all, but in Wontfix,
I decided to screw it.
*/
case class UTCTimestamp(timestamp: Date) extends FixString(
  if (timestamp.getTime % 1000 == 0) UTCUtil.format.format(timestamp)
              else UTCUtil.formatMillis.format(timestamp)
)

object UTCUtil {
  val UTC = TimeZone.getTimeZone("UTC")

  val format = new SimpleDateFormat("yyyyMMdd-HH:mm:ss")
  format.setTimeZone(UTC)

  val formatMillis = new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSS")
  formatMillis.setTimeZone(UTC)
}

case class UTCTimeOnly(hour: Int, minute: Int, second: Int, millis: Int) extends FixString({
  val millisString = if (millis == 0) "" else ".%03d".format(millis)
  "%02d:%02d:%02d".format(hour, minute, second) + millisString
}) {
  require(hour >= 0 && hour <= 23, "Hours should be 0..23")
  require(minute >= 0 && minute <= 59, "Minutes should be 0..59")
  require(second >= 0 && second <= 59, "Seconds should be 0..59")
  require(millis >= 0 && millis <= 999, "Millis should be 0..999")
}

case class LocalMktDate(year: Int, month: Int, day: Int) extends FixString("%04d%02d%02d".format(year, month, day)) {
  require(year >= 0 && year <= 9999, "Year should be 0..9999")
  require(month >= 1 && month <= 12, "Month should be 1..12")
  require(day >= 1 && day <= 31, "Day should be 1..31")
}

object TZUtil {
  def offsetHour(offset: Long): Int = (offset / 3600000).intValue()
  def offsetMinute(offset: Long): Int = ((offset % 3600000) / 60000).intValue()
}

case class TZTimeOnly(hour: Int, minute: Int, second: Int, tz: TimeZone) extends FixString({
  val timeString = "%02d:%02d:%02d".format(hour, minute, second)
  val offset = tz.getRawOffset
  val offsetString = if (offset == 0) "" else "%+02d".format(TZUtil.offsetHour(offset)) +
    "%02d".format(TZUtil.offsetMinute(offset))
  timeString + offsetString
}) {

  require(hour >= 0 && hour <= 23, "Hours should be 0..23")
  require(minute >= 0 && minute <= 59, "Minutes should be 0..59")
  require(second >= 0 && second <= 59, "Seconds should be 0..59")
}

case class TZTimestamp(timestamp: Date, tz: TimeZone) extends FixString({
  val format = if (timestamp.getTime % 1000 == 0) new SimpleDateFormat("yyyyMMdd-HH:mm:ss")
                         else new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSS")
  format.setTimeZone(tz)
  val offset = tz.getRawOffset
  val sign = if (offset >= 0) "+" else "-"
  val timeZoneString = if (tz == TimeZone.getTimeZone("UTC")) "Z"
                       else sign + "%02d:%02d".format(TZUtil.offsetHour(offset), TZUtil.offsetMinute(offset))
  format.format(timestamp) + timeZoneString
})

case class Data(data: Array[Byte]) extends FixString(new String(data, Charset.forName("UTF-8"))) {

  def this(s: String) = this(s.getBytes)

  def length = data.length
}

case class XMLData(xml: Elem) extends FixString(xml.toString) {

  def this(s: String) = this(XML.load(s))
}

case class Language(code: String) extends FixString(code) {
  // todo more strict ISO 639-1 check
  require(code.matches("""^[a-z][a-z]$"""), "Only ISO 639-1 language codes are supported")
}

abstract class Pattern[T] extends FixValue[T] {

  require(isValid, "Pattern validation failed")

  def isValid: Boolean
}

case class Tenor(override val value: String) extends Pattern[String] {
  def isValid = value.matches("""^[DMWY]\d+$""")
}

sealed trait FixElement {
  def flatten: List[FixField]
  override def toString: String = flatten.map(field => field.toString).mkString(" | ")
}

case class FixField(tag: TagNum, value: FixValue[Any]) extends FixElement {

  def this(tagNumber: Int, value: FixValue[Any]) = this(TagNum(tagNumber), value)

  lazy val tagNumber = tag.value

  override def toString: String = tagNumber.toString + "=" + value.toString

  def flatten = List(this)
}

object FixField {
  def apply(tagNumber: Int, value: FixValue[Any]) = new FixField(TagNum(tagNumber), value)
  def apply(tagNumber: Int, value: Int) = new FixField(TagNum(tagNumber), FixInteger(value))
  def apply(tagNumber: Int, value: Decimal) = new FixField(TagNum(tagNumber), FixFloat(value))
  def apply(tagNumber: Int, value: Char) = new FixField(TagNum(tagNumber), FixChar(value))
  def apply(tagNumber: Int, value: String) = new FixField(TagNum(tagNumber), FixString(value))
}

case class FixRepeatingGroup(groupTag: TagNum, groups: List[FixElement]*) extends FixElement {

  require(groups.forall(e => e.size > 0 && e(0).isInstanceOf[FixField]) &&
    groups.map(_(0).asInstanceOf[FixField].tagNumber).toSet.size == 1,
      "Group validation failed")

  def size = groups.length

  lazy val flatten = FixField(groupTag, NumInGroup(size)) :: groups.flatten.map(_.flatten).flatten.toList
}
object FixRepeatingGroup {
  def apply(groupNumber: Int, groups: List[FixElement]*) = new FixRepeatingGroup(TagNum(groupNumber), groups: _*)
}

case class FixStructure(elements: FixElement*) extends FixElement {
  lazy val flatten = elements.map(_.flatten).flatten.toList
}

case class FixMessage(msgType: String, structure: FixStructure)
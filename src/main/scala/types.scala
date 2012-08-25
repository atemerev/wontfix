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

case class ParseError(message: String) extends RuntimeException(message)

trait SerializableBytes {
  val ASCII = Charset.forName("US-ASCII")
  def toBytes: Array[Byte]
}

trait DeserializableBytes[T] {
  val ASCII = Charset.forName("US-ASCII")
  def apply(data: Array[Byte]): T
}

sealed abstract class FixValue[+T] extends SerializableBytes {
  def value: T

  override def toString = value.toString
  def toBytes = toString.getBytes(ASCII)
}

/*!## Integer types

Though FIX integers are unbounded and modeled as ASCII strings, we are going to use Scala's Int representation.
Quantities are covered with Decimal type, and for all other purposes the Int should be enough for everyone.
*/

class FixInteger(override val value: Int) extends FixValue[Int] {
  override def equals(other: Any): Boolean = other match {
    case f: FixInteger => value.equals(f.value)
    case _ => false
  }

  override def hashCode() = value.hashCode()
}

object FixInteger extends DeserializableBytes[FixInteger] {
  def apply(value: Int) = new FixInteger(value)
  def apply(data: Array[Byte]) = new FixInteger(new String(data, ASCII).toInt)
}

case class Length(length: Int) extends FixInteger(length) {
  require(length > 0, "Only positive values are allowed")
}
object Length extends DeserializableBytes[Length] {
  def apply(data: Array[Byte]) = Length(new String(data, ASCII).toInt)
}

case class TagNum(number: Int) extends FixInteger(number) {
  require(number > 0, "Only positive values are allowed")
}
object TagNum extends DeserializableBytes[TagNum] {
  def apply(data: Array[Byte]) = TagNum(new String(data, ASCII).toInt)
}

case class SeqNum(number: Int) extends FixInteger(number) {
  require(number > 0, "Only positive values are allowed")
}
object SeqNum extends DeserializableBytes[SeqNum] {
  def apply(data: Array[Byte]) = SeqNum(new String(data, ASCII).toInt)
}

case class NumInGroup(number: Int) extends FixInteger(number) {
  require(number > 0, "Only positive values are allowed")
}
object NumInGroup extends DeserializableBytes[NumInGroup] {
  def apply(data: Array[Byte]) = NumInGroup(new String(data, ASCII).toInt)
}

case class DayOfMonth(day: Int) extends FixInteger(day) {
  require(day >= 1 && day <= 31, "Only values of 1..31 are allowed")
}
object DayOfMonth extends DeserializableBytes[DayOfMonth] {
  def apply(data: Array[Byte]) = DayOfMonth(new String(data, ASCII).toInt)
}

/*!## "Float" (i.e. Decimal) types

Here we are going to use our very own Decimal implementation. It is based on Scala's BigDecimal, but stripped to
DECIMAL64 representation for performance and convenience purposes. Some useful scaling methods are also added.
*/
class FixFloat(override val value: Decimal) extends FixValue[Decimal] {
  override def equals(other: Any) = other match {
    case f: FixFloat => value.equals(f.value)
    case _ => false
  }

  override def hashCode = value.hashCode
}

object FixFloat extends DeserializableBytes[FixFloat] {
  def apply(value: Decimal) = new FixFloat(value)
  def apply(data: Array[Byte]) = FixFloat(Decimal(new String(data, ASCII)))
}

case class Qty(quantity: Decimal) extends FixFloat(quantity)
object Qty extends DeserializableBytes[Qty] {
  def apply(data: Array[Byte]) = Qty(Decimal(new String(data, ASCII)))
}

case class Price(price: Decimal) extends FixFloat(price)
object Price extends DeserializableBytes[Price] {
  def apply(data: Array[Byte]) = Price(Decimal(new String(data, ASCII)))
}

case class PriceOffset(offset: Decimal) extends FixFloat(offset)
object PriceOffset extends DeserializableBytes[PriceOffset] {
  def apply(data: Array[Byte]) = PriceOffset(Decimal(new String(data, ASCII)))
}

case class Amt(amount: Decimal) extends FixFloat(amount)
object Amt extends DeserializableBytes[Amt] {
  def apply(data: Array[Byte]) = Amt(Decimal(new String(data, ASCII)))
}

case class Percentage(ratio: Decimal) extends FixFloat(ratio) {
  override def toString = (value * 100).toString + "%"
}
object Percentage extends DeserializableBytes[Percentage] {
  def apply(data: Array[Byte]) = Percentage(Decimal(new String(data, ASCII)))
}

/*!## "Char" types. There is only one char-based type, which is a boolean (go figure) */

class FixChar(override val value: Char) extends FixValue[Char] {
  override def equals(other: Any) = other match {
    case c: FixChar => c.value == value
    case _ => false
  }
  override def hashCode = value.hashCode()
}

object FixChar extends DeserializableBytes[FixChar] {
  def apply(value: Char) = new FixChar(value)
  def apply(data: Array[Byte]) = FixChar(data(0).toChar)
}

case class FixBoolean(booleanValue: Boolean) extends FixChar(if (booleanValue) 'Y' else 'N')
object FixBoolean extends DeserializableBytes[FixBoolean] {
  def apply(data: Array[Byte]) = if (data(0).toChar == 'Y') FixBoolean(true) else
    if (data(0).toChar == 'N') FixBoolean(false) else
    throw ParseError("Invalid boolean char: " + data(0))
}

/*!## "String" types, which are many */

class FixString(override val value: String) extends FixValue[String] {
  override def equals(other: Any) = other match {
    case s: FixString => value.equals(s.value)
    case _ => false
  }
  override def hashCode() = value.hashCode()
}

object FixString extends DeserializableBytes[FixString] {
  def apply(value: String) = new FixString(value)
  def apply(data: Array[Byte]) = FixString(new String(data, ASCII))
}

case class MultipleCharValue(chars: Char*) extends FixString(chars.mkString(" "))
object MultipleCharValue extends DeserializableBytes[MultipleCharValue] {
  def apply(data: Array[Byte]) = MultipleCharValue((new String(data, ASCII)).split(" ").map(_.toCharArray()(0)): _*)
}

case class MultipleStringValue(strings: String*) extends FixString(strings.mkString(" ")) {
  require(strings.forall(! _.contains(" ")))
}
object MultipleStringValue extends DeserializableBytes[MultipleStringValue] {
  def apply(data: Array[Byte]) = MultipleStringValue((new String(data, ASCII)).split(" "): _*)
}

case class Country(code: String) extends FixString(code) {
  require(Country.isCountryCode(code))
}
object Country extends DeserializableBytes[Country] {
  val codes = Locale.getISOCountries
  def apply(data: Array[Byte]) = Country(new String(data, ASCII))
  def isCountryCode(string: String): Boolean = codes.contains(string)
}

case class Currency(code: String) extends FixString(code) {
  require(Currency.isCurrencyCode(code))
}
object Currency extends DeserializableBytes[Currency] {
  def apply(data: Array[Byte]) = Currency(new String(data, ASCII))
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
object Exchange extends DeserializableBytes[Exchange] {
  def apply(data: Array[Byte]) = Exchange(new String(data, ASCII))
}

case class MonthYear(year: Int, month: Int, day: Option[Int] = None, week: Option[Int] = None) extends FixString({
  // So, you need a non-trivial second constructor? Can do!
  val dayString = day match {
    case Some(d) => "%02d".format(d)
    case None => ""
  }
  val weekString = week match {
    case Some(w) => "w%01d".format(w)
    case None => ""
  }
  "%04d%02d".format(year, month) + dayString + weekString
}) {

  require(year >= 0 && year <= 9999, "Year should be 0..9999")
  require(month >= 1 && month <= 12, "Month should be 1..12")
  require(day.isEmpty || day.get >= 1 && day.get <= 31, "Day should be 1..31, if defined")
  require(week.isEmpty || week.get >= 1 && week.get <= 5, "Week should be 1..5, if defined")
  require(day.isEmpty || week.isEmpty, "Day and week cannot be both defined")
}
object MonthYear extends DeserializableBytes[MonthYear] {
  def apply(data: Array[Byte]) = try {
    val v = new String(data, ASCII)
    val Extractor = """^(\d\d\d\d)(\d\d)(\d\d|w\d)?$""".r
    val Extractor(year, month, dayOrWeek) = v
    if (dayOrWeek.matches("^$")) MonthYear(year.toInt, month.toInt, None, None) else
    if (dayOrWeek.matches("^\\d\\d$")) MonthYear(year.toInt, month.toInt, Some(dayOrWeek.toInt), None) else
    if (dayOrWeek.matches("^w\\d$")) MonthYear(year.toInt, month.toInt, None, Some(dayOrWeek.substring(1).toInt))
    else throw ParseError("Unknown MonthYear value: " + v)
  } catch {case e: Exception => throw new ParseError(e.getMessage)}
}

/*! Technically we would need to clearly discriminate between .000 and no milliseconds at all, but in Wontfix,
I decided to screw it.
*/
case class UTCTimestamp(timestamp: Date) extends FixString(
  if (timestamp.getTime % 1000 == 0) UTCUtil.format.format(timestamp)
              else UTCUtil.formatMillis.format(timestamp)
)
object UTCTimestamp extends DeserializableBytes[UTCTimestamp] {
  def apply(data: Array[Byte]) = try {
    val v = new String(data, ASCII)
    val ts = if (v.matches("\\.\\d+$")) UTCUtil.formatMillis.parse(v) else UTCUtil.format.parse(v)
    UTCTimestamp(ts)
  } catch {case e: Exception => throw new ParseError(e.getMessage)}
}
object UTCUtil {
  val UTC = TimeZone.getTimeZone("UTC")

  val format = new SimpleDateFormat("yyyyMMdd-HH:mm:ss")
  format.setTimeZone(UTC)

  val formatMillis = new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSS")
  formatMillis.setTimeZone(UTC)
}

case class UTCDateOnly(year: Int, month: Int, day: Int) extends FixString("%04d%02d%02d".format(year, month, day)) {
  require(year >= 0 && year <= 9999, "Year should be 0..9999")
  require(month >= 1 && month <= 12, "Month should be 1..12")
  require(day >= 1 && day <= 31, "Day should be 1..31")
}
object UTCDateOnly extends DeserializableBytes[LocalMktDate] {
  def apply(data: Array[Byte]) = try {
    val v = new String(data, ASCII)
    val Extractor = """^(\d\d\d\d)(\d\d)(\d\d)$""".r
    val Extractor(year, month, day) = v
    LocalMktDate(year.toInt, month.toInt, day.toInt)
  } catch {case e: Exception => throw new ParseError(e.getMessage)}
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
object UTCTimeOnly extends DeserializableBytes[UTCTimeOnly] {
  def apply(data: Array[Byte]) = try {
    val v = new String(data, ASCII)
    val Extractor = """^(\d\d):(\d\d):(\d\d)\.?(\d\d\d)?$""".r
    val Extractor(hour, minute, second, millis) = v
    UTCTimeOnly(hour.toInt, minute.toInt, second.toInt, if (millis == "") 0 else millis.toInt)
  } catch {case e: Exception => throw new ParseError(e.getMessage)}
}

case class LocalMktDate(year: Int, month: Int, day: Int) extends FixString("%04d%02d%02d".format(year, month, day)) {
  require(year >= 0 && year <= 9999, "Year should be 0..9999")
  require(month >= 1 && month <= 12, "Month should be 1..12")
  require(day >= 1 && day <= 31, "Day should be 1..31")
}
object LocalMktDate extends DeserializableBytes[LocalMktDate] {
  def apply(data: Array[Byte]) = try {
    val v = new String(data, ASCII)
    val Extractor = """^(\d\d\d\d)(\d\d)(\d\d)$""".r
    val Extractor(year, month, day) = v
    LocalMktDate(year.toInt, month.toInt, day.toInt)
  } catch {case e: Exception => throw new ParseError(e.getMessage)}
}
object TZUtil {
  def offsetHour(offset: Long): Int = (offset / 3600000).intValue()
  def offsetMinute(offset: Long): Int = ((offset % 3600000) / 60000).intValue()
}

case class TZTimeOnly(hour: Int, minute: Int, second: Int, tz: TimeZone) extends FixString({
  val timeString = "%02d:%02d:%02d".format(hour, minute, second)
  val offset = tz.getRawOffset
  val sign = if (offset >= 0) "+" else "-"
  val offsetString = if (offset == 0) "Z" else sign + "%02d".format(TZUtil.offsetHour(offset)) +
    ":%02d".format(TZUtil.offsetMinute(offset))
  timeString + offsetString
}) {
  require(hour >= 0 && hour <= 23, "Hours should be 0..23")
  require(minute >= 0 && minute <= 59, "Minutes should be 0..59")
  require(second >= 0 && second <= 59, "Seconds should be 0..59")
}
object TZTimeOnly extends DeserializableBytes[TZTimeOnly] {
  def apply(data: Array[Byte]) = try {
    val v = new String(data, ASCII)
    val Extractor = """^(\S+?)(Z|\+\d\d\:\d\d|\-\d\d\:\d\d)$""".r
    val Extractor(time, tzString) = v
    val TimeExtractor = """^(\d\d):(\d\d):(\d\d)$""".r
    val TimeExtractor(hour, minute, second) = time
    val tz = TimeZone.getTimeZone("GMT" + tzString)
    TZTimeOnly(hour.toInt, minute.toInt, second.toInt, tz)
  } catch {case e: Exception => throw new ParseError(e.getMessage)}
}

case class TZTimestamp(timestamp: Date, tz: TimeZone) extends FixString({
  val format = if (timestamp.getTime % 1000 == 0) new SimpleDateFormat("yyyyMMdd-HH:mm:ss")
                         else new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSS")
  format.setTimeZone(tz)
  val offset = tz.getRawOffset
  val sign = if (offset >= 0) "+" else "-"
  val timeZoneString = if (offset == 0) "Z"
                       else sign + "%02d:%02d".format(TZUtil.offsetHour(offset), TZUtil.offsetMinute(offset))
  format.format(timestamp) + timeZoneString
})
object TZTimestamp extends DeserializableBytes[TZTimestamp] {
  def apply(data: Array[Byte]) = try {
    val v = new String(data, ASCII)
    val Extractor = """^(\S+?)(Z|\+\d\d\:\d\d|\-\d\d\:\d\d)$""".r
    val Extractor(time, tzString) = v
    val tz = TimeZone.getTimeZone("GMT" + tzString)
    val format = if (time.matches("^\\S+\\.\\d+$")) new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSS")
                           else new SimpleDateFormat("yyyyMMdd-HH:mm:ss")
    format.setTimeZone(tz)
    val ts = format.parse(time)
    TZTimestamp(ts, tz)
  } catch {case e: Exception => throw new ParseError(e.getMessage)}
}

case class Data(data: Array[Byte]) extends FixString(new String(data, Charset.forName("UTF-8"))) {
  def length = data.length
}
object Data extends DeserializableBytes[Data] {
  def apply(s: String): Data = Data(s.getBytes(ASCII))
}

case class XMLData(xml: Elem) extends FixString(xml.toString)
object XMLData extends DeserializableBytes[XMLData] {
  def apply(s: String): XMLData = XMLData(XML.loadString(s))
  def apply(data: Array[Byte]): XMLData = XMLData(new String(data, ASCII))
}

case class Language(code: String) extends FixString(code) {
  // todo more strict ISO 639-1 check
  require(code.matches("""^[a-z][a-z]$"""), "Only ISO 639-1 language codes are supported")
}
object Language extends DeserializableBytes[Language] {
  def apply(data: Array[Byte]) = Language(new String(data, ASCII))
}

abstract class Pattern[T] extends FixValue[T] {
  require(isValid, "Pattern validation failed")
  def isValid: Boolean
}

case class Tenor(override val value: String) extends Pattern[String] {
  def isValid = value.matches("""^[DMWY]\d+$""")
}
object Tenor extends DeserializableBytes[Tenor] {
  def apply(data: Array[Byte]) = Tenor(new String(data, ASCII))
}
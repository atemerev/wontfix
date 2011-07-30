package com.miriamlaurel.wontfix.fix50.fields

import com.miriamlaurel.wontfix.structure._
import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.numbers.Decimal
import java.util.Date
import java.util.TimeZone

case class Account(s: String) extends FixField(1, types.FixString(s))

case class AdvId(s: String) extends FixField(2, types.FixString(s))

case class AdvRefID(s: String) extends FixField(3, types.FixString(s))

case class AdvSide(c: Char) extends FixField(4, types.FixChar(c))
object AdvSide {
  val BUY = AdvSide('B')
  val SELL = AdvSide('S')
  val CROSS = AdvSide('X')
  val TRADE = AdvSide('T')
}

case class AdvTransType(s: String) extends FixField(5, types.FixString(s))
object AdvTransType {
  val NEW = AdvTransType("N")
  val CANCEL = AdvTransType("C")
  val REPLACE = AdvTransType("R")
}

case class AvgPx(price: Decimal) extends FixField(6, types.Price(price))

case class BeginSeqNo(seqNum: Int) extends FixField(7, types.SeqNum(seqNum))

case class BeginString(s: String) extends FixField(8, types.FixString(s))

case class BodyLength(length: Int) extends FixField(9, types.Length(length))

case class CheckSum(s: String) extends FixField(10, types.FixString(s))

case class ClOrdID(s: String) extends FixField(11, types.FixString(s))

case class Commission(amount: Decimal) extends FixField(12, types.Amt(amount))

case class CommType(c: Char) extends FixField(13, types.FixChar(c))
object CommType {
  val PER_UNIT = CommType('1')
  val PERCENTAGE = CommType('2')
  val ABSOLUTE = CommType('3')
  val PERCENTAGE_WAIVED_CASH_DISCOUNT = CommType('4')
  val PERCENTAGE_WAIVED_ENHANCED_UNITS = CommType('5')
  val POINTS_PER_BOND_OR_OR_CONTRACT = CommType('6')
}

case class CumQty(qty: Decimal) extends FixField(14, types.Qty(qty))

case class Currency(code: String) extends FixField(15, types.Currency(code))

case class EndSeqNo(seqNum: Int) extends FixField(16, types.SeqNum(seqNum))

case class ExecID(s: String) extends FixField(17, types.FixString(s))

case class ExecInst(chars: Char*) extends FixField(18, types.MultipleCharValue(chars: _*))
object ExecInst {
  val STAY_ON_OFFERSIDE = ExecInst('0')
  val NOT_HELD = ExecInst('1')
  val WORK = ExecInst('2')
  val GO_ALONG = ExecInst('3')
  val OVER_THE_DAY = ExecInst('4')
  val HELD = ExecInst('5')
  val PARTICIPATE_DONT_INITIATE = ExecInst('6')
  val STRICT_SCALE = ExecInst('7')
  val TRY_TO_SCALE = ExecInst('8')
  val STAY_ON_BIDSIDE = ExecInst('9')
  val NO_CROSS = ExecInst('A')
  val OK_TO_CROSS = ExecInst('B')
  val CALL_FIRST = ExecInst('C')
  val PERCENT_OF_VOLUME = ExecInst('D')
  val DO_NOT_INCREASE = ExecInst('E')
  val DO_NOT_REDUCE = ExecInst('F')
  val ALL_OR_NONE = ExecInst('G')
  val REINSTATE_ON_SYSTEM_FAILURE = ExecInst('H')
  val INSTITUTIONS_ONLY = ExecInst('I')
  val REINSTATE_ON_TRADING_HALT = ExecInst('J')
  val CANCEL_ON_TRADING_HALT = ExecInst('K')
  val LAST_PEG = ExecInst('L')
  val MID_PRICE = ExecInst('M')
  val NON_NEGOTIABLE = ExecInst('N')
  val OPENING_PEG = ExecInst('O')
  val MARKET_PEG = ExecInst('P')
  val CANCEL_ON_SYSTEM_FAILURE = ExecInst('Q')
  val PRIMARY_PEG = ExecInst('R')
  val SUSPEND = ExecInst('S')
  val FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER = ExecInst('T')
  val CUSTOMER_DISPLAY_INSTRUCTION = ExecInst('U')
  val NETTING = ExecInst('V')
  val PEG_TO_VWAP = ExecInst('W')
  val TRADE_ALONG = ExecInst('X')
  val TRY_TO_STOP = ExecInst('Y')
  val CANCEL_IF_NOT_BEST = ExecInst('Z')
  val TRAILING_STOP_PEG = ExecInst('a')
  val STRICT_LIMIT = ExecInst('b')
  val IGNORE_PRICE_VALIDITY_CHECKS = ExecInst('c')
  val PEG_TO_LIMIT_PRICE = ExecInst('d')
  val WORK_TO_TARGET_STRATEGY = ExecInst('e')
  val INTERMARKET_SWEEP = ExecInst('f')
  val EXTERNAL_ROUTING_ALLOWED = ExecInst('g')
  val EXTERNAL_ROUTING_NOT_ALLOWED = ExecInst('h')
  val IMBALANCE_ONLY = ExecInst('i')
  val SINGLE_EXECUTION_REQUESTED_FOR_BLOCK_TRADE = ExecInst('j')
  val BEST_EXECUTION = ExecInst('k')
}

case class ExecRefID(s: String) extends FixField(19, types.FixString(s))

case class ExecTransType(c: Char) extends FixField(20, types.FixChar(c))
object ExecTransType {
  val NEW = ExecTransType('0')
  val CANCEL = ExecTransType('1')
  val CORRECT = ExecTransType('2')
  val STATUS = ExecTransType('3')
}

case class HandlInst(c: Char) extends FixField(21, types.FixChar(c))
object HandlInst {
  val AUTOMATED_EXECUTION_ORDER_PRIVATE = HandlInst('1')
  val AUTOMATED_EXECUTION_ORDER_PUBLIC = HandlInst('2')
  val MANUAL_ORDER = HandlInst('3')
}

case class SecurityIDSource(s: String) extends FixField(22, types.FixString(s))
object SecurityIDSource {
  val CUSIP = SecurityIDSource("1")
  val SEDOL = SecurityIDSource("2")
  val QUIK = SecurityIDSource("3")
  val ISIN_NUMBER = SecurityIDSource("4")
  val RIC_CODE = SecurityIDSource("5")
  val ISO_CURRENCY_CODE = SecurityIDSource("6")
  val ISO_COUNTRY_CODE = SecurityIDSource("7")
  val EXCHANGE_SYMBOL = SecurityIDSource("8")
  val CONSOLIDATED_TAPE_ASSOCIATION = SecurityIDSource("9")
  val BLOOMBERG_SYMBOL = SecurityIDSource("A")
  val WERTPAPIER = SecurityIDSource("B")
  val DUTCH = SecurityIDSource("C")
  val VALOREN = SecurityIDSource("D")
  val SICOVAM = SecurityIDSource("E")
  val BELGIAN = SecurityIDSource("F")
  val COMMON = SecurityIDSource("G")
  val CLEARING_HOUSE_CLEARING_ORGANIZATION = SecurityIDSource("H")
  val ISDA_FPML_PRODUCT_SPECIFICATION = SecurityIDSource("I")
  val OPTIONS_PRICE_REPORTING_AUTHORITY = SecurityIDSource("J")
  val ISDA_FPML_PRODUCT_URL = SecurityIDSource("K")
  val LETTER_OF_CREDIT = SecurityIDSource("L")
}

case class IOIid(s: String) extends FixField(23, types.FixString(s))

case class IOIQltyInd(c: Char) extends FixField(25, types.FixChar(c))
object IOIQltyInd {
  val LOW = IOIQltyInd('L')
  val MEDIUM = IOIQltyInd('M')
  val HIGH = IOIQltyInd('H')
}

case class IOIRefID(s: String) extends FixField(26, types.FixString(s))

case class IOIQty(s: String) extends FixField(27, types.FixString(s))
object IOIQty {
  val _1000000000 = IOIQty("0")
  val SMALL = IOIQty("S")
  val MEDIUM = IOIQty("M")
  val LARGE = IOIQty("L")
  val UNDISCLOSED_QUANTITY = IOIQty("U")
}

case class IOITransType(c: Char) extends FixField(28, types.FixChar(c))
object IOITransType {
  val NEW = IOITransType('N')
  val CANCEL = IOITransType('C')
  val REPLACE = IOITransType('R')
}

case class LastCapacity(c: Char) extends FixField(29, types.FixChar(c))
object LastCapacity {
  val AGENT = LastCapacity('1')
  val CROSS_AS_AGENT = LastCapacity('2')
  val CROSS_AS_PRINCIPAL = LastCapacity('3')
  val PRINCIPAL = LastCapacity('4')
}

case class LastMkt(code: String) extends FixField(30, types.Exchange(code))

case class LastPx(price: Decimal) extends FixField(31, types.Price(price))

case class LastQty(qty: Decimal) extends FixField(32, types.Qty(qty))

case class NoLinesOfText(num: Int) extends FixField(33, types.NumInGroup(num))

case class MsgSeqNum(seqNum: Int) extends FixField(34, types.SeqNum(seqNum))

case class MsgType(s: String) extends FixField(35, types.FixString(s))
object MsgType {
  val HEARTBEAT = MsgType("0")
  val TEST_REQUEST = MsgType("1")
  val RESEND_REQUEST = MsgType("2")
  val REJECT = MsgType("3")
  val SEQUENCE_RESET = MsgType("4")
  val LOGOUT = MsgType("5")
  val INDICATION_OF_INTEREST = MsgType("6")
  val ADVERTISEMENT = MsgType("7")
  val EXECUTION_REPORT = MsgType("8")
  val ORDER_CANCEL_REJECT = MsgType("9")
  val LOGON = MsgType("A")
  val NEWS = MsgType("B")
  val EMAIL = MsgType("C")
  val ORDER_SINGLE = MsgType("D")
  val ORDER_LIST = MsgType("E")
  val ORDER_CANCEL_REQUEST = MsgType("F")
  val ORDER_CANCEL_REPLACE_REQUEST = MsgType("G")
  val ORDER_STATUS_REQUEST = MsgType("H")
  val ALLOCATION_INSTRUCTION = MsgType("J")
  val LIST_CANCEL_REQUEST = MsgType("K")
  val LIST_EXECUTE = MsgType("L")
  val LIST_STATUS_REQUEST = MsgType("M")
  val LIST_STATUS = MsgType("N")
  val ALLOCATION_INSTRUCTION_ACK = MsgType("P")
  val DONT_KNOW_TRADE = MsgType("Q")
  val QUOTE_REQUEST = MsgType("R")
  val QUOTE = MsgType("S")
  val SETTLEMENT_INSTRUCTIONS = MsgType("T")
  val MARKET_DATA_REQUEST = MsgType("V")
  val MARKET_DATA_SNAPSHOT_FULL_REFRESH = MsgType("W")
  val MARKET_DATA_INCREMENTAL_REFRESH = MsgType("X")
  val MARKET_DATA_REQUEST_REJECT = MsgType("Y")
  val QUOTE_CANCEL = MsgType("Z")
  val QUOTE_STATUS_REQUEST = MsgType("a")
  val MASS_QUOTE_ACKNOWLEDGEMENT = MsgType("b")
  val SECURITY_DEFINITION_REQUEST = MsgType("c")
  val SECURITY_DEFINITION = MsgType("d")
  val SECURITY_STATUS_REQUEST = MsgType("e")
  val SECURITY_STATUS = MsgType("f")
  val TRADING_SESSION_STATUS_REQUEST = MsgType("g")
  val TRADING_SESSION_STATUS = MsgType("h")
  val MASS_QUOTE = MsgType("i")
  val BUSINESS_MESSAGE_REJECT = MsgType("j")
  val BID_REQUEST = MsgType("k")
  val BID_RESPONSE = MsgType("l")
  val LIST_STRIKE_PRICE = MsgType("m")
  val XML_MESSAGE = MsgType("n")
  val REGISTRATION_INSTRUCTIONS = MsgType("o")
  val REGISTRATION_INSTRUCTIONS_RESPONSE = MsgType("p")
  val ORDER_MASS_CANCEL_REQUEST = MsgType("q")
  val ORDER_MASS_CANCEL_REPORT = MsgType("r")
  val NEW_ORDER_CROSS = MsgType("s")
  val CROSS_ORDER_CANCEL_REPLACE_REQUEST = MsgType("t")
  val CROSS_ORDER_CANCEL_REQUEST = MsgType("u")
  val SECURITY_TYPE_REQUEST = MsgType("v")
  val SECURITY_TYPES = MsgType("w")
  val SECURITY_LIST_REQUEST = MsgType("x")
  val SECURITY_LIST = MsgType("y")
  val DERIVATIVE_SECURITY_LIST_REQUEST = MsgType("z")
  val DERIVATIVE_SECURITY_LIST = MsgType("AA")
  val NEW_ORDER_MULTILEG = MsgType("AB")
  val MULTILEG_ORDER_CANCEL_REPLACE = MsgType("AC")
  val TRADE_CAPTURE_REPORT_REQUEST = MsgType("AD")
  val TRADE_CAPTURE_REPORT = MsgType("AE")
  val ORDER_MASS_STATUS_REQUEST = MsgType("AF")
  val QUOTE_REQUEST_REJECT = MsgType("AG")
  val RFQ_REQUEST = MsgType("AH")
  val QUOTE_STATUS_REPORT = MsgType("AI")
  val QUOTE_RESPONSE = MsgType("AJ")
  val CONFIRMATION = MsgType("AK")
  val POSITION_MAINTENANCE_REQUEST = MsgType("AL")
  val POSITION_MAINTENANCE_REPORT = MsgType("AM")
  val REQUEST_FOR_POSITIONS = MsgType("AN")
  val REQUEST_FOR_POSITIONS_ACK = MsgType("AO")
  val POSITION_REPORT = MsgType("AP")
  val TRADE_CAPTURE_REPORT_REQUEST_ACK = MsgType("AQ")
  val TRADE_CAPTURE_REPORT_ACK = MsgType("AR")
  val ALLOCATION_REPORT = MsgType("AS")
  val ALLOCATION_REPORT_ACK = MsgType("AT")
  val CONFIRMATION_ACK = MsgType("AU")
  val SETTLEMENT_INSTRUCTION_REQUEST = MsgType("AV")
  val ASSIGNMENT_REPORT = MsgType("AW")
  val COLLATERAL_REQUEST = MsgType("AX")
  val COLLATERAL_ASSIGNMENT = MsgType("AY")
  val COLLATERAL_RESPONSE = MsgType("AZ")
  val COLLATERAL_REPORT = MsgType("BA")
  val COLLATERAL_INQUIRY = MsgType("BB")
  val NETWORK_STATUS_REQUEST = MsgType("BC")
  val NETWORK_STATUS_RESPONSE = MsgType("BD")
  val USER_REQUEST = MsgType("BE")
  val USER_RESPONSE = MsgType("BF")
  val COLLATERAL_INQUIRY_ACK = MsgType("BG")
  val CONFIRMATION_REQUEST = MsgType("BH")
  val TRADING_SESSION_LIST_REQUEST = MsgType("BI")
  val TRADING_SESSION_LIST = MsgType("BJ")
  val SECURITY_LIST_UPDATE_REPORT = MsgType("BK")
  val ADJUSTED_POSITION_REPORT = MsgType("BL")
  val ALLOCATION_INSTRUCTION_ALERT = MsgType("BM")
  val EXECUTION_ACKNOWLEDGEMENT = MsgType("BN")
  val CONTRARY_INTENTION_REPORT = MsgType("BO")
  val SECURITY_DEFINITION_UPDATE_REPORT = MsgType("BP")
}

case class NewSeqNo(seqNum: Int) extends FixField(36, types.SeqNum(seqNum))

case class OrderID(s: String) extends FixField(37, types.FixString(s))

case class OrderQty(qty: Decimal) extends FixField(38, types.Qty(qty))

case class OrdStatus(c: Char) extends FixField(39, types.FixChar(c))
object OrdStatus {
  val NEW = OrdStatus('0')
  val PARTIALLY_FILLED = OrdStatus('1')
  val FILLED = OrdStatus('2')
  val DONE_FOR_DAY = OrdStatus('3')
  val CANCELED = OrdStatus('4')
  val REPLACED = OrdStatus('5')
  val PENDING_CANCEL = OrdStatus('6')
  val STOPPED = OrdStatus('7')
  val REJECTED = OrdStatus('8')
  val SUSPENDED = OrdStatus('9')
  val PENDING_NEW = OrdStatus('A')
  val CALCULATED = OrdStatus('B')
  val EXPIRED = OrdStatus('C')
  val ACCEPTED_FOR_BIDDING = OrdStatus('D')
  val PENDING_REPLACE = OrdStatus('E')
}

case class OrdType(c: Char) extends FixField(40, types.FixChar(c))
object OrdType {
  val MARKET = OrdType('1')
  val LIMIT = OrdType('2')
  val STOP = OrdType('3')
  val STOP_LIMIT = OrdType('4')
  val MARKET_ON_CLOSE = OrdType('5')
  val WITH_OR_WITHOUT = OrdType('6')
  val LIMIT_OR_BETTER = OrdType('7')
  val LIMIT_WITH_OR_WITHOUT = OrdType('8')
  val ON_BASIS = OrdType('9')
  val ON_CLOSE = OrdType('A')
  val LIMIT_ON_CLOSE = OrdType('B')
  val FOREX_MARKET = OrdType('C')
  val PREVIOUSLY_QUOTED = OrdType('D')
  val PREVIOUSLY_INDICATED = OrdType('E')
  val FOREX_LIMIT = OrdType('F')
  val FOREX_SWAP = OrdType('G')
  val FOREX_PREVIOUSLY_QUOTED = OrdType('H')
  val FUNARI = OrdType('I')
  val MARKET_IF_TOUCHED = OrdType('J')
  val MARKET_WITH_LEFTOVER_AS_LIMIT = OrdType('K')
  val PREVIOUS_FUND_VALUATION_POINT = OrdType('L')
  val NEXT_FUND_VALUATION_POINT = OrdType('M')
  val PEGGED = OrdType('P')
  val COUNTER_ORDER_SELECTION = OrdType('Q')
}

case class OrigClOrdID(s: String) extends FixField(41, types.FixString(s))

case class OrigTime(timestamp: Date) extends FixField(42, types.UTCTimestamp(timestamp))

case class PossDupFlag(bool: Boolean) extends FixField(43, types.FixBoolean(bool))

case class Price(price: Decimal) extends FixField(44, types.Price(price))

case class RefSeqNum(seqNum: Int) extends FixField(45, types.SeqNum(seqNum))

case class SecurityID(s: String) extends FixField(48, types.FixString(s))

case class SenderCompID(s: String) extends FixField(49, types.FixString(s))

case class SenderSubID(s: String) extends FixField(50, types.FixString(s))

case class SendingTime(timestamp: Date) extends FixField(52, types.UTCTimestamp(timestamp))

case class Quantity(qty: Decimal) extends FixField(53, types.Qty(qty))

case class Side(c: Char) extends FixField(54, types.FixChar(c))
object Side {
  val BUY = Side('1')
  val SELL = Side('2')
  val BUY_MINUS = Side('3')
  val SELL_PLUS = Side('4')
  val SELL_SHORT = Side('5')
  val SELL_SHORT_EXEMPT = Side('6')
  val UNDISCLOSED = Side('7')
  val CROSS = Side('8')
  val CROSS_SHORT = Side('9')
  val CROSS_SHORT_EXEMPT = Side('A')
  val AS_DEFINED = Side('B')
  val OPPOSITE = Side('C')
  val SUBSCRIBE = Side('D')
  val REDEEM = Side('E')
  val LEND = Side('F')
  val BORROW = Side('G')
}

case class Symbol(s: String) extends FixField(55, types.FixString(s))

case class TargetCompID(s: String) extends FixField(56, types.FixString(s))

case class TargetSubID(s: String) extends FixField(57, types.FixString(s))

case class Text(s: String) extends FixField(58, types.FixString(s))

case class TimeInForce(c: Char) extends FixField(59, types.FixChar(c))
object TimeInForce {
  val DAY = TimeInForce('0')
  val GOOD_TILL_CANCEL = TimeInForce('1')
  val AT_THE_OPENING = TimeInForce('2')
  val IMMEDIATE_OR_CANCEL = TimeInForce('3')
  val FILL_OR_KILL = TimeInForce('4')
  val GOOD_TILL_CROSSING = TimeInForce('5')
  val GOOD_TILL_DATE = TimeInForce('6')
  val AT_THE_CLOSE = TimeInForce('7')
}

case class TransactTime(timestamp: Date) extends FixField(60, types.UTCTimestamp(timestamp))

case class Urgency(c: Char) extends FixField(61, types.FixChar(c))
object Urgency {
  val NORMAL = Urgency('0')
  val FLASH = Urgency('1')
  val BACKGROUND = Urgency('2')
}

case class ValidUntilTime(timestamp: Date) extends FixField(62, types.UTCTimestamp(timestamp))

case class SettlType(s: String) extends FixField(63, types.FixString(s))
object SettlType {
  val REGULAR = SettlType("0")
  val CASH = SettlType("1")
  val NEXT_DAY = SettlType("2")
  val T_PLUS_2 = SettlType("3")
  val T_PLUS_3 = SettlType("4")
  val T_PLUS_4 = SettlType("5")
  val FUTURE = SettlType("6")
  val WHEN_AND_IF_ISSUED = SettlType("7")
  val SELLERS_OPTION = SettlType("8")
  val T_PLUS_5 = SettlType("9")
  val FX_SPOT_NEXT_SETTLEMENT = SettlType("C")
  val BROKEN_DATE = SettlType("B")
}

case class SettlDate(year: Int, month: Int, day: Int) extends FixField(64, types.LocalMktDate(year, month, day))

case class SymbolSfx(s: String) extends FixField(65, types.FixString(s))
object SymbolSfx {
  val WHEN_ISSUED = SymbolSfx("WI")
  val A_EUCP_WITH_LUMP_SUM_INTEREST = SymbolSfx("CD")
}

case class ListID(s: String) extends FixField(66, types.FixString(s))

case class ListSeqNo(i: Int) extends FixField(67, types.FixInteger(i))

case class TotNoOrders(i: Int) extends FixField(68, types.FixInteger(i))

case class ListExecInst(s: String) extends FixField(69, types.FixString(s))

case class AllocID(s: String) extends FixField(70, types.FixString(s))

case class AllocTransType(c: Char) extends FixField(71, types.FixChar(c))
object AllocTransType {
  val NEW = AllocTransType('0')
  val REPLACE = AllocTransType('1')
  val CANCEL = AllocTransType('2')
  val PRELIMINARY = AllocTransType('3')
  val CALCULATED = AllocTransType('4')
  val CALCULATED_WITHOUT_PRELIMINARY = AllocTransType('5')
  val REVERSAL = AllocTransType('6')
}

case class RefAllocID(s: String) extends FixField(72, types.FixString(s))

case class NoOrders(num: Int) extends FixField(73, types.NumInGroup(num))

case class AvgPxPrecision(i: Int) extends FixField(74, types.FixInteger(i))

case class TradeDate(year: Int, month: Int, day: Int) extends FixField(75, types.LocalMktDate(year, month, day))

case class ExecBroker(s: String) extends FixField(76, types.FixString(s))

case class PositionEffect(c: Char) extends FixField(77, types.FixChar(c))
object PositionEffect {
  val OPEN = PositionEffect('O')
  val CLOSE = PositionEffect('C')
  val ROLLED = PositionEffect('R')
  val FIFO = PositionEffect('F')
}

case class NoAllocs(num: Int) extends FixField(78, types.NumInGroup(num))

case class AllocAccount(s: String) extends FixField(79, types.FixString(s))

case class AllocQty(qty: Decimal) extends FixField(80, types.Qty(qty))

case class ProcessCode(c: Char) extends FixField(81, types.FixChar(c))
object ProcessCode {
  val REGULAR = ProcessCode('0')
  val SOFT_DOLLAR = ProcessCode('1')
  val STEP_IN = ProcessCode('2')
  val STEP_OUT = ProcessCode('3')
  val SOFT_DOLLAR_STEP_IN = ProcessCode('4')
  val SOFT_DOLLAR_STEP_OUT = ProcessCode('5')
  val PLAN_SPONSOR = ProcessCode('6')
}

case class NoRpts(i: Int) extends FixField(82, types.FixInteger(i))

case class RptSeq(i: Int) extends FixField(83, types.FixInteger(i))

case class CxlQty(qty: Decimal) extends FixField(84, types.Qty(qty))

case class NoDlvyInst(num: Int) extends FixField(85, types.NumInGroup(num))

case class DlvyInst(s: String) extends FixField(86, types.FixString(s))

case class AllocStatus(i: Int) extends FixField(87, types.FixInteger(i))
object AllocStatus {
  val ACCEPTED = AllocStatus(0)
  val BLOCK_LEVEL_REJECT = AllocStatus(1)
  val ACCOUNT_LEVEL_REJECT = AllocStatus(2)
  val RECEIVED = AllocStatus(3)
  val INCOMPLETE = AllocStatus(4)
  val REJECTED_BY_INTERMEDIARY = AllocStatus(5)
  val ALLOCATION_PENDING = AllocStatus(6)
  val REVERSED = AllocStatus(7)
}

case class AllocRejCode(i: Int) extends FixField(88, types.FixInteger(i))
object AllocRejCode {
  val UNKNOWN_ACCOUNT = AllocRejCode(0)
  val INCORRECT_QUANTITY = AllocRejCode(1)
  val INCORRECT_AVERAGE_PRICE = AllocRejCode(2)
  val UNKNOWN_EXECUTING_BROKER_MNEMONIC = AllocRejCode(3)
  val COMMISSION_DIFFERENCE = AllocRejCode(4)
  val UNKNOWN_ORDERID = AllocRejCode(5)
  val UNKNOWN_LISTID = AllocRejCode(6)
  val OTHER = AllocRejCode(7)
  val INCORRECT_ALLOCATED_QUANTITY = AllocRejCode(8)
  val CALCULATION_DIFFERENCE = AllocRejCode(9)
  val UNKNOWN_OR_STALE_EXEC_ID = AllocRejCode(10)
  val MISMATCHED_DATA_VALUE = AllocRejCode(11)
  val UNKNOWN_CLORDID = AllocRejCode(12)
  val WAREHOUSE_REQUEST_REJECTED = AllocRejCode(13)
}

case class Signature(data: Array[Byte]) extends FixField(89, types.Data(data))

case class SecureDataLen(length: Int) extends FixField(90, types.Length(length))

case class SecureData(data: Array[Byte]) extends FixField(91, types.Data(data))

case class BrokerOfCredit(s: String) extends FixField(92, types.FixString(s))

case class SignatureLength(length: Int) extends FixField(93, types.Length(length))

case class EmailType(c: Char) extends FixField(94, types.FixChar(c))
object EmailType {
  val NEW = EmailType('0')
  val REPLY = EmailType('1')
  val ADMIN_REPLY = EmailType('2')
}

case class RawDataLength(length: Int) extends FixField(95, types.Length(length))

case class RawData(data: Array[Byte]) extends FixField(96, types.Data(data))

case class PossResend(bool: Boolean) extends FixField(97, types.FixBoolean(bool))

case class EncryptMethod(i: Int) extends FixField(98, types.FixInteger(i))
object EncryptMethod {
  val NONE_OTHER = EncryptMethod(0)
  val PKCS = EncryptMethod(1)
  val DES = EncryptMethod(2)
  val PKCS_DES = EncryptMethod(3)
  val PGP_DES = EncryptMethod(4)
  val PGP_DES_MD5 = EncryptMethod(5)
  val PEM_DES_MD5 = EncryptMethod(6)
}

case class StopPx(price: Decimal) extends FixField(99, types.Price(price))

case class ExDestination(code: String) extends FixField(100, types.Exchange(code))

case class CxlRejReason(i: Int) extends FixField(102, types.FixInteger(i))
object CxlRejReason {
  val TOO_LATE_TO_CANCEL = CxlRejReason(0)
  val UNKNOWN_ORDER = CxlRejReason(1)
  val BROKER_EXCHANGE_OPTION = CxlRejReason(2)
  val ORDER_ALREADY_IN_PENDING_CANCEL_OR_PENDING_REPLACE_STATUS = CxlRejReason(3)
  val UNABLE_TO_PROCESS_ORDER_MASS_CANCEL_REQUEST = CxlRejReason(4)
  val ORIGORDMODTIME_DID_NOT_MATCH_LAST_TRANSACTTIME_OF_ORDER = CxlRejReason(5)
  val DUPLICATE_CLORDID_RECEIVED = CxlRejReason(6)
  val INVALID_PRICE_INCREMENT = CxlRejReason(18)
  val OTHER = CxlRejReason(99)
}

case class OrdRejReason(i: Int) extends FixField(103, types.FixInteger(i))
object OrdRejReason {
  val BROKER_EXCHANGE_OPTION = OrdRejReason(0)
  val UNKNOWN_SYMBOL = OrdRejReason(1)
  val EXCHANGE_CLOSED = OrdRejReason(2)
  val ORDER_EXCEEDS_LIMIT = OrdRejReason(3)
  val TOO_LATE_TO_ENTER = OrdRejReason(4)
  val UNKNOWN_ORDER = OrdRejReason(5)
  val DUPLICATE_ORDER = OrdRejReason(6)
  val DUPLICATE_OF_A_VERBALLY_COMMUNICATED_ORDER = OrdRejReason(7)
  val STALE_ORDER = OrdRejReason(8)
  val TRADE_ALONG_REQUIRED = OrdRejReason(9)
  val INVALID_INVESTOR_ID = OrdRejReason(10)
  val UNSUPPORTED_ORDER_CHARACTERISTIC = OrdRejReason(11)
  val SURVEILLENCE_OPTION = OrdRejReason(12)
  val INCORRECT_QUANTITY = OrdRejReason(13)
  val INCORRECT_ALLOCATED_QUANTITY = OrdRejReason(14)
  val UNKNOWN_ACCOUNT = OrdRejReason(15)
  val INVALID_PRICE_INCREMENT = OrdRejReason(18)
  val OTHER = OrdRejReason(99)
}

case class IOIQualifier(c: Char) extends FixField(104, types.FixChar(c))
object IOIQualifier {
  val ALL_OR_NONE = IOIQualifier('A')
  val MARKET_ON_CLOSE = IOIQualifier('B')
  val AT_THE_CLOSE = IOIQualifier('C')
  val VWAP = IOIQualifier('D')
  val IN_TOUCH_WITH = IOIQualifier('I')
  val LIMIT = IOIQualifier('L')
  val MORE_BEHIND = IOIQualifier('M')
  val AT_THE_OPEN = IOIQualifier('O')
  val TAKING_A_POSITION = IOIQualifier('P')
  val AT_THE_MARKET = IOIQualifier('Q')
  val READY_TO_TRADE = IOIQualifier('R')
  val PORTFOLIO_SHOWN = IOIQualifier('S')
  val THROUGH_THE_DAY = IOIQualifier('T')
  val VERSUS = IOIQualifier('V')
  val INDICATION_WORKING_AWAY = IOIQualifier('W')
  val CROSSING_OPPORTUNITY = IOIQualifier('X')
  val AT_THE_MIDPOINT = IOIQualifier('Y')
  val PRE_OPEN = IOIQualifier('Z')
}

case class WaveNo(s: String) extends FixField(105, types.FixString(s))

case class Issuer(s: String) extends FixField(106, types.FixString(s))

case class SecurityDesc(s: String) extends FixField(107, types.FixString(s))

case class HeartBtInt(i: Int) extends FixField(108, types.FixInteger(i))

case class ClientID(s: String) extends FixField(109, types.FixString(s))

case class MinQty(qty: Decimal) extends FixField(110, types.Qty(qty))

case class MaxFloor(qty: Decimal) extends FixField(111, types.Qty(qty))

case class TestReqID(s: String) extends FixField(112, types.FixString(s))

case class ReportToExch(bool: Boolean) extends FixField(113, types.FixBoolean(bool))

case class LocateReqd(bool: Boolean) extends FixField(114, types.FixBoolean(bool))

case class OnBehalfOfCompID(s: String) extends FixField(115, types.FixString(s))

case class OnBehalfOfSubID(s: String) extends FixField(116, types.FixString(s))

case class QuoteID(s: String) extends FixField(117, types.FixString(s))

case class NetMoney(amount: Decimal) extends FixField(118, types.Amt(amount))

case class SettlCurrAmt(amount: Decimal) extends FixField(119, types.Amt(amount))

case class SettlCurrency(code: String) extends FixField(120, types.Currency(code))

case class ForexReq(bool: Boolean) extends FixField(121, types.FixBoolean(bool))

case class OrigSendingTime(timestamp: Date) extends FixField(122, types.UTCTimestamp(timestamp))

case class GapFillFlag(bool: Boolean) extends FixField(123, types.FixBoolean(bool))

case class NoExecs(num: Int) extends FixField(124, types.NumInGroup(num))

case class CxlType(c: Char) extends FixField(125, types.FixChar(c))
object CxlType {
  val PARTIAL_CANCEL = CxlType('P')
  val FULL_REMAINING_QUANTITY = CxlType('F')
}

case class ExpireTime(timestamp: Date) extends FixField(126, types.UTCTimestamp(timestamp))

case class DKReason(c: Char) extends FixField(127, types.FixChar(c))
object DKReason {
  val UNKNOWN_SYMBOL = DKReason('A')
  val WRONG_SIDE = DKReason('B')
  val QUANTITY_EXCEEDS_ORDER = DKReason('C')
  val NO_MATCHING_ORDER = DKReason('D')
  val PRICE_EXCEEDS_LIMIT = DKReason('E')
  val CALCULATION_DIFFERENCE = DKReason('F')
  val OTHER = DKReason('Z')
}

case class DeliverToCompID(s: String) extends FixField(128, types.FixString(s))

case class DeliverToSubID(s: String) extends FixField(129, types.FixString(s))

case class IOINaturalFlag(bool: Boolean) extends FixField(130, types.FixBoolean(bool))

case class QuoteReqID(s: String) extends FixField(131, types.FixString(s))

case class BidPx(price: Decimal) extends FixField(132, types.Price(price))

case class OfferPx(price: Decimal) extends FixField(133, types.Price(price))

case class BidSize(qty: Decimal) extends FixField(134, types.Qty(qty))

case class OfferSize(qty: Decimal) extends FixField(135, types.Qty(qty))

case class NoMiscFees(num: Int) extends FixField(136, types.NumInGroup(num))

case class MiscFeeAmt(amount: Decimal) extends FixField(137, types.Amt(amount))

case class MiscFeeCurr(code: String) extends FixField(138, types.Currency(code))

case class MiscFeeType(s: String) extends FixField(139, types.FixString(s))
object MiscFeeType {
  val REGULATORY = MiscFeeType("1")
  val TAX = MiscFeeType("2")
  val LOCAL_COMMISSION = MiscFeeType("3")
  val EXCHANGE_FEES = MiscFeeType("4")
  val STAMP = MiscFeeType("5")
  val LEVY = MiscFeeType("6")
  val OTHER = MiscFeeType("7")
  val MARKUP = MiscFeeType("8")
  val CONSUMPTION_TAX = MiscFeeType("9")
  val PER_TRANSACTION = MiscFeeType("10")
  val CONVERSION = MiscFeeType("11")
  val AGENT = MiscFeeType("12")
  val TRANSFER_FEE = MiscFeeType("13")
  val SECURITY_LENDING = MiscFeeType("14")
}

case class PrevClosePx(price: Decimal) extends FixField(140, types.Price(price))

case class ResetSeqNumFlag(bool: Boolean) extends FixField(141, types.FixBoolean(bool))

case class SenderLocationID(s: String) extends FixField(142, types.FixString(s))

case class TargetLocationID(s: String) extends FixField(143, types.FixString(s))

case class OnBehalfOfLocationID(s: String) extends FixField(144, types.FixString(s))

case class DeliverToLocationID(s: String) extends FixField(145, types.FixString(s))

case class NoRelatedSym(num: Int) extends FixField(146, types.NumInGroup(num))

case class Subject(s: String) extends FixField(147, types.FixString(s))

case class Headline(s: String) extends FixField(148, types.FixString(s))

case class URLLink(s: String) extends FixField(149, types.FixString(s))

case class ExecType(c: Char) extends FixField(150, types.FixChar(c))
object ExecType {
  val NEW = ExecType('0')
  val PARTIAL_FILL = ExecType('1')
  val FILL = ExecType('2')
  val DONE_FOR_DAY = ExecType('3')
  val CANCELED = ExecType('4')
  val REPLACE = ExecType('5')
  val PENDING_CANCEL = ExecType('6')
  val STOPPED = ExecType('7')
  val REJECTED = ExecType('8')
  val SUSPENDED = ExecType('9')
  val PENDING_NEW = ExecType('A')
  val CALCULATED = ExecType('B')
  val EXPIRED = ExecType('C')
  val RESTATED = ExecType('D')
  val PENDING_REPLACE = ExecType('E')
  val TRADE = ExecType('F')
  val TRADE_CORRECT = ExecType('G')
  val TRADE_CANCEL = ExecType('H')
  val ORDER_STATUS = ExecType('I')
  val TRADE_IN_A_CLEARING_HOLD = ExecType('J')
  val TRADE_HAS_BEEN_RELEASED_TO_CLEARING = ExecType('K')
  val TRIGGERED_OR_ACTIVATED_BY_SYSTEM = ExecType('L')
}

case class LeavesQty(qty: Decimal) extends FixField(151, types.Qty(qty))

case class CashOrderQty(qty: Decimal) extends FixField(152, types.Qty(qty))

case class AllocAvgPx(price: Decimal) extends FixField(153, types.Price(price))

case class AllocNetMoney(amount: Decimal) extends FixField(154, types.Amt(amount))

case class SettlCurrFxRate(f: Decimal) extends FixField(155, types.FixFloat(f))

case class SettlCurrFxRateCalc(c: Char) extends FixField(156, types.FixChar(c))
object SettlCurrFxRateCalc {
  val MULTIPLY = SettlCurrFxRateCalc('M')
  val DIVIDE = SettlCurrFxRateCalc('D')
}

case class NumDaysInterest(i: Int) extends FixField(157, types.FixInteger(i))

case class AccruedInterestRate(percentage: Decimal) extends FixField(158, types.Percentage(percentage))

case class AccruedInterestAmt(amount: Decimal) extends FixField(159, types.Amt(amount))

case class SettlInstMode(c: Char) extends FixField(160, types.FixChar(c))
object SettlInstMode {
  val DEFAULT = SettlInstMode('0')
  val STANDING_INSTRUCTIONS_PROVIDED = SettlInstMode('1')
  val SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING = SettlInstMode('2')
  val SPECIFIC_ALLOCATION_ACCOUNT_STANDING = SettlInstMode('3')
  val SPECIFIC_ORDER_FOR_A_SINGLE_ACCOUNT = SettlInstMode('4')
  val REQUEST_REJECT = SettlInstMode('5')
}

case class AllocText(s: String) extends FixField(161, types.FixString(s))

case class SettlInstID(s: String) extends FixField(162, types.FixString(s))

case class SettlInstTransType(c: Char) extends FixField(163, types.FixChar(c))
object SettlInstTransType {
  val NEW = SettlInstTransType('N')
  val CANCEL = SettlInstTransType('C')
  val REPLACE = SettlInstTransType('R')
  val RESTATE = SettlInstTransType('T')
}

case class EmailThreadID(s: String) extends FixField(164, types.FixString(s))

case class SettlInstSource(c: Char) extends FixField(165, types.FixChar(c))
object SettlInstSource {
  val BROKERS_INSTRUCTIONS = SettlInstSource('1')
  val INSTITUTIONS_INSTRUCTIONS = SettlInstSource('2')
  val INVESTOR = SettlInstSource('3')
}

case class SettlLocation(s: String) extends FixField(166, types.FixString(s))
object SettlLocation {
  val CEDEL = SettlLocation("CED")
  val DEPOSITORY_TRUST_COMPANY = SettlLocation("DTC")
  val EUROCLEAR = SettlLocation("EUR")
  val FEDERAL_BOOK_ENTRY = SettlLocation("FED")
  val LOCAL_MARKET_SETTLE_LOCATION = SettlLocation("ISO")
  val PHYSICAL = SettlLocation("PNY")
  val PARTICIPANT_TRUST_COMPANY = SettlLocation("PTC")
}

case class SecurityType(s: String) extends FixField(167, types.FixString(s))
object SecurityType {
  val WILDCARD = SecurityType("?")
  val ASSET_BACKED_SECURITIES = SecurityType("ABS")
  val AMENDED_AND_RESTATED = SecurityType("AMENDED")
  val OTHER_ANTICIPATION_NOTES = SecurityType("AN")
  val BANKERS_ACCEPTANCE = SecurityType("BA")
  val BANK_NOTES = SecurityType("BN")
  val BILL_OF_EXCHANGES = SecurityType("BOX")
  val BRADY_BOND = SecurityType("BRADY")
  val BRIDGE_LOAN = SecurityType("BRIDGE")
  val BUY_SELLBACK = SecurityType("BUYSELL")
  val CONVERTIBLE_BOND = SecurityType("CB")
  val CERTIFICATE_OF_DEPOSIT = SecurityType("CD")
  val CALL_LOANS = SecurityType("CL")
  val CORP_MORTGAGE_BACKED_SECURITIES = SecurityType("CMBS")
  val COLLATERALIZED_MORTGAGE_OBLIGATION = SecurityType("CMO")
  val CERTIFICATE_OF_OBLIGATION = SecurityType("COFO")
  val CERTIFICATE_OF_PARTICIPATION = SecurityType("COFP")
  val CORPORATE_BOND = SecurityType("CORP")
  val COMMERCIAL_PAPER = SecurityType("CP")
  val CORPORATE_PRIVATE_PLACEMENT = SecurityType("CPP")
  val COMMON_STOCK = SecurityType("CS")
  val DEFAULTED = SecurityType("DEFLTED")
  val DEBTOR_IN_POSSESSION = SecurityType("DINP")
  val DEPOSIT_NOTES = SecurityType("DN")
  val DUAL_CURRENCY = SecurityType("DUAL")
  val EURO_CERTIFICATE_OF_DEPOSIT = SecurityType("EUCD")
  val EURO_CORPORATE_BOND = SecurityType("EUCORP")
  val EURO_COMMERCIAL_PAPER = SecurityType("EUCP")
  val EURO_SOVEREIGNS = SecurityType("EUSOV")
  val EURO_SUPRANATIONAL_COUPONS = SecurityType("EUSUPRA")
  val FEDERAL_AGENCY_COUPON = SecurityType("FAC")
  val FEDERAL_AGENCY_DISCOUNT_NOTE = SecurityType("FADN")
  val FOREIGN_EXCHANGE_CONTRACT = SecurityType("FOR")
  val FORWARD = SecurityType("FORWARD")
  val FUTURE = SecurityType("FUT")
  val GENERAL_OBLIGATION_BONDS = SecurityType("GO")
  val IOETTE_MORTGAGE = SecurityType("IET")
  val LETTER_OF_CREDIT = SecurityType("LOFC")
  val LIQUIDITY_NOTE = SecurityType("LQN")
  val MATURED = SecurityType("MATURED")
  val MORTGAGE_BACKED_SECURITIES = SecurityType("MBS")
  val MUTUAL_FUND = SecurityType("MF")
  val MORTGAGE_INTEREST_ONLY = SecurityType("MIO")
  val MULTI_LEG_INSTRUMENT = SecurityType("MLEG")
  val MORTGAGE_PRINCIPAL_ONLY = SecurityType("MPO")
  val MORTGAGE_PRIVATE_PLACEMENT = SecurityType("MPP")
  val MISCELLANEOUS_PASS_THROUGH = SecurityType("MPT")
  val MANDATORY_TENDER = SecurityType("MT")
  val MEDIUM_TERM_NOTES = SecurityType("MTN")
  val NO_SECURITY_TYPE = SecurityType("NONE")
  val OVERNIGHT = SecurityType("ONITE")
  val OPTION = SecurityType("OPT")
  val PRIVATE_EXPORT_FUNDING = SecurityType("PEF")
  val PFANDBRIEFE = SecurityType("PFAND")
  val PROMISSORY_NOTE = SecurityType("PN")
  val PREFERRED_STOCK = SecurityType("PS")
  val PLAZOS_FIJOS = SecurityType("PZFJ")
  val REVENUE_ANTICIPATION_NOTE = SecurityType("RAN")
  val REPLACED = SecurityType("REPLACD")
  val REPURCHASE = SecurityType("REPO")
  val RETIRED = SecurityType("RETIRED")
  val REVENUE_BONDS = SecurityType("REV")
  val REVOLVER_LOAN = SecurityType("RVLV")
  val REVOLVER_TERM_LOAN = SecurityType("RVLVTRM")
  val SECURITIES_LOAN = SecurityType("SECLOAN")
  val SECURITIES_PLEDGE = SecurityType("SECPLEDGE")
  val SPECIAL_ASSESSMENT = SecurityType("SPCLA")
  val SPECIAL_OBLIGATION = SecurityType("SPCLO")
  val SPECIAL_TAX = SecurityType("SPCLT")
  val SHORT_TERM_LOAN_NOTE = SecurityType("STN")
  val STRUCTURED_NOTES = SecurityType("STRUCT")
  val USD_SUPRANATIONAL_COUPONS = SecurityType("SUPRA")
  val SWING_LINE_FACILITY = SecurityType("SWING")
  val TAX_ANTICIPATION_NOTE = SecurityType("TAN")
  val TAX_ALLOCATION = SecurityType("TAXA")
  val TO_BE_ANNOUNCED = SecurityType("TBA")
  val US_TREASURY_BILL = SecurityType("TBILL")
  val US_TREASURY_BOND = SecurityType("TBOND")
  val PRINCIPAL_STRIP_OF_A_CALLABLE_BOND_OR_NOTE = SecurityType("TCAL")
  val TIME_DEPOSIT = SecurityType("TD")
  val TAX_EXEMPT_COMMERCIAL_PAPER = SecurityType("TECP")
  val TERM_LOAN = SecurityType("TERM")
  val INTEREST_STRIP_FROM_ANY_BOND_OR_NOTE = SecurityType("TINT")
  val TREASURY_INFLATION_PROTECTED_SECURITIES = SecurityType("TIPS")
  val US_TREASURY_NOTE = SecurityType("TNOTE")
  val PRINCIPAL_STRIP_FROM_A_NON_CALLABLE_BOND_OR_NOTE = SecurityType("TPRN")
  val TAX_AND_REVENUE_ANTICIPATION_NOTE = SecurityType("TRAN")
  val US_TREASURY_NOTE2 = SecurityType("UST")
  val US_TREASURY_BILL2 = SecurityType("USTB")
  val VARIABLE_RATE_DEMAND_NOTE = SecurityType("VRDN")
  val WARRANT = SecurityType("WAR")
  val WITHDRAWN = SecurityType("WITHDRN")
  val _UNKNOWN = SecurityType("WLD")
  val EXTENDED_COMM_NOTE = SecurityType("XCN")
  val INDEXED_LINKED = SecurityType("XLINKD")
  val YANKEE_CORPORATE_BOND = SecurityType("YANK")
  val YANKEE_CERTIFICATE_OF_DEPOSIT = SecurityType("YCD")
  val OPTIONS_ON_PHYSICAL = SecurityType("OOP")
  val OPTIONS_ON_FUTURES = SecurityType("OOF")
  val CASH = SecurityType("CASH")
}

case class EffectiveTime(timestamp: Date) extends FixField(168, types.UTCTimestamp(timestamp))

case class StandInstDbType(i: Int) extends FixField(169, types.FixInteger(i))
object StandInstDbType {
  val OTHER = StandInstDbType(0)
  val DTC_SID = StandInstDbType(1)
  val THOMSON_ALERT = StandInstDbType(2)
  val A_GLOBAL_CUSTODIAN = StandInstDbType(3)
  val ACCOUNTNET = StandInstDbType(4)
}

case class StandInstDbName(s: String) extends FixField(170, types.FixString(s))

case class StandInstDbID(s: String) extends FixField(171, types.FixString(s))

case class SettlDeliveryType(i: Int) extends FixField(172, types.FixInteger(i))
object SettlDeliveryType {
  val VERSUS_PAYMENT = SettlDeliveryType(0)
  val FREE = SettlDeliveryType(1)
  val TRI_PARTY = SettlDeliveryType(2)
  val HOLD_IN_CUSTODY = SettlDeliveryType(3)
}

case class SettlDepositoryCode(s: String) extends FixField(173, types.FixString(s))

case class SettlBrkrCode(s: String) extends FixField(174, types.FixString(s))

case class SettlInstCode(s: String) extends FixField(175, types.FixString(s))

case class SecuritySettlAgentName(s: String) extends FixField(176, types.FixString(s))

case class SecuritySettlAgentCode(s: String) extends FixField(177, types.FixString(s))

case class SecuritySettlAgentAcctNum(s: String) extends FixField(178, types.FixString(s))

case class SecuritySettlAgentAcctName(s: String) extends FixField(179, types.FixString(s))

case class SecuritySettlAgentContactName(s: String) extends FixField(180, types.FixString(s))

case class SecuritySettlAgentContactPhone(s: String) extends FixField(181, types.FixString(s))

case class CashSettlAgentName(s: String) extends FixField(182, types.FixString(s))

case class CashSettlAgentCode(s: String) extends FixField(183, types.FixString(s))

case class CashSettlAgentAcctNum(s: String) extends FixField(184, types.FixString(s))

case class CashSettlAgentAcctName(s: String) extends FixField(185, types.FixString(s))

case class CashSettlAgentContactName(s: String) extends FixField(186, types.FixString(s))

case class CashSettlAgentContactPhone(s: String) extends FixField(187, types.FixString(s))

case class BidSpotRate(price: Decimal) extends FixField(188, types.Price(price))

case class BidForwardPoints(offset: Decimal) extends FixField(189, types.PriceOffset(offset))

case class OfferSpotRate(price: Decimal) extends FixField(190, types.Price(price))

case class OfferForwardPoints(offset: Decimal) extends FixField(191, types.PriceOffset(offset))

case class OrderQty2(qty: Decimal) extends FixField(192, types.Qty(qty))

case class SettlDate2(year: Int, month: Int, day: Int) extends FixField(193, types.LocalMktDate(year, month, day))

case class LastSpotRate(price: Decimal) extends FixField(194, types.Price(price))

case class LastForwardPoints(offset: Decimal) extends FixField(195, types.PriceOffset(offset))

case class AllocLinkID(s: String) extends FixField(196, types.FixString(s))

case class AllocLinkType(i: Int) extends FixField(197, types.FixInteger(i))
object AllocLinkType {
  val F_X_NETTING = AllocLinkType(0)
  val F_X_SWAP = AllocLinkType(1)
}

case class SecondaryOrderID(s: String) extends FixField(198, types.FixString(s))

case class NoIOIQualifiers(num: Int) extends FixField(199, types.NumInGroup(num))

case class MaturityMonthYear(year: Int, month: Int, day: Option[Int], week: Option[Int]) extends FixField(200, types.MonthYear(year, month, day, week))

case class PutOrCall(i: Int) extends FixField(201, types.FixInteger(i))
object PutOrCall {
  val PUT = PutOrCall(0)
  val CALL = PutOrCall(1)
}

case class StrikePrice(price: Decimal) extends FixField(202, types.Price(price))

case class CoveredOrUncovered(i: Int) extends FixField(203, types.FixInteger(i))
object CoveredOrUncovered {
  val COVERED = CoveredOrUncovered(0)
  val UNCOVERED = CoveredOrUncovered(1)
}

case class CustomerOrFirm(i: Int) extends FixField(204, types.FixInteger(i))
object CustomerOrFirm {
  val CUSTOMER = CustomerOrFirm(0)
  val FIRM = CustomerOrFirm(1)
}

case class MaturityDay(day: Int) extends FixField(205, types.DayOfMonth(day))

case class OptAttribute(c: Char) extends FixField(206, types.FixChar(c))

case class SecurityExchange(code: String) extends FixField(207, types.Exchange(code))

case class NotifyBrokerOfCredit(bool: Boolean) extends FixField(208, types.FixBoolean(bool))

case class AllocHandlInst(i: Int) extends FixField(209, types.FixInteger(i))
object AllocHandlInst {
  val MATCH = AllocHandlInst(1)
  val FORWARD = AllocHandlInst(2)
  val FORWARD_AND_MATCH = AllocHandlInst(3)
}

case class MaxShow(qty: Decimal) extends FixField(210, types.Qty(qty))

case class PegOffsetValue(f: Decimal) extends FixField(211, types.FixFloat(f))

case class XmlDataLen(length: Int) extends FixField(212, types.Length(length))

case class XmlData(data: Array[Byte]) extends FixField(213, types.Data(data))

case class SettlInstRefID(s: String) extends FixField(214, types.FixString(s))

case class NoRoutingIDs(num: Int) extends FixField(215, types.NumInGroup(num))

case class RoutingType(i: Int) extends FixField(216, types.FixInteger(i))
object RoutingType {
  val TARGET_FIRM = RoutingType(1)
  val TARGET_LIST = RoutingType(2)
  val BLOCK_FIRM = RoutingType(3)
  val BLOCK_LIST = RoutingType(4)
}

case class RoutingID(s: String) extends FixField(217, types.FixString(s))

case class Spread(offset: Decimal) extends FixField(218, types.PriceOffset(offset))

case class Benchmark(c: Char) extends FixField(219, types.FixChar(c))
object Benchmark {
  val CURVE = Benchmark('1')
  val FIVEYR = Benchmark('2')
  val OLD5 = Benchmark('3')
  val TENYR = Benchmark('4')
  val OLD10 = Benchmark('5')
  val THIRTYYR = Benchmark('6')
  val OLD30 = Benchmark('7')
  val THREEMOLIBOR = Benchmark('8')
  val SIXMOLIBOR = Benchmark('9')
}

case class BenchmarkCurveCurrency(code: String) extends FixField(220, types.Currency(code))

case class BenchmarkCurveName(s: String) extends FixField(221, types.FixString(s))
object BenchmarkCurveName {
  val EONIA = BenchmarkCurveName("EONIA")
  val EUREPO = BenchmarkCurveName("EUREPO")
  val EURIBOR = BenchmarkCurveName("Euribor")
  val FUTURESWAP = BenchmarkCurveName("FutureSWAP")
  val LIBID = BenchmarkCurveName("LIBID")
  val LIBOR = BenchmarkCurveName("LIBOR")
  val MUNIAAA = BenchmarkCurveName("MuniAAA")
  val OTHER = BenchmarkCurveName("OTHER")
  val PFANDBRIEFE = BenchmarkCurveName("Pfandbriefe")
  val SONIA = BenchmarkCurveName("SONIA")
  val SWAP = BenchmarkCurveName("SWAP")
  val TREASURY = BenchmarkCurveName("Treasury")
}

case class BenchmarkCurvePoint(s: String) extends FixField(222, types.FixString(s))

case class CouponRate(percentage: Decimal) extends FixField(223, types.Percentage(percentage))

case class CouponPaymentDate(year: Int, month: Int, day: Int) extends FixField(224, types.LocalMktDate(year, month, day))

case class IssueDate(year: Int, month: Int, day: Int) extends FixField(225, types.LocalMktDate(year, month, day))

case class RepurchaseTerm(i: Int) extends FixField(226, types.FixInteger(i))

case class RepurchaseRate(percentage: Decimal) extends FixField(227, types.Percentage(percentage))

case class Factor(f: Decimal) extends FixField(228, types.FixFloat(f))

case class TradeOriginationDate(year: Int, month: Int, day: Int) extends FixField(229, types.LocalMktDate(year, month, day))

case class ExDate(year: Int, month: Int, day: Int) extends FixField(230, types.LocalMktDate(year, month, day))

case class ContractMultiplier(f: Decimal) extends FixField(231, types.FixFloat(f))

case class NoStipulations(num: Int) extends FixField(232, types.NumInGroup(num))

case class StipulationType(s: String) extends FixField(233, types.FixString(s))
object StipulationType {
  val ABSOLUTE_PREPAYMENT_SPEED = StipulationType("ABS")
  val AMT = StipulationType("AMT")
  val AUTO_REINVESTMENT_AT_OR_BETTER = StipulationType("AUTOREINV")
  val BANK_QUALIFIED = StipulationType("BANKQUAL")
  val BARGAIN_CONDITIONS = StipulationType("BGNCON")
  val COUPON_RANGE = StipulationType("COUPON")
  val CONSTANT_PREPAYMENT_PENALTY = StipulationType("CPP")
  val CONSTANT_PREPAYMENT_RATE = StipulationType("CPR")
  val CONSTANT_PREPAYMENT_YIELD = StipulationType("CPY")
  val ISO_CURRENCY_CODE = StipulationType("CURRENCY")
  val CUSTOM_START_END_DATE = StipulationType("CUSTOMDATE")
  val GEOGRAPHICS_AND_PERCENT_RANGE = StipulationType("GEOG")
  val VALUATION_DISCOUNT = StipulationType("HAIRCUT")
  val FINAL_CPR_OF_HOME_EQUITY_PREPAYMENT_CURVE = StipulationType("HEP")
  val INSURED = StipulationType("INSURED")
  val YEAR_OR_YEAR_MONTH_OF_ISSUE = StipulationType("ISSUE")
  val ISSUERS_TICKER = StipulationType("ISSUER")
  val ISSUE_SIZE_RANGE = StipulationType("ISSUESIZE")
  val LOOKBACK_DAYS = StipulationType("LOOKBACK")
  val EXPLICIT_LOT_IDENTIFIER = StipulationType("LOT")
  val LOT_VARIANCE = StipulationType("LOTVAR")
  val MATURITY_YEAR_AND_MONTH = StipulationType("MAT")
  val MATURITY_RANGE = StipulationType("MATURITY")
  val MAXIMUM_SUBSTITUTIONS = StipulationType("MAXSUBS")
  val PERCENT_OF_MANUFACTURED_HOUSING_PREPAYMENT_CURVE = StipulationType("MHP")
  val MINIMUM_DENOMINATION = StipulationType("MINDNOM")
  val MINIMUM_INCREMENT = StipulationType("MININCR")
  val MINIMUM_QUANTITY = StipulationType("MINQTY")
  val MONTHLY_PREPAYMENT_RATE = StipulationType("MPR")
  val PAYMENT_FREQUENCY_CALENDAR = StipulationType("PAYFREQ")
  val NUMBER_OF_PIECES = StipulationType("PIECES")
  val POOLS_MAXIMUM = StipulationType("PMAX")
  val PERCENT_OF_PROSPECTUS_PREPAYMENT_CURVE = StipulationType("PPC")
  val POOLS_PER_LOT = StipulationType("PPL")
  val POOLS_PER_MILLION = StipulationType("PPM")
  val POOLS_PER_TRADE = StipulationType("PPT")
  val PRICE_RANGE = StipulationType("PRICE")
  val PRICING_FREQUENCY = StipulationType("PRICEFREQ")
  val PRODUCTION_YEAR = StipulationType("PROD")
  val CALL_PROTECTION = StipulationType("PROTECT")
  val PERCENT_OF_BMA_PREPAYMENT_CURVE = StipulationType("PSA")
  val PURPOSE = StipulationType("PURPOSE")
  val BENCHMARK_PRICE_SOURCE = StipulationType("PXSOURCE")
  val RATING_SOURCE_AND_RANGE = StipulationType("RATING")
  val TYPE_OF_REDEMPTION = StipulationType("REDEMPTION")
  val RESTRICTED = StipulationType("RESTRICTED")
  val MARKET_SECTOR = StipulationType("SECTOR")
  val SECURITYTYPE_INCLUDED_OR_EXCLUDED = StipulationType("SECTYPE")
  val SINGLE_MONTHLY_MORTALITY = StipulationType("SMM")
  val STRUCTURE = StipulationType("STRUCT")
  val SUBSTITUTIONS_FREQUENCY = StipulationType("SUBSFREQ")
  val SUBSTITUTIONS_LEFT = StipulationType("SUBSLEFT")
  val FREEFORM_TEXT = StipulationType("TEXT")
  val TRADE_VARIANCE = StipulationType("TRDVAR")
  val WEIGHTED_AVERAGE_COUPON = StipulationType("WAC")
  val WEIGHTED_AVERAGE_LIFE_COUPON = StipulationType("WAL")
  val WEIGHTED_AVERAGE_LOAN_AGE = StipulationType("WALA")
  val WEIGHTED_AVERAGE_MATURITY = StipulationType("WAM")
  val WHOLE_POOL = StipulationType("WHOLE")
  val YIELD_RANGE = StipulationType("YIELD")
}

case class StipulationValue(s: String) extends FixField(234, types.FixString(s))
object StipulationValue {
  val SPECIAL_CUM_DIVIDEND = StipulationValue("CD")
  val SPECIAL_EX_DIVIDEND = StipulationValue("XD")
  val SPECIAL_CUM_COUPON = StipulationValue("CC")
  val SPECIAL_EX_COUPON = StipulationValue("XC")
  val SPECIAL_CUM_BONUS = StipulationValue("CB")
  val SPECIAL_EX_BONUS = StipulationValue("XB")
  val SPECIAL_CUM_RIGHTS = StipulationValue("CR")
  val SPECIAL_EX_RIGHTS = StipulationValue("XR")
  val SPECIAL_CUM_CAPITAL_REPAYMENTS = StipulationValue("CP")
  val SPECIAL_EX_CAPITAL_REPAYMENTS = StipulationValue("XP")
  val CASH_SETTLEMENT = StipulationValue("CS")
  val SPECIAL_PRICE = StipulationValue("SP")
  val REPORT_FOR_EUROPEAN_EQUITY_MARKET_SECURITIES = StipulationValue("TR")
  val GUARANTEED_DELIVERY = StipulationValue("GD")
}

case class YieldType(s: String) extends FixField(235, types.FixString(s))
object YieldType {
  val AFTER_TAX_YIELD = YieldType("AFTERTAX")
  val ANNUAL_YIELD = YieldType("ANNUAL")
  val YIELD_AT_ISSUE = YieldType("ATISSUE")
  val YIELD_TO_AVERAGE_MATURITY = YieldType("AVGMATURITY")
  val BOOK_YIELD = YieldType("BOOK")
  val YIELD_TO_NEXT_CALL = YieldType("CALL")
  val YIELD_CHANGE_SINCE_CLOSE = YieldType("CHANGE")
  val CLOSING_YIELD = YieldType("CLOSE")
  val COMPOUND_YIELD = YieldType("COMPOUND")
  val CURRENT_YIELD = YieldType("CURRENT")
  val GOVERNMENT_EQUIVALENT_YIELD = YieldType("GOVTEQUIV")
  val TRUE_GROSS_YIELD = YieldType("GROSS")
  val YIELD_WITH_INFLATION_ASSUMPTION = YieldType("INFLATION")
  val INVERSE_FLOATER_BOND_YIELD = YieldType("INVERSEFLOATER")
  val MOST_RECENT_CLOSING_YIELD = YieldType("LASTCLOSE")
  val CLOSING_YIELD_MOST_RECENT_MONTH = YieldType("LASTMONTH")
  val CLOSING_YIELD_MOST_RECENT_QUARTER = YieldType("LASTQUARTER")
  val CLOSING_YIELD_MOST_RECENT_YEAR = YieldType("LASTYEAR")
  val YIELD_TO_LONGEST_AVERAGE_LIFE = YieldType("LONGAVGLIFE")
  val MARK_TO_MARKET_YIELD = YieldType("MARK")
  val YIELD_TO_MATURITY = YieldType("MATURITY")
  val YIELD_TO_NEXT_REFUND = YieldType("NEXTREFUND")
  val OPEN_AVERAGE_YIELD = YieldType("OPENAVG")
  val PREVIOUS_CLOSE_YIELD = YieldType("PREVCLOSE")
  val PROCEEDS_YIELD = YieldType("PROCEEDS")
  val YIELD_TO_NEXT_PUT = YieldType("PUT")
  val SEMI_ANNUAL_YIELD = YieldType("SEMIANNUAL")
  val YIELD_TO_SHORTEST_AVERAGE_LIFE = YieldType("SHORTAVGLIFE")
  val SIMPLE_YIELD = YieldType("SIMPLE")
  val TAX_EQUIVALENT_YIELD = YieldType("TAXEQUIV")
  val YIELD_TO_TENDER_DATE = YieldType("TENDER")
  val TRUE_YIELD = YieldType("TRUE")
  val YIELD_VALUE_OF_1_32 = YieldType("VALUE1_32")
  val YIELD_TO_WORST = YieldType("WORST")
}

case class Yield(percentage: Decimal) extends FixField(236, types.Percentage(percentage))

case class TotalTakedown(amount: Decimal) extends FixField(237, types.Amt(amount))

case class Concession(amount: Decimal) extends FixField(238, types.Amt(amount))

case class RepoCollateralSecurityType(i: Int) extends FixField(239, types.FixInteger(i))

case class RedemptionDate(year: Int, month: Int, day: Int) extends FixField(240, types.LocalMktDate(year, month, day))

case class UnderlyingCouponPaymentDate(year: Int, month: Int, day: Int) extends FixField(241, types.LocalMktDate(year, month, day))

case class UnderlyingIssueDate(year: Int, month: Int, day: Int) extends FixField(242, types.LocalMktDate(year, month, day))

case class UnderlyingRepoCollateralSecurityType(i: Int) extends FixField(243, types.FixInteger(i))

case class UnderlyingRepurchaseTerm(i: Int) extends FixField(244, types.FixInteger(i))

case class UnderlyingRepurchaseRate(percentage: Decimal) extends FixField(245, types.Percentage(percentage))

case class UnderlyingFactor(f: Decimal) extends FixField(246, types.FixFloat(f))

case class UnderlyingRedemptionDate(year: Int, month: Int, day: Int) extends FixField(247, types.LocalMktDate(year, month, day))

case class LegCouponPaymentDate(year: Int, month: Int, day: Int) extends FixField(248, types.LocalMktDate(year, month, day))

case class LegIssueDate(year: Int, month: Int, day: Int) extends FixField(249, types.LocalMktDate(year, month, day))

case class LegRepoCollateralSecurityType(i: Int) extends FixField(250, types.FixInteger(i))

case class LegRepurchaseTerm(i: Int) extends FixField(251, types.FixInteger(i))

case class LegRepurchaseRate(percentage: Decimal) extends FixField(252, types.Percentage(percentage))

case class LegFactor(f: Decimal) extends FixField(253, types.FixFloat(f))

case class LegRedemptionDate(year: Int, month: Int, day: Int) extends FixField(254, types.LocalMktDate(year, month, day))

case class CreditRating(s: String) extends FixField(255, types.FixString(s))

case class UnderlyingCreditRating(s: String) extends FixField(256, types.FixString(s))

case class LegCreditRating(s: String) extends FixField(257, types.FixString(s))

case class TradedFlatSwitch(bool: Boolean) extends FixField(258, types.FixBoolean(bool))

case class BasisFeatureDate(year: Int, month: Int, day: Int) extends FixField(259, types.LocalMktDate(year, month, day))

case class BasisFeaturePrice(price: Decimal) extends FixField(260, types.Price(price))

case class MDReqID(s: String) extends FixField(262, types.FixString(s))

case class SubscriptionRequestType(c: Char) extends FixField(263, types.FixChar(c))
object SubscriptionRequestType {
  val SNAPSHOT = SubscriptionRequestType('0')
  val SNAPSHOT_PLUS_UPDATES = SubscriptionRequestType('1')
  val DISABLE_PREVIOUS_SNAPSHOT_PLUS_UPDATE_REQUEST = SubscriptionRequestType('2')
}

case class MarketDepth(i: Int) extends FixField(264, types.FixInteger(i))

case class MDUpdateType(i: Int) extends FixField(265, types.FixInteger(i))
object MDUpdateType {
  val FULL_REFRESH = MDUpdateType(0)
  val INCREMENTAL_REFRESH = MDUpdateType(1)
}

case class AggregatedBook(bool: Boolean) extends FixField(266, types.FixBoolean(bool))

case class NoMDEntryTypes(num: Int) extends FixField(267, types.NumInGroup(num))

case class NoMDEntries(num: Int) extends FixField(268, types.NumInGroup(num))

case class MDEntryType(c: Char) extends FixField(269, types.FixChar(c))
object MDEntryType {
  val BID = MDEntryType('0')
  val OFFER = MDEntryType('1')
  val TRADE = MDEntryType('2')
  val INDEX_VALUE = MDEntryType('3')
  val OPENING_PRICE = MDEntryType('4')
  val CLOSING_PRICE = MDEntryType('5')
  val SETTLEMENT_PRICE = MDEntryType('6')
  val TRADING_SESSION_HIGH_PRICE = MDEntryType('7')
  val TRADING_SESSION_LOW_PRICE = MDEntryType('8')
  val TRADING_SESSION_VWAP_PRICE = MDEntryType('9')
  val IMBALANCE = MDEntryType('A')
  val TRADE_VOLUME = MDEntryType('B')
  val OPEN_INTEREST = MDEntryType('C')
  val COMPOSITE_UNDERLYING_PRICE = MDEntryType('D')
  val SIMULATED_SELL_PRICE = MDEntryType('E')
  val SIMULATED_BUY_PRICE = MDEntryType('F')
  val MARGIN_RATE = MDEntryType('G')
  val MID_PRICE = MDEntryType('H')
  val EMPTY_BOOK = MDEntryType('J')
  val SETTLE_HIGH_PRICE = MDEntryType('K')
  val SETTLE_LOW_PRICE = MDEntryType('L')
  val PRIOR_SETTLE_PRICE = MDEntryType('M')
  val SESSION_HIGH_BID = MDEntryType('N')
  val SESSION_LOW_OFFER = MDEntryType('O')
  val EARLY_PRICES = MDEntryType('P')
  val AUCTION_CLEARING_PRICE = MDEntryType('Q')
}

case class MDEntryPx(price: Decimal) extends FixField(270, types.Price(price))

case class MDEntrySize(qty: Decimal) extends FixField(271, types.Qty(qty))

case class MDEntryDate(year: Int, month: Int, day: Int) extends FixField(272, types.UTCDateOnly(year, month, day))

case class MDEntryTime(hour: Int, minute: Int, second: Int, millis: Int) extends FixField(273, types.UTCTimeOnly(hour, minute, second, millis))

case class TickDirection(c: Char) extends FixField(274, types.FixChar(c))
object TickDirection {
  val PLUS_TICK = TickDirection('0')
  val ZERO_PLUS_TICK = TickDirection('1')
  val MINUS_TICK = TickDirection('2')
  val ZERO_MINUS_TICK = TickDirection('3')
}

case class MDMkt(code: String) extends FixField(275, types.Exchange(code))

case class QuoteCondition(strings: String*) extends FixField(276, types.MultipleStringValue(strings: _*))
object QuoteCondition {
  val OPEN_ACTIVE = QuoteCondition("A")
  val CLOSED_INACTIVE = QuoteCondition("B")
  val EXCHANGE_BEST = QuoteCondition("C")
  val CONSOLIDATED_BEST = QuoteCondition("D")
  val LOCKED = QuoteCondition("E")
  val CROSSED = QuoteCondition("F")
  val DEPTH = QuoteCondition("G")
  val FAST_TRADING = QuoteCondition("H")
  val NON_FIRM = QuoteCondition("I")
  val MANUAL_SLOW_QUOTE = QuoteCondition("L")
  val OUTRIGHT_PRICE = QuoteCondition("J")
  val IMPLIED_PRICE = QuoteCondition("K")
  val DEPTH_ON_OFFER = QuoteCondition("M")
  val DEPTH_ON_BID = QuoteCondition("N")
  val CLOSING = QuoteCondition("O")
  val NEWS_DISSEMINATION = QuoteCondition("P")
  val TRADING_RANGE = QuoteCondition("Q")
  val ORDER_INFLUX = QuoteCondition("R")
  val DUE_TO_RELATED = QuoteCondition("S")
  val NEWS_PENDING = QuoteCondition("T")
  val ADDITIONAL_INFO = QuoteCondition("U")
  val ADDITIONAL_INFO_DUE_TO_RELATED = QuoteCondition("V")
  val RESUME = QuoteCondition("W")
  val VIEW_OF_COMMON = QuoteCondition("X")
  val VOLUME_ALERT = QuoteCondition("Y")
  val ORDER_IMBALANCE = QuoteCondition("Z")
  val EQUIPMENT_CHANGEOVER = QuoteCondition("a")
  val NO_OPEN = QuoteCondition("b")
  val REGULAR_ETH = QuoteCondition("c")
  val AUTOMATIC_EXECUTION = QuoteCondition("d")
  val AUTOMATIC_EXECUTION_ETH = QuoteCondition("e")
  val FAST_MARKET_ETH = QuoteCondition("f")
  val INACTIVE_ETH = QuoteCondition("g")
  val ROTATION = QuoteCondition("h")
  val ROTATION_ETH = QuoteCondition("i")
  val HALT = QuoteCondition("j")
  val HALT_ETH = QuoteCondition("k")
  val DUE_TO_NEWS_DISSEMINATION = QuoteCondition("l")
  val DUE_TO_NEWS_PENDING = QuoteCondition("m")
  val TRADING_RESUME = QuoteCondition("n")
  val OUT_OF_SEQUENCE = QuoteCondition("o")
  val BID_SPECIALIST = QuoteCondition("p")
  val OFFER_SPECIALIST = QuoteCondition("q")
  val BID_OFFER_SPECIALIST = QuoteCondition("r")
  val END_OF_DAY_SAM = QuoteCondition("s")
  val FORBIDDEN_SAM = QuoteCondition("t")
  val FROZEN_SAM = QuoteCondition("u")
  val PREOPENING_SAM = QuoteCondition("v")
  val OPENING_SAM = QuoteCondition("w")
  val OPEN_SAM = QuoteCondition("x")
  val SURVEILLANCE_SAM = QuoteCondition("y")
  val SUSPENDED_SAM = QuoteCondition("z")
  val RESERVED_SAM = QuoteCondition("0")
  val NO_ACTIVE_SAM = QuoteCondition("1")
  val RESTRICTED = QuoteCondition("2")
  val NO_MARKET_ACTIVITY = QuoteCondition("1000")
  val NO_DATA_AVAILABLE = QuoteCondition("1001")
  val NOT_APPLICABLE = QuoteCondition("1002")
  val AMOUNT_THRESHOLD_EXCEEDED = QuoteCondition("1003")
}

case class TradeCondition(strings: String*) extends FixField(277, types.MultipleStringValue(strings: _*))
object TradeCondition {
  val CASH_MARKET = TradeCondition("A")
  val AVERAGE_PRICE_TRADE = TradeCondition("B")
  val CASH_TRADE = TradeCondition("C")
  val NEXT_DAY_MARKET = TradeCondition("D")
  val OPENING_REOPENING_TRADE_DETAIL = TradeCondition("E")
  val INTRADAY_TRADE_DETAIL = TradeCondition("F")
  val RULE127 = TradeCondition("G")
  val RULE155 = TradeCondition("H")
  val SOLD_LAST = TradeCondition("I")
  val NEXT_DAY_TRADE = TradeCondition("J")
  val OPENED = TradeCondition("K")
  val SELLER = TradeCondition("L")
  val SOLD = TradeCondition("M")
  val STOPPED_STOCK = TradeCondition("N")
  val IMBALANCE_MORE_BUYERS = TradeCondition("P")
  val IMBALANCE_MORE_SELLERS = TradeCondition("Q")
  val OPENING_PRICE = TradeCondition("R")
  val TRADES_RESULTING_FROM_MANUAL_SLOW_QUOTE = TradeCondition("Y")
  val TRADES_RESULTING_FROM_INTERMARKET_SWEEP = TradeCondition("Z")
  val BARGAIN_CONDITION = TradeCondition("S")
  val CONVERTED_PRICE_INDICATOR = TradeCondition("T")
  val EXCHANGE_LAST = TradeCondition("U")
  val FINAL_PRICE_OF_SESSION = TradeCondition("V")
  val EX_PIT = TradeCondition("W")
  val CROSSED = TradeCondition("X")
  val CANCEL = TradeCondition("0")
  val VOLUME_ONLY = TradeCondition("a")
  val DIRECT_PLUS = TradeCondition("b")
  val ACQUISITION = TradeCondition("c")
  val BUNCHED = TradeCondition("d")
  val DISTRIBUTION = TradeCondition("e")
  val BUNCHED_SALE = TradeCondition("f")
  val SPLIT_TRADE = TradeCondition("g")
  val CANCEL_STOPPED = TradeCondition("h")
  val CANCEL_ETH = TradeCondition("i")
  val CANCEL_STOPPED_ETH = TradeCondition("j")
  val OUT_OF_SEQUENCE_ETH = TradeCondition("k")
  val CANCEL_LAST_ETH = TradeCondition("l")
  val SOLD_LAST_SALE_ETH = TradeCondition("m")
  val CANCEL_LAST = TradeCondition("n")
  val SOLD_LAST_SALE = TradeCondition("o")
  val CANCEL_OPEN = TradeCondition("p")
  val CANCEL_OPEN_ETH = TradeCondition("q")
  val OPENED_SALE_ETH = TradeCondition("r")
  val CANCEL_ONLY = TradeCondition("s")
  val CANCEL_ONLY_ETH = TradeCondition("t")
  val LATE_OPEN_ETH = TradeCondition("u")
  val AUTO_EXECUTION_ETH = TradeCondition("v")
  val REOPEN = TradeCondition("w")
  val REOPEN_ETH = TradeCondition("x")
  val ADJUSTED = TradeCondition("y")
  val ADJUSTED_ETH = TradeCondition("z")
  val SPREAD = TradeCondition("AA")
  val SPREAD_ETH = TradeCondition("AB")
  val STRADDLE = TradeCondition("AC")
  val STRADDLE_ETH = TradeCondition("AD")
  val STOPPED = TradeCondition("AE")
  val STOPPED_ETH = TradeCondition("AF")
  val REGULAR_ETH = TradeCondition("AG")
  val COMBO = TradeCondition("AH")
  val COMBO_ETH = TradeCondition("AI")
  val OFFICIAL_CLOSING_PRICE = TradeCondition("AJ")
  val PRIOR_REFERENCE_PRICE = TradeCondition("AK")
  val STOPPED_SOLD_LAST = TradeCondition("AL")
  val STOPPED_OUT_OF_SEQUENCE = TradeCondition("AM")
  val OFFICAL_CLOSING_PRICE = TradeCondition("AN")
  val CROSSED2 = TradeCondition("AO")
  val FAST_MARKET = TradeCondition("AP")
  val AUTOMATIC_EXECUTION = TradeCondition("AQ")
  val FORM_T = TradeCondition("AR")
  val BASKET_INDEX = TradeCondition("AS")
  val BURST_BASKET = TradeCondition("AT")
  val NO_MARKET_ACTIVITY = TradeCondition("1000")
  val NO_DATA_AVAILABLE = TradeCondition("1001")
  val NOT_APPLICABLE = TradeCondition("1002")
}

case class MDEntryID(s: String) extends FixField(278, types.FixString(s))

case class MDUpdateAction(c: Char) extends FixField(279, types.FixChar(c))
object MDUpdateAction {
  val NEW = MDUpdateAction('0')
  val CHANGE = MDUpdateAction('1')
  val DELETE = MDUpdateAction('2')
  val DELETE_THRU = MDUpdateAction('3')
  val DELETE_FROM = MDUpdateAction('4')
}

case class MDEntryRefID(s: String) extends FixField(280, types.FixString(s))

case class MDReqRejReason(c: Char) extends FixField(281, types.FixChar(c))
object MDReqRejReason {
  val UNKNOWN_SYMBOL = MDReqRejReason('0')
  val DUPLICATE_MDREQID = MDReqRejReason('1')
  val INSUFFICIENT_BANDWIDTH = MDReqRejReason('2')
  val INSUFFICIENT_PERMISSIONS = MDReqRejReason('3')
  val UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE = MDReqRejReason('4')
  val UNSUPPORTED_MARKETDEPTH = MDReqRejReason('5')
  val UNSUPPORTED_MDUPDATETYPE = MDReqRejReason('6')
  val UNSUPPORTED_AGGREGATEDBOOK = MDReqRejReason('7')
  val UNSUPPORTED_MDENTRYTYPE = MDReqRejReason('8')
  val UNSUPPORTED_TRADINGSESSIONID = MDReqRejReason('9')
  val UNSUPPORTED_SCOPE = MDReqRejReason('A')
  val UNSUPPORTED_OPENCLOSESETTLEFLAG = MDReqRejReason('B')
  val UNSUPPORTED_MDIMPLICITDELETE = MDReqRejReason('C')
  val INSUFFICIENT_CREDIT = MDReqRejReason('D')
}

case class MDEntryOriginator(s: String) extends FixField(282, types.FixString(s))

case class LocationID(s: String) extends FixField(283, types.FixString(s))

case class DeskID(s: String) extends FixField(284, types.FixString(s))

case class DeleteReason(c: Char) extends FixField(285, types.FixChar(c))
object DeleteReason {
  val CANCELATION_TRADE_BUST = DeleteReason('0')
  val ERROR = DeleteReason('1')
}

case class OpenCloseSettlFlag(chars: Char*) extends FixField(286, types.MultipleCharValue(chars: _*))
object OpenCloseSettlFlag {
  val DAILY_OPEN_CLOSE_SETTLEMENT_ENTRY = OpenCloseSettlFlag('0')
  val SESSION_OPEN_CLOSE_SETTLEMENT_ENTRY = OpenCloseSettlFlag('1')
  val DELIVERY_SETTLEMENT_ENTRY = OpenCloseSettlFlag('2')
  val EXPECTED_ENTRY = OpenCloseSettlFlag('3')
  val ENTRY_FROM_PREVIOUS_BUSINESS_DAY = OpenCloseSettlFlag('4')
  val THEORETICAL_PRICE_VALUE = OpenCloseSettlFlag('5')
}

case class SellerDays(i: Int) extends FixField(287, types.FixInteger(i))

case class MDEntryBuyer(s: String) extends FixField(288, types.FixString(s))

case class MDEntrySeller(s: String) extends FixField(289, types.FixString(s))

case class MDEntryPositionNo(i: Int) extends FixField(290, types.FixInteger(i))

case class FinancialStatus(chars: Char*) extends FixField(291, types.MultipleCharValue(chars: _*))
object FinancialStatus {
  val BANKRUPT = FinancialStatus('1')
  val PENDING_DELISTING = FinancialStatus('2')
  val RESTRICTED = FinancialStatus('3')
}

case class CorporateAction(chars: Char*) extends FixField(292, types.MultipleCharValue(chars: _*))
object CorporateAction {
  val EX_DIVIDEND = CorporateAction('A')
  val EX_DISTRIBUTION = CorporateAction('B')
  val EX_RIGHTS = CorporateAction('C')
  val NEW = CorporateAction('D')
  val EX_INTEREST = CorporateAction('E')
  val CASH_DIVIDEND = CorporateAction('F')
  val STOCK_DIVIDEND = CorporateAction('G')
  val NON_INTEGER_STOCK_SPLIT = CorporateAction('H')
  val REVERSE_STOCK_SPLIT = CorporateAction('I')
  val STANDARD_INTEGER_STOCK_SPLIT = CorporateAction('J')
  val POSITION_CONSOLIDATION = CorporateAction('K')
  val LIQUIDATION_REORGANIZATION = CorporateAction('L')
  val MERGER_REORGANIZATION = CorporateAction('M')
  val RIGHTS_OFFERING = CorporateAction('N')
  val SHAREHOLDER_MEETING = CorporateAction('O')
  val SPINOFF = CorporateAction('P')
  val TENDER_OFFER = CorporateAction('Q')
  val WARRANT = CorporateAction('R')
  val SPECIAL_ACTION = CorporateAction('S')
  val SYMBOL_CONVERSION = CorporateAction('T')
  val CUSIP = CorporateAction('U')
  val LEAP_ROLLOVER = CorporateAction('V')
}

case class DefBidSize(qty: Decimal) extends FixField(293, types.Qty(qty))

case class DefOfferSize(qty: Decimal) extends FixField(294, types.Qty(qty))

case class NoQuoteEntries(num: Int) extends FixField(295, types.NumInGroup(num))

case class NoQuoteSets(num: Int) extends FixField(296, types.NumInGroup(num))

case class QuoteStatus(i: Int) extends FixField(297, types.FixInteger(i))
object QuoteStatus {
  val ACCEPTED = QuoteStatus(0)
  val CANCELED_FOR_SYMBOL = QuoteStatus(1)
  val PENDING = QuoteStatus(10)
  val PASS = QuoteStatus(11)
  val LOCKED_MARKET_WARNING = QuoteStatus(12)
  val CROSS_MARKET_WARNING = QuoteStatus(13)
  val CANCELED_DUE_TO_LOCK_MARKET = QuoteStatus(14)
  val CANCELED_DUE_TO_CROSS_MARKET = QuoteStatus(15)
  val CANCELED_FOR_SECURITY_TYPE = QuoteStatus(2)
  val CANCELED_FOR_UNDERLYING = QuoteStatus(3)
  val CANCELED_ALL = QuoteStatus(4)
  val REJECTED = QuoteStatus(5)
  val REMOVED_FROM_MARKET = QuoteStatus(6)
  val EXPIRED = QuoteStatus(7)
  val QUERY = QuoteStatus(8)
  val QUOTE_NOT_FOUND = QuoteStatus(9)
}

case class QuoteCancelType(i: Int) extends FixField(298, types.FixInteger(i))
object QuoteCancelType {
  val CANCEL_FOR_SYMBOL = QuoteCancelType(1)
  val CANCEL_FOR_SECURITY_TYPE = QuoteCancelType(2)
  val CANCEL_FOR_UNDERLYING_SYMBOL = QuoteCancelType(3)
  val CANCEL_ALL_QUOTES = QuoteCancelType(4)
  val CANCEL_QUOTE_SPECIFIED_IN_QUOTEID = QuoteCancelType(5)
}

case class QuoteEntryID(s: String) extends FixField(299, types.FixString(s))

case class QuoteRejectReason(i: Int) extends FixField(300, types.FixInteger(i))
object QuoteRejectReason {
  val UNKNOWN_SYMBOL = QuoteRejectReason(1)
  val EXCHANGE_CLOSED = QuoteRejectReason(2)
  val QUOTE_REQUEST_EXCEEDS_LIMIT = QuoteRejectReason(3)
  val TOO_LATE_TO_ENTER = QuoteRejectReason(4)
  val UNKNOWN_QUOTE = QuoteRejectReason(5)
  val DUPLICATE_QUOTE = QuoteRejectReason(6)
  val INVALID_BID_ASK_SPREAD = QuoteRejectReason(7)
  val INVALID_PRICE = QuoteRejectReason(8)
  val NOT_AUTHORIZED_TO_QUOTE_SECURITY = QuoteRejectReason(9)
  val OTHER = QuoteRejectReason(99)
}

case class QuoteResponseLevel(i: Int) extends FixField(301, types.FixInteger(i))
object QuoteResponseLevel {
  val NO_ACKNOWLEDGEMENT = QuoteResponseLevel(0)
  val ACKNOWLEDGE_ONLY_NEGATIVE_OR_ERRONEOUS_QUOTES = QuoteResponseLevel(1)
  val ACKNOWLEDGE_EACH_QUOTE_MESSAGES = QuoteResponseLevel(2)
}

case class QuoteSetID(s: String) extends FixField(302, types.FixString(s))

case class QuoteRequestType(i: Int) extends FixField(303, types.FixInteger(i))
object QuoteRequestType {
  val MANUAL = QuoteRequestType(1)
  val AUTOMATIC = QuoteRequestType(2)
}

case class TotNoQuoteEntries(i: Int) extends FixField(304, types.FixInteger(i))

case class UnderlyingSecurityIDSource(s: String) extends FixField(305, types.FixString(s))

case class UnderlyingIssuer(s: String) extends FixField(306, types.FixString(s))

case class UnderlyingSecurityDesc(s: String) extends FixField(307, types.FixString(s))

case class UnderlyingSecurityExchange(code: String) extends FixField(308, types.Exchange(code))

case class UnderlyingSecurityID(s: String) extends FixField(309, types.FixString(s))

case class UnderlyingSecurityType(s: String) extends FixField(310, types.FixString(s))

case class UnderlyingSymbol(s: String) extends FixField(311, types.FixString(s))

case class UnderlyingSymbolSfx(s: String) extends FixField(312, types.FixString(s))

case class UnderlyingMaturityMonthYear(year: Int, month: Int, day: Option[Int], week: Option[Int]) extends FixField(313, types.MonthYear(year, month, day, week))

case class UnderlyingMaturityDay(day: Int) extends FixField(314, types.DayOfMonth(day))

case class UnderlyingPutOrCall(i: Int) extends FixField(315, types.FixInteger(i))

case class UnderlyingStrikePrice(price: Decimal) extends FixField(316, types.Price(price))

case class UnderlyingOptAttribute(c: Char) extends FixField(317, types.FixChar(c))

case class UnderlyingCurrency(code: String) extends FixField(318, types.Currency(code))

case class RatioQty(qty: Decimal) extends FixField(319, types.Qty(qty))

case class SecurityReqID(s: String) extends FixField(320, types.FixString(s))

case class SecurityRequestType(i: Int) extends FixField(321, types.FixInteger(i))
object SecurityRequestType {
  val REQUEST_SECURITY_IDENTITY_AND_SPECIFICATIONS = SecurityRequestType(0)
  val REQUEST_SECURITY_IDENTITY_FOR_THE_SPECIFICATIONS_PROVIDED = SecurityRequestType(1)
  val REQUEST_LIST_SECURITY_TYPES = SecurityRequestType(2)
  val REQUEST_LIST_SECURITIES = SecurityRequestType(3)
}

case class SecurityResponseID(s: String) extends FixField(322, types.FixString(s))

case class SecurityResponseType(i: Int) extends FixField(323, types.FixInteger(i))
object SecurityResponseType {
  val ACCEPT_SECURITY_PROPOSAL_AS_IS = SecurityResponseType(1)
  val ACCEPT_SECURITY_PROPOSAL_WITH_REVISIONS_AS_INDICATED_IN_THE_MESSAGE = SecurityResponseType(2)
  val LIST_OF_SECURITY_TYPES_RETURNED_PER_REQUEST = SecurityResponseType(3)
  val LIST_OF_SECURITIES_RETURNED_PER_REQUEST = SecurityResponseType(4)
  val REJECT_SECURITY_PROPOSAL = SecurityResponseType(5)
  val CAN_NOT_MATCH_SELECTION_CRITERIA = SecurityResponseType(6)
}

case class SecurityStatusReqID(s: String) extends FixField(324, types.FixString(s))

case class UnsolicitedIndicator(bool: Boolean) extends FixField(325, types.FixBoolean(bool))

case class SecurityTradingStatus(i: Int) extends FixField(326, types.FixInteger(i))
object SecurityTradingStatus {
  val OPENING_DELAY = SecurityTradingStatus(1)
  val MARKET_ON_CLOSE_IMBALANCE_SELL = SecurityTradingStatus(10)
  val NOT_ASSIGNED = SecurityTradingStatus(11)
  val NO_MARKET_IMBALANCE = SecurityTradingStatus(12)
  val NO_MARKET_ON_CLOSE_IMBALANCE = SecurityTradingStatus(13)
  val ITS_PRE_OPENING = SecurityTradingStatus(14)
  val NEW_PRICE_INDICATION = SecurityTradingStatus(15)
  val TRADE_DISSEMINATION_TIME = SecurityTradingStatus(16)
  val READY_TO_TRADE_START_OF_SESSION = SecurityTradingStatus(17)
  val NOT_AVAILABLE_FOR_TRADING_END_OF_SESSION = SecurityTradingStatus(18)
  val NOT_TRADED_ON_THIS_MARKET = SecurityTradingStatus(19)
  val TRADING_HALT = SecurityTradingStatus(2)
  val UNKNOWN_OR_INVALID = SecurityTradingStatus(20)
  val PRE_OPEN = SecurityTradingStatus(21)
  val OPENING_ROTATION = SecurityTradingStatus(22)
  val FAST_MARKET = SecurityTradingStatus(23)
  val RESUME = SecurityTradingStatus(3)
  val NO_OPEN_NO_RESUME = SecurityTradingStatus(4)
  val PRICE_INDICATION = SecurityTradingStatus(5)
  val TRADING_RANGE_INDICATION = SecurityTradingStatus(6)
  val MARKET_IMBALANCE_BUY = SecurityTradingStatus(7)
  val MARKET_IMBALANCE_SELL = SecurityTradingStatus(8)
  val MARKET_ON_CLOSE_IMBALANCE_BUY = SecurityTradingStatus(9)
}

case class HaltReason(c: Char) extends FixField(327, types.FixChar(c))
object HaltReason {
  val NEWS_DISSEMINATION = HaltReason('D')
  val ORDER_INFLUX = HaltReason('E')
  val ORDER_IMBALANCE = HaltReason('I')
  val ADDITIONAL_INFORMATION = HaltReason('M')
  val NEWS_PENDING = HaltReason('P')
  val EQUIPMENT_CHANGEOVER = HaltReason('X')
}

case class InViewOfCommon(bool: Boolean) extends FixField(328, types.FixBoolean(bool))

case class DueToRelated(bool: Boolean) extends FixField(329, types.FixBoolean(bool))

case class BuyVolume(qty: Decimal) extends FixField(330, types.Qty(qty))

case class SellVolume(qty: Decimal) extends FixField(331, types.Qty(qty))

case class HighPx(price: Decimal) extends FixField(332, types.Price(price))

case class LowPx(price: Decimal) extends FixField(333, types.Price(price))

case class Adjustment(i: Int) extends FixField(334, types.FixInteger(i))
object Adjustment {
  val CANCEL = Adjustment(1)
  val ERROR = Adjustment(2)
  val CORRECTION = Adjustment(3)
}

case class TradSesReqID(s: String) extends FixField(335, types.FixString(s))

case class TradingSessionID(s: String) extends FixField(336, types.FixString(s))

case class ContraTrader(s: String) extends FixField(337, types.FixString(s))

case class TradSesMethod(i: Int) extends FixField(338, types.FixInteger(i))
object TradSesMethod {
  val ELECTRONIC = TradSesMethod(1)
  val OPEN_OUTCRY = TradSesMethod(2)
  val TWO_PARTY = TradSesMethod(3)
}

case class TradSesMode(i: Int) extends FixField(339, types.FixInteger(i))
object TradSesMode {
  val TESTING = TradSesMode(1)
  val SIMULATED = TradSesMode(2)
  val PRODUCTION = TradSesMode(3)
}

case class TradSesStatus(i: Int) extends FixField(340, types.FixInteger(i))
object TradSesStatus {
  val UNKNOWN = TradSesStatus(0)
  val HALTED = TradSesStatus(1)
  val OPEN = TradSesStatus(2)
  val CLOSED = TradSesStatus(3)
  val PRE_OPEN = TradSesStatus(4)
  val PRE_CLOSE = TradSesStatus(5)
  val REQUEST_REJECTED = TradSesStatus(6)
}

case class TradSesStartTime(timestamp: Date) extends FixField(341, types.UTCTimestamp(timestamp))

case class TradSesOpenTime(timestamp: Date) extends FixField(342, types.UTCTimestamp(timestamp))

case class TradSesPreCloseTime(timestamp: Date) extends FixField(343, types.UTCTimestamp(timestamp))

case class TradSesCloseTime(timestamp: Date) extends FixField(344, types.UTCTimestamp(timestamp))

case class TradSesEndTime(timestamp: Date) extends FixField(345, types.UTCTimestamp(timestamp))

case class NumberOfOrders(i: Int) extends FixField(346, types.FixInteger(i))

case class MessageEncoding(s: String) extends FixField(347, types.FixString(s))
object MessageEncoding {
  val ISO_2022_JP = MessageEncoding("ISO-2022-JP")
  val EUC_JP = MessageEncoding("EUC-JP")
  val SHIFT_JIS = MessageEncoding("SHIFT_JIS")
  val UTF_8 = MessageEncoding("UTF-8")
}

case class EncodedIssuerLen(length: Int) extends FixField(348, types.Length(length))

case class EncodedIssuer(data: Array[Byte]) extends FixField(349, types.Data(data))

case class EncodedSecurityDescLen(length: Int) extends FixField(350, types.Length(length))

case class EncodedSecurityDesc(data: Array[Byte]) extends FixField(351, types.Data(data))

case class EncodedListExecInstLen(length: Int) extends FixField(352, types.Length(length))

case class EncodedListExecInst(data: Array[Byte]) extends FixField(353, types.Data(data))

case class EncodedTextLen(length: Int) extends FixField(354, types.Length(length))

case class EncodedText(data: Array[Byte]) extends FixField(355, types.Data(data))

case class EncodedSubjectLen(length: Int) extends FixField(356, types.Length(length))

case class EncodedSubject(data: Array[Byte]) extends FixField(357, types.Data(data))

case class EncodedHeadlineLen(length: Int) extends FixField(358, types.Length(length))

case class EncodedHeadline(data: Array[Byte]) extends FixField(359, types.Data(data))

case class EncodedAllocTextLen(length: Int) extends FixField(360, types.Length(length))

case class EncodedAllocText(data: Array[Byte]) extends FixField(361, types.Data(data))

case class EncodedUnderlyingIssuerLen(length: Int) extends FixField(362, types.Length(length))

case class EncodedUnderlyingIssuer(data: Array[Byte]) extends FixField(363, types.Data(data))

case class EncodedUnderlyingSecurityDescLen(length: Int) extends FixField(364, types.Length(length))

case class EncodedUnderlyingSecurityDesc(data: Array[Byte]) extends FixField(365, types.Data(data))

case class AllocPrice(price: Decimal) extends FixField(366, types.Price(price))

case class QuoteSetValidUntilTime(timestamp: Date) extends FixField(367, types.UTCTimestamp(timestamp))

case class QuoteEntryRejectReason(i: Int) extends FixField(368, types.FixInteger(i))
object QuoteEntryRejectReason {
  val UNKNOWN_SYMBOL = QuoteEntryRejectReason(1)
  val EXCHANGE_CLOSED = QuoteEntryRejectReason(2)
  val QUOTE_EXCEEDS_LIMIT = QuoteEntryRejectReason(3)
  val TOO_LATE_TO_ENTER = QuoteEntryRejectReason(4)
  val UNKNOWN_QUOTE = QuoteEntryRejectReason(5)
  val DUPLICATE_QUOTE = QuoteEntryRejectReason(6)
  val INVALID_BID_ASK_SPREAD = QuoteEntryRejectReason(7)
  val INVALID_PRICE = QuoteEntryRejectReason(8)
  val NOT_AUTHORIZED_TO_QUOTE_SECURITY = QuoteEntryRejectReason(9)
  val OTHER = QuoteEntryRejectReason(99)
}

case class LastMsgSeqNumProcessed(seqNum: Int) extends FixField(369, types.SeqNum(seqNum))

case class OnBehalfOfSendingTime(timestamp: Date) extends FixField(370, types.UTCTimestamp(timestamp))

case class RefTagID(i: Int) extends FixField(371, types.FixInteger(i))

case class RefMsgType(s: String) extends FixField(372, types.FixString(s))

case class SessionRejectReason(i: Int) extends FixField(373, types.FixInteger(i))
object SessionRejectReason {
  val INVALID_TAG_NUMBER = SessionRejectReason(0)
  val REQUIRED_TAG_MISSING = SessionRejectReason(1)
  val SENDINGTIME_ACCURACY_PROBLEM = SessionRejectReason(10)
  val INVALID_MSGTYPE = SessionRejectReason(11)
  val XML_VALIDATION_ERROR = SessionRejectReason(12)
  val TAG_APPEARS_MORE_THAN_ONCE = SessionRejectReason(13)
  val TAG_SPECIFIED_OUT_OF_REQUIRED_ORDER = SessionRejectReason(14)
  val REPEATING_GROUP_FIELDS_OUT_OF_ORDER = SessionRejectReason(15)
  val INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP = SessionRejectReason(16)
  val NON_DATA_VALUE_INCLUDES_FIELD_DELIMITER = SessionRejectReason(17)
  val TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE = SessionRejectReason(2)
  val UNDEFINED_TAG = SessionRejectReason(3)
  val TAG_SPECIFIED_WITHOUT_A_VALUE = SessionRejectReason(4)
  val VALUE_IS_INCORRECT = SessionRejectReason(5)
  val INCORRECT_DATA_FORMAT_FOR_VALUE = SessionRejectReason(6)
  val DECRYPTION_PROBLEM = SessionRejectReason(7)
  val SIGNATURE_PROBLEM = SessionRejectReason(8)
  val COMPID_PROBLEM = SessionRejectReason(9)
  val OTHER = SessionRejectReason(99)
}

case class BidRequestTransType(c: Char) extends FixField(374, types.FixChar(c))
object BidRequestTransType {
  val CANCEL = BidRequestTransType('C')
  val NEW = BidRequestTransType('N')
}

case class ContraBroker(s: String) extends FixField(375, types.FixString(s))

case class ComplianceID(s: String) extends FixField(376, types.FixString(s))

case class SolicitedFlag(bool: Boolean) extends FixField(377, types.FixBoolean(bool))

case class ExecRestatementReason(i: Int) extends FixField(378, types.FixInteger(i))
object ExecRestatementReason {
  val GT_CORPORATE_ACTION = ExecRestatementReason(0)
  val GT_RENEWAL_RESTATEMENT = ExecRestatementReason(1)
  val WAREHOUSE_RECAP = ExecRestatementReason(10)
  val VERBAL_CHANGE = ExecRestatementReason(2)
  val REPRICING_OF_ORDER = ExecRestatementReason(3)
  val BROKER_OPTION = ExecRestatementReason(4)
  val PARTIAL_DECLINE_OF_ORDERQTY = ExecRestatementReason(5)
  val CANCEL_ON_TRADING_HALT = ExecRestatementReason(6)
  val CANCEL_ON_SYSTEM_FAILURE = ExecRestatementReason(7)
  val MARKET_OPTION = ExecRestatementReason(8)
  val CANCELED_NOT_BEST = ExecRestatementReason(9)
  val OTHER = ExecRestatementReason(99)
  val PEG_REFRESH = ExecRestatementReason(11)
}

case class BusinessRejectRefID(s: String) extends FixField(379, types.FixString(s))

case class BusinessRejectReason(i: Int) extends FixField(380, types.FixInteger(i))
object BusinessRejectReason {
  val OTHER = BusinessRejectReason(0)
  val UNKOWN_ID = BusinessRejectReason(1)
  val UNKNOWN_SECURITY = BusinessRejectReason(2)
  val UNSUPPORTED_MESSAGE_TYPE = BusinessRejectReason(3)
  val APPLICATION_NOT_AVAILABLE = BusinessRejectReason(4)
  val CONDITIONALLY_REQUIRED_FIELD_MISSING = BusinessRejectReason(5)
  val NOT_AUTHORIZED = BusinessRejectReason(6)
  val DELIVERTO_FIRM_NOT_AVAILABLE_AT_THIS_TIME = BusinessRejectReason(7)
  val INVALID_PRICE_INCREMENT = BusinessRejectReason(18)
}

case class GrossTradeAmt(amount: Decimal) extends FixField(381, types.Amt(amount))

case class NoContraBrokers(num: Int) extends FixField(382, types.NumInGroup(num))

case class MaxMessageSize(length: Int) extends FixField(383, types.Length(length))

case class NoMsgTypes(num: Int) extends FixField(384, types.NumInGroup(num))

case class MsgDirection(c: Char) extends FixField(385, types.FixChar(c))
object MsgDirection {
  val RECEIVE = MsgDirection('R')
  val SEND = MsgDirection('S')
}

case class NoTradingSessions(num: Int) extends FixField(386, types.NumInGroup(num))

case class TotalVolumeTraded(qty: Decimal) extends FixField(387, types.Qty(qty))

case class DiscretionInst(c: Char) extends FixField(388, types.FixChar(c))
object DiscretionInst {
  val RELATED_TO_DISPLAYED_PRICE = DiscretionInst('0')
  val RELATED_TO_MARKET_PRICE = DiscretionInst('1')
  val RELATED_TO_PRIMARY_PRICE = DiscretionInst('2')
  val RELATED_TO_LOCAL_PRIMARY_PRICE = DiscretionInst('3')
  val RELATED_TO_MIDPOINT_PRICE = DiscretionInst('4')
  val RELATED_TO_LAST_TRADE_PRICE = DiscretionInst('5')
  val RELATED_TO_VWAP = DiscretionInst('6')
  val AVERAGE_PRICE_GUARANTEE = DiscretionInst('7')
}

case class DiscretionOffsetValue(f: Decimal) extends FixField(389, types.FixFloat(f))

case class BidID(s: String) extends FixField(390, types.FixString(s))

case class ClientBidID(s: String) extends FixField(391, types.FixString(s))

case class ListName(s: String) extends FixField(392, types.FixString(s))

case class TotNoRelatedSym(i: Int) extends FixField(393, types.FixInteger(i))

case class BidType(i: Int) extends FixField(394, types.FixInteger(i))
object BidType {
  val NON_DISCLOSED = BidType(1)
  val DISCLOSED_STYLE = BidType(2)
  val NO_BIDDING_PROCESS = BidType(3)
}

case class NumTickets(i: Int) extends FixField(395, types.FixInteger(i))

case class SideValue1(amount: Decimal) extends FixField(396, types.Amt(amount))

case class SideValue2(amount: Decimal) extends FixField(397, types.Amt(amount))

case class NoBidDescriptors(num: Int) extends FixField(398, types.NumInGroup(num))

case class BidDescriptorType(i: Int) extends FixField(399, types.FixInteger(i))
object BidDescriptorType {
  val SECTOR = BidDescriptorType(1)
  val COUNTRY = BidDescriptorType(2)
  val INDEX = BidDescriptorType(3)
}

case class BidDescriptor(s: String) extends FixField(400, types.FixString(s))

case class SideValueInd(i: Int) extends FixField(401, types.FixInteger(i))
object SideValueInd {
  val SIDEVALUE1 = SideValueInd(1)
  val SIDEVALUE2 = SideValueInd(2)
}

case class LiquidityPctLow(percentage: Decimal) extends FixField(402, types.Percentage(percentage))

case class LiquidityPctHigh(percentage: Decimal) extends FixField(403, types.Percentage(percentage))

case class LiquidityValue(amount: Decimal) extends FixField(404, types.Amt(amount))

case class EFPTrackingError(percentage: Decimal) extends FixField(405, types.Percentage(percentage))

case class FairValue(amount: Decimal) extends FixField(406, types.Amt(amount))

case class OutsideIndexPct(percentage: Decimal) extends FixField(407, types.Percentage(percentage))

case class ValueOfFutures(amount: Decimal) extends FixField(408, types.Amt(amount))

case class LiquidityIndType(i: Int) extends FixField(409, types.FixInteger(i))
object LiquidityIndType {
  val FIVEDAY_MOVING_AVERAGE = LiquidityIndType(1)
  val TWENTYDAY_MOVING_AVERAGE = LiquidityIndType(2)
  val NORMAL_MARKET_SIZE = LiquidityIndType(3)
  val OTHER = LiquidityIndType(4)
}

case class WtAverageLiquidity(percentage: Decimal) extends FixField(410, types.Percentage(percentage))

case class ExchangeForPhysical(bool: Boolean) extends FixField(411, types.FixBoolean(bool))

case class OutMainCntryUIndex(amount: Decimal) extends FixField(412, types.Amt(amount))

case class CrossPercent(percentage: Decimal) extends FixField(413, types.Percentage(percentage))

case class ProgRptReqs(i: Int) extends FixField(414, types.FixInteger(i))
object ProgRptReqs {
  val BUYSIDE_EXPLICITLY_REQUESTS_STATUS_USING_STATUSREQUEST = ProgRptReqs(1)
  val SELLSIDE_PERIODICALLY_SENDS_STATUS_USING_LISTSTATUS = ProgRptReqs(2)
  val REAL_TIME_EXECUTION_REPORTS = ProgRptReqs(3)
}

case class ProgPeriodInterval(i: Int) extends FixField(415, types.FixInteger(i))

case class IncTaxInd(i: Int) extends FixField(416, types.FixInteger(i))
object IncTaxInd {
  val NET = IncTaxInd(1)
  val GROSS = IncTaxInd(2)
}

case class NumBidders(i: Int) extends FixField(417, types.FixInteger(i))

case class BidTradeType(c: Char) extends FixField(418, types.FixChar(c))
object BidTradeType {
  val AGENCY = BidTradeType('A')
  val VWAP_GUARANTEE = BidTradeType('G')
  val GUARANTEED_CLOSE = BidTradeType('J')
  val RISK_TRADE = BidTradeType('R')
}

case class BasisPxType(c: Char) extends FixField(419, types.FixChar(c))
object BasisPxType {
  val CLOSING_PRICE_AT_MORNING_SESSION = BasisPxType('2')
  val CLOSING_PRICE = BasisPxType('3')
  val CURRENT_PRICE = BasisPxType('4')
  val SQ = BasisPxType('5')
  val VWAP_THROUGH_A_DAY = BasisPxType('6')
  val VWAP_THROUGH_A_MORNING_SESSION = BasisPxType('7')
  val VWAP_THROUGH_AN_AFTERNOON_SESSION = BasisPxType('8')
  val VWAP_THROUGH_A_DAY_EXCEPT_YORI = BasisPxType('9')
  val VWAP_THROUGH_A_MORNING_SESSION_EXCEPT_YORI = BasisPxType('A')
  val VWAP_THROUGH_AN_AFTERNOON_SESSION_EXCEPT_YORI = BasisPxType('B')
  val STRIKE = BasisPxType('C')
  val OPEN = BasisPxType('D')
  val OTHERS = BasisPxType('Z')
}

case class NoBidComponents(num: Int) extends FixField(420, types.NumInGroup(num))

case class Country(code: String) extends FixField(421, types.Country(code))

case class TotNoStrikes(i: Int) extends FixField(422, types.FixInteger(i))

case class PriceType(i: Int) extends FixField(423, types.FixInteger(i))
object PriceType {
  val PERCENTAGE = PriceType(1)
  val FIXED_CABINET_TRADE_PRICE = PriceType(10)
  val VARIABLE_CABINET_TRADE_PRICE = PriceType(11)
  val PER_UNIT = PriceType(2)
  val FIXED_AMOUNT = PriceType(3)
  val DISCOUNT = PriceType(4)
  val PREMIUM = PriceType(5)
  val SPREAD = PriceType(6)
  val TED_PRICE = PriceType(7)
  val TED_YIELD = PriceType(8)
  val YIELD = PriceType(9)
  val PRODUCT_TICKS_IN_HALFS = PriceType(13)
  val PRODUCT_TICKS_IN_FOURTHS = PriceType(14)
  val PRODUCT_TICKS_IN_EIGHTS = PriceType(15)
  val PRODUCT_TICKS_IN_SIXTEENTHS = PriceType(16)
  val PRODUCT_TICKS_IN_THIRTY_SECONDS = PriceType(17)
  val PRODUCT_TICKS_IN_SIXTY_FORTHS = PriceType(18)
  val PRODUCT_TICKS_IN_ONE_TWENTY_EIGHTS = PriceType(19)
}

case class DayOrderQty(qty: Decimal) extends FixField(424, types.Qty(qty))

case class DayCumQty(qty: Decimal) extends FixField(425, types.Qty(qty))

case class DayAvgPx(price: Decimal) extends FixField(426, types.Price(price))

case class GTBookingInst(i: Int) extends FixField(427, types.FixInteger(i))
object GTBookingInst {
  val BOOK_OUT_ALL_TRADES_ON_DAY_OF_EXECUTION = GTBookingInst(0)
  val ACCUMULATE_EXECUTIONS_UNTIL_ORDER_IS_FILLED_OR_EXPIRES = GTBookingInst(1)
  val ACCUMULATE_UNTIL_VERBALLY_NOTIFIED_OTHERWISE = GTBookingInst(2)
}

case class NoStrikes(num: Int) extends FixField(428, types.NumInGroup(num))

case class ListStatusType(i: Int) extends FixField(429, types.FixInteger(i))
object ListStatusType {
  val ACK = ListStatusType(1)
  val RESPONSE = ListStatusType(2)
  val TIMED = ListStatusType(3)
  val EXECSTARTED = ListStatusType(4)
  val ALLDONE = ListStatusType(5)
  val ALERT = ListStatusType(6)
}

case class NetGrossInd(i: Int) extends FixField(430, types.FixInteger(i))
object NetGrossInd {
  val NET = NetGrossInd(1)
  val GROSS = NetGrossInd(2)
}

case class ListOrderStatus(i: Int) extends FixField(431, types.FixInteger(i))
object ListOrderStatus {
  val INBIDDINGPROCESS = ListOrderStatus(1)
  val RECEIVEDFOREXECUTION = ListOrderStatus(2)
  val EXECUTING = ListOrderStatus(3)
  val CANCELING = ListOrderStatus(4)
  val ALERT = ListOrderStatus(5)
  val ALL_DONE = ListOrderStatus(6)
  val REJECT = ListOrderStatus(7)
}

case class ExpireDate(year: Int, month: Int, day: Int) extends FixField(432, types.LocalMktDate(year, month, day))

case class ListExecInstType(c: Char) extends FixField(433, types.FixChar(c))
object ListExecInstType {
  val IMMEDIATE = ListExecInstType('1')
  val WAIT_FOR_EXECUTE_INSTRUCTION = ListExecInstType('2')
  val EXCHANGE_SWITCH_CIV_ORDER_SELL_DRIVEN = ListExecInstType('3')
  val EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_TOP_UP = ListExecInstType('4')
  val EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_WITHDRAW = ListExecInstType('5')
}

case class CxlRejResponseTo(c: Char) extends FixField(434, types.FixChar(c))
object CxlRejResponseTo {
  val ORDER_CANCEL_REQUEST = CxlRejResponseTo('1')
  val ORDER_CANCEL_REPLACE_REQUEST = CxlRejResponseTo('2')
}

case class UnderlyingCouponRate(percentage: Decimal) extends FixField(435, types.Percentage(percentage))

case class UnderlyingContractMultiplier(f: Decimal) extends FixField(436, types.FixFloat(f))

case class ContraTradeQty(qty: Decimal) extends FixField(437, types.Qty(qty))

case class ContraTradeTime(timestamp: Date) extends FixField(438, types.UTCTimestamp(timestamp))

case class ClearingFirm(s: String) extends FixField(439, types.FixString(s))

case class ClearingAccount(s: String) extends FixField(440, types.FixString(s))

case class LiquidityNumSecurities(i: Int) extends FixField(441, types.FixInteger(i))

case class MultiLegReportingType(c: Char) extends FixField(442, types.FixChar(c))
object MultiLegReportingType {
  val SINGLE_SECURITY = MultiLegReportingType('1')
  val INDIVIDUAL_LEG_OF_A_MULTI_LEG_SECURITY = MultiLegReportingType('2')
  val MULTI_LEG_SECURITY = MultiLegReportingType('3')
}

case class StrikeTime(timestamp: Date) extends FixField(443, types.UTCTimestamp(timestamp))

case class ListStatusText(s: String) extends FixField(444, types.FixString(s))

case class EncodedListStatusTextLen(length: Int) extends FixField(445, types.Length(length))

case class EncodedListStatusText(data: Array[Byte]) extends FixField(446, types.Data(data))

case class PartyIDSource(c: Char) extends FixField(447, types.FixChar(c))
object PartyIDSource {
  val KOREAN_INVESTOR_ID = PartyIDSource('1')
  val TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID_QFII_FID = PartyIDSource('2')
  val TAIWANESE_TRADING_ACCOUNT = PartyIDSource('3')
  val MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER = PartyIDSource('4')
  val CHINESE_B_SHARE = PartyIDSource('5')
  val UK_NATIONAL_INSURANCE_OR_PENSION_NUMBER = PartyIDSource('6')
  val US_SOCIAL_SECURITY_NUMBER = PartyIDSource('7')
  val US_EMPLOYER_IDENTIFICATION_NUMBER = PartyIDSource('8')
  val AUSTRALIAN_BUSINESS_NUMBER = PartyIDSource('9')
  val AUSTRALIAN_TAX_FILE_NUMBER = PartyIDSource('A')
  val BIC = PartyIDSource('B')
  val GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER = PartyIDSource('C')
  val PROPRIETARY_CUSTOM_CODE = PartyIDSource('D')
  val ISO_COUNTRY_CODE = PartyIDSource('E')
  val SETTLEMENT_ENTITY_LOCATION = PartyIDSource('F')
  val MIC = PartyIDSource('G')
  val CSD_PARTICIPANT_MEMBER_CODE = PartyIDSource('H')
  val DIRECTED_BROKER = PartyIDSource('I')
}

case class PartyID(s: String) extends FixField(448, types.FixString(s))

case class TotalVolumeTradedDate(year: Int, month: Int, day: Int) extends FixField(449, types.UTCDateOnly(year, month, day))

case class TotalVolumeTradedTime(hour: Int, minute: Int, second: Int, millis: Int) extends FixField(450, types.UTCTimeOnly(hour, minute, second, millis))

case class NetChgPrevDay(offset: Decimal) extends FixField(451, types.PriceOffset(offset))

case class PartyRole(i: Int) extends FixField(452, types.FixInteger(i))
object PartyRole {
  val EXECUTING_FIRM = PartyRole(1)
  val BROKER_OF_CREDIT = PartyRole(2)
  val CLIENT_ID = PartyRole(3)
  val CLEARING_FIRM = PartyRole(4)
  val INVESTOR_ID = PartyRole(5)
  val INTRODUCING_FIRM = PartyRole(6)
  val ENTERING_FIRM = PartyRole(7)
  val LOCATE_LENDING_FIRM = PartyRole(8)
  val FUND_MANAGER_CLIENT_ID = PartyRole(9)
  val SETTLEMENT_LOCATION = PartyRole(10)
  val ORDER_ORIGINATION_TRADER = PartyRole(11)
  val EXECUTING_TRADER = PartyRole(12)
  val ORDER_ORIGINATION_FIRM = PartyRole(13)
  val GIVEUP_CLEARING_FIRM = PartyRole(14)
  val CORRESPONDANT_CLEARING_FIRM = PartyRole(15)
  val EXECUTING_SYSTEM = PartyRole(16)
  val CONTRA_FIRM = PartyRole(17)
  val CONTRA_CLEARING_FIRM = PartyRole(18)
  val SPONSORING_FIRM = PartyRole(19)
  val UNDERLYING_CONTRA_FIRM = PartyRole(20)
  val CLEARING_ORGANIZATION = PartyRole(21)
  val EXCHANGE = PartyRole(22)
  val CUSTOMER_ACCOUNT = PartyRole(24)
  val CORRESPONDENT_CLEARING_ORGANIZATION = PartyRole(25)
  val CORRESPONDENT_BROKER = PartyRole(26)
  val BUYER_SELLER = PartyRole(27)
  val CUSTODIAN = PartyRole(28)
  val INTERMEDIARY = PartyRole(29)
  val AGENT = PartyRole(30)
  val SUB_CUSTODIAN = PartyRole(31)
  val BENEFICIARY = PartyRole(32)
  val INTERESTED_PARTY = PartyRole(33)
  val REGULATORY_BODY = PartyRole(34)
  val LIQUIDITY_PROVIDER = PartyRole(35)
  val ENTERING_TRADER = PartyRole(36)
  val CONTRA_TRADER = PartyRole(37)
  val POSITION_ACCOUNT = PartyRole(38)
  val CONTRA_INVESTOR_ID = PartyRole(39)
  val TRANSFER_TO_FIRM = PartyRole(40)
  val CONTRA_POSITION_ACCOUNT = PartyRole(41)
  val CONTRA_EXCHANGE = PartyRole(42)
  val INTERNAL_CARRY_ACCOUNT = PartyRole(43)
  val ORDER_ENTRY_OPERATOR_ID = PartyRole(44)
  val SECONDARY_ACCOUNT_NUMBER = PartyRole(45)
  val FORIEGN_FIRM = PartyRole(46)
  val THIRD_PARTY_ALLOCATION_FIRM = PartyRole(47)
  val CLAIMING_ACCOUNT = PartyRole(48)
  val ASSET_MANAGER = PartyRole(49)
  val PLEDGOR_ACCOUNT = PartyRole(50)
  val PLEDGEE_ACCOUNT = PartyRole(51)
  val LARGE_TRADER_REPORTABLE_ACCOUNT = PartyRole(52)
  val TRADER_MNEMONIC = PartyRole(53)
  val SENDER_LOCATION = PartyRole(54)
  val SESSION_ID = PartyRole(55)
  val ACCEPTABLE_COUNTERPARTY = PartyRole(56)
  val UNACCEPTABLE_COUNTERPARTY = PartyRole(57)
  val ENTERING_UNIT = PartyRole(58)
  val EXECUTING_UNIT = PartyRole(59)
  val INTRODUCING_BROKER = PartyRole(60)
  val QUOTE_ORIGINATOR = PartyRole(61)
  val REPORT_ORIGINATOR = PartyRole(62)
  val SYSTEMATIC_INTERNALISER = PartyRole(63)
  val MULTILATERAL_TRADING_FACILITY = PartyRole(64)
  val REGULATED_MARKET = PartyRole(65)
  val MARKET_MAKER = PartyRole(66)
  val INVESTMENT_FIRM = PartyRole(67)
  val HOST_COMPETENT_AUTHORITY = PartyRole(68)
  val HOME_COMPETENT_AUTHORITY = PartyRole(69)
  val COMPETENT_AUTHORITY_OF_THE_MOST_RELEVANT_MARKET_IN_TERMS_OF_LIQUIDITY = PartyRole(70)
  val COMPETENT_AUTHORITY_OF_THE_TRANSACTION = PartyRole(71)
  val REPORTING_INTERMEDIARY = PartyRole(72)
  val EXECUTION_VENUE = PartyRole(73)
  val MARKET_DATA_ENTRY_ORIGINATOR = PartyRole(74)
  val LOCATION_ID = PartyRole(75)
  val DESK_ID = PartyRole(76)
  val MARKET_DATA_MARKET = PartyRole(77)
  val ALLOCATION_ENTITY = PartyRole(78)
}

case class NoPartyIDs(num: Int) extends FixField(453, types.NumInGroup(num))

case class NoSecurityAltID(num: Int) extends FixField(454, types.NumInGroup(num))

case class SecurityAltID(s: String) extends FixField(455, types.FixString(s))

case class SecurityAltIDSource(s: String) extends FixField(456, types.FixString(s))

case class NoUnderlyingSecurityAltID(num: Int) extends FixField(457, types.NumInGroup(num))

case class UnderlyingSecurityAltID(s: String) extends FixField(458, types.FixString(s))

case class UnderlyingSecurityAltIDSource(s: String) extends FixField(459, types.FixString(s))

case class Product(i: Int) extends FixField(460, types.FixInteger(i))
object Product {
  val AGENCY = Product(1)
  val COMMODITY = Product(2)
  val CORPORATE = Product(3)
  val CURRENCY = Product(4)
  val EQUITY = Product(5)
  val GOVERNMENT = Product(6)
  val INDEX = Product(7)
  val LOAN = Product(8)
  val MONEYMARKET = Product(9)
  val MORTGAGE = Product(10)
  val MUNICIPAL = Product(11)
  val OTHER = Product(12)
  val FINANCING = Product(13)
}

case class CFICode(s: String) extends FixField(461, types.FixString(s))

case class UnderlyingProduct(i: Int) extends FixField(462, types.FixInteger(i))

case class UnderlyingCFICode(s: String) extends FixField(463, types.FixString(s))

case class TestMessageIndicator(bool: Boolean) extends FixField(464, types.FixBoolean(bool))

case class QuantityType(i: Int) extends FixField(465, types.FixInteger(i))
object QuantityType {
  val SHARES = QuantityType(1)
  val BONDS = QuantityType(2)
  val CURRENTFACE = QuantityType(3)
  val ORIGINALFACE = QuantityType(4)
  val CURRENCY = QuantityType(5)
  val CONTRACTS = QuantityType(6)
  val OTHER = QuantityType(7)
  val PAR = QuantityType(8)
}

case class BookingRefID(s: String) extends FixField(466, types.FixString(s))

case class IndividualAllocID(s: String) extends FixField(467, types.FixString(s))

case class RoundingDirection(c: Char) extends FixField(468, types.FixChar(c))
object RoundingDirection {
  val ROUND_TO_NEAREST = RoundingDirection('0')
  val ROUND_DOWN = RoundingDirection('1')
  val ROUND_UP = RoundingDirection('2')
}

case class RoundingModulus(f: Decimal) extends FixField(469, types.FixFloat(f))

case class CountryOfIssue(code: String) extends FixField(470, types.Country(code))

case class StateOrProvinceOfIssue(s: String) extends FixField(471, types.FixString(s))

case class LocaleOfIssue(s: String) extends FixField(472, types.FixString(s))

case class NoRegistDtls(num: Int) extends FixField(473, types.NumInGroup(num))

case class MailingDtls(s: String) extends FixField(474, types.FixString(s))

case class InvestorCountryOfResidence(code: String) extends FixField(475, types.Country(code))

case class PaymentRef(s: String) extends FixField(476, types.FixString(s))

case class DistribPaymentMethod(i: Int) extends FixField(477, types.FixInteger(i))
object DistribPaymentMethod {
  val CREST = DistribPaymentMethod(1)
  val NSCC = DistribPaymentMethod(2)
  val EUROCLEAR = DistribPaymentMethod(3)
  val CLEARSTREAM = DistribPaymentMethod(4)
  val CHEQUE = DistribPaymentMethod(5)
  val TELEGRAPHIC_TRANSFER = DistribPaymentMethod(6)
  val FEDWIRE = DistribPaymentMethod(7)
  val DIRECT_CREDIT = DistribPaymentMethod(8)
  val ACH_CREDIT = DistribPaymentMethod(9)
  val BPAY = DistribPaymentMethod(10)
  val HIGH_VALUE_CLEARING_SYSTEM_HVACS = DistribPaymentMethod(11)
  val REINVEST_IN_FUND = DistribPaymentMethod(12)
}

case class CashDistribCurr(code: String) extends FixField(478, types.Currency(code))

case class CommCurrency(code: String) extends FixField(479, types.Currency(code))

case class CancellationRights(c: Char) extends FixField(480, types.FixChar(c))
object CancellationRights {
  val NO_EXECUTION_ONLY = CancellationRights('N')
  val NO_WAIVER_AGREEMENT = CancellationRights('M')
  val NO_INSTITUTIONAL = CancellationRights('O')
  val YES = CancellationRights('Y')
}

case class MoneyLaunderingStatus(c: Char) extends FixField(481, types.FixChar(c))
object MoneyLaunderingStatus {
  val PASSED = MoneyLaunderingStatus('Y')
  val NOT_CHECKED = MoneyLaunderingStatus('N')
  val EXEMPT_BELOW_THE_LIMIT = MoneyLaunderingStatus('1')
  val EXEMPT_CLIENT_MONEY_TYPE_EXEMPTION = MoneyLaunderingStatus('2')
  val EXEMPT_AUTHORISED_CREDIT_OR_FINANCIAL_INSTITUTION = MoneyLaunderingStatus('3')
}

case class MailingInst(s: String) extends FixField(482, types.FixString(s))

case class TransBkdTime(timestamp: Date) extends FixField(483, types.UTCTimestamp(timestamp))

case class ExecPriceType(c: Char) extends FixField(484, types.FixChar(c))
object ExecPriceType {
  val BID_PRICE = ExecPriceType('B')
  val CREATION_PRICE = ExecPriceType('C')
  val CREATION_PRICE_PLUS_ADJUSTMENT_PERCENT = ExecPriceType('D')
  val CREATION_PRICE_PLUS_ADJUSTMENT_AMOUNT = ExecPriceType('E')
  val OFFER_PRICE = ExecPriceType('O')
  val OFFER_PRICE_MINUS_ADJUSTMENT_PERCENT = ExecPriceType('P')
  val OFFER_PRICE_MINUS_ADJUSTMENT_AMOUNT = ExecPriceType('Q')
  val SINGLE_PRICE = ExecPriceType('S')
}

case class ExecPriceAdjustment(f: Decimal) extends FixField(485, types.FixFloat(f))

case class DateOfBirth(year: Int, month: Int, day: Int) extends FixField(486, types.LocalMktDate(year, month, day))

case class TradeReportTransType(i: Int) extends FixField(487, types.FixInteger(i))
object TradeReportTransType {
  val NEW = TradeReportTransType(0)
  val CANCEL = TradeReportTransType(1)
  val REPLACE = TradeReportTransType(2)
  val RELEASE = TradeReportTransType(3)
  val REVERSE = TradeReportTransType(4)
  val CANCEL_DUE_TO_BACK_OUT_OF_TRADE = TradeReportTransType(5)
}

case class CardHolderName(s: String) extends FixField(488, types.FixString(s))

case class CardNumber(s: String) extends FixField(489, types.FixString(s))

case class CardExpDate(year: Int, month: Int, day: Int) extends FixField(490, types.LocalMktDate(year, month, day))

case class CardIssNum(s: String) extends FixField(491, types.FixString(s))

case class PaymentMethod(i: Int) extends FixField(492, types.FixInteger(i))
object PaymentMethod {
  val CREST = PaymentMethod(1)
  val NSCC = PaymentMethod(2)
  val EUROCLEAR = PaymentMethod(3)
  val CLEARSTREAM = PaymentMethod(4)
  val CHEQUE = PaymentMethod(5)
  val TELEGRAPHIC_TRANSFER = PaymentMethod(6)
  val FEDWIRE = PaymentMethod(7)
  val DEBIT_CARD = PaymentMethod(8)
  val DIRECT_DEBIT = PaymentMethod(9)
  val DIRECT_CREDIT = PaymentMethod(10)
  val CREDIT_CARD = PaymentMethod(11)
  val ACH_DEBIT = PaymentMethod(12)
  val ACH_CREDIT = PaymentMethod(13)
  val BPAY = PaymentMethod(14)
  val HIGH_VALUE_CLEARING_SYSTEM = PaymentMethod(15)
}

case class RegistAcctType(s: String) extends FixField(493, types.FixString(s))

case class Designation(s: String) extends FixField(494, types.FixString(s))

case class TaxAdvantageType(i: Int) extends FixField(495, types.FixInteger(i))
object TaxAdvantageType {
  val NONE = TaxAdvantageType(0)
  val MAXI_ISA = TaxAdvantageType(1)
  val TESSA = TaxAdvantageType(2)
  val MINI_CASH_ISA = TaxAdvantageType(3)
  val MINI_STOCKS_AND_SHARES_ISA = TaxAdvantageType(4)
  val MINI_INSURANCE_ISA = TaxAdvantageType(5)
  val CURRENT_YEAR_PAYMENT = TaxAdvantageType(6)
  val PRIOR_YEAR_PAYMENT = TaxAdvantageType(7)
  val ASSET_TRANSFER = TaxAdvantageType(8)
  val EMPLOYEE_PRIOR_YEAR = TaxAdvantageType(9)
  val EMPLOYEE = TaxAdvantageType(10)
  val EMPLOYER = TaxAdvantageType(11)
  val EMPLOYER2 = TaxAdvantageType(12)
  val NON_FUND_PROTOTYPE_IRA = TaxAdvantageType(13)
  val NON_FUND_QUALIFIED_PLAN = TaxAdvantageType(14)
  val DEFINED_CONTRIBUTION_PLAN = TaxAdvantageType(15)
  val INDIVIDUAL_RETIREMENT_ACCOUNT = TaxAdvantageType(16)
  val INDIVIDUAL_RETIREMENT_ACCOUNT2 = TaxAdvantageType(17)
  val KEOGH = TaxAdvantageType(18)
  val PROFIT_SHARING_PLAN = TaxAdvantageType(19)
  val _401_K = TaxAdvantageType(20)
  val SELF_DIRECTED_IRA = TaxAdvantageType(21)
  val _403_B = TaxAdvantageType(22)
  val _457 = TaxAdvantageType(23)
  val ROTH_IRA = TaxAdvantageType(24)
  val ROTH_IRA2 = TaxAdvantageType(25)
  val ROTH_CONVERSION_IRA = TaxAdvantageType(26)
  val ROTH_CONVERSION_IRA2 = TaxAdvantageType(27)
  val EDUCATION_IRA = TaxAdvantageType(28)
  val EDUCATION_IRA2 = TaxAdvantageType(29)
  val OTHER = TaxAdvantageType(999)
}

case class RegistRejReasonText(s: String) extends FixField(496, types.FixString(s))

case class FundRenewWaiv(c: Char) extends FixField(497, types.FixChar(c))
object FundRenewWaiv {
  val NO = FundRenewWaiv('N')
  val YES = FundRenewWaiv('Y')
}

case class CashDistribAgentName(s: String) extends FixField(498, types.FixString(s))

case class CashDistribAgentCode(s: String) extends FixField(499, types.FixString(s))

case class CashDistribAgentAcctNumber(s: String) extends FixField(500, types.FixString(s))

case class CashDistribPayRef(s: String) extends FixField(501, types.FixString(s))

case class CashDistribAgentAcctName(s: String) extends FixField(502, types.FixString(s))

case class CardStartDate(year: Int, month: Int, day: Int) extends FixField(503, types.LocalMktDate(year, month, day))

case class PaymentDate(year: Int, month: Int, day: Int) extends FixField(504, types.LocalMktDate(year, month, day))

case class PaymentRemitterID(s: String) extends FixField(505, types.FixString(s))

case class RegistStatus(c: Char) extends FixField(506, types.FixChar(c))
object RegistStatus {
  val ACCEPTED = RegistStatus('A')
  val REJECTED = RegistStatus('R')
  val HELD = RegistStatus('H')
  val REMINDER = RegistStatus('N')
}

case class RegistRejReasonCode(i: Int) extends FixField(507, types.FixInteger(i))
object RegistRejReasonCode {
  val INVALID_UNACCEPTABLE_ACCOUNT_TYPE = RegistRejReasonCode(1)
  val INVALID_UNACCEPTABLE_TAX_EXEMPT_TYPE = RegistRejReasonCode(2)
  val INVALID_UNACCEPTABLE_OWNERSHIP_TYPE = RegistRejReasonCode(3)
  val INVALID_UNACCEPTABLE_NO_REG_DETLS = RegistRejReasonCode(4)
  val INVALID_UNACCEPTABLE_REG_SEQ_NO = RegistRejReasonCode(5)
  val INVALID_UNACCEPTABLE_REG_DTLS = RegistRejReasonCode(6)
  val INVALID_UNACCEPTABLE_MAILING_DTLS = RegistRejReasonCode(7)
  val INVALID_UNACCEPTABLE_MAILING_INST = RegistRejReasonCode(8)
  val INVALID_UNACCEPTABLE_INVESTOR_ID = RegistRejReasonCode(9)
  val INVALID_UNACCEPTABLE_INVESTOR_ID_SOURCE = RegistRejReasonCode(10)
  val INVALID_UNACCEPTABLE_DATE_OF_BIRTH = RegistRejReasonCode(11)
  val INVALID_UNACCEPTABLE_INVESTOR_COUNTRY_OF_RESIDENCE = RegistRejReasonCode(12)
  val INVALID_UNACCEPTABLE_NODISTRIBINSTNS = RegistRejReasonCode(13)
  val INVALID_UNACCEPTABLE_DISTRIB_PERCENTAGE = RegistRejReasonCode(14)
  val INVALID_UNACCEPTABLE_DISTRIB_PAYMENT_METHOD = RegistRejReasonCode(15)
  val INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_ACCT_NAME = RegistRejReasonCode(16)
  val INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_CODE = RegistRejReasonCode(17)
  val INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_ACCT_NUM = RegistRejReasonCode(18)
  val OTHER = RegistRejReasonCode(99)
}

case class RegistRefID(s: String) extends FixField(508, types.FixString(s))

case class RegistDtls(s: String) extends FixField(509, types.FixString(s))

case class NoDistribInsts(num: Int) extends FixField(510, types.NumInGroup(num))

case class RegistEmail(s: String) extends FixField(511, types.FixString(s))

case class DistribPercentage(percentage: Decimal) extends FixField(512, types.Percentage(percentage))

case class RegistID(s: String) extends FixField(513, types.FixString(s))

case class RegistTransType(c: Char) extends FixField(514, types.FixChar(c))
object RegistTransType {
  val NEW = RegistTransType('0')
  val REPLACE = RegistTransType('1')
  val CANCEL = RegistTransType('2')
}

case class ExecValuationPoint(timestamp: Date) extends FixField(515, types.UTCTimestamp(timestamp))

case class OrderPercent(percentage: Decimal) extends FixField(516, types.Percentage(percentage))

case class OwnershipType(c: Char) extends FixField(517, types.FixChar(c))
object OwnershipType {
  val JOINT_INVESTORS = OwnershipType('J')
  val TENANTS_IN_COMMON = OwnershipType('T')
  val JOINT_TRUSTEES = OwnershipType('2')
}

case class NoContAmts(num: Int) extends FixField(518, types.NumInGroup(num))

case class ContAmtType(i: Int) extends FixField(519, types.FixInteger(i))
object ContAmtType {
  val COMMISSION_AMOUNT = ContAmtType(1)
  val COMMISSION_PERCENT = ContAmtType(2)
  val INITIAL_CHARGE_AMOUNT = ContAmtType(3)
  val INITIAL_CHARGE_PERCENT = ContAmtType(4)
  val DISCOUNT_AMOUNT = ContAmtType(5)
  val DISCOUNT_PERCENT = ContAmtType(6)
  val DILUTION_LEVY_AMOUNT = ContAmtType(7)
  val DILUTION_LEVY_PERCENT = ContAmtType(8)
  val EXIT_CHARGE_AMOUNT = ContAmtType(9)
  val EXIT_CHARGE_PERCENT = ContAmtType(10)
  val FUND_BASED_RENEWAL_COMMISSION_PERCENT = ContAmtType(11)
  val PROJECTED_FUND_VALUE = ContAmtType(12)
  val FUND_BASED_RENEWAL_COMMISSION_AMOUNT = ContAmtType(13)
  val FUND_BASED_RENEWAL_COMMISSION_AMOUNT2 = ContAmtType(14)
  val NET_SETTLEMENT_AMOUNT = ContAmtType(15)
}

case class ContAmtValue(f: Decimal) extends FixField(520, types.FixFloat(f))

case class ContAmtCurr(code: String) extends FixField(521, types.Currency(code))

case class OwnerType(i: Int) extends FixField(522, types.FixInteger(i))
object OwnerType {
  val INDIVIDUAL_INVESTOR = OwnerType(1)
  val PUBLIC_COMPANY = OwnerType(2)
  val PRIVATE_COMPANY = OwnerType(3)
  val INDIVIDUAL_TRUSTEE = OwnerType(4)
  val COMPANY_TRUSTEE = OwnerType(5)
  val PENSION_PLAN = OwnerType(6)
  val CUSTODIAN_UNDER_GIFTS_TO_MINORS_ACT = OwnerType(7)
  val TRUSTS = OwnerType(8)
  val FIDUCIARIES = OwnerType(9)
  val NETWORKING_SUB_ACCOUNT = OwnerType(10)
  val NON_PROFIT_ORGANIZATION = OwnerType(11)
  val CORPORATE_BODY = OwnerType(12)
  val NOMINEE = OwnerType(13)
}

case class PartySubID(s: String) extends FixField(523, types.FixString(s))

case class NestedPartyID(s: String) extends FixField(524, types.FixString(s))

case class NestedPartyIDSource(c: Char) extends FixField(525, types.FixChar(c))

case class SecondaryClOrdID(s: String) extends FixField(526, types.FixString(s))

case class SecondaryExecID(s: String) extends FixField(527, types.FixString(s))

case class OrderCapacity(c: Char) extends FixField(528, types.FixChar(c))
object OrderCapacity {
  val AGENCY = OrderCapacity('A')
  val PROPRIETARY = OrderCapacity('G')
  val INDIVIDUAL = OrderCapacity('I')
  val PRINCIPAL = OrderCapacity('P')
  val RISKLESS_PRINCIPAL = OrderCapacity('R')
  val AGENT_FOR_OTHER_MEMBER = OrderCapacity('W')
}

case class OrderRestrictions(chars: Char*) extends FixField(529, types.MultipleCharValue(chars: _*))
object OrderRestrictions {
  val PROGRAM_TRADE = OrderRestrictions('1')
  val INDEX_ARBITRAGE = OrderRestrictions('2')
  val NON_INDEX_ARBITRAGE = OrderRestrictions('3')
  val COMPETING_MARKET_MAKER = OrderRestrictions('4')
  val ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_SECURITY = OrderRestrictions('5')
  val ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_UNDERLYING_SECURITY_OF_A_DERIVATIVE_SECURITY = OrderRestrictions('6')
  val FOREIGN_ENTITY = OrderRestrictions('7')
  val EXTERNAL_MARKET_PARTICIPANT = OrderRestrictions('8')
  val EXTERNAL_INTER_CONNECTED_MARKET_LINKAGE = OrderRestrictions('9')
  val RISKLESS_ARBITRAGE = OrderRestrictions('A')
}

case class MassCancelRequestType(c: Char) extends FixField(530, types.FixChar(c))
object MassCancelRequestType {
  val CANCEL_ORDERS_FOR_A_SECURITY = MassCancelRequestType('1')
  val CANCEL_ORDERS_FOR_AN_UNDERLYING_SECURITY = MassCancelRequestType('2')
  val CANCEL_ORDERS_FOR_A_PRODUCT = MassCancelRequestType('3')
  val CANCEL_ORDERS_FOR_A_CFICODE = MassCancelRequestType('4')
  val CANCEL_ORDERS_FOR_A_SECURITYTYPE = MassCancelRequestType('5')
  val CANCEL_ORDERS_FOR_A_TRADING_SESSION = MassCancelRequestType('6')
  val CANCEL_ALL_ORDERS = MassCancelRequestType('7')
}

case class MassCancelResponse(c: Char) extends FixField(531, types.FixChar(c))
object MassCancelResponse {
  val CANCEL_REQUEST_REJECTED = MassCancelResponse('0')
  val CANCEL_ORDERS_FOR_A_SECURITY = MassCancelResponse('1')
  val CANCEL_ORDERS_FOR_AN_UNDERLYING_SECURITY = MassCancelResponse('2')
  val CANCEL_ORDERS_FOR_A_PRODUCT = MassCancelResponse('3')
  val CANCEL_ORDERS_FOR_A_CFICODE = MassCancelResponse('4')
  val CANCEL_ORDERS_FOR_A_SECURITYTYPE = MassCancelResponse('5')
  val CANCEL_ORDERS_FOR_A_TRADING_SESSION = MassCancelResponse('6')
  val CANCEL_ALL_ORDERS = MassCancelResponse('7')
}

case class MassCancelRejectReason(i: Int) extends FixField(532, types.FixInteger(i))
object MassCancelRejectReason {
  val MASS_CANCEL_NOT_SUPPORTED = MassCancelRejectReason(0)
  val INVALID_OR_UNKNOWN_SECURITY = MassCancelRejectReason(1)
  val INVALID_OR_UNKNOWN_UNDERLYING = MassCancelRejectReason(2)
  val INVALID_OR_UNKNOWN_PRODUCT = MassCancelRejectReason(3)
  val INVALID_OR_UNKNOWN_CFICODE = MassCancelRejectReason(4)
  val INVALID_OR_UNKNOWN_SECURITY_TYPE = MassCancelRejectReason(5)
  val INVALID_OR_UNKNOWN_TRADING_SESSION = MassCancelRejectReason(6)
  val OTHER = MassCancelRejectReason(99)
}

case class TotalAffectedOrders(i: Int) extends FixField(533, types.FixInteger(i))

case class NoAffectedOrders(i: Int) extends FixField(534, types.FixInteger(i))

case class AffectedOrderID(s: String) extends FixField(535, types.FixString(s))

case class AffectedSecondaryOrderID(s: String) extends FixField(536, types.FixString(s))

case class QuoteType(i: Int) extends FixField(537, types.FixInteger(i))
object QuoteType {
  val INDICATIVE = QuoteType(0)
  val TRADEABLE = QuoteType(1)
  val RESTRICTED_TRADEABLE = QuoteType(2)
  val COUNTER = QuoteType(3)
}

case class NestedPartyRole(i: Int) extends FixField(538, types.FixInteger(i))

case class NoNestedPartyIDs(num: Int) extends FixField(539, types.NumInGroup(num))

case class TotalAccruedInterestAmt(amount: Decimal) extends FixField(540, types.Amt(amount))

case class MaturityDate(year: Int, month: Int, day: Int) extends FixField(541, types.LocalMktDate(year, month, day))

case class UnderlyingMaturityDate(year: Int, month: Int, day: Int) extends FixField(542, types.LocalMktDate(year, month, day))

case class InstrRegistry(s: String) extends FixField(543, types.FixString(s))

case class CashMargin(c: Char) extends FixField(544, types.FixChar(c))
object CashMargin {
  val CASH = CashMargin('1')
  val MARGIN_OPEN = CashMargin('2')
  val MARGIN_CLOSE = CashMargin('3')
}

case class NestedPartySubID(s: String) extends FixField(545, types.FixString(s))

case class Scope(chars: Char*) extends FixField(546, types.MultipleCharValue(chars: _*))
object Scope {
  val LOCAL = Scope('1')
  val NATIONAL = Scope('2')
  val GLOBAL = Scope('3')
}

case class MDImplicitDelete(bool: Boolean) extends FixField(547, types.FixBoolean(bool))

case class CrossID(s: String) extends FixField(548, types.FixString(s))

case class CrossType(i: Int) extends FixField(549, types.FixInteger(i))
object CrossType {
  val CROSS_TRADE_WHICH_IS_EXECUTED_COMPLETELY_OR_NOT = CrossType(1)
  val CROSS_TRADE_WHICH_IS_EXECUTED_PARTIALLY_AND_THE_REST_IS_CANCELLED = CrossType(2)
  val CROSS_TRADE_WHICH_IS_PARTIALLY_EXECUTED_WITH_THE_UNFILLED_PORTIONS_REMAINING_ACTIVE = CrossType(3)
  val CROSS_TRADE_IS_EXECUTED_WITH_EXISTING_ORDERS_WITH_THE_SAME_PRICE = CrossType(4)
}

case class CrossPrioritization(i: Int) extends FixField(550, types.FixInteger(i))
object CrossPrioritization {
  val NONE = CrossPrioritization(0)
  val BUY_SIDE_IS_PRIORITIZED = CrossPrioritization(1)
  val SELL_SIDE_IS_PRIORITIZED = CrossPrioritization(2)
}

case class OrigCrossID(s: String) extends FixField(551, types.FixString(s))

case class NoSides(num: Int) extends FixField(552, types.NumInGroup(num))
object NoSides {
  val ONE_SIDE = NoSides(1)
  val BOTH_SIDES = NoSides(2)
}

case class Username(s: String) extends FixField(553, types.FixString(s))

case class Password(s: String) extends FixField(554, types.FixString(s))

case class NoLegs(num: Int) extends FixField(555, types.NumInGroup(num))

case class LegCurrency(code: String) extends FixField(556, types.Currency(code))

case class TotNoSecurityTypes(i: Int) extends FixField(557, types.FixInteger(i))

case class NoSecurityTypes(num: Int) extends FixField(558, types.NumInGroup(num))

case class SecurityListRequestType(i: Int) extends FixField(559, types.FixInteger(i))
object SecurityListRequestType {
  val SYMBOL = SecurityListRequestType(0)
  val SECURITYTYPE_AND_OR_CFICODE = SecurityListRequestType(1)
  val PRODUCT = SecurityListRequestType(2)
  val TRADINGSESSIONID = SecurityListRequestType(3)
  val ALL_SECURITIES = SecurityListRequestType(4)
}

case class SecurityRequestResult(i: Int) extends FixField(560, types.FixInteger(i))
object SecurityRequestResult {
  val VALID_REQUEST = SecurityRequestResult(0)
  val INVALID_OR_UNSUPPORTED_REQUEST = SecurityRequestResult(1)
  val NO_INSTRUMENTS_FOUND_THAT_MATCH_SELECTION_CRITERIA = SecurityRequestResult(2)
  val NOT_AUTHORIZED_TO_RETRIEVE_INSTRUMENT_DATA = SecurityRequestResult(3)
  val INSTRUMENT_DATA_TEMPORARILY_UNAVAILABLE = SecurityRequestResult(4)
  val REQUEST_FOR_INSTRUMENT_DATA_NOT_SUPPORTED = SecurityRequestResult(5)
}

case class RoundLot(qty: Decimal) extends FixField(561, types.Qty(qty))

case class MinTradeVol(qty: Decimal) extends FixField(562, types.Qty(qty))

case class MultiLegRptTypeReq(i: Int) extends FixField(563, types.FixInteger(i))
object MultiLegRptTypeReq {
  val REPORT_BY_MULITLEG_SECURITY_ONLY = MultiLegRptTypeReq(0)
  val REPORT_BY_MULTILEG_SECURITY_AND_BY_INSTRUMENT_LEGS_BELONGING_TO_THE_MULTILEG_SECURITY = MultiLegRptTypeReq(1)
  val REPORT_BY_INSTRUMENT_LEGS_BELONGING_TO_THE_MULTILEG_SECURITY_ONLY = MultiLegRptTypeReq(2)
}

case class LegPositionEffect(c: Char) extends FixField(564, types.FixChar(c))

case class LegCoveredOrUncovered(i: Int) extends FixField(565, types.FixInteger(i))

case class LegPrice(price: Decimal) extends FixField(566, types.Price(price))

case class TradSesStatusRejReason(i: Int) extends FixField(567, types.FixInteger(i))
object TradSesStatusRejReason {
  val UNKNOWN_OR_INVALID_TRADINGSESSIONID = TradSesStatusRejReason(1)
  val OTHER = TradSesStatusRejReason(99)
}

case class TradeRequestID(s: String) extends FixField(568, types.FixString(s))

case class TradeRequestType(i: Int) extends FixField(569, types.FixInteger(i))
object TradeRequestType {
  val ALL_TRADES = TradeRequestType(0)
  val MATCHED_TRADES_MATCHING_CRITERIA_PROVIDED_ON_REQUEST = TradeRequestType(1)
  val UNMATCHED_TRADES_THAT_MATCH_CRITERIA = TradeRequestType(2)
  val UNREPORTED_TRADES_THAT_MATCH_CRITERIA = TradeRequestType(3)
  val ADVISORIES_THAT_MATCH_CRITERIA = TradeRequestType(4)
}

case class PreviouslyReported(bool: Boolean) extends FixField(570, types.FixBoolean(bool))

case class TradeReportID(s: String) extends FixField(571, types.FixString(s))

case class TradeReportRefID(s: String) extends FixField(572, types.FixString(s))

case class MatchStatus(c: Char) extends FixField(573, types.FixChar(c))
object MatchStatus {
  val COMPARED_MATCHED_OR_AFFIRMED = MatchStatus('0')
  val UNCOMPARED_UNMATCHED_OR_UNAFFIRMED = MatchStatus('1')
  val ADVISORY_OR_ALERT = MatchStatus('2')
}

case class MatchType(s: String) extends FixField(574, types.FixString(s))
object MatchType {
  val ONE_PARTY_TRADE_REPORT = MatchType("1")
  val TWO_PARTY_TRADE_REPORT = MatchType("2")
  val CONFIRMED_TRADE_REPORT = MatchType("3")
  val AUTO_MATCH = MatchType("4")
  val CROSS_AUCTION = MatchType("5")
  val COUNTER_ORDER_SELECTION = MatchType("6")
  val CALL_AUCTION = MatchType("7")
  val EXACT_PLUS_FOUR_BADGES_AND_EXECUTION_TIME = MatchType("A1")
  val EXACT_PLUS_FOUR_BADGES = MatchType("A2")
  val EXACT_PLUS_TWO_BADGES_AND_EXECUTION_TIME = MatchType("A3")
  val EXACT_PLUS_TWO_BADGES = MatchType("A4")
  val EXACT_PLUS_EXECUTION_TIME = MatchType("A5")
  val ACT_ACCEPTED_TRADE = MatchType("M3")
  val ACT_DEFAULT_TRADE = MatchType("M4")
  val ACT_DEFAULT_AFTER_M2 = MatchType("M5")
  val ACT_M6_MATCH = MatchType("M6")
  val COMPARED_RECORDS_RESULTING_FROM_STAMPED_ADVISORIES_OR_SPECIALIST_ACCEPTS_PAIR_OFFS = MatchType("AQ")
  val EXACT_MATCH_ON_TRADE_DATE_STOCK_SYMBOL_QUANTITY_PRICE_TRADE_TYPE_AND_SPECIAL_TRADE_INDICATOR_MINUS_BADGES_AND_TIMES_ACT_M1_MATCH = MatchType("M1")
  val SUMMARIZED_MATCH_MINUS_BADGES_AND_TIMES_ACT_M2_MATCH = MatchType("M2")
  val OCS_LOCKED_IN_NON_ACT = MatchType("MT")
  val SUMMARIZED_MATCH_USING_A1_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIED = MatchType("S1")
  val SUMMARIZED_MATCH_USING_A2_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED = MatchType("S2")
  val SUMMARIZED_MATCH_USING_A3_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED = MatchType("S3")
  val SUMMARIZED_MATCH_USING_A4_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED = MatchType("S4")
  val SUMMARIZED_MATCH_USING_A5_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED = MatchType("S5")
  val ONE_PARTY_PRIVATELY_NEGOTIATED_TRADE_REPORT = MatchType("60")
  val TWO_PARTY_PRIVATELY_NEGOTIATED_TRADE_REPORT = MatchType("61")
  val CONTINUOUS_AUTO_MATCH = MatchType("62")
  val CROSS_AUCTION2 = MatchType("63")
  val COUNTER_ORDER_SELECTION2 = MatchType("64")
  val CALL_AUCTION2 = MatchType("65")
}

case class OddLot(bool: Boolean) extends FixField(575, types.FixBoolean(bool))

case class NoClearingInstructions(num: Int) extends FixField(576, types.NumInGroup(num))

case class ClearingInstruction(i: Int) extends FixField(577, types.FixInteger(i))
object ClearingInstruction {
  val PROCESS_NORMALLY = ClearingInstruction(0)
  val EXCLUDE_FROM_ALL_NETTING = ClearingInstruction(1)
  val BILATERAL_NETTING_ONLY = ClearingInstruction(2)
  val EX_CLEARING = ClearingInstruction(3)
  val SPECIAL_TRADE = ClearingInstruction(4)
  val MULTILATERAL_NETTING = ClearingInstruction(5)
  val CLEAR_AGAINST_CENTRAL_COUNTERPARTY = ClearingInstruction(6)
  val EXCLUDE_FROM_CENTRAL_COUNTERPARTY = ClearingInstruction(7)
  val MANUAL_MODE = ClearingInstruction(8)
  val AUTOMATIC_POSTING_MODE = ClearingInstruction(9)
  val AUTOMATIC_GIVE_UP_MODE = ClearingInstruction(10)
  val QUALIFIED_SERVICE_REPRESENTATIVE_QSR = ClearingInstruction(11)
  val CUSTOMER_TRADE = ClearingInstruction(12)
  val SELF_CLEARING = ClearingInstruction(13)
}

case class TradeInputSource(s: String) extends FixField(578, types.FixString(s))

case class TradeInputDevice(s: String) extends FixField(579, types.FixString(s))

case class NoDates(i: Int) extends FixField(580, types.FixInteger(i))

case class AccountType(i: Int) extends FixField(581, types.FixInteger(i))
object AccountType {
  val ACCOUNT_IS_CARRIED_ON_CUSTOMER_SIDE_OF_BOOKS = AccountType(1)
  val ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS = AccountType(2)
  val HOUSE_TRADER = AccountType(3)
  val FLOOR_TRADER = AccountType(4)
  val ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS_AND_IS_CROSS_MARGINED = AccountType(6)
  val ACCOUNT_IS_HOUSE_TRADER_AND_IS_CROSS_MARGINED = AccountType(7)
  val JOINT_BACKOFFICE_ACCOUNT = AccountType(8)
}

case class CustOrderCapacity(i: Int) extends FixField(582, types.FixInteger(i))
object CustOrderCapacity {
  val MEMBER_TRADING_FOR_THEIR_OWN_ACCOUNT = CustOrderCapacity(1)
  val CLEARING_FIRM_TRADING_FOR_ITS_PROPRIETARY_ACCOUNT = CustOrderCapacity(2)
  val MEMBER_TRADING_FOR_ANOTHER_MEMBER = CustOrderCapacity(3)
  val ALL_OTHER = CustOrderCapacity(4)
}

case class ClOrdLinkID(s: String) extends FixField(583, types.FixString(s))

case class MassStatusReqID(s: String) extends FixField(584, types.FixString(s))

case class MassStatusReqType(i: Int) extends FixField(585, types.FixInteger(i))
object MassStatusReqType {
  val STATUS_FOR_ORDERS_FOR_A_SECURITY = MassStatusReqType(1)
  val STATUS_FOR_ORDERS_FOR_AN_UNDERLYING_SECURITY = MassStatusReqType(2)
  val STATUS_FOR_ORDERS_FOR_A_PRODUCT = MassStatusReqType(3)
  val STATUS_FOR_ORDERS_FOR_A_CFICODE = MassStatusReqType(4)
  val STATUS_FOR_ORDERS_FOR_A_SECURITYTYPE = MassStatusReqType(5)
  val STATUS_FOR_ORDERS_FOR_A_TRADING_SESSION = MassStatusReqType(6)
  val STATUS_FOR_ALL_ORDERS = MassStatusReqType(7)
  val STATUS_FOR_ORDERS_FOR_A_PARTYID = MassStatusReqType(8)
}

case class OrigOrdModTime(timestamp: Date) extends FixField(586, types.UTCTimestamp(timestamp))

case class LegSettlType(c: Char) extends FixField(587, types.FixChar(c))

case class LegSettlDate(year: Int, month: Int, day: Int) extends FixField(588, types.LocalMktDate(year, month, day))

case class DayBookingInst(c: Char) extends FixField(589, types.FixChar(c))
object DayBookingInst {
  val CAN_TRIGGER_BOOKING_WITHOUT_REFERENCE_TO_THE_ORDER_INITIATOR = DayBookingInst('0')
  val SPEAK_WITH_ORDER_INITIATOR_BEFORE_BOOKING = DayBookingInst('1')
  val ACCUMULATE = DayBookingInst('2')
}

case class BookingUnit(c: Char) extends FixField(590, types.FixChar(c))
object BookingUnit {
  val EACH_PARTIAL_EXECUTION_IS_A_BOOKABLE_UNIT = BookingUnit('0')
  val AGGREGATE_PARTIAL_EXECUTIONS_ON_THIS_ORDER_AND_BOOK_ONE_TRADE_PER_ORDER = BookingUnit('1')
  val AGGREGATE_EXECUTIONS_FOR_THIS_SYMBOL_SIDE_AND_SETTLEMENT_DATE = BookingUnit('2')
}

case class PreallocMethod(c: Char) extends FixField(591, types.FixChar(c))
object PreallocMethod {
  val PRO_RATA = PreallocMethod('0')
  val DO_NOT_PRO_RATA = PreallocMethod('1')
}

case class UnderlyingCountryOfIssue(code: String) extends FixField(592, types.Country(code))

case class UnderlyingStateOrProvinceOfIssue(s: String) extends FixField(593, types.FixString(s))

case class UnderlyingLocaleOfIssue(s: String) extends FixField(594, types.FixString(s))

case class UnderlyingInstrRegistry(s: String) extends FixField(595, types.FixString(s))

case class LegCountryOfIssue(code: String) extends FixField(596, types.Country(code))

case class LegStateOrProvinceOfIssue(s: String) extends FixField(597, types.FixString(s))

case class LegLocaleOfIssue(s: String) extends FixField(598, types.FixString(s))

case class LegInstrRegistry(s: String) extends FixField(599, types.FixString(s))

case class LegSymbol(s: String) extends FixField(600, types.FixString(s))

case class LegSymbolSfx(s: String) extends FixField(601, types.FixString(s))

case class LegSecurityID(s: String) extends FixField(602, types.FixString(s))

case class LegSecurityIDSource(s: String) extends FixField(603, types.FixString(s))

case class NoLegSecurityAltID(s: String) extends FixField(604, types.FixString(s))

case class LegSecurityAltID(s: String) extends FixField(605, types.FixString(s))

case class LegSecurityAltIDSource(s: String) extends FixField(606, types.FixString(s))

case class LegProduct(i: Int) extends FixField(607, types.FixInteger(i))

case class LegCFICode(s: String) extends FixField(608, types.FixString(s))

case class LegSecurityType(s: String) extends FixField(609, types.FixString(s))

case class LegMaturityMonthYear(year: Int, month: Int, day: Option[Int], week: Option[Int]) extends FixField(610, types.MonthYear(year, month, day, week))

case class LegMaturityDate(year: Int, month: Int, day: Int) extends FixField(611, types.LocalMktDate(year, month, day))

case class LegStrikePrice(price: Decimal) extends FixField(612, types.Price(price))

case class LegOptAttribute(c: Char) extends FixField(613, types.FixChar(c))

case class LegContractMultiplier(f: Decimal) extends FixField(614, types.FixFloat(f))

case class LegCouponRate(percentage: Decimal) extends FixField(615, types.Percentage(percentage))

case class LegSecurityExchange(code: String) extends FixField(616, types.Exchange(code))

case class LegIssuer(s: String) extends FixField(617, types.FixString(s))

case class EncodedLegIssuerLen(length: Int) extends FixField(618, types.Length(length))

case class EncodedLegIssuer(data: Array[Byte]) extends FixField(619, types.Data(data))

case class LegSecurityDesc(s: String) extends FixField(620, types.FixString(s))

case class EncodedLegSecurityDescLen(length: Int) extends FixField(621, types.Length(length))

case class EncodedLegSecurityDesc(data: Array[Byte]) extends FixField(622, types.Data(data))

case class LegRatioQty(f: Decimal) extends FixField(623, types.FixFloat(f))

case class LegSide(c: Char) extends FixField(624, types.FixChar(c))

case class TradingSessionSubID(s: String) extends FixField(625, types.FixString(s))

case class AllocType(i: Int) extends FixField(626, types.FixInteger(i))
object AllocType {
  val CALCULATED = AllocType(1)
  val PRELIMINARY = AllocType(2)
  val SELLSIDE_CALCULATED_USING_PRELIMINARY = AllocType(3)
  val SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY = AllocType(4)
  val READY_TO_BOOK_SINGLE_ORDER = AllocType(5)
  val BUYSIDE_READY_TO_BOOK = AllocType(6)
  val WAREHOUSE_INSTRUCTION = AllocType(7)
  val REQUEST_TO_INTERMEDIARY = AllocType(8)
  val ACCEPT = AllocType(9)
  val REJECT = AllocType(10)
  val ACCEPT_PENDING = AllocType(11)
  val INCOMPLETE_GROUP = AllocType(12)
  val COMPLETE_GROUP = AllocType(13)
  val REVERSAL_PENDING = AllocType(14)
}

case class NoHops(num: Int) extends FixField(627, types.NumInGroup(num))

case class HopCompID(s: String) extends FixField(628, types.FixString(s))

case class HopSendingTime(timestamp: Date) extends FixField(629, types.UTCTimestamp(timestamp))

case class HopRefID(seqNum: Int) extends FixField(630, types.SeqNum(seqNum))

case class MidPx(price: Decimal) extends FixField(631, types.Price(price))

case class BidYield(percentage: Decimal) extends FixField(632, types.Percentage(percentage))

case class MidYield(percentage: Decimal) extends FixField(633, types.Percentage(percentage))

case class OfferYield(percentage: Decimal) extends FixField(634, types.Percentage(percentage))

case class ClearingFeeIndicator(s: String) extends FixField(635, types.FixString(s))
object ClearingFeeIndicator {
  val CBOE_MEMBER = ClearingFeeIndicator("B")
  val NON_MEMBER_AND_CUSTOMER = ClearingFeeIndicator("C")
  val EQUITY_MEMBER_AND_CLEARING_MEMBER = ClearingFeeIndicator("E")
  val FULL_AND_ASSOCIATE_MEMBER_TRADING_FOR_OWN_ACCOUNT_AND_AS_FLOOR_BROKERS = ClearingFeeIndicator("F")
  val FIRMS_106H_AND_106J = ClearingFeeIndicator("H")
  val GIM_IDEM_AND_COM_MEMBERSHIP_INTEREST_HOLDERS = ClearingFeeIndicator("I")
  val LESSEE_AND_106F_EMPLOYEES = ClearingFeeIndicator("L")
  val ALL_OTHER_OWNERSHIP_TYPES = ClearingFeeIndicator("M")
  val _1ST_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT = ClearingFeeIndicator("1")
  val _2ND_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT = ClearingFeeIndicator("2")
  val _3RD_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT = ClearingFeeIndicator("3")
  val _4TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT = ClearingFeeIndicator("4")
  val _5TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT = ClearingFeeIndicator("5")
  val _6TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT = ClearingFeeIndicator("9")
}

case class WorkingIndicator(bool: Boolean) extends FixField(636, types.FixBoolean(bool))

case class LegLastPx(price: Decimal) extends FixField(637, types.Price(price))

case class PriorityIndicator(i: Int) extends FixField(638, types.FixInteger(i))
object PriorityIndicator {
  val PRIORITY_UNCHANGED = PriorityIndicator(0)
  val LOST_PRIORITY_AS_RESULT_OF_ORDER_CHANGE = PriorityIndicator(1)
}

case class PriceImprovement(offset: Decimal) extends FixField(639, types.PriceOffset(offset))

case class Price2(price: Decimal) extends FixField(640, types.Price(price))

case class LastForwardPoints2(offset: Decimal) extends FixField(641, types.PriceOffset(offset))

case class BidForwardPoints2(offset: Decimal) extends FixField(642, types.PriceOffset(offset))

case class OfferForwardPoints2(offset: Decimal) extends FixField(643, types.PriceOffset(offset))

case class RFQReqID(s: String) extends FixField(644, types.FixString(s))

case class MktBidPx(price: Decimal) extends FixField(645, types.Price(price))

case class MktOfferPx(price: Decimal) extends FixField(646, types.Price(price))

case class MinBidSize(qty: Decimal) extends FixField(647, types.Qty(qty))

case class MinOfferSize(qty: Decimal) extends FixField(648, types.Qty(qty))

case class QuoteStatusReqID(s: String) extends FixField(649, types.FixString(s))

case class LegalConfirm(bool: Boolean) extends FixField(650, types.FixBoolean(bool))

case class UnderlyingLastPx(price: Decimal) extends FixField(651, types.Price(price))

case class UnderlyingLastQty(qty: Decimal) extends FixField(652, types.Qty(qty))

case class SecDefStatus(i: Int) extends FixField(653, types.FixInteger(i))
object SecDefStatus {
  val PENDING_APPROVAL = SecDefStatus(0)
  val APPROVED = SecDefStatus(1)
  val REJECTED = SecDefStatus(2)
  val UNAUTHORIZED_REQUEST = SecDefStatus(3)
  val INVALID_DEFINITION_REQUEST = SecDefStatus(4)
}

case class LegRefID(s: String) extends FixField(654, types.FixString(s))

case class ContraLegRefID(s: String) extends FixField(655, types.FixString(s))

case class SettlCurrBidFxRate(f: Decimal) extends FixField(656, types.FixFloat(f))

case class SettlCurrOfferFxRate(f: Decimal) extends FixField(657, types.FixFloat(f))

case class QuoteRequestRejectReason(i: Int) extends FixField(658, types.FixInteger(i))
object QuoteRequestRejectReason {
  val UNKNOWN_SYMBOL = QuoteRequestRejectReason(1)
  val EXCHANGE_CLOSED = QuoteRequestRejectReason(2)
  val QUOTE_REQUEST_EXCEEDS_LIMIT = QuoteRequestRejectReason(3)
  val TOO_LATE_TO_ENTER = QuoteRequestRejectReason(4)
  val INVALID_PRICE = QuoteRequestRejectReason(5)
  val NOT_AUTHORIZED_TO_REQUEST_QUOTE = QuoteRequestRejectReason(6)
  val NO_MATCH_FOR_INQUIRY = QuoteRequestRejectReason(7)
  val NO_MARKET_FOR_INSTRUMENT = QuoteRequestRejectReason(8)
  val NO_INVENTORY = QuoteRequestRejectReason(9)
  val PASS = QuoteRequestRejectReason(10)
  val INSUFFICIENT_CREDIT = QuoteRequestRejectReason(11)
  val OTHER = QuoteRequestRejectReason(99)
}

case class SideComplianceID(s: String) extends FixField(659, types.FixString(s))

case class AcctIDSource(i: Int) extends FixField(660, types.FixInteger(i))
object AcctIDSource {
  val BIC = AcctIDSource(1)
  val SID_CODE = AcctIDSource(2)
  val TFM = AcctIDSource(3)
  val OMGEO = AcctIDSource(4)
  val DTCC_CODE = AcctIDSource(5)
  val OTHER = AcctIDSource(99)
}

case class AllocAcctIDSource(i: Int) extends FixField(661, types.FixInteger(i))

case class BenchmarkPrice(price: Decimal) extends FixField(662, types.Price(price))

case class BenchmarkPriceType(i: Int) extends FixField(663, types.FixInteger(i))

case class ConfirmID(s: String) extends FixField(664, types.FixString(s))

case class ConfirmStatus(i: Int) extends FixField(665, types.FixInteger(i))
object ConfirmStatus {
  val RECEIVED = ConfirmStatus(1)
  val MISMATCHED_ACCOUNT = ConfirmStatus(2)
  val MISSING_SETTLEMENT_INSTRUCTIONS = ConfirmStatus(3)
  val CONFIRMED = ConfirmStatus(4)
  val REQUEST_REJECTED = ConfirmStatus(5)
}

case class ConfirmTransType(i: Int) extends FixField(666, types.FixInteger(i))
object ConfirmTransType {
  val NEW = ConfirmTransType(0)
  val REPLACE = ConfirmTransType(1)
  val CANCEL = ConfirmTransType(2)
}

case class ContractSettlMonth(year: Int, month: Int, day: Option[Int], week: Option[Int]) extends FixField(667, types.MonthYear(year, month, day, week))

case class DeliveryForm(i: Int) extends FixField(668, types.FixInteger(i))
object DeliveryForm {
  val BOOKENTRY = DeliveryForm(1)
  val BEARER = DeliveryForm(2)
}

case class LastParPx(price: Decimal) extends FixField(669, types.Price(price))

case class NoLegAllocs(num: Int) extends FixField(670, types.NumInGroup(num))

case class LegAllocAccount(s: String) extends FixField(671, types.FixString(s))

case class LegIndividualAllocID(s: String) extends FixField(672, types.FixString(s))

case class LegAllocQty(qty: Decimal) extends FixField(673, types.Qty(qty))

case class LegAllocAcctIDSource(s: String) extends FixField(674, types.FixString(s))

case class LegSettlCurrency(code: String) extends FixField(675, types.Currency(code))

case class LegBenchmarkCurveCurrency(code: String) extends FixField(676, types.Currency(code))

case class LegBenchmarkCurveName(s: String) extends FixField(677, types.FixString(s))

case class LegBenchmarkCurvePoint(s: String) extends FixField(678, types.FixString(s))

case class LegBenchmarkPrice(price: Decimal) extends FixField(679, types.Price(price))

case class LegBenchmarkPriceType(i: Int) extends FixField(680, types.FixInteger(i))

case class LegBidPx(price: Decimal) extends FixField(681, types.Price(price))

case class LegIOIQty(s: String) extends FixField(682, types.FixString(s))

case class NoLegStipulations(num: Int) extends FixField(683, types.NumInGroup(num))

case class LegOfferPx(price: Decimal) extends FixField(684, types.Price(price))

case class LegOrderQty(qty: Decimal) extends FixField(685, types.Qty(qty))

case class LegPriceType(i: Int) extends FixField(686, types.FixInteger(i))

case class LegQty(qty: Decimal) extends FixField(687, types.Qty(qty))

case class LegStipulationType(s: String) extends FixField(688, types.FixString(s))

case class LegStipulationValue(s: String) extends FixField(689, types.FixString(s))

case class LegSwapType(i: Int) extends FixField(690, types.FixInteger(i))
object LegSwapType {
  val PAR_FOR_PAR = LegSwapType(1)
  val MODIFIED_DURATION = LegSwapType(2)
  val RISK = LegSwapType(4)
  val PROCEEDS = LegSwapType(5)
}

case class Pool(s: String) extends FixField(691, types.FixString(s))

case class QuotePriceType(i: Int) extends FixField(692, types.FixInteger(i))
object QuotePriceType {
  val PERCENT = QuotePriceType(1)
  val PER_SHARE = QuotePriceType(2)
  val FIXED_AMOUNT = QuotePriceType(3)
  val DISCOUNT = QuotePriceType(4)
  val PREMIUM = QuotePriceType(5)
  val BASIS_POINTS_RELATIVE_TO_BENCHMARK = QuotePriceType(6)
  val TED_PRICE = QuotePriceType(7)
  val TED_YIELD = QuotePriceType(8)
  val YIELD_SPREAD = QuotePriceType(9)
  val YIELD = QuotePriceType(10)
}

case class QuoteRespID(s: String) extends FixField(693, types.FixString(s))

case class QuoteRespType(i: Int) extends FixField(694, types.FixInteger(i))
object QuoteRespType {
  val HIT_LIFT = QuoteRespType(1)
  val COUNTER = QuoteRespType(2)
  val EXPIRED = QuoteRespType(3)
  val COVER = QuoteRespType(4)
  val DONE_AWAY = QuoteRespType(5)
  val PASS = QuoteRespType(6)
}

case class QuoteQualifier(c: Char) extends FixField(695, types.FixChar(c))

case class YieldRedemptionDate(year: Int, month: Int, day: Int) extends FixField(696, types.LocalMktDate(year, month, day))

case class YieldRedemptionPrice(price: Decimal) extends FixField(697, types.Price(price))

case class YieldRedemptionPriceType(i: Int) extends FixField(698, types.FixInteger(i))

case class BenchmarkSecurityID(s: String) extends FixField(699, types.FixString(s))

case class ReversalIndicator(bool: Boolean) extends FixField(700, types.FixBoolean(bool))

case class YieldCalcDate(year: Int, month: Int, day: Int) extends FixField(701, types.LocalMktDate(year, month, day))

case class NoPositions(num: Int) extends FixField(702, types.NumInGroup(num))

case class PosType(s: String) extends FixField(703, types.FixString(s))
object PosType {
  val TRANSACTION_QUANTITY = PosType("TQ")
  val INTRA_SPREAD_QTY = PosType("IAS")
  val INTER_SPREAD_QTY = PosType("IES")
  val END_OF_DAY_QTY = PosType("FIN")
  val START_OF_DAY_QTY = PosType("SOD")
  val OPTION_EXERCISE_QTY = PosType("EX")
  val OPTION_ASSIGNMENT = PosType("AS")
  val TRANSACTION_FROM_EXERCISE = PosType("TX")
  val TRANSACTION_FROM_ASSIGNMENT = PosType("TA")
  val PIT_TRADE_QTY = PosType("PIT")
  val TRANSFER_TRADE_QTY = PosType("TRF")
  val ELECTRONIC_TRADE_QTY = PosType("ETR")
  val ALLOCATION_TRADE_QTY = PosType("ALC")
  val ADJUSTMENT_QTY = PosType("PA")
  val AS_OF_TRADE_QTY = PosType("ASF")
  val DELIVERY_QTY = PosType("DLV")
  val TOTAL_TRANSACTION_QTY = PosType("TOT")
  val CROSS_MARGIN_QTY = PosType("XM")
  val INTEGRAL_SPLIT = PosType("SPL")
  val RECEIVE_QUANTITY = PosType("RCV")
  val CORPORATE_ACTION_ADJUSTMENT = PosType("CAA")
  val DELIVERY_NOTICE_QTY = PosType("DN")
  val EXCHANGE_FOR_PHYSICAL_QTY = PosType("EP")
}

case class LongQty(qty: Decimal) extends FixField(704, types.Qty(qty))

case class ShortQty(qty: Decimal) extends FixField(705, types.Qty(qty))

case class PosQtyStatus(i: Int) extends FixField(706, types.FixInteger(i))
object PosQtyStatus {
  val SUBMITTED = PosQtyStatus(0)
  val ACCEPTED = PosQtyStatus(1)
  val REJECTED = PosQtyStatus(2)
}

case class PosAmtType(s: String) extends FixField(707, types.FixString(s))
object PosAmtType {
  val FINAL_MARK_TO_MARKET_AMOUNT = PosAmtType("FMTM")
  val INCREMENTAL_MARK_TO_MARKET_AMOUNT = PosAmtType("IMTM")
  val TRADE_VARIATION_AMOUNT = PosAmtType("TVAR")
  val START_OF_DAY_MARK_TO_MARKET_AMOUNT = PosAmtType("SMTM")
  val PREMIUM_AMOUNT = PosAmtType("PREM")
  val CASH_RESIDUAL_AMOUNT = PosAmtType("CRES")
  val CASH_AMOUNT = PosAmtType("CASH")
  val VALUE_ADJUSTED_AMOUNT = PosAmtType("VADJ")
  val SETTLEMENT_VALUE = PosAmtType("SETL")
}

case class PosAmt(amount: Decimal) extends FixField(708, types.Amt(amount))

case class PosTransType(i: Int) extends FixField(709, types.FixInteger(i))
object PosTransType {
  val EXERCISE = PosTransType(1)
  val DO_NOT_EXERCISE = PosTransType(2)
  val POSITION_ADJUSTMENT = PosTransType(3)
  val POSITION_CHANGE_SUBMISSION_MARGIN_DISPOSITION = PosTransType(4)
  val PLEDGE = PosTransType(5)
  val LARGE_TRADER_SUBMISSION = PosTransType(6)
}

case class PosReqID(s: String) extends FixField(710, types.FixString(s))

case class NoUnderlyings(num: Int) extends FixField(711, types.NumInGroup(num))

case class PosMaintAction(i: Int) extends FixField(712, types.FixInteger(i))
object PosMaintAction {
  val NEW = PosMaintAction(1)
  val REPLACE = PosMaintAction(2)
  val CANCEL = PosMaintAction(3)
  val REVERSE = PosMaintAction(4)
}

case class OrigPosReqRefID(s: String) extends FixField(713, types.FixString(s))

case class PosMaintRptRefID(s: String) extends FixField(714, types.FixString(s))

case class ClearingBusinessDate(year: Int, month: Int, day: Int) extends FixField(715, types.LocalMktDate(year, month, day))

case class SettlSessID(s: String) extends FixField(716, types.FixString(s))
object SettlSessID {
  val INTRADAY = SettlSessID("ITD")
  val REGULAR_TRADING_HOURS = SettlSessID("RTH")
  val ELECTRONIC_TRADING_HOURS = SettlSessID("ETH")
  val END_OF_DAY = SettlSessID("EOD")
}

case class SettlSessSubID(s: String) extends FixField(717, types.FixString(s))

case class AdjustmentType(i: Int) extends FixField(718, types.FixInteger(i))
object AdjustmentType {
  val PROCESS_REQUEST_AS_MARGIN_DISPOSITION = AdjustmentType(0)
  val DELTA_PLUS = AdjustmentType(1)
  val DELTA_MINUS = AdjustmentType(2)
  val FINAL = AdjustmentType(3)
}

case class ContraryInstructionIndicator(bool: Boolean) extends FixField(719, types.FixBoolean(bool))

case class PriorSpreadIndicator(bool: Boolean) extends FixField(720, types.FixBoolean(bool))

case class PosMaintRptID(s: String) extends FixField(721, types.FixString(s))

case class PosMaintStatus(i: Int) extends FixField(722, types.FixInteger(i))
object PosMaintStatus {
  val ACCEPTED = PosMaintStatus(0)
  val ACCEPTED_WITH_WARNINGS = PosMaintStatus(1)
  val REJECTED = PosMaintStatus(2)
  val COMPLETED = PosMaintStatus(3)
  val COMPLETED_WITH_WARNINGS = PosMaintStatus(4)
}

case class PosMaintResult(i: Int) extends FixField(723, types.FixInteger(i))
object PosMaintResult {
  val SUCCESSFUL_COMPLETION_NO_WARNINGS_OR_ERRORS = PosMaintResult(0)
  val REJECTED = PosMaintResult(1)
  val OTHER = PosMaintResult(99)
}

case class PosReqType(i: Int) extends FixField(724, types.FixInteger(i))
object PosReqType {
  val POSITIONS = PosReqType(0)
  val TRADES = PosReqType(1)
  val EXERCISES = PosReqType(2)
  val ASSIGNMENTS = PosReqType(3)
  val SETTLEMENT_ACTIVITY = PosReqType(4)
  val BACKOUT_MESSAGE = PosReqType(5)
}

case class ResponseTransportType(i: Int) extends FixField(725, types.FixInteger(i))
object ResponseTransportType {
  val INBAND = ResponseTransportType(0)
  val OUT_OF_BAND = ResponseTransportType(1)
}

case class ResponseDestination(s: String) extends FixField(726, types.FixString(s))

case class TotalNumPosReports(i: Int) extends FixField(727, types.FixInteger(i))

case class PosReqResult(i: Int) extends FixField(728, types.FixInteger(i))
object PosReqResult {
  val VALID_REQUEST = PosReqResult(0)
  val INVALID_OR_UNSUPPORTED_REQUEST = PosReqResult(1)
  val NO_POSITIONS_FOUND_THAT_MATCH_CRITERIA = PosReqResult(2)
  val NOT_AUTHORIZED_TO_REQUEST_POSITIONS = PosReqResult(3)
  val REQUEST_FOR_POSITION_NOT_SUPPORTED = PosReqResult(4)
  val OTHER = PosReqResult(99)
}

case class PosReqStatus(i: Int) extends FixField(729, types.FixInteger(i))
object PosReqStatus {
  val COMPLETED = PosReqStatus(0)
  val COMPLETED_WITH_WARNINGS = PosReqStatus(1)
  val REJECTED = PosReqStatus(2)
}

case class SettlPrice(price: Decimal) extends FixField(730, types.Price(price))

case class SettlPriceType(i: Int) extends FixField(731, types.FixInteger(i))
object SettlPriceType {
  val FINAL = SettlPriceType(1)
  val THEORETICAL = SettlPriceType(2)
}

case class UnderlyingSettlPrice(price: Decimal) extends FixField(732, types.Price(price))

case class UnderlyingSettlPriceType(i: Int) extends FixField(733, types.FixInteger(i))

case class PriorSettlPrice(price: Decimal) extends FixField(734, types.Price(price))

case class NoQuoteQualifiers(num: Int) extends FixField(735, types.NumInGroup(num))

case class AllocSettlCurrency(code: String) extends FixField(736, types.Currency(code))

case class AllocSettlCurrAmt(amount: Decimal) extends FixField(737, types.Amt(amount))

case class InterestAtMaturity(amount: Decimal) extends FixField(738, types.Amt(amount))

case class LegDatedDate(year: Int, month: Int, day: Int) extends FixField(739, types.LocalMktDate(year, month, day))

case class LegPool(s: String) extends FixField(740, types.FixString(s))

case class AllocInterestAtMaturity(amount: Decimal) extends FixField(741, types.Amt(amount))

case class AllocAccruedInterestAmt(amount: Decimal) extends FixField(742, types.Amt(amount))

case class DeliveryDate(year: Int, month: Int, day: Int) extends FixField(743, types.LocalMktDate(year, month, day))

case class AssignmentMethod(c: Char) extends FixField(744, types.FixChar(c))
object AssignmentMethod {
  val RANDOM = AssignmentMethod('R')
  val PRORATA = AssignmentMethod('P')
}

case class AssignmentUnit(qty: Decimal) extends FixField(745, types.Qty(qty))

case class OpenInterest(amount: Decimal) extends FixField(746, types.Amt(amount))

case class ExerciseMethod(c: Char) extends FixField(747, types.FixChar(c))
object ExerciseMethod {
  val AUTOMATIC = ExerciseMethod('A')
  val MANUAL = ExerciseMethod('M')
}

case class TotNumTradeReports(i: Int) extends FixField(748, types.FixInteger(i))

case class TradeRequestResult(i: Int) extends FixField(749, types.FixInteger(i))
object TradeRequestResult {
  val SUCCESSFUL = TradeRequestResult(0)
  val INVALID_OR_UNKNOWN_INSTRUMENT = TradeRequestResult(1)
  val INVALID_TYPE_OF_TRADE_REQUESTED = TradeRequestResult(2)
  val INVALID_PARTIES = TradeRequestResult(3)
  val INVALID_TRANSPORT_TYPE_REQUESTED = TradeRequestResult(4)
  val INVALID_DESTINATION_REQUESTED = TradeRequestResult(5)
  val TRADEREQUESTTYPE_NOT_SUPPORTED = TradeRequestResult(8)
  val UNAUTHORIZED_FOR_TRADE_CAPTURE_REPORT_REQUEST = TradeRequestResult(9)
  val OTHER = TradeRequestResult(99)
}

case class TradeRequestStatus(i: Int) extends FixField(750, types.FixInteger(i))
object TradeRequestStatus {
  val ACCEPTED = TradeRequestStatus(0)
  val COMPLETED = TradeRequestStatus(1)
  val REJECTED = TradeRequestStatus(2)
}

case class TradeReportRejectReason(i: Int) extends FixField(751, types.FixInteger(i))
object TradeReportRejectReason {
  val SUCCESSFUL = TradeReportRejectReason(0)
  val INVALID_PARTY_INFORMATION = TradeReportRejectReason(1)
  val UNKNOWN_INSTRUMENT = TradeReportRejectReason(2)
  val UNAUTHORIZED_TO_REPORT_TRADES = TradeReportRejectReason(3)
  val INVALID_TRADE_TYPE = TradeReportRejectReason(4)
  val OTHER = TradeReportRejectReason(99)
}

case class SideMultiLegReportingType(i: Int) extends FixField(752, types.FixInteger(i))
object SideMultiLegReportingType {
  val SINGLE_SECURITY = SideMultiLegReportingType(1)
  val INDIVIDUAL_LEG_OF_A_MULTI_LEG_SECURITY = SideMultiLegReportingType(2)
  val MULTI_LEG_SECURITY = SideMultiLegReportingType(3)
}

case class NoPosAmt(num: Int) extends FixField(753, types.NumInGroup(num))

case class AutoAcceptIndicator(bool: Boolean) extends FixField(754, types.FixBoolean(bool))

case class AllocReportID(s: String) extends FixField(755, types.FixString(s))

case class NoNested2PartyIDs(num: Int) extends FixField(756, types.NumInGroup(num))

case class Nested2PartyID(s: String) extends FixField(757, types.FixString(s))

case class Nested2PartyIDSource(c: Char) extends FixField(758, types.FixChar(c))

case class Nested2PartyRole(i: Int) extends FixField(759, types.FixInteger(i))

case class Nested2PartySubID(s: String) extends FixField(760, types.FixString(s))

case class BenchmarkSecurityIDSource(s: String) extends FixField(761, types.FixString(s))

case class SecuritySubType(s: String) extends FixField(762, types.FixString(s))

case class UnderlyingSecuritySubType(s: String) extends FixField(763, types.FixString(s))

case class LegSecuritySubType(s: String) extends FixField(764, types.FixString(s))

case class AllowableOneSidednessPct(percentage: Decimal) extends FixField(765, types.Percentage(percentage))

case class AllowableOneSidednessValue(amount: Decimal) extends FixField(766, types.Amt(amount))

case class AllowableOneSidednessCurr(code: String) extends FixField(767, types.Currency(code))

case class NoTrdRegTimestamps(num: Int) extends FixField(768, types.NumInGroup(num))

case class TrdRegTimestamp(timestamp: Date) extends FixField(769, types.UTCTimestamp(timestamp))

case class TrdRegTimestampType(i: Int) extends FixField(770, types.FixInteger(i))
object TrdRegTimestampType {
  val EXECUTION_TIME = TrdRegTimestampType(1)
  val TIME_IN = TrdRegTimestampType(2)
  val TIME_OUT = TrdRegTimestampType(3)
  val BROKER_RECEIPT = TrdRegTimestampType(4)
  val BROKER_EXECUTION = TrdRegTimestampType(5)
  val DESK_RECEIPT = TrdRegTimestampType(6)
}

case class TrdRegTimestampOrigin(s: String) extends FixField(771, types.FixString(s))

case class ConfirmRefID(s: String) extends FixField(772, types.FixString(s))

case class ConfirmType(i: Int) extends FixField(773, types.FixInteger(i))
object ConfirmType {
  val STATUS = ConfirmType(1)
  val CONFIRMATION = ConfirmType(2)
  val CONFIRMATION_REQUEST_REJECTED = ConfirmType(3)
}

case class ConfirmRejReason(i: Int) extends FixField(774, types.FixInteger(i))
object ConfirmRejReason {
  val MISMATCHED_ACCOUNT = ConfirmRejReason(1)
  val MISSING_SETTLEMENT_INSTRUCTIONS = ConfirmRejReason(2)
  val OTHER = ConfirmRejReason(99)
}

case class BookingType(i: Int) extends FixField(775, types.FixInteger(i))
object BookingType {
  val REGULAR_BOOKING = BookingType(0)
  val CFD = BookingType(1)
  val TOTAL_RETURN_SWAP = BookingType(2)
}

case class IndividualAllocRejCode(i: Int) extends FixField(776, types.FixInteger(i))

case class SettlInstMsgID(s: String) extends FixField(777, types.FixString(s))

case class NoSettlInst(num: Int) extends FixField(778, types.NumInGroup(num))

case class LastUpdateTime(timestamp: Date) extends FixField(779, types.UTCTimestamp(timestamp))

case class AllocSettlInstType(i: Int) extends FixField(780, types.FixInteger(i))
object AllocSettlInstType {
  val USE_DEFAULT_INSTRUCTIONS = AllocSettlInstType(0)
  val DERIVE_FROM_PARAMETERS_PROVIDED = AllocSettlInstType(1)
  val FULL_DETAILS_PROVIDED = AllocSettlInstType(2)
  val SSI_DB_IDS_PROVIDED = AllocSettlInstType(3)
  val PHONE_FOR_INSTRUCTIONS = AllocSettlInstType(4)
}

case class NoSettlPartyIDs(num: Int) extends FixField(781, types.NumInGroup(num))

case class SettlPartyID(s: String) extends FixField(782, types.FixString(s))

case class SettlPartyIDSource(c: Char) extends FixField(783, types.FixChar(c))

case class SettlPartyRole(i: Int) extends FixField(784, types.FixInteger(i))

case class SettlPartySubID(s: String) extends FixField(785, types.FixString(s))

case class SettlPartySubIDType(i: Int) extends FixField(786, types.FixInteger(i))

case class DlvyInstType(c: Char) extends FixField(787, types.FixChar(c))
object DlvyInstType {
  val SECURITIES = DlvyInstType('S')
  val CASH = DlvyInstType('C')
}

case class TerminationType(i: Int) extends FixField(788, types.FixInteger(i))
object TerminationType {
  val OVERNIGHT = TerminationType(1)
  val TERM = TerminationType(2)
  val FLEXIBLE = TerminationType(3)
  val OPEN = TerminationType(4)
}

case class NextExpectedMsgSeqNum(seqNum: Int) extends FixField(789, types.SeqNum(seqNum))

case class OrdStatusReqID(s: String) extends FixField(790, types.FixString(s))

case class SettlInstReqID(s: String) extends FixField(791, types.FixString(s))

case class SettlInstReqRejCode(i: Int) extends FixField(792, types.FixInteger(i))
object SettlInstReqRejCode {
  val UNABLE_TO_PROCESS_REQUEST = SettlInstReqRejCode(0)
  val UNKNOWN_ACCOUNT = SettlInstReqRejCode(1)
  val NO_MATCHING_SETTLEMENT_INSTRUCTIONS_FOUND = SettlInstReqRejCode(2)
  val OTHER = SettlInstReqRejCode(99)
}

case class SecondaryAllocID(s: String) extends FixField(793, types.FixString(s))

case class AllocReportType(i: Int) extends FixField(794, types.FixInteger(i))
object AllocReportType {
  val SELLSIDE_CALCULATED_USING_PRELIMINARY = AllocReportType(3)
  val SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY = AllocReportType(4)
  val WAREHOUSE_RECAP = AllocReportType(5)
  val REQUEST_TO_INTERMEDIARY = AllocReportType(8)
  val PRELIMINARY_REQUEST_TO_INTERMEDIARY = AllocReportType(2)
  val ACCEPT = AllocReportType(9)
  val REJECT = AllocReportType(10)
  val ACCEPT_PENDING = AllocReportType(11)
  val COMPLETE = AllocReportType(12)
  val REVERSE_PENDING = AllocReportType(14)
}

case class AllocReportRefID(s: String) extends FixField(795, types.FixString(s))

case class AllocCancReplaceReason(i: Int) extends FixField(796, types.FixInteger(i))
object AllocCancReplaceReason {
  val ORIGINAL_DETAILS_INCOMPLETE_INCORRECT = AllocCancReplaceReason(1)
  val CHANGE_IN_UNDERLYING_ORDER_DETAILS = AllocCancReplaceReason(2)
  val OTHER = AllocCancReplaceReason(99)
}

case class CopyMsgIndicator(bool: Boolean) extends FixField(797, types.FixBoolean(bool))

case class AllocAccountType(i: Int) extends FixField(798, types.FixInteger(i))
object AllocAccountType {
  val ACCOUNT_IS_CARRIED_ON_CUSTOMER_SIDE_OF_BOOKS = AllocAccountType(1)
  val ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS = AllocAccountType(2)
  val HOUSE_TRADER = AllocAccountType(3)
  val FLOOR_TRADER = AllocAccountType(4)
  val ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS_AND_IS_CROSS_MARGINED = AllocAccountType(6)
  val ACCOUNT_IS_HOUSE_TRADER_AND_IS_CROSS_MARGINED = AllocAccountType(7)
  val JOINT_BACKOFFICE_ACCOUNT = AllocAccountType(8)
}

case class OrderAvgPx(price: Decimal) extends FixField(799, types.Price(price))

case class OrderBookingQty(qty: Decimal) extends FixField(800, types.Qty(qty))

case class NoSettlPartySubIDs(num: Int) extends FixField(801, types.NumInGroup(num))

case class NoPartySubIDs(num: Int) extends FixField(802, types.NumInGroup(num))

case class PartySubIDType(i: Int) extends FixField(803, types.FixInteger(i))
object PartySubIDType {
  val FIRM = PartySubIDType(1)
  val PERSON = PartySubIDType(2)
  val SYSTEM = PartySubIDType(3)
  val APPLICATION = PartySubIDType(4)
  val FULL_LEGAL_NAME_OF_FIRM = PartySubIDType(5)
  val POSTAL_ADDRESS = PartySubIDType(6)
  val PHONE_NUMBER = PartySubIDType(7)
  val EMAIL_ADDRESS = PartySubIDType(8)
  val CONTACT_NAME = PartySubIDType(9)
  val SECURITIES_ACCOUNT_NUMBER = PartySubIDType(10)
  val REGISTRATION_NUMBER = PartySubIDType(11)
  val REGISTERED_ADDRESS = PartySubIDType(12)
  val REGULATORY_STATUS = PartySubIDType(13)
  val REGISTRATION_NAME = PartySubIDType(14)
  val CASH_ACCOUNT_NUMBER = PartySubIDType(15)
  val BIC = PartySubIDType(16)
  val CSD_PARTICIPANT_MEMBER_CODE = PartySubIDType(17)
  val REGISTERED_ADDRESS2 = PartySubIDType(18)
  val FUND_ACCOUNT_NAME = PartySubIDType(19)
  val TELEX_NUMBER = PartySubIDType(20)
  val FAX_NUMBER = PartySubIDType(21)
  val SECURITIES_ACCOUNT_NAME = PartySubIDType(22)
  val CASH_ACCOUNT_NAME = PartySubIDType(23)
  val DEPARTMENT = PartySubIDType(24)
  val LOCATION_DESK = PartySubIDType(25)
  val POSITION_ACCOUNT_TYPE = PartySubIDType(26)
  val SECURITY_LOCATE_ID = PartySubIDType(27)
  val MARKET_MAKER = PartySubIDType(28)
  val ELIGIBLE_COUNTERPARTY = PartySubIDType(29)
  val PROFESSIONAL_CLIENT = PartySubIDType(30)
  val LOCATION = PartySubIDType(31)
  val EXECUTION_VENUE = PartySubIDType(32)
}

case class NoNestedPartySubIDs(num: Int) extends FixField(804, types.NumInGroup(num))

case class NestedPartySubIDType(i: Int) extends FixField(805, types.FixInteger(i))

case class NoNested2PartySubIDs(num: Int) extends FixField(806, types.NumInGroup(num))

case class Nested2PartySubIDType(i: Int) extends FixField(807, types.FixInteger(i))

case class AllocIntermedReqType(i: Int) extends FixField(808, types.FixInteger(i))
object AllocIntermedReqType {
  val PENDING_ACCEPT = AllocIntermedReqType(1)
  val PENDING_RELEASE = AllocIntermedReqType(2)
  val PENDING_REVERSAL = AllocIntermedReqType(3)
  val ACCEPT = AllocIntermedReqType(4)
  val BLOCK_LEVEL_REJECT = AllocIntermedReqType(5)
  val ACCOUNT_LEVEL_REJECT = AllocIntermedReqType(6)
}

case class UnderlyingPx(price: Decimal) extends FixField(810, types.Price(price))

case class PriceDelta(f: Decimal) extends FixField(811, types.FixFloat(f))

case class ApplQueueMax(i: Int) extends FixField(812, types.FixInteger(i))

case class ApplQueueDepth(i: Int) extends FixField(813, types.FixInteger(i))

case class ApplQueueResolution(i: Int) extends FixField(814, types.FixInteger(i))
object ApplQueueResolution {
  val NO_ACTION_TAKEN = ApplQueueResolution(0)
  val QUEUE_FLUSHED = ApplQueueResolution(1)
  val OVERLAY_LAST = ApplQueueResolution(2)
  val END_SESSION = ApplQueueResolution(3)
}

case class ApplQueueAction(i: Int) extends FixField(815, types.FixInteger(i))
object ApplQueueAction {
  val NO_ACTION_TAKEN = ApplQueueAction(0)
  val QUEUE_FLUSHED = ApplQueueAction(1)
  val OVERLAY_LAST = ApplQueueAction(2)
  val END_SESSION = ApplQueueAction(3)
}

case class NoAltMDSource(num: Int) extends FixField(816, types.NumInGroup(num))

case class AltMDSourceID(s: String) extends FixField(817, types.FixString(s))

case class SecondaryTradeReportID(s: String) extends FixField(818, types.FixString(s))

case class AvgPxIndicator(i: Int) extends FixField(819, types.FixInteger(i))
object AvgPxIndicator {
  val NO_AVERAGE_PRICING = AvgPxIndicator(0)
  val TRADE_IS_PART_OF_AN_AVERAGE_PRICE_GROUP_IDENTIFIED_BY_THE_TRADELINKID = AvgPxIndicator(1)
  val LAST_TRADE_IN_THE_AVERAGE_PRICE_GROUP_IDENTIFIED_BY_THE_TRADELINKID = AvgPxIndicator(2)
}

case class TradeLinkID(s: String) extends FixField(820, types.FixString(s))

case class OrderInputDevice(s: String) extends FixField(821, types.FixString(s))

case class UnderlyingTradingSessionID(s: String) extends FixField(822, types.FixString(s))

case class UnderlyingTradingSessionSubID(s: String) extends FixField(823, types.FixString(s))

case class TradeLegRefID(s: String) extends FixField(824, types.FixString(s))

case class ExchangeRule(s: String) extends FixField(825, types.FixString(s))

case class TradeAllocIndicator(i: Int) extends FixField(826, types.FixInteger(i))
object TradeAllocIndicator {
  val ALLOCATION_NOT_REQUIRED = TradeAllocIndicator(0)
  val ALLOCATION_REQUIRED = TradeAllocIndicator(1)
  val USE_ALLOCATION_PROVIDED_WITH_THE_TRADE = TradeAllocIndicator(2)
  val ALLOCATION_GIVE_UP_EXECUTOR = TradeAllocIndicator(3)
  val ALLOCATION_FROM_EXECUTOR = TradeAllocIndicator(4)
  val ALLOCATION_TO_CLAIM_ACCOUNT = TradeAllocIndicator(5)
}

case class ExpirationCycle(i: Int) extends FixField(827, types.FixInteger(i))
object ExpirationCycle {
  val EXPIRE_ON_TRADING_SESSION_CLOSE = ExpirationCycle(0)
  val EXPIRE_ON_TRADING_SESSION_OPEN = ExpirationCycle(1)
}

case class TrdType(i: Int) extends FixField(828, types.FixInteger(i))
object TrdType {
  val REGULAR_TRADE = TrdType(0)
  val BLOCK_TRADE = TrdType(1)
  val AFTER_HOURS_TRADE = TrdType(10)
  val EFP = TrdType(2)
  val TRANSFER = TrdType(3)
  val LATE_TRADE = TrdType(4)
  val T_TRADE = TrdType(5)
  val WEIGHTED_AVERAGE_PRICE_TRADE = TrdType(6)
  val BUNCHED_TRADE = TrdType(7)
  val LATE_BUNCHED_TRADE = TrdType(8)
  val PRIOR_REFERENCE_PRICE_TRADE = TrdType(9)
  val EXCHANGE_FOR_RISK = TrdType(11)
  val EXCHANGE_FOR_SWAP = TrdType(12)
  val EXCHANGE_OF_FUTURES_FOR = TrdType(13)
  val EXCHANGE_OF_OPTIONS_FOR_OPTIONS = TrdType(14)
  val TRADING_AT_SETTLEMENT = TrdType(15)
  val ALL_OR_NONE = TrdType(16)
  val FUTURES_LARGE_ORDER_EXECUTION = TrdType(17)
  val EXCHANGE_OF_FUTURES_FOR_FUTURES = TrdType(18)
  val OPTION_INTERIM_TRADE = TrdType(19)
  val OPTION_CABINET_TRADE = TrdType(20)
  val PRIVATELY_NEGOTIATED_TRADES = TrdType(22)
  val SUBSTITUTION_OF_FUTURES_FOR_FORWARDS = TrdType(23)
  val ERROR_TRADE = TrdType(24)
  val SPECIAL_CUM_DIVIDEND = TrdType(25)
  val SPECIAL_EX_DIVIDEND = TrdType(26)
  val SPECIAL_CUM_COUPON = TrdType(27)
  val SPECIAL_EX_COUPON = TrdType(28)
  val CASH_SETTLEMENT = TrdType(29)
  val SPECIAL_PRICE = TrdType(30)
  val GUARANTEED_DELIVERY = TrdType(31)
  val SPECIAL_CUM_RIGHTS = TrdType(32)
  val SPECIAL_EX_RIGHTS = TrdType(33)
  val SPECIAL_CUM_CAPITAL_REPAYMENTS = TrdType(34)
  val SPECIAL_EX_CAPITAL_REPAYMENTS = TrdType(35)
  val SPECIAL_CUM_BONUS = TrdType(36)
  val SPECIAL_EX_BONUS = TrdType(37)
  val BLOCK_TRADE2 = TrdType(38)
  val WORKED_PRINCIPAL_TRADE = TrdType(39)
  val BLOCK_TRADES = TrdType(40)
  val NAME_CHANGE = TrdType(41)
  val PORTFOLIO_TRANSFER = TrdType(42)
  val PROROGATION_BUY = TrdType(43)
  val PROROGATION_SELL = TrdType(44)
  val OPTION_EXERCISE = TrdType(45)
  val DELTA_NEUTRAL_TRANSACTION = TrdType(46)
  val FINANCING_TRANSACTION = TrdType(47)
}

case class TrdSubType(i: Int) extends FixField(829, types.FixInteger(i))
object TrdSubType {
  val CMTA = TrdSubType(0)
  val INTERNAL_TRANSFER_OR_ADJUSTMENT = TrdSubType(1)
  val EXTERNAL_TRANSFER_OR_TRANSFER_OF_ACCOUNT = TrdSubType(2)
  val REJECT_FOR_SUBMITTING_SIDE = TrdSubType(3)
  val ADVISORY_FOR_CONTRA_SIDE = TrdSubType(4)
  val OFFSET_DUE_TO_AN_ALLOCATION = TrdSubType(5)
  val ONSET_DUT_TO_AN_ALLOCATION = TrdSubType(6)
  val DIFFERENTIAL_SPREAD = TrdSubType(7)
  val IMPLIED_SPREAD_LEG_EXECUTED_AGAINST_AN_OUTRIGHT = TrdSubType(8)
  val TRANSACTION_FROM_EXERCISE = TrdSubType(9)
  val TRANSACTION_FROM_ASSIGNMENT = TrdSubType(10)
  val ACATS = TrdSubType(11)
  val AI = TrdSubType(14)
  val B = TrdSubType(15)
  val K = TrdSubType(16)
  val LC = TrdSubType(17)
  val M = TrdSubType(18)
  val N = TrdSubType(19)
  val NM = TrdSubType(20)
  val NR = TrdSubType(21)
  val P = TrdSubType(22)
  val PA = TrdSubType(23)
  val PC = TrdSubType(24)
  val PN = TrdSubType(25)
  val R = TrdSubType(26)
  val RO = TrdSubType(27)
  val RT = TrdSubType(28)
  val SW = TrdSubType(29)
  val T = TrdSubType(30)
  val WN = TrdSubType(31)
  val WT = TrdSubType(32)
}

case class TransferReason(s: String) extends FixField(830, types.FixString(s))

case class AsgnReqID(s: String) extends FixField(831, types.FixString(s))

case class TotNumAssignmentReports(i: Int) extends FixField(832, types.FixInteger(i))

case class AsgnRptID(s: String) extends FixField(833, types.FixString(s))

case class ThresholdAmount(offset: Decimal) extends FixField(834, types.PriceOffset(offset))

case class PegMoveType(i: Int) extends FixField(835, types.FixInteger(i))
object PegMoveType {
  val FLOATING = PegMoveType(0)
  val FIXED = PegMoveType(1)
}

case class PegOffsetType(i: Int) extends FixField(836, types.FixInteger(i))
object PegOffsetType {
  val PRICE = PegOffsetType(0)
  val BASIS_POINTS = PegOffsetType(1)
  val TICKS = PegOffsetType(2)
  val PRICE_TIER_LEVEL = PegOffsetType(3)
}

case class PegLimitType(i: Int) extends FixField(837, types.FixInteger(i))
object PegLimitType {
  val OR_BETTER = PegLimitType(0)
  val STRICT = PegLimitType(1)
  val OR_WORSE = PegLimitType(2)
}

case class PegRoundDirection(i: Int) extends FixField(838, types.FixInteger(i))
object PegRoundDirection {
  val MORE_AGGRESSIVE = PegRoundDirection(1)
  val MORE_PASSIVE = PegRoundDirection(2)
}

case class PeggedPrice(price: Decimal) extends FixField(839, types.Price(price))

case class PegScope(i: Int) extends FixField(840, types.FixInteger(i))
object PegScope {
  val LOCAL = PegScope(1)
  val NATIONAL = PegScope(2)
  val GLOBAL = PegScope(3)
  val NATIONAL_EXCLUDING_LOCAL = PegScope(4)
}

case class DiscretionMoveType(i: Int) extends FixField(841, types.FixInteger(i))
object DiscretionMoveType {
  val FLOATING = DiscretionMoveType(0)
  val FIXED = DiscretionMoveType(1)
}

case class DiscretionOffsetType(i: Int) extends FixField(842, types.FixInteger(i))
object DiscretionOffsetType {
  val PRICE = DiscretionOffsetType(0)
  val BASIS_POINTS = DiscretionOffsetType(1)
  val TICKS = DiscretionOffsetType(2)
  val PRICE_TIER_LEVEL = DiscretionOffsetType(3)
}

case class DiscretionLimitType(i: Int) extends FixField(843, types.FixInteger(i))
object DiscretionLimitType {
  val OR_BETTER = DiscretionLimitType(0)
  val STRICT = DiscretionLimitType(1)
  val OR_WORSE = DiscretionLimitType(2)
}

case class DiscretionRoundDirection(i: Int) extends FixField(844, types.FixInteger(i))
object DiscretionRoundDirection {
  val MORE_AGGRESSIVE = DiscretionRoundDirection(1)
  val MORE_PASSIVE = DiscretionRoundDirection(2)
}

case class DiscretionPrice(price: Decimal) extends FixField(845, types.Price(price))

case class DiscretionScope(i: Int) extends FixField(846, types.FixInteger(i))
object DiscretionScope {
  val LOCAL = DiscretionScope(1)
  val NATIONAL = DiscretionScope(2)
  val GLOBAL = DiscretionScope(3)
  val NATIONAL_EXCLUDING_LOCAL = DiscretionScope(4)
}

case class TargetStrategy(i: Int) extends FixField(847, types.FixInteger(i))
object TargetStrategy {
  val VWAP = TargetStrategy(1)
  val PARTICIPATE = TargetStrategy(2)
  val MININIZE_MARKET_IMPACT = TargetStrategy(3)
}

case class TargetStrategyParameters(s: String) extends FixField(848, types.FixString(s))

case class ParticipationRate(percentage: Decimal) extends FixField(849, types.Percentage(percentage))

case class TargetStrategyPerformance(f: Decimal) extends FixField(850, types.FixFloat(f))

case class LastLiquidityInd(i: Int) extends FixField(851, types.FixInteger(i))
object LastLiquidityInd {
  val ADDED_LIQUIDITY = LastLiquidityInd(1)
  val REMOVED_LIQUIDITY = LastLiquidityInd(2)
  val LIQUIDITY_ROUTED_OUT = LastLiquidityInd(3)
}

case class PublishTrdIndicator(bool: Boolean) extends FixField(852, types.FixBoolean(bool))

case class ShortSaleReason(i: Int) extends FixField(853, types.FixInteger(i))
object ShortSaleReason {
  val DEALER_SOLD_SHORT = ShortSaleReason(0)
  val DEALER_SOLD_SHORT_EXEMPT = ShortSaleReason(1)
  val SELLING_CUSTOMER_SOLD_SHORT = ShortSaleReason(2)
  val SELLING_CUSTOMER_SOLD_SHORT_EXEMPT = ShortSaleReason(3)
  val QUALIFED_SERVICE_REPRESENTATIVE_OR_AUTOMATIC_GIVEUP_CONTRA_SIDE_SOLD_SHORT = ShortSaleReason(4)
  val QSR_OR_AGU_CONTRA_SIDE_SOLD_SHORT_EXEMPT = ShortSaleReason(5)
}

case class QtyType(i: Int) extends FixField(854, types.FixInteger(i))
object QtyType {
  val UNITS = QtyType(0)
  val CONTRACTS = QtyType(1)
  val UNITS_OF_MEASURE_PER_TIME_UNIT = QtyType(2)
}

case class SecondaryTrdType(i: Int) extends FixField(855, types.FixInteger(i))

case class TradeReportType(i: Int) extends FixField(856, types.FixInteger(i))
object TradeReportType {
  val SUBMIT = TradeReportType(0)
  val ALLEGED = TradeReportType(1)
  val ACCEPT = TradeReportType(2)
  val DECLINE = TradeReportType(3)
  val ADDENDUM = TradeReportType(4)
  val NO_WAS = TradeReportType(5)
  val TRADE_REPORT_CANCEL = TradeReportType(6)
  val LOCKED_IN_TRADE_BREAK = TradeReportType(7)
  val DEFAULTED = TradeReportType(8)
  val INVALID_CMTA = TradeReportType(9)
  val PENDED = TradeReportType(10)
  val ALLEGED_NEW = TradeReportType(11)
  val ALLEGED_ADDENDUM = TradeReportType(12)
  val ALLEGED_NO_WAS = TradeReportType(13)
  val ALLEGED_TRADE_REPORT_CANCEL = TradeReportType(14)
  val ALLEGED2 = TradeReportType(15)
}

case class AllocNoOrdersType(i: Int) extends FixField(857, types.FixInteger(i))
object AllocNoOrdersType {
  val NOT_SPECIFIED = AllocNoOrdersType(0)
  val EXPLICIT_LIST_PROVIDED = AllocNoOrdersType(1)
}

case class SharedCommission(amount: Decimal) extends FixField(858, types.Amt(amount))

case class ConfirmReqID(s: String) extends FixField(859, types.FixString(s))

case class AvgParPx(price: Decimal) extends FixField(860, types.Price(price))

case class ReportedPx(price: Decimal) extends FixField(861, types.Price(price))

case class NoCapacities(num: Int) extends FixField(862, types.NumInGroup(num))

case class OrderCapacityQty(qty: Decimal) extends FixField(863, types.Qty(qty))

case class NoEvents(num: Int) extends FixField(864, types.NumInGroup(num))

case class EventType(i: Int) extends FixField(865, types.FixInteger(i))
object EventType {
  val PUT = EventType(1)
  val CALL = EventType(2)
  val TENDER = EventType(3)
  val SINKING_FUND_CALL = EventType(4)
  val ACTIVATION = EventType(5)
  val INACTIVIATION = EventType(6)
  val OTHER = EventType(99)
}

case class EventDate(year: Int, month: Int, day: Int) extends FixField(866, types.LocalMktDate(year, month, day))

case class EventPx(price: Decimal) extends FixField(867, types.Price(price))

case class EventText(s: String) extends FixField(868, types.FixString(s))

case class PctAtRisk(percentage: Decimal) extends FixField(869, types.Percentage(percentage))

case class NoInstrAttrib(num: Int) extends FixField(870, types.NumInGroup(num))

case class InstrAttribType(i: Int) extends FixField(871, types.FixInteger(i))
object InstrAttribType {
  val FLAT = InstrAttribType(1)
  val ZERO_COUPON = InstrAttribType(2)
  val INTEREST_BEARING = InstrAttribType(3)
  val NO_PERIODIC_PAYMENTS = InstrAttribType(4)
  val VARIABLE_RATE = InstrAttribType(5)
  val LESS_FEE_FOR_PUT = InstrAttribType(6)
  val STEPPED_COUPON = InstrAttribType(7)
  val COUPON_PERIOD = InstrAttribType(8)
  val WHEN_AND_IF_ISSUED = InstrAttribType(9)
  val ORIGINAL_ISSUE_DISCOUNT = InstrAttribType(10)
  val CALLABLE_PUTTABLE = InstrAttribType(11)
  val ESCROWED_TO_MATURITY = InstrAttribType(12)
  val ESCROWED_TO_REDEMPTION_DATE = InstrAttribType(13)
  val PRE_REFUNDED = InstrAttribType(14)
  val IN_DEFAULT = InstrAttribType(15)
  val UNRATED = InstrAttribType(16)
  val TAXABLE = InstrAttribType(17)
  val INDEXED = InstrAttribType(18)
  val SUBJECT_TO_ALTERNATIVE_MINIMUM_TAX = InstrAttribType(19)
  val ORIGINAL_ISSUE_DISCOUNT_PRICE_SUPPLY_PRICE_IN_THE_INSTRATTRIBVALUE = InstrAttribType(20)
  val CALLABLE_BELOW_MATURITY_VALUE = InstrAttribType(21)
  val CALLABLE_WITHOUT_NOTICE_BY_MAIL_TO_HOLDER_UNLESS_REGISTERED = InstrAttribType(22)
  val TEXT_SUPPLY_THE_TEXT_OF_THE_ATTRIBUTE_OR_DISCLAIMER_IN_THE_INSTRATTRIBVALUE = InstrAttribType(99)
}

case class InstrAttribValue(s: String) extends FixField(872, types.FixString(s))

case class DatedDate(year: Int, month: Int, day: Int) extends FixField(873, types.LocalMktDate(year, month, day))

case class InterestAccrualDate(year: Int, month: Int, day: Int) extends FixField(874, types.LocalMktDate(year, month, day))

case class CPProgram(i: Int) extends FixField(875, types.FixInteger(i))
object CPProgram {
  val _3_A = CPProgram(1)
  val _4_2 = CPProgram(2)
  val OTHER = CPProgram(99)
}

case class CPRegType(s: String) extends FixField(876, types.FixString(s))

case class UnderlyingCPProgram(s: String) extends FixField(877, types.FixString(s))

case class UnderlyingCPRegType(s: String) extends FixField(878, types.FixString(s))

case class UnderlyingQty(qty: Decimal) extends FixField(879, types.Qty(qty))

case class TrdMatchID(s: String) extends FixField(880, types.FixString(s))

case class SecondaryTradeReportRefID(s: String) extends FixField(881, types.FixString(s))

case class UnderlyingDirtyPrice(price: Decimal) extends FixField(882, types.Price(price))

case class UnderlyingEndPrice(price: Decimal) extends FixField(883, types.Price(price))

case class UnderlyingStartValue(amount: Decimal) extends FixField(884, types.Amt(amount))

case class UnderlyingCurrentValue(amount: Decimal) extends FixField(885, types.Amt(amount))

case class UnderlyingEndValue(amount: Decimal) extends FixField(886, types.Amt(amount))

case class NoUnderlyingStips(num: Int) extends FixField(887, types.NumInGroup(num))

case class UnderlyingStipType(s: String) extends FixField(888, types.FixString(s))

case class UnderlyingStipValue(s: String) extends FixField(889, types.FixString(s))

case class MaturityNetMoney(amount: Decimal) extends FixField(890, types.Amt(amount))

case class MiscFeeBasis(i: Int) extends FixField(891, types.FixInteger(i))
object MiscFeeBasis {
  val ABSOLUTE = MiscFeeBasis(0)
  val PER_UNIT = MiscFeeBasis(1)
  val PERCENTAGE = MiscFeeBasis(2)
}

case class TotNoAllocs(i: Int) extends FixField(892, types.FixInteger(i))

case class LastFragment(bool: Boolean) extends FixField(893, types.FixBoolean(bool))

case class CollReqID(s: String) extends FixField(894, types.FixString(s))

case class CollAsgnReason(i: Int) extends FixField(895, types.FixInteger(i))
object CollAsgnReason {
  val INITIAL = CollAsgnReason(0)
  val SCHEDULED = CollAsgnReason(1)
  val TIME_WARNING = CollAsgnReason(2)
  val MARGIN_DEFICIENCY = CollAsgnReason(3)
  val MARGIN_EXCESS = CollAsgnReason(4)
  val FORWARD_COLLATERAL_DEMAND = CollAsgnReason(5)
  val EVENT_OF_DEFAULT = CollAsgnReason(6)
  val ADVERSE_TAX_EVENT = CollAsgnReason(7)
}

case class CollInquiryQualifier(i: Int) extends FixField(896, types.FixInteger(i))
object CollInquiryQualifier {
  val TRADEDATE = CollInquiryQualifier(0)
  val GC_INSTRUMENT = CollInquiryQualifier(1)
  val COLLATERALINSTRUMENT = CollInquiryQualifier(2)
  val SUBSTITUTION_ELIGIBLE = CollInquiryQualifier(3)
  val NOT_ASSIGNED = CollInquiryQualifier(4)
  val PARTIALLY_ASSIGNED = CollInquiryQualifier(5)
  val FULLY_ASSIGNED = CollInquiryQualifier(6)
  val OUTSTANDING_TRADES = CollInquiryQualifier(7)
}

case class NoTrades(num: Int) extends FixField(897, types.NumInGroup(num))

case class MarginRatio(percentage: Decimal) extends FixField(898, types.Percentage(percentage))

case class MarginExcess(amount: Decimal) extends FixField(899, types.Amt(amount))

case class TotalNetValue(amount: Decimal) extends FixField(900, types.Amt(amount))

case class CashOutstanding(amount: Decimal) extends FixField(901, types.Amt(amount))

case class CollAsgnID(s: String) extends FixField(902, types.FixString(s))

case class CollAsgnTransType(i: Int) extends FixField(903, types.FixInteger(i))
object CollAsgnTransType {
  val NEW = CollAsgnTransType(0)
  val REPLACE = CollAsgnTransType(1)
  val CANCEL = CollAsgnTransType(2)
  val RELEASE = CollAsgnTransType(3)
  val REVERSE = CollAsgnTransType(4)
}

case class CollRespID(s: String) extends FixField(904, types.FixString(s))

case class CollAsgnRespType(i: Int) extends FixField(905, types.FixInteger(i))
object CollAsgnRespType {
  val RECEIVED = CollAsgnRespType(0)
  val ACCEPTED = CollAsgnRespType(1)
  val DECLINED = CollAsgnRespType(2)
  val REJECTED = CollAsgnRespType(3)
}

case class CollAsgnRejectReason(i: Int) extends FixField(906, types.FixInteger(i))
object CollAsgnRejectReason {
  val UNKNOWN_DEAL = CollAsgnRejectReason(0)
  val UNKNOWN_OR_INVALID_INSTRUMENT = CollAsgnRejectReason(1)
  val UNAUTHORIZED_TRANSACTION = CollAsgnRejectReason(2)
  val INSUFFICIENT_COLLATERAL = CollAsgnRejectReason(3)
  val INVALID_TYPE_OF_COLLATERAL = CollAsgnRejectReason(4)
  val EXCESSIVE_SUBSTITUTION = CollAsgnRejectReason(5)
  val OTHER = CollAsgnRejectReason(99)
}

case class CollAsgnRefID(s: String) extends FixField(907, types.FixString(s))

case class CollRptID(s: String) extends FixField(908, types.FixString(s))

case class CollInquiryID(s: String) extends FixField(909, types.FixString(s))

case class CollStatus(i: Int) extends FixField(910, types.FixInteger(i))
object CollStatus {
  val UNASSIGNED = CollStatus(0)
  val PARTIALLY_ASSIGNED = CollStatus(1)
  val ASSIGNMENT_PROPOSED = CollStatus(2)
  val ASSIGNED = CollStatus(3)
  val CHALLENGED = CollStatus(4)
}

case class TotNumReports(i: Int) extends FixField(911, types.FixInteger(i))

case class LastRptRequested(bool: Boolean) extends FixField(912, types.FixBoolean(bool))

case class AgreementDesc(s: String) extends FixField(913, types.FixString(s))

case class AgreementID(s: String) extends FixField(914, types.FixString(s))

case class AgreementDate(year: Int, month: Int, day: Int) extends FixField(915, types.LocalMktDate(year, month, day))

case class StartDate(year: Int, month: Int, day: Int) extends FixField(916, types.LocalMktDate(year, month, day))

case class EndDate(year: Int, month: Int, day: Int) extends FixField(917, types.LocalMktDate(year, month, day))

case class AgreementCurrency(code: String) extends FixField(918, types.Currency(code))

case class DeliveryType(i: Int) extends FixField(919, types.FixInteger(i))
object DeliveryType {
  val VERSUS_PAYMENT = DeliveryType(0)
  val FREE = DeliveryType(1)
  val TRI_PARTY = DeliveryType(2)
  val HOLD_IN_CUSTODY = DeliveryType(3)
}

case class EndAccruedInterestAmt(amount: Decimal) extends FixField(920, types.Amt(amount))

case class StartCash(amount: Decimal) extends FixField(921, types.Amt(amount))

case class EndCash(amount: Decimal) extends FixField(922, types.Amt(amount))

case class UserRequestID(s: String) extends FixField(923, types.FixString(s))

case class UserRequestType(i: Int) extends FixField(924, types.FixInteger(i))
object UserRequestType {
  val LOGONUSER = UserRequestType(1)
  val LOGOFFUSER = UserRequestType(2)
  val CHANGEPASSWORDFORUSER = UserRequestType(3)
  val REQUEST_INDIVIDUAL_USER_STATUS = UserRequestType(4)
}

case class NewPassword(s: String) extends FixField(925, types.FixString(s))

case class UserStatus(i: Int) extends FixField(926, types.FixInteger(i))
object UserStatus {
  val LOGGED_IN = UserStatus(1)
  val NOT_LOGGED_IN = UserStatus(2)
  val USER_NOT_RECOGNISED = UserStatus(3)
  val PASSWORD_INCORRECT = UserStatus(4)
  val PASSWORD_CHANGED = UserStatus(5)
  val OTHER = UserStatus(6)
}

case class UserStatusText(s: String) extends FixField(927, types.FixString(s))

case class StatusValue(i: Int) extends FixField(928, types.FixInteger(i))
object StatusValue {
  val CONNECTED = StatusValue(1)
  val NOT_CONNECTED_DOWN_EXPECTED_UP = StatusValue(2)
  val NOT_CONNECTED_DOWN_EXPECTED_DOWN = StatusValue(3)
  val IN_PROCESS = StatusValue(4)
}

case class StatusText(s: String) extends FixField(929, types.FixString(s))

case class RefCompID(s: String) extends FixField(930, types.FixString(s))

case class RefSubID(s: String) extends FixField(931, types.FixString(s))

case class NetworkResponseID(s: String) extends FixField(932, types.FixString(s))

case class NetworkRequestID(s: String) extends FixField(933, types.FixString(s))

case class LastNetworkResponseID(s: String) extends FixField(934, types.FixString(s))

case class NetworkRequestType(i: Int) extends FixField(935, types.FixInteger(i))
object NetworkRequestType {
  val SNAPSHOT = NetworkRequestType(1)
  val SUBSCRIBE = NetworkRequestType(2)
  val STOP_SUBSCRIBING = NetworkRequestType(4)
  val LEVEL_OF_DETAIL = NetworkRequestType(8)
}

case class NoCompIDs(num: Int) extends FixField(936, types.NumInGroup(num))

case class NetworkStatusResponseType(i: Int) extends FixField(937, types.FixInteger(i))
object NetworkStatusResponseType {
  val FULL = NetworkStatusResponseType(1)
  val INCREMENTAL_UPDATE = NetworkStatusResponseType(2)
}

case class NoCollInquiryQualifier(num: Int) extends FixField(938, types.NumInGroup(num))

case class TrdRptStatus(i: Int) extends FixField(939, types.FixInteger(i))
object TrdRptStatus {
  val ACCEPTED = TrdRptStatus(0)
  val REJECTED = TrdRptStatus(1)
  val ACCEPTED_WITH_ERRORS = TrdRptStatus(3)
}

case class AffirmStatus(i: Int) extends FixField(940, types.FixInteger(i))
object AffirmStatus {
  val RECEIVED = AffirmStatus(1)
  val CONFIRM_REJECTED = AffirmStatus(2)
  val AFFIRMED = AffirmStatus(3)
}

case class UnderlyingStrikeCurrency(code: String) extends FixField(941, types.Currency(code))

case class LegStrikeCurrency(code: String) extends FixField(942, types.Currency(code))

case class TimeBracket(s: String) extends FixField(943, types.FixString(s))

case class CollAction(i: Int) extends FixField(944, types.FixInteger(i))
object CollAction {
  val RETAIN = CollAction(0)
  val ADD = CollAction(1)
  val REMOVE = CollAction(2)
}

case class CollInquiryStatus(i: Int) extends FixField(945, types.FixInteger(i))
object CollInquiryStatus {
  val ACCEPTED = CollInquiryStatus(0)
  val ACCEPTED_WITH_WARNINGS = CollInquiryStatus(1)
  val COMPLETED = CollInquiryStatus(2)
  val COMPLETED_WITH_WARNINGS = CollInquiryStatus(3)
  val REJECTED = CollInquiryStatus(4)
}

case class CollInquiryResult(i: Int) extends FixField(946, types.FixInteger(i))
object CollInquiryResult {
  val SUCCESSFUL = CollInquiryResult(0)
  val INVALID_OR_UNKNOWN_INSTRUMENT = CollInquiryResult(1)
  val INVALID_OR_UNKNOWN_COLLATERAL_TYPE = CollInquiryResult(2)
  val INVALID_PARTIES = CollInquiryResult(3)
  val INVALID_TRANSPORT_TYPE_REQUESTED = CollInquiryResult(4)
  val INVALID_DESTINATION_REQUESTED = CollInquiryResult(5)
  val NO_COLLATERAL_FOUND_FOR_THE_TRADE_SPECIFIED = CollInquiryResult(6)
  val NO_COLLATERAL_FOUND_FOR_THE_ORDER_SPECIFIED = CollInquiryResult(7)
  val COLLATERAL_INQUIRY_TYPE_NOT_SUPPORTED = CollInquiryResult(8)
  val UNAUTHORIZED_FOR_COLLATERAL_INQUIRY = CollInquiryResult(9)
  val OTHER = CollInquiryResult(99)
}

case class StrikeCurrency(code: String) extends FixField(947, types.Currency(code))

case class NoNested3PartyIDs(num: Int) extends FixField(948, types.NumInGroup(num))

case class Nested3PartyID(s: String) extends FixField(949, types.FixString(s))

case class Nested3PartyIDSource(c: Char) extends FixField(950, types.FixChar(c))

case class Nested3PartyRole(i: Int) extends FixField(951, types.FixInteger(i))

case class NoNested3PartySubIDs(num: Int) extends FixField(952, types.NumInGroup(num))

case class Nested3PartySubID(s: String) extends FixField(953, types.FixString(s))

case class Nested3PartySubIDType(i: Int) extends FixField(954, types.FixInteger(i))

case class LegContractSettlMonth(year: Int, month: Int, day: Option[Int], week: Option[Int]) extends FixField(955, types.MonthYear(year, month, day, week))

case class LegInterestAccrualDate(year: Int, month: Int, day: Int) extends FixField(956, types.LocalMktDate(year, month, day))

case class NoStrategyParameters(num: Int) extends FixField(957, types.NumInGroup(num))

case class StrategyParameterName(s: String) extends FixField(958, types.FixString(s))

case class StrategyParameterType(i: Int) extends FixField(959, types.FixInteger(i))
object StrategyParameterType {
  val INT = StrategyParameterType(1)
  val LENGTH = StrategyParameterType(2)
  val NUMINGROUP = StrategyParameterType(3)
  val SEQNUM = StrategyParameterType(4)
  val TAGNUM = StrategyParameterType(5)
  val FLOAT = StrategyParameterType(6)
  val QTY = StrategyParameterType(7)
  val PRICE = StrategyParameterType(8)
  val PRICEOFFSET = StrategyParameterType(9)
  val AMT = StrategyParameterType(10)
  val PERCENTAGE = StrategyParameterType(11)
  val CHAR = StrategyParameterType(12)
  val BOOLEAN = StrategyParameterType(13)
  val STRING = StrategyParameterType(14)
  val MULTIPLECHARVALUE = StrategyParameterType(15)
  val CURRENCY = StrategyParameterType(16)
  val EXCHANGE = StrategyParameterType(17)
  val MONTH_YEAR = StrategyParameterType(18)
  val UTCTIMESTAMP = StrategyParameterType(19)
  val UTCTIMEONLY = StrategyParameterType(20)
  val LOCALMKTTIME = StrategyParameterType(21)
  val UTCDATE = StrategyParameterType(22)
  val DATA = StrategyParameterType(23)
  val MULTIPLESTRINGVALUE = StrategyParameterType(24)
}

case class StrategyParameterValue(s: String) extends FixField(960, types.FixString(s))

case class HostCrossID(s: String) extends FixField(961, types.FixString(s))

case class SideTimeInForce(timestamp: Date) extends FixField(962, types.UTCTimestamp(timestamp))

case class MDReportID(i: Int) extends FixField(963, types.FixInteger(i))

case class SecurityReportID(i: Int) extends FixField(964, types.FixInteger(i))

case class SecurityStatus(s: String) extends FixField(965, types.FixString(s))
object SecurityStatus {
  val ACTIVE = SecurityStatus("1")
  val INACTIVE = SecurityStatus("2")
}

case class SettleOnOpenFlag(s: String) extends FixField(966, types.FixString(s))

case class StrikeMultiplier(f: Decimal) extends FixField(967, types.FixFloat(f))

case class StrikeValue(f: Decimal) extends FixField(968, types.FixFloat(f))

case class MinPriceIncrement(f: Decimal) extends FixField(969, types.FixFloat(f))

case class PositionLimit(i: Int) extends FixField(970, types.FixInteger(i))

case class NTPositionLimit(i: Int) extends FixField(971, types.FixInteger(i))

case class UnderlyingAllocationPercent(percentage: Decimal) extends FixField(972, types.Percentage(percentage))

case class UnderlyingCashAmount(amount: Decimal) extends FixField(973, types.Amt(amount))

case class UnderlyingCashType(s: String) extends FixField(974, types.FixString(s))
object UnderlyingCashType {
  val FIXED = UnderlyingCashType("FIXED")
  val DIFF = UnderlyingCashType("DIFF")
}

case class UnderlyingSettlementType(i: Int) extends FixField(975, types.FixInteger(i))
object UnderlyingSettlementType {
  val Tp1 = UnderlyingSettlementType(2)
  val Tp3 = UnderlyingSettlementType(4)
  val Tp4 = UnderlyingSettlementType(5)
}

case class QuantityDate(year: Int, month: Int, day: Int) extends FixField(976, types.LocalMktDate(year, month, day))

case class ContIntRptID(s: String) extends FixField(977, types.FixString(s))

case class LateIndicator(bool: Boolean) extends FixField(978, types.FixBoolean(bool))

case class InputSource(s: String) extends FixField(979, types.FixString(s))

case class SecurityUpdateAction(c: Char) extends FixField(980, types.FixChar(c))
object SecurityUpdateAction {
  val ADD = SecurityUpdateAction('A')
  val DELETE = SecurityUpdateAction('D')
  val MODIFY = SecurityUpdateAction('M')
}

case class NoExpiration(num: Int) extends FixField(981, types.NumInGroup(num))

case class ExpType(i: Int) extends FixField(982, types.FixInteger(i))
object ExpType {
  val AUTO_EXERCISE = ExpType(1)
  val NON_AUTO_EXERCISE = ExpType(2)
  val FINAL_WILL_BE_EXERCISED = ExpType(3)
  val CONTRARY_INTENTION = ExpType(4)
  val DIFFERENCE = ExpType(5)
}

case class ExpQty(qty: Decimal) extends FixField(983, types.Qty(qty))

case class NoUnderlyingAmounts(num: Int) extends FixField(984, types.NumInGroup(num))

case class UnderlyingPayAmount(amount: Decimal) extends FixField(985, types.Amt(amount))

case class UnderlyingCollectAmount(amount: Decimal) extends FixField(986, types.Amt(amount))

case class UnderlyingSettlementDate(year: Int, month: Int, day: Int) extends FixField(987, types.LocalMktDate(year, month, day))

case class UnderlyingSettlementStatus(s: String) extends FixField(988, types.FixString(s))

case class SecondaryIndividualAllocID(s: String) extends FixField(989, types.FixString(s))

case class LegReportID(s: String) extends FixField(990, types.FixString(s))

case class RndPx(price: Decimal) extends FixField(991, types.Price(price))

case class IndividualAllocType(i: Int) extends FixField(992, types.FixInteger(i))
object IndividualAllocType {
  val SUB_ALLOCATE = IndividualAllocType(1)
  val THIRD_PARTY_ALLOCATION = IndividualAllocType(2)
}

case class AllocCustomerCapacity(s: String) extends FixField(993, types.FixString(s))

case class TierCode(s: String) extends FixField(994, types.FixString(s))

case class UnitofMeasure(s: String) extends FixField(996, types.FixString(s))
object UnitofMeasure {
  val MEGAWATT_HOURS = UnitofMeasure("MWh")
  val ONE_MILLION_BTU = UnitofMeasure("MMBtu")
  val BARRELS = UnitofMeasure("Bbl")
  val GALLONS = UnitofMeasure("Gal")
  val METRIC_TONS = UnitofMeasure("t")
  val TONS = UnitofMeasure("tn")
  val MILLION_BARRELS = UnitofMeasure("MMbbl")
  val POUNDS = UnitofMeasure("lbs")
  val TROY_OUNCES = UnitofMeasure("oz_tr")
  val US_DOLLARS = UnitofMeasure("USD")
  val BILLION_CUBIC_FEET = UnitofMeasure("Bcf")
  val BUSHELS = UnitofMeasure("Bu")
}

case class TimeUnit(s: String) extends FixField(997, types.FixString(s))
object TimeUnit {
  val SECOND = TimeUnit("S")
  val MINUTE = TimeUnit("Min")
  val HOUR = TimeUnit("H")
  val DAY = TimeUnit("D")
  val WEEK = TimeUnit("Wk")
  val MONTH = TimeUnit("Mo")
  val YEAR = TimeUnit("Yr")
}

case class UnderlyingUnitofMeasure(s: String) extends FixField(998, types.FixString(s))

case class LegUnitofMeasure(s: String) extends FixField(999, types.FixString(s))

case class UnderlyingTimeUnit(s: String) extends FixField(1000, types.FixString(s))

case class LegTimeUnit(s: String) extends FixField(1001, types.FixString(s))

case class AllocMethod(i: Int) extends FixField(1002, types.FixInteger(i))
object AllocMethod {
  val AUTOMATIC = AllocMethod(1)
  val GUARANTOR = AllocMethod(2)
  val MANUAL = AllocMethod(3)
}

case class TradeID(s: String) extends FixField(1003, types.FixString(s))

case class SideTradeReportID(s: String) extends FixField(1005, types.FixString(s))

case class SideFillStationCd(s: String) extends FixField(1006, types.FixString(s))

case class SideReasonCd(s: String) extends FixField(1007, types.FixString(s))

case class SideTrdSubTyp(i: Int) extends FixField(1008, types.FixInteger(i))
object SideTrdSubTyp {
  val CMTA = SideTrdSubTyp(0)
  val INTERNAL_TRANSFER = SideTrdSubTyp(1)
  val EXTERNAL_TRANSFER = SideTrdSubTyp(2)
  val REJECT_FOR_SUBMITTING_TRADE = SideTrdSubTyp(3)
  val ADVISORY_FOR_CONTRA_SIDE = SideTrdSubTyp(4)
  val OFFSET_DUE_TO_AN_ALLOCATION = SideTrdSubTyp(5)
  val ONSET_DUE_TO_AN_ALLOCATION = SideTrdSubTyp(6)
  val DIFFERENTIAL_SPREAD = SideTrdSubTyp(7)
  val IMPLIED_SPREAD_LEG_EXECUTED_AGAINST_AN_OUTRIGHT = SideTrdSubTyp(8)
  val TRANSACTION_FROM_EXERCISE = SideTrdSubTyp(9)
  val TRANSACTION_FROM_ASSIGNMENT = SideTrdSubTyp(10)
}

case class SideQty(i: Int) extends FixField(1009, types.FixInteger(i))

case class MessageEventSource(s: String) extends FixField(1011, types.FixString(s))

case class SideTrdRegTimestamp(timestamp: Date) extends FixField(1012, types.UTCTimestamp(timestamp))

case class SideTrdRegTimestampType(i: Int) extends FixField(1013, types.FixInteger(i))

case class SideTrdRegTimestampSrc(s: String) extends FixField(1014, types.FixString(s))

case class AsOfIndicator(c: Char) extends FixField(1015, types.FixChar(c))
object AsOfIndicator {
  val FALSE = AsOfIndicator('0')
  val TRUE = AsOfIndicator('1')
}

case class NoSideTrdRegTS(num: Int) extends FixField(1016, types.NumInGroup(num))

case class LegOptionRatio(f: Decimal) extends FixField(1017, types.FixFloat(f))

case class NoInstrumentParties(num: Int) extends FixField(1018, types.NumInGroup(num))

case class InstrumentPartyID(s: String) extends FixField(1019, types.FixString(s))

case class TradeVolume(qty: Decimal) extends FixField(1020, types.Qty(qty))

case class MDBookType(i: Int) extends FixField(1021, types.FixInteger(i))
object MDBookType {
  val TOP_OF_BOOK = MDBookType(1)
  val PRICE_DEPTH = MDBookType(2)
  val ORDER_DEPTH = MDBookType(3)
}

case class MDFeedType(s: String) extends FixField(1022, types.FixString(s))

case class MDPriceLevel(i: Int) extends FixField(1023, types.FixInteger(i))

case class MDOriginType(i: Int) extends FixField(1024, types.FixInteger(i))
object MDOriginType {
  val BOOK = MDOriginType(0)
  val OFF_BOOK = MDOriginType(1)
  val CROSS = MDOriginType(2)
}

case class FirstPx(price: Decimal) extends FixField(1025, types.Price(price))

case class MDEntrySpotRate(f: Decimal) extends FixField(1026, types.FixFloat(f))

case class MDEntryForwardPoints(offset: Decimal) extends FixField(1027, types.PriceOffset(offset))

case class ManualOrderIndicator(bool: Boolean) extends FixField(1028, types.FixBoolean(bool))

case class CustDirectedOrder(bool: Boolean) extends FixField(1029, types.FixBoolean(bool))

case class ReceivedDeptID(s: String) extends FixField(1030, types.FixString(s))

case class CustOrderHandlingInst(strings: String*) extends FixField(1031, types.MultipleStringValue(strings: _*))
object CustOrderHandlingInst {
  val ADD_ON_ORDER = CustOrderHandlingInst("ADD")
  val ALL_OR_NONE = CustOrderHandlingInst("AON")
  val CASH_NOT_HELD = CustOrderHandlingInst("CNH")
  val DIRECTED_ORDER = CustOrderHandlingInst("DIR")
  val EXCHANGE_FOR_PHYSICAL_TRANSACTION = CustOrderHandlingInst("E.W")
  val FILL_OR_KILL = CustOrderHandlingInst("FOK")
  val IMBALANCE_ONLY = CustOrderHandlingInst("IO")
  val IMMEDIATE_OR_CANCEL = CustOrderHandlingInst("IOC")
  val LIMIT_ON_OPEN = CustOrderHandlingInst("LOO")
  val LIMIT_ON_CLOSE = CustOrderHandlingInst("LOC")
  val MARKET_AT_OPEN = CustOrderHandlingInst("MAO")
  val MARKET_AT_CLOSE = CustOrderHandlingInst("MAC")
  val MARKET_ON_OPEN = CustOrderHandlingInst("MOO")
  val MARKET_ON_CLOSE = CustOrderHandlingInst("MOC")
  val MINIMUM_QUANTITY = CustOrderHandlingInst("MQT")
  val NOT_HELD = CustOrderHandlingInst("NH")
  val OVER_THE_DAY = CustOrderHandlingInst("OVD")
  val PEGGED = CustOrderHandlingInst("PEG")
  val RESERVE_SIZE_ORDER = CustOrderHandlingInst("RSV")
  val STOP_STOCK_TRANSACTION = CustOrderHandlingInst("S.W")
  val SCALE = CustOrderHandlingInst("SCL")
  val TIME_ORDER = CustOrderHandlingInst("TMO")
  val TRAILING_STOP = CustOrderHandlingInst("TS")
  val WORK = CustOrderHandlingInst("WRK")
}

case class OrderHandlingInstSource(i: Int) extends FixField(1032, types.FixInteger(i))
object OrderHandlingInstSource {
  val NASD_OATS = OrderHandlingInstSource(1)
}

case class DeskType(s: String) extends FixField(1033, types.FixString(s))
object DeskType {
  val AGENCY = DeskType("A")
  val ARBITRAGE = DeskType("AR")
  val DERIVATIVES = DeskType("D")
  val INTERNATIONAL = DeskType("IN")
  val INSTITUTIONAL = DeskType("IS")
  val OTHER = DeskType("O")
  val PREFERRED_TRADING = DeskType("PF")
  val PROPRIETARY = DeskType("PR")
  val PROGRAM_TRADING = DeskType("PT")
  val SALES = DeskType("S")
  val TRADING = DeskType("T")
}

case class DeskTypeSource(i: Int) extends FixField(1034, types.FixInteger(i))
object DeskTypeSource {
  val NASD_OATS = DeskTypeSource(1)
}

case class DeskOrderHandlingInst(strings: String*) extends FixField(1035, types.MultipleStringValue(strings: _*))
object DeskOrderHandlingInst {
  val ADD_ON_ORDER = DeskOrderHandlingInst("ADD")
  val ALL_OR_NONE = DeskOrderHandlingInst("AON")
  val CASH_NOT_HELD = DeskOrderHandlingInst("CNH")
  val DIRECTED_ORDER = DeskOrderHandlingInst("DIR")
  val EXCHANGE_FOR_PHYSICAL_TRANSACTION = DeskOrderHandlingInst("E.W")
  val FILL_OR_KILL = DeskOrderHandlingInst("FOK")
  val IMBALANCE_ONLY = DeskOrderHandlingInst("IO")
  val IMMEDIATE_OR_CANCEL = DeskOrderHandlingInst("IOC")
  val LIMIT_ON_OPEN = DeskOrderHandlingInst("LOO")
  val LIMIT_ON_CLOSE = DeskOrderHandlingInst("LOC")
  val MARKET_AT_OPEN = DeskOrderHandlingInst("MAO")
  val MARKET_AT_CLOSE = DeskOrderHandlingInst("MAC")
  val MARKET_ON_OPEN = DeskOrderHandlingInst("MOO")
  val MARKET_ON_CLOSE = DeskOrderHandlingInst("MOC")
  val MINIMUM_QUANTITY = DeskOrderHandlingInst("MQT")
  val NOT_HELD = DeskOrderHandlingInst("NH")
  val OVER_THE_DAY = DeskOrderHandlingInst("OVD")
  val PEGGED = DeskOrderHandlingInst("PEG")
  val RESERVE_SIZE_ORDER = DeskOrderHandlingInst("RSV")
  val STOP_STOCK_TRANSACTION = DeskOrderHandlingInst("S.W")
  val SCALE = DeskOrderHandlingInst("SCL")
  val TIME_ORDER = DeskOrderHandlingInst("TMO")
  val TRAILING_STOP = DeskOrderHandlingInst("TS")
  val WORK = DeskOrderHandlingInst("WRK")
}

case class ExecAckStatus(c: Char) extends FixField(1036, types.FixChar(c))
object ExecAckStatus {
  val RECEIVED_NOT_YET_PROCESSED = ExecAckStatus('0')
  val ACCEPTED = ExecAckStatus('1')
  val DONT_KNOW = ExecAckStatus('2')
}

case class UnderlyingDeliveryAmount(amount: Decimal) extends FixField(1037, types.Amt(amount))

case class UnderlyingCapValue(amount: Decimal) extends FixField(1038, types.Amt(amount))

case class UnderlyingSettlMethod(s: String) extends FixField(1039, types.FixString(s))

case class SecondaryTradeID(s: String) extends FixField(1040, types.FixString(s))

case class FirmTradeID(s: String) extends FixField(1041, types.FixString(s))

case class SecondaryFirmTradeID(s: String) extends FixField(1042, types.FixString(s))

case class CollApplType(i: Int) extends FixField(1043, types.FixInteger(i))
object CollApplType {
  val SPECIFIC_DEPOSIT = CollApplType(0)
  val GENERAL = CollApplType(1)
}

case class UnderlyingAdjustedQuantity(qty: Decimal) extends FixField(1044, types.Qty(qty))

case class UnderlyingFXRate(f: Decimal) extends FixField(1045, types.FixFloat(f))

case class UnderlyingFXRateCalc(c: Char) extends FixField(1046, types.FixChar(c))
object UnderlyingFXRateCalc {
  val MULTIPLY = UnderlyingFXRateCalc('M')
  val DIVIDE = UnderlyingFXRateCalc('D')
}

case class AllocPositionEffect(c: Char) extends FixField(1047, types.FixChar(c))
object AllocPositionEffect {
  val OPEN = AllocPositionEffect('O')
  val CLOSE = AllocPositionEffect('C')
  val ROLLED = AllocPositionEffect('R')
  val FIFO = AllocPositionEffect('F')
}

case class DealingCapacity(offset: Decimal) extends FixField(1048, types.PriceOffset(offset))

case class InstrmtAssignmentMethod(c: Char) extends FixField(1049, types.FixChar(c))

case class InstrumentPartyIDSource(c: Char) extends FixField(1050, types.FixChar(c))

case class InstrumentPartyRole(i: Int) extends FixField(1051, types.FixInteger(i))

case class NoInstrumentPartySubIDs(num: Int) extends FixField(1052, types.NumInGroup(num))

case class InstrumentPartySubID(s: String) extends FixField(1053, types.FixString(s))

case class InstrumentPartySubIDType(i: Int) extends FixField(1054, types.FixInteger(i))

case class PositionCurrency(s: String) extends FixField(1055, types.FixString(s))

case class CalculatedCcyLastQty(qty: Decimal) extends FixField(1056, types.Qty(qty))

case class AggressorIndicator(bool: Boolean) extends FixField(1057, types.FixBoolean(bool))

case class NoUndlyInstrumentParties(num: Int) extends FixField(1058, types.NumInGroup(num))

case class UndlyInstrumentPartyID(s: String) extends FixField(1059, types.FixString(s))

case class UndlyInstrumentPartyIDSource(c: Char) extends FixField(1060, types.FixChar(c))

case class UndlyInstrumentPartyRole(i: Int) extends FixField(1061, types.FixInteger(i))

case class NoUndlyInstrumentPartySubIDs(num: Int) extends FixField(1062, types.NumInGroup(num))

case class UndlyInstrumentPartySubID(s: String) extends FixField(1063, types.FixString(s))

case class UndlyInstrumentPartySubIDType(i: Int) extends FixField(1064, types.FixInteger(i))

case class BidSwapPoints(offset: Decimal) extends FixField(1065, types.PriceOffset(offset))

case class OfferSwapPoints(offset: Decimal) extends FixField(1066, types.PriceOffset(offset))

case class LegBidForwardPoints(offset: Decimal) extends FixField(1067, types.PriceOffset(offset))

case class LegOfferForwardPoints(offset: Decimal) extends FixField(1068, types.PriceOffset(offset))

case class SwapPoints(offset: Decimal) extends FixField(1069, types.PriceOffset(offset))

case class MDQuoteType(i: Int) extends FixField(1070, types.FixInteger(i))
object MDQuoteType {
  val INDICATIVE = MDQuoteType(0)
  val TRADEABLE = MDQuoteType(1)
  val RESTRICTED_TRADEABLE = MDQuoteType(2)
  val COUNTER = MDQuoteType(3)
  val INDICATIVE_AND_TRADEABLE = MDQuoteType(4)
}

case class LastSwapPoints(offset: Decimal) extends FixField(1071, types.PriceOffset(offset))

case class SideGrossTradeAmt(amount: Decimal) extends FixField(1072, types.Amt(amount))

case class LegLastForwardPoints(offset: Decimal) extends FixField(1073, types.PriceOffset(offset))

case class LegCalculatedCcyLastQty(qty: Decimal) extends FixField(1074, types.Qty(qty))

case class LegGrossTradeAmt(amount: Decimal) extends FixField(1075, types.Amt(amount))

case class MaturityTime(hour: Int, minute: Int, second: Int, tz: TimeZone) extends FixField(1079, types.TZTimeOnly(hour, minute, second, tz))

case class RefOrderID(s: String) extends FixField(1080, types.FixString(s))

case class RefOrderIDSource(c: Char) extends FixField(1081, types.FixChar(c))
object RefOrderIDSource {
  val SECONDARYORDEID = RefOrderIDSource('0')
  val ORDEID = RefOrderIDSource('1')
  val MENTRYID = RefOrderIDSource('2')
  val QUOTENTRYID = RefOrderIDSource('3')
}

case class SecondaryDisplayQty(qty: Decimal) extends FixField(1082, types.Qty(qty))

case class DisplayWhen(c: Char) extends FixField(1083, types.FixChar(c))
object DisplayWhen {
  val IMMEDIATE = DisplayWhen('1')
  val EXHAUST = DisplayWhen('2')
}

case class DisplayMethod(c: Char) extends FixField(1084, types.FixChar(c))
object DisplayMethod {
  val INITIAL = DisplayMethod('1')
  val NEW = DisplayMethod('2')
  val RANDOM = DisplayMethod('3')
}

case class DisplayLowQty(qty: Decimal) extends FixField(1085, types.Qty(qty))

case class DisplayHighQty(qty: Decimal) extends FixField(1086, types.Qty(qty))

case class DisplayMinIncr(qty: Decimal) extends FixField(1087, types.Qty(qty))

case class RefreshQty(qty: Decimal) extends FixField(1088, types.Qty(qty))

case class MatchIncrement(qty: Decimal) extends FixField(1089, types.Qty(qty))

case class MaxPriceLevels(i: Int) extends FixField(1090, types.FixInteger(i))

case class PreTradeAnonymity(bool: Boolean) extends FixField(1091, types.FixBoolean(bool))

case class PriceProtectionScope(c: Char) extends FixField(1092, types.FixChar(c))
object PriceProtectionScope {
  val NONE = PriceProtectionScope('0')
  val LOCAL = PriceProtectionScope('1')
  val NATIONAL = PriceProtectionScope('2')
  val GLOBAL = PriceProtectionScope('3')
}

case class LotType(c: Char) extends FixField(1093, types.FixChar(c))
object LotType {
  val ODD_LOT = LotType('1')
  val ROUND_LOT = LotType('2')
  val BLOCK_LOT = LotType('3')
}

case class PegPriceType(i: Int) extends FixField(1094, types.FixInteger(i))
object PegPriceType {
  val LAST_PEG = PegPriceType(1)
  val MID_PRICE_PEG = PegPriceType(2)
  val OPENING_PEG = PegPriceType(3)
  val MARKET_PEG = PegPriceType(4)
  val PRIMARY_PEG = PegPriceType(5)
  val FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER = PegPriceType(6)
  val PEG_TO_VWAP = PegPriceType(7)
  val TRAILING_STOP_PEG = PegPriceType(8)
  val PEG_TO_LIMIT_PRICE = PegPriceType(9)
}

case class PeggedRefPrice(price: Decimal) extends FixField(1095, types.Price(price))

case class PegSecurityIDSource(s: String) extends FixField(1096, types.FixString(s))

case class PegSecurityID(s: String) extends FixField(1097, types.FixString(s))

case class PegSymbol(s: String) extends FixField(1098, types.FixString(s))

case class PegSecurityDesc(s: String) extends FixField(1099, types.FixString(s))

case class TriggerType(c: Char) extends FixField(1100, types.FixChar(c))
object TriggerType {
  val PARTIAL_EXECUTION = TriggerType('1')
  val SPECIFIED_TRADING_SESSION = TriggerType('2')
  val NEXT_AUCTION = TriggerType('3')
  val PRICE_MOVEMENT = TriggerType('4')
}

case class TriggerAction(c: Char) extends FixField(1101, types.FixChar(c))
object TriggerAction {
  val ACTIVATE = TriggerAction('1')
  val MODIFY = TriggerAction('2')
  val CANCEL = TriggerAction('3')
}

case class TriggerPrice(price: Decimal) extends FixField(1102, types.Price(price))

case class TriggerSymbol(s: String) extends FixField(1103, types.FixString(s))

case class TriggerSecurityID(s: String) extends FixField(1104, types.FixString(s))

case class TriggerSecurityIDSource(s: String) extends FixField(1105, types.FixString(s))

case class TriggerSecurityDesc(s: String) extends FixField(1106, types.FixString(s))

case class TriggerPriceType(c: Char) extends FixField(1107, types.FixChar(c))
object TriggerPriceType {
  val BEST_OFFER = TriggerPriceType('1')
  val LAST_TRADE = TriggerPriceType('2')
  val BEST_BID = TriggerPriceType('3')
  val BEST_BID_OR_LAST_TRADE = TriggerPriceType('4')
  val BEST_OFFER_OR_LAST_TRADE = TriggerPriceType('5')
  val BEST_MID = TriggerPriceType('6')
}

case class TriggerPriceTypeScope(c: Char) extends FixField(1108, types.FixChar(c))
object TriggerPriceTypeScope {
  val NONE = TriggerPriceTypeScope('0')
  val LOCAL = TriggerPriceTypeScope('1')
  val NATIONAL = TriggerPriceTypeScope('2')
  val GLOBAL = TriggerPriceTypeScope('3')
}

case class TriggerPriceDirection(c: Char) extends FixField(1109, types.FixChar(c))
object TriggerPriceDirection {
  val TRIGGER_IF_THE_PRICE_OF_THE_SPECIFIED_TYPE_GOES_UP_TO_OR_THROUGH_THE_SPECIFIED_TRIGGER_PRICE = TriggerPriceDirection('U')
  val TRIGGER_IF_THE_PRICE_OF_THE_SPECIFIED_TYPE_GOES_DOWN_TO_OR_THROUGH_THE_SPECIFIED_TRIGGER_PRICE = TriggerPriceDirection('D')
}

case class TriggerNewPrice(price: Decimal) extends FixField(1110, types.Price(price))

case class TriggerOrderType(c: Char) extends FixField(1111, types.FixChar(c))
object TriggerOrderType {
  val MARKET = TriggerOrderType('1')
  val LIMIT = TriggerOrderType('2')
}

case class TriggerNewQty(qty: Decimal) extends FixField(1112, types.Qty(qty))

case class TriggerTradingSessionID(s: String) extends FixField(1113, types.FixString(s))

case class TriggerTradingSessionSubID(s: String) extends FixField(1114, types.FixString(s))

case class OrderCategory(c: Char) extends FixField(1115, types.FixChar(c))
object OrderCategory {
  val ORDER = OrderCategory('1')
  val QUOTE = OrderCategory('2')
  val PRIVATELY_NEGOTIATED_TRADE = OrderCategory('3')
  val MULTILEG_ORDER = OrderCategory('4')
  val LINKED_ORDER = OrderCategory('5')
  val QUOTE_REQUEST = OrderCategory('6')
  val IMPLIED_ORDER = OrderCategory('7')
  val CROSS_ORDER = OrderCategory('8')
}

case class NoRootPartyIDs(num: Int) extends FixField(1116, types.NumInGroup(num))

case class RootPartyID(s: String) extends FixField(1117, types.FixString(s))

case class RootPartyIDSource(c: Char) extends FixField(1118, types.FixChar(c))

case class RootPartyRole(i: Int) extends FixField(1119, types.FixInteger(i))

case class NoRootPartySubIDs(num: Int) extends FixField(1120, types.NumInGroup(num))

case class RootPartySubID(s: String) extends FixField(1121, types.FixString(s))

case class RootPartySubIDType(i: Int) extends FixField(1122, types.FixInteger(i))

case class TradeHandlingInstr(c: Char) extends FixField(1123, types.FixChar(c))
object TradeHandlingInstr {
  val TRADE_CONFIRMATION = TradeHandlingInstr('0')
  val TWO_PARTY_REPORT = TradeHandlingInstr('1')
  val ONE_PARTY_REPORT_FOR_MATCHING = TradeHandlingInstr('2')
  val ONE_PARTY_REPORT_FOR_PASS_THROUGH = TradeHandlingInstr('3')
  val AUTOMATED_FLOOR_ORDER_ROUTING = TradeHandlingInstr('4')
}

case class OrigTradeHandlingInstr(c: Char) extends FixField(1124, types.FixChar(c))

case class OrigTradeDate(year: Int, month: Int, day: Int) extends FixField(1125, types.LocalMktDate(year, month, day))

case class OrigTradeID(s: String) extends FixField(1126, types.FixString(s))

case class OrigSecondaryTradeID(s: String) extends FixField(1127, types.FixString(s))

case class ApplVerID(s: String) extends FixField(1128, types.FixString(s))
object ApplVerID {
  val FIX27 = ApplVerID("0")
  val FIX30 = ApplVerID("1")
  val FIX40 = ApplVerID("2")
  val FIX41 = ApplVerID("3")
  val FIX42 = ApplVerID("4")
  val FIX43 = ApplVerID("5")
  val FIX44 = ApplVerID("6")
  val FIX50 = ApplVerID("7")
}

case class CstmApplVerID(s: String) extends FixField(1129, types.FixString(s))

case class RefApplVerID(s: String) extends FixField(1130, types.FixString(s))

case class RefCstmApplVerID(s: String) extends FixField(1131, types.FixString(s))

case class TZTransactTime(timestamp: Date, tz: TimeZone) extends FixField(1132, types.TZTimestamp(timestamp, tz))

case class ExDestinationIDSource(c: Char) extends FixField(1133, types.FixChar(c))
object ExDestinationIDSource {
  val BIC = ExDestinationIDSource('B')
  val GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER = ExDestinationIDSource('C')
  val PROPRIETARY = ExDestinationIDSource('D')
  val ISO_COUNTRY_CODE = ExDestinationIDSource('E')
  val MIC = ExDestinationIDSource('G')
}

case class ReportedPxDiff(bool: Boolean) extends FixField(1134, types.FixBoolean(bool))

case class RptSys(s: String) extends FixField(1135, types.FixString(s))

case class AllocClearingFeeIndicator(s: String) extends FixField(1136, types.FixString(s))

case class DefaultApplVerID(s: String) extends FixField(1137, types.FixString(s))

case class DisplayQty(qty: Decimal) extends FixField(1138, types.Qty(qty))

case class ExchangeSpecialInstructions(s: String) extends FixField(1139, types.FixString(s))

case class MDElementName(i: Int) extends FixField(5450, types.FixInteger(i))
object MDElementName {
  val BEST_BID = MDElementName(1)
  val BEST_OFFER = MDElementName(2)
  val PAID = MDElementName(11)
  val GIVEN = MDElementName(12)
  val DEALABLE_BID = MDElementName(45)
  val DEALABLE_OFFER = MDElementName(46)
  val LOCAL_BID = MDElementName(47)
  val LOCAL_OFFER = MDElementName(48)
  val DEALABLE_REGULAR_BID = MDElementName(49)
  val DEALABLE_REGULAR_OFFER = MDElementName(50)
  val DEALABLE_OUTSIDE_BID = MDElementName(51)
  val DEALABLE_OUTSIDE_OFFER = MDElementName(52)
  val DEALABLE_PLUS_BID = MDElementName(53)
  val DEALABLE_PLUS_OFFER = MDElementName(54)
}

case class SimulatedTime(timestamp: Date) extends FixField(8000, types.UTCTimestamp(timestamp))

case class NoNestedUserData(i: Int) extends FixField(9000, types.FixInteger(i))

case class NestedUserDataName(s: String) extends FixField(9001, types.FixString(s))

case class NestedUserDataValue(s: String) extends FixField(9002, types.FixString(s))

case class SpotValueDateForNDF(year: Int, month: Int, day: Int) extends FixField(9995, types.LocalMktDate(year, month, day))
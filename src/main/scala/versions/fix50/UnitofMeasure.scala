package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

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
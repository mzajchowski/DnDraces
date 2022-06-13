package com.main
import com.main.*
import scala.io.StdIn.readLine

enum Race(raceName: RaceName,shortDescription: ShortDescription,longerDescription: LongerDescription,racialTraits:RacialTraits) {
  case dragonborn extends Race(RaceName.Dragonborn, ShortDescription.Dragonborn, LongerDescription.Dragonborn, RacialTraits.Dragonborn)
  case dwarf extends Race(RaceName.Dwarf, ShortDescription.Dwarf, LongerDescription.Dwarf, RacialTraits.Dwarf)
  case elf extends Race(RaceName.Elf, ShortDescription.Elf, LongerDescription.Elf, RacialTraits.Elf)
  case gnome extends Race(RaceName.Gnome, ShortDescription.Gnome, LongerDescription.Gnome, RacialTraits.Gnome)
  case halfelf extends Race(RaceName.Halfelf, ShortDescription.Halfelf, LongerDescription.Halfelf, RacialTraits.Halfelf)
  case halfling extends Race(RaceName.Halfling, ShortDescription.Halfling, LongerDescription.Halfling, RacialTraits.Halfling)
  case halforc extends Race(RaceName.Halforc, ShortDescription.Halforc, LongerDescription.Halforc, RacialTraits.Halforc)
  case human extends Race(RaceName.Human, ShortDescription.Human, LongerDescription.Human, RacialTraits.Human)
  case tiefling extends Race(RaceName.Tiefling, ShortDescription.Tiefling, LongerDescription.Tiefling, RacialTraits.Tiefling)

}
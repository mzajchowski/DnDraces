package com.main

enum RacialTraits(racialTraits: String) {
  case Dragonborn extends RacialTraits("+2 Strength, +1 Charisma, Draconic Ancestry, Breath Weapon, Damage Resistance")
  case Dwarf extends RacialTraits("+2 Constitution, Darkvision, Dwarven Resilience, Dwarven Combat Training, Stonecunning")
  case Elf extends RacialTraits("+2 Dexterity, Darkvision, Keen Senses, Fey Ancestry, Trance")
  case Gnome extends RacialTraits("+2 Intelligence, Darkvision, Gnome Cunning")
  case Halfelf extends RacialTraits("+2 Charisma, +1 to Two Other Ability Scores, Darkvision, Fey Ancestry, Skill Versatility")
  case Halfling extends RacialTraits("+2 Dexterity, Lucky, Brave, Halfling Nimbleness")
  case Halforc extends RacialTraits("+2 Strength, +1 Constitution, Darkvision, Menacing, Relentless Endurance, Savage Attacks")
  case Human extends RacialTraits("+1 to All Ability Scores, Extra Language")
  case Tiefling extends RacialTraits("+2 Charisma, +1 Intelligence, Darkvision, Hellish Resistance, Infernal Legacy")
}

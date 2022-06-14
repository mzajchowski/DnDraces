package com.main

import scala.io.StdIn.readLine
import com.main.Race
import com.main.RaceName
enum ConsoleCommand(val consoleCommand: String) {
  case short extends ConsoleCommand("short")
  case longer extends ConsoleCommand("longer")
  case menu extends ConsoleCommand("menu")
}

class ConsoleRaceService {
  final def run(): Unit = {
    println(
      "______                                                          _  ______                                 \n|  _  \\                                                        | | |  _  \\                                \n| | | |_   _ _ __   __ _  ___  ___  _ __  ___    __ _ _ __   __| | | | | |_ __ __ _  __ _  ___  _ __  ___ \n| | | | | | | '_ \\ / _` |/ _ \\/ _ \\| '_ \\/ __|  / _` | '_ \\ / _` | | | | | '__/ _` |/ _` |/ _ \\| '_ \\/ __|\n| |/ /| |_| | | | | (_| |  __/ (_) | | | \\__ \\ | (_| | | | | (_| | | |/ /| | | (_| | (_| | (_) | | | \\__ \\\n|___/  \\__,_|_| |_|\\__, |\\___|\\___/|_| |_|___/  \\__,_|_| |_|\\__,_| |___/ |_|  \\__,_|\\__, |\\___/|_| |_|___/\n                    __/ |                                                            __/ |                \n                   |___/                                                            |___/                 "
    )
    println(
      "                                          _ _                          __                           \n                                         | (_)                        / _|                          \n  ___ ___  _ __ ___  _ __   ___ _ __   __| |_ _   _ _ __ ___     ___ | |_   _ __ __ _  ___ ___  ___ \n / __/ _ \\| '_ ` _ \\| '_ \\ / _ \\ '_ \\ / _` | | | | | '_ ` _ \\   / _ \\|  _| | '__/ _` |/ __/ _ \\/ __|\n| (_| (_) | | | | | | |_) |  __/ | | | (_| | | |_| | | | | | | | (_) | |   | | | (_| | (_|  __/\\__ \\\n \\___\\___/|_| |_| |_| .__/ \\___|_| |_|\\__,_|_|\\__,_|_| |_| |_|  \\___/|_|   |_|  \\__,_|\\___\\___||___/\n                    | |                                                                             \n                    |_|                                                                             "
    )
    println("Do you want to learn something about all races or you prefer a more detailed description of a specific race?")
    println("Enter short, longer or menu to go back: ")
    val raceAnsw = readLine().toLowerCase()
    ConsoleCommand.valueOf(raceAnsw) match
      case ConsoleCommand.short =>
        for (i <- Race.values) {
          println(i.raceName.raceName + (": "))
          println(i.shortDescription.shortDescription)
        }
      case ConsoleCommand.longer => println("Which race do you want to learn about?")
        println("Choose from: Dragonborn, Dwarf, Elf, Gnome, Half-Elf, Halfling, Half-Orc, Human or Tiefling")
        val choosenRace = readLine().toLowerCase().replaceAll("-", "")
        val result: Option[Race] = Race.values.find(race => race.raceName.raceName.toLowerCase() == choosenRace)
        result match {
          case Some(race) =>
            println(race.raceName.raceName)
            println("Longer Description: ")
            println(race.longerDescription.longerDescription)
            println("Racial Traits: ")
            println(race.racialTrait)
          case None => println(s"There is no such race ${choosenRace}")
        }
      case ConsoleCommand.menu => run()
  }
}

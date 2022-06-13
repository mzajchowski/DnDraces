package com.main
import scala.io.StdIn.readLine

enum ConsoleCommand( val consoleCommand: String){
  case Short extends ConsoleCommand("short")
  case Longer extends ConsoleCommand("longer")
  case Menu extends ConsoleCommand("menu")
}
final def ConsoleRaceService()={
  println("Do you want to learn something about all races or you prefer a more detailed description of a specific race?")
  println("Enter short, longer or menu to go back: ")
  var raceAnsw = readLine()
  raceAnsw.toLowerCase() match
    case ConsoleCommand.Short.consoleCommand => {
      for(i <- listOfRaces) {
        println(i.raceName.toString+ (": "))
        println(i.shortDescription)
      }
    }
    case ConsoleCommand.Longer.consoleCommand =>{
      println("Which race do you want to learn about?")
      println("Choose from: Dragonborn, Dwarf, Elf, Gnome, Half-Elf, Halfling, Half-Orc, Human or Tiefling")
      var choosenRace = readLine().toLowerCase.replaceAll("-","")
      val result: Option[Race] = List(listOfRaces).find(race => race.raceName.toString.toLowerCase() == choosenRace)
      result match {
        case Some(race) => {
          println(race.raceName)
          println("Longer Description: ")
          println(race.longerDescription)
          println("Racial Traits: ")
          race.racialTraits
        }
        case None => println(s"There is no such race ${choosenRace}")
        }
    }
    case ConsoleCommand.Menu.consoleCommand => println("I'm going back to the menu")
    case raceAnsw => println("You gave the wrong command, try again: ")
}

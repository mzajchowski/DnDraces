package com.main
import com.main.DiceRoller
import com.main.Race
import scala.io.StdIn.{readLine,readInt}


object Main extends App {
  println("______                                                          _  ______                                 \n|  _  \\                                                        | | |  _  \\                                \n| | | |_   _ _ __   __ _  ___  ___  _ __  ___    __ _ _ __   __| | | | | |_ __ __ _  __ _  ___  _ __  ___ \n| | | | | | | '_ \\ / _` |/ _ \\/ _ \\| '_ \\/ __|  / _` | '_ \\ / _` | | | | | '__/ _` |/ _` |/ _ \\| '_ \\/ __|\n| |/ /| |_| | | | | (_| |  __/ (_) | | | \\__ \\ | (_| | | | | (_| | | |/ /| | | (_| | (_| | (_) | | | \\__ \\\n|___/  \\__,_|_| |_|\\__, |\\___|\\___/|_| |_|___/  \\__,_|_| |_|\\__,_| |___/ |_|  \\__,_|\\__, |\\___/|_| |_|___/\n                    __/ |                                                            __/ |                \n                   |___/                                                            |___/                 ")
  println("                                          _ _                          __                           \n                                         | (_)                        / _|                          \n  ___ ___  _ __ ___  _ __   ___ _ __   __| |_ _   _ _ __ ___     ___ | |_   _ __ __ _  ___ ___  ___ \n / __/ _ \\| '_ ` _ \\| '_ \\ / _ \\ '_ \\ / _` | | | | | '_ ` _ \\   / _ \\|  _| | '__/ _` |/ __/ _ \\/ __|\n| (_| (_) | | | | | | |_) |  __/ | | | (_| | | |_| | | | | | | | (_) | |   | | | (_| | (_|  __/\\__ \\\n \\___\\___/|_| |_| |_| .__/ \\___|_| |_|\\__,_|_|\\__,_|_| |_| |_|  \\___/|_|   |_|  \\__,_|\\___\\___||___/\n                    | |                                                                             \n                    |_|                                                                             ")
  println("Do you want to learn something about races or you want to use dice roller?")
  println("Write 'Races' to see list of races, 'Dice Roller' to roll some dices or 'Exit' to end: ")
  Iterator.continually(io.StdIn.readLine.toLowerCase())
  .takeWhile(_ != "exit")
  .foreach{
    case "races" => {
      ConsoleRaceService()
      println("Write 'Races' to see list of races, 'Dice Roller' to roll some dices or 'Exit' to end: ")
    }
    case "dice roller"=>{
      DiceRoller()
      println("Write 'Races' to see list of races, 'Dice Roller' to roll some dices or 'Exit' to end: ")
  }
    case _ => println("Write 'Races' to see list of races, 'Dice Roller' to roll some dices or 'Exit' to end: ")
  }
}
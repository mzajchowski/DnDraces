package com.main
import scala.io.StdIn.{readInt, readLine}

case class Dice(sides: Int) {
  def roll(): Int =
    scala.util.Random.nextInt(sides) + 1
}

class DiceRoller(){
  println("Choose dice you wanna roll:")
  println("For Example: d4, d6, d8, d10, d12, d20, d100")
  var chosenDice = readLine().replaceAll("([a-z])", "").toInt
  println("How many dices you wanna roll: ")
  var amountOfRolls: Int = readInt()
  println("You rolled:")
  var summedDices = 0
  for (amountOfRolls <- 0 until(amountOfRolls)){
    var rolledDice = Dice(chosenDice).roll()
    println(rolledDice)
    summedDices += rolledDice
  }
  println("The sum of your rolls: "+ summedDices)
}
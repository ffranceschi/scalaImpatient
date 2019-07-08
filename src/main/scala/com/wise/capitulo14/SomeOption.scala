package com.wise.capitulo14

object SomeOption extends App {

  val scores = Map("Alice" -> 1, "Jon" -> 2, "Doe" -> 3)

  val alicesScore = scores.get("Alice")

  alicesScore match {

    case Some(score) => println(score)

    case None => println("No score")

  }


  if (alicesScore.isEmpty) println("No score")

  else println(alicesScore.get)

  println(alicesScore.getOrElse("No score"))

  for (score <- alicesScore) println(score)

}

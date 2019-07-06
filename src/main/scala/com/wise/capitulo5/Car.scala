package com.wise.capitulo5

case class Car(val model : String = "", val  year : Int = 0)

object Car extends App {
  val car = new Car("fusca", 1966)
  println(car.year)
}


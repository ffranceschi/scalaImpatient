package com.wise.capitulo6

class Car(val model : String = "", val  year : Int = 0) {

  private var ano = year

}

object Car extends App {
  def apply(model1: String = "", year: Int = 0): Car = new Car(model1, year)
  val car = Car("fusca", 1966)
  println(car.ano)
}
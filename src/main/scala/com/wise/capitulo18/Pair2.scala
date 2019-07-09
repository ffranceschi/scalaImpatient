package com.wise.capitulo18

class Pair2[T <: Comparable[T]](val first: T, val second: T) {

  def smaller = if (first.compareTo(second) < 0) first else second

}

object Pair2 extends App {
  val p = new Pair2("Fred", "Brooks")

  println(p.smaller) // Prints Brooks
}
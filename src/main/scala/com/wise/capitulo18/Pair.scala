package com.wise.capitulo18


class Pair[T, S](val first: T, val second: S) {
  def getMiddle[T](a: Seq[T]) = a(a.length / 2)
}

object Pair extends App {
  val p = new Pair(42, "String") // It's a Pair[Int, String]
  println(s"${p.first} -> ${p.second} ${p.getMiddle(Seq(1,2,3,14,5,6,7))}")

  val p2 = new Pair[Any, Any](42, "String")
  println(s"${p2.first} -> ${p2.second}")
}

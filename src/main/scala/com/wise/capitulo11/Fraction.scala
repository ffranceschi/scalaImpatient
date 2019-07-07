package com.wise.capitulo11

// (n1 / d1) × (n2 / d2) = (n1n2 / d1d2)
// Sem o val no contrutor da classe, nao acessa campo
class Fraction(val n: Int, val d:Int) {

  def *(other: Fraction): Fraction = new Fraction(n * other.n, d * other.d)

  override def toString(): String = {
    s"valor de N -> ${this.n} e valor de D -> ${this.d}"
  }

}

object Fraction extends App {

  def apply(n: Int, d: Int) = new Fraction(n, d)

  def unapply(input: Fraction) = {
    if (input.d == 0) None else Some((input.n, input.d))
  }

  val f1 = new Fraction(2,3)
  println(f1.n)
  val f2 = Fraction(2,2)
  val f3 = f1*f2
  println(f3)


  val tupleOption = Fraction.unapply(f3)

  if (tupleOption == None) throw new MatchError

  // tupleOption is Some((t1, t2))

  println(tupleOption)

}
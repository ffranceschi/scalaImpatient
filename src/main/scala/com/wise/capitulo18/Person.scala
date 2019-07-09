package com.wise.capitulo18

trait Friend[-T] {

  def befriend(someone: T)

}

class Person extends Friend[Person] {
  override def befriend(someone: Person): Unit = ???
}

//class Student extends Person{}

//val susan = new Student

//val fred = new Person
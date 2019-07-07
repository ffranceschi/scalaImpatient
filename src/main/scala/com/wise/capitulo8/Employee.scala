package com.wise.capitulo8

class Employee(name: String, age: Int, val salary: Double) extends Person(name, age) {

}


object Employee extends App {
  def apply(name: String, age: Int, salary: Double): Employee = new Employee(name, age, salary)

  val employee = Employee("Fernando Franceschi", 39, 1000.98)

  println(s"${employee.name} com idade ${employee.age}, recebe ${employee.salary}")
}
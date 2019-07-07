package com.wise.capitulo10


trait ConsoleLogger2 {

  def log(msg: String) { println(msg) }

}
class Account2(var balance: Double) {

}


class SavingsAccount extends Account2(100) with ConsoleLogger2 {

  override def log(msg: String): Unit = super.log("sobrescrita do metodo e msg -> " + msg)

  def withdraw(amount: Double) {
    if (amount >  balance) log("Insufficient funds")
    else balance -= amount
  }

}

object SavingsAccount extends App  {
  val savingsAccount = new SavingsAccount()
  savingsAccount.withdraw(30)
  println(savingsAccount.balance)
  savingsAccount.withdraw(80)
  println(savingsAccount.balance)
}
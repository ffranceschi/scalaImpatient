package com.wise.capitulo10

trait Logger {

  def log(msg: String) // An abstract method

}

class ConsoleLogger extends Logger { // Use extends, not implements

  def log(msg: String) { println(msg) } // No override needed

}
////////

package com.wise.capitulo6

object Accounts {

  private var lastNumber = 0

  def newUniqueNumber() = { lastNumber += 1; lastNumber }

}
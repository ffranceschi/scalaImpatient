package com.wise.capitulo19

trait SelfType {

  def log(msg: String)

}


trait Log extends SelfType {

  this: Exception =>
    def log() { log(getMessage()) }

}
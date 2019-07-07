package com.wise.capitulo9

object ExpressaoRegular extends App {

  val numPattern = "[0-9]+".r
  val matches = numPattern.findAllIn("99 bottles, 98 bottles").toArray
  println(matches.foreach(println(_)))
}

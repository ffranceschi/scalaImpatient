package com.wise.capitulo19

import scala.collection.mutable

class Book(val title: String) {

  type ChapterName = String
  type Index = mutable.HashMap[String, (Int, Int)]

  def getTitle(): this.type = {
   this
  }

  def getChapterName(index: Index): ChapterName = {
    val tuple = index.getOrElse("a", (0,0))
    println(tuple.toString)
    tuple.toString

  }

}

object Book extends App {

  var idx : mutable.HashMap[String, (Int, Int)] =  new mutable.HashMap[String, (Int, Int)]()
  idx.put("a", (1,2))

  val book = new Book("scala impatient")
  println(book.title)

  book.getChapterName(idx)

}

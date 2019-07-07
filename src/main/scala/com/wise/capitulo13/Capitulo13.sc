import scala.collection.mutable.ArrayBuffer

val coll = Seq(1, 1, 2, 3, 5, 8, 13)

val set = coll.toSet

val buffer = coll.to[ArrayBuffer]

////////

var numbers = Set(1, 2, 3)

numbers += 5 // Sets numbers to the immutable set numbers + 5

var numberVector = Vector(1, 2, 3)

numberVector :+= 5 // += does not work since vectors don't have a + operator

/////////

val names = List("Peter", "Paul", "Mary")
for (n <- names) yield n.toUpperCase
names.par.size // parallel

////////

val props: scala.collection.mutable.Map[String, String] = scala.collection.mutable.Map("a"->"1", "b"->"2")
props("com.horstmann.scala") = "impatient"
props.foreach(println(_))
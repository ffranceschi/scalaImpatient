import scala.collection.mutable

val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

///////
val scores2: Map[String, Int] = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

/////////

val bobsScore0 = scores("Bob")
val bobsScore = scores.get("Bob")

//////

val bobsScore2 = if (scores.contains("Bob")) scores("Bob") else 0
val bobsScore3 = scores.getOrElse("Bob", 0)
val bobsScore4 = scores.getOrElse("Bob1", 0)

////////////

var scores5: scala.collection.mutable.Map[String, Int] = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

scores5 += ("Fred" -> 7)
scores5 = scores5 + ("Bob" -> 10, "Fred" -> 7)
scores5 = scores5 - "Alice"
//scores5("Bob") = 10


///////////

val tuple = (1, 1.3, "Fernando")
println(tuple._2)
val (first, second, third) = tuple
println(first)

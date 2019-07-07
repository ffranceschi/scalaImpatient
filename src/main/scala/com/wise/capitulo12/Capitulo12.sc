(x: Double) => 3 * x // funcao anonima

val triple = (x: Double) => 3 * x

def triple(x: Double) = 3 * x

Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x)

//////////

def mulBy(factor : Double) = (x : Double) => factor * x
val quintuple = mulBy(5)
quintuple(20)

/////////


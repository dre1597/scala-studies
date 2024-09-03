package forLoops

def forLoop(): Unit = {
  val ints = List(1, 2, 3, 4, 5)

  for i <- ints do println(i)
}

def forLoopWithGuard(): Unit = {
  val ints = List(1, 2, 3, 4, 5)

  for
    i <- ints
    if i % 2 == 0
  do println(i)
}

def nestedFor(): Unit = {
  for
    i <- 1 to 3
    j <- 'a' to 'c'
    if i == 2
    if j == 'b'
  do println(s"i = $i, j = $j")
}

def forExpressions(): Unit = {
  val ints = List(1, 2, 3, 4, 5)

  val doubles = for i <- ints yield i * 2
  val doubles2: List[Int] = List(2, 4, 6, 8, 10)
  val doubles3 = for i <- ints yield i * 2
  val doubles4 = for (i <- ints) yield i * 2
  val doubles5 = for (i <- ints) yield (i * 2)
  val doubles6 = for {i <- ints} yield (i * 2)

  println(doubles)
  println(doubles2)
  println(doubles3)
  println(doubles4)
  println(doubles5)
  println(doubles6)
}

def capitalize(): Unit = {
  val names = List("chris", "ed", "maurice")
  val capNames = for name <- names yield name.capitalize
}

def forMultipleLines(): Unit = {
  val fruits = List("apple", "banana", "lime", "orange")

  val fruitLengths = for
    f <- fruits
    if f.length > 4
  yield
    f.length

  println(fruitLengths)
}

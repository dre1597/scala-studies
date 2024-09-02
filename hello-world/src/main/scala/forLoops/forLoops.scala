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


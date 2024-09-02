package controlStrutures

def negativePositive(x: Int): Int = {
  if x < 0 then
    println(s"$x is negative")
  else if x == 0 then
    println(s"$x is zero")
  else
    println(s"$x is positive")
  x
}

def comparableTernary(a: Int, b: Int): Int = {
  if a > b then a else b
}

@main def controlStructures(): Unit = {
  negativePositive(0)
  negativePositive(1)
  negativePositive(-1)
  comparableTernary(1, 2)
  comparableTernary(2, 1)
}

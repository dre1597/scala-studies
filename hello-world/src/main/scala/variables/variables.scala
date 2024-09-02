package variables

def variables(): Unit = {
  val a = 0
  val b = 1
  val msg = "Hello, World!"
  //msg = "Hello, World 2!" // error: reassignment to val
  val x1: Int = 1
  var msg2 = "Hello, World!"
  msg2 = "Hello, World 2!" // OK
  val s: String = "a string"
  val nums: List[Int] = List(1, 2, 3)
  val p = new Person("John")
  val vb: Byte = 1
  val vi: Int = 1
  val vl: Long = 1
  val vs: Short = 1
  val vd: Double = 2.0
  val vf: Float = 3.0
  val i = 123 // defaults to Int
  val j = 1.0 // defaults to Double
  val x = 1_000L // val x: Long = 1000
  val y = 2.2D // val y: Double = 2.2
  val z = 3.3F // val z: Float = 3.3
  var va = BigInt(1_234_567_890_987_654_321L)
  var bb = BigDecimal(123_456.789)
  val firstName = "John"
  val mi = 'C'
  val lastName = "Doe"
  println(s"Name: $firstName $mi $lastName") // "Name: John C Doe"
  println(s"2 + 2 = ${2 + 2}") // prints "2 + 2 = 4"
  println(s"x.abs = ${x.abs}") // prints "x.abs = 1"

  val quote =
    """The essence of Scala:
       Fusion of functional and object-oriented
       programming in a typed setting."""
}

class Person(val name: String) {
  def greet(): Unit = println(s"Hello, $name")
}

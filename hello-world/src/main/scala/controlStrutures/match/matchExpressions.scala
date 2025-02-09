package `match`

def matchWithoutReturn(i: Int): Unit = {
  i match
    case 1 => println("one")
    case 2 => println("two")
    case _ => println("other")
}

def matchWithReturn(i: Int): String = {
  i match
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
}

def matchWithClasses(): Unit = {
  val p = Person("Fred")

  val name = "Fred"

  p match
    case Person(name) if name == "Fred" =>
      println(s"$name says, Yubba dubba doo")

    case Person(name) if name == "Bam Bam" =>
      println(s"$name says, Bam bam!")

    case _ => println("Watch the Flintstones!")
}

def getClassAsString(x: Matchable): String = x match
  case s: String => s"'$s' is a String"
  case i: Int => "Int"
  case d: Double => "Double"
  case l: List[?] => "List"
  case _ => "Unknown"


class Person(val name: String)

object Person {
  def apply(name: String): Person = new Person(name)

  def unapply(person: Person): Option[String] = {
    Some(person.name)
  }
}

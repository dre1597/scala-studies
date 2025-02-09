val person = Person("John", "Doe")
println(person.firstName)
person.lastName = "Smith"
person.printFullName()

class Person(var firstName: String, var lastName: String):
  def printFullName(): Unit = println(s"$firstName $lastName")

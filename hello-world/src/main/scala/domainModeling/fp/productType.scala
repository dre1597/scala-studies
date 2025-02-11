val person = Person("John", "Engineer")
val person2 = person.copy(name = "Emily")

// define a case class
case class Person(
  name: String,
  vocation: String
)

println(person)
println(person.name)
person.name = "John Doe"
printLn(person.name)

println(person2)


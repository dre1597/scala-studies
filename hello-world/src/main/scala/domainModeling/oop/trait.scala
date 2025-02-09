val dog = Dog("Fido")
val cat = Cat("Garfield")

trait Speaker:
  def speak(): String // abstract

trait TailWagger:
  def startTail(): Unit = println("Tail wagging...")
  def stopTail(): Unit = print("Tail stopped...")

trait Runner:
  def startRunning(): Unit = println("Running...")
  def stopRunning(): Unit = println("Stopped running...")

class Dog(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = "Woof!"
println(dog.speak())

class Cat(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = "Meow!"
  override def startRunning(): Unit = println("I dont want to run")
  override def stopRunning(): Unit = println("No need to stop")

println(cat.speak())
cat.startRunning()
cat.stopRunning()

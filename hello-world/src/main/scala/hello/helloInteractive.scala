package hello

import scala.io.StdIn.readLine

def helloInteractive(): Unit = {
  println("What is your name?")
  val name = readLine()

  println(s"Hello $name")
}

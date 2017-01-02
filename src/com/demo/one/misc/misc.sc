package com.demo.one.misc

object misc {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  case class User(name: String)
  object test {
    def printMessageForUser(message: String)(implicit user: User): Unit = {
      println("Hello")
      println(message + user.name)
    }
  }

  implicit val user = User("Admin")               //> user  : com.demo.one.misc.misc.User = User(Admin)
  test.printMessageForUser("Welcome ")            //> Hello
                                                  //| Welcome Admin

  object x {

    implicit def changeIt(x: String): Array[Char] = x.toCharArray

    def printString(c: Array[Char]): String = c.map(_ + 1 toChar).mkString

    def doPrint(x: String) = {
      println(printString(x))
    }

  }

  x.doPrint("Hello")                              //> Ifmmp

  implicit class RichStrings(x: String) {
    def incrementBy1 = x map (_ + 1 toChar)
  }

  println("Hello".incrementBy1)                   //> Ifmmp
  

}
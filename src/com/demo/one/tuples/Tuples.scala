package com.demo.one.tuples

//combination of 2 or more different data types is called tuples
//Scala supports 22 different data types in 1 object
object Tuples {

  def main(args: Array[String]): Unit = {
    val a = ("Hello", 5)
    println(a._1 + " " + a._2)
  }

}

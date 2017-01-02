package com.demo.one.typeInfer

import scala.annotation.tailrec

object typeInference {

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var a = "Hello"                                 //> a  : String = Hello
  a += " world"
  println(a)                                      //> Hello world
  //a = 5 // doesn't compile, because previously it was inferred of type String

  //recursion
  def fact1(n: Int) = {
    def loop(n: Int): Int = {
      if (n <= 1) 1
      else n * loop(n - 1) // doesn't compile until type is given
    }
    loop(n)
  }                                               //> fact1: (n: Int)Int

  println(fact1(5))                               //> 120

  //tail recursion
  def fact2(n: Int): Int = {
    @tailrec
    def loop(n: Int, acc: Int): Int = {
      if (n <= 1) acc
      else loop(n - 1, n * acc)
    }
    loop(n, 1)
  }                                               //> fact2: (n: Int)Int

  println(fact2(5))                               //> 120

}
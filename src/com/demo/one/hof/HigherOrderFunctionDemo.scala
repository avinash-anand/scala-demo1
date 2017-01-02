package com.demo.one.hof

// we want to add numbers between a range after applying a function to each number in range

object HigherOrderFunctionDemo {

  def main(args: Array[String]): Unit = {
    println(sumInts(1, 5))
    println(sumSquares(1, 5))
    println(sumFact(1, 5))
    println(sumHOF(identity, 1, 5))
    println(sumHOF(square, 1, 5))
    println(sumHOF(fact, 1, 5))
  }

  // This function adds integers from a to b
  def identity(a: Int): Int = a
  def sumInts(a: Int, b: Int): Int = {
    if (a > b) 0
    else a + sumInts(a + 1, b)
  }

  def square(a: Int): Int = a * a
  def sumSquares(a: Int, b: Int): Int = {
    if (a > b) 0
    else square(a) + sumSquares(a + 1, b)
  }

  def fact(a: Int): Int = {
    if (a <= 1) 1
    else a * fact(a - 1)
  }
  def sumFact(a: Int, b: Int): Int = {
    if (a > b) 0
    else fact(a) + sumFact(a + 1, b)
  }

  //Higher order function
  def sumHOF(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sumHOF(f, a + 1, b)
  }

}

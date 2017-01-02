package com.demo.one.currying

object CurryingDemo {

  def identity(x: Int): Int = x
  def square(a: Int): Int = a * a
  def fact(a: Int): Int = {
    if (a <= 1) 1
    else a * fact(a - 1)
  }

  //let's write the sum function we wrote earlier in a different manner
  // Reason - because we are passing a & b as arguments, but its not used directly in this function; its just passed on.
  // Basically its not participating into interesting combinations, the sumHOF is doing

  def sumCurried1(f: Int => Int): (Int, Int) => Int = {
    def sumAfterApplyingPassedFunction(a: Int, b: Int): Int = {
      if (a > b) 0 else f(a) + sumAfterApplyingPassedFunction(a + 1, b)
    }
    sumAfterApplyingPassedFunction
  }

  def sumInts1 = sumCurried1(identity)
  def sumSqrs1 = sumCurried1(square)
  def sumFacts1 = sumCurried1(fact)

  // Now there is a syntactic sugar for the above function as well
  def sumCurried(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sumCurried(f)(a + 1, b)
  }

  // Below is an example of partially applied function
  def sumInts = sumCurried(identity)_
  def sumSqrs = sumCurried(square)_
  def sumFacts = sumCurried(fact)_

  def main(args: Array[String]): Unit = {
    println(sumInts1(1, 5))
    println(sumSqrs1(1, 5))
    println(sumFacts1(1, 5))
    println(sumInts(1, 5))
    println(sumSqrs(1, 5))
    println(sumFacts(1, 5))
  }

}

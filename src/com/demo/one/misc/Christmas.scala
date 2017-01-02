package com.demo.one.misc

object Christmas {
  def main(args: Array[String]): Unit = {
    println()
    printChristmasTree
  }

  def printChristmasTree: Unit = {
    val n = 12
    val tree = (0 to n)
      .map(x => n - x -> (1 + x * 2))
      .map { case (x, y) => " " * x + "*" * y }
      .mkString("\n")

    val trunk = List.fill(n / 3)(" " * (n - 1) + "###")
      .mkString("\n")

    println(tree)
    println(trunk)
  }

}

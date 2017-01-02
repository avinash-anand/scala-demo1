package com.demo.one.colections

object DemoCollections {

  def main(args: Array[String]): Unit = {
    val seqOfNmbers = Seq(1, 2, 3, 4, 5)
    val rangeOfNumbers = 1 to 5
    val pairOfAboveTwo = seqOfNmbers.zip(rangeOfNumbers)
    println(seqOfNmbers == rangeOfNumbers)
    println(pairOfAboveTwo)
    //    val multipliedByTwo = seqOfNmbers.map(a => a * 2)
    val multipliedByTwo = seqOfNmbers map (_ * 2) // syntactic sugar
    println(multipliedByTwo)
    val oneTo10 = 1 to 10
    val (odd, even) = oneTo10.partition(_ % 2 != 0)
    println(odd)
    println(even)
    val a = Seq(10, 5, 8, 17, 6, 4)
    println(s"max is = ${a.max} And min is = ${a.min}")
    // Let's say i wan't to find maximum out of few sequences of data
    val subject1 = Seq(67, 87, 77, 76, 89)
    val subject2 = Seq(66, 86, 76, 75, 78)
    val subject3 = Seq(56, 58, 57, 65, 68)
    val allSubjectMarks = Seq(subject1, subject2, subject3)
    // i want to get maximum marks from each standard
    val maxFromEach = allSubjectMarks.map(_.max)
    println(maxFromEach)
    val allInOne = allSubjectMarks.flatten
    println(allInOne)
    // Now i want to sum it all
    var total = 0
    for (i <- allInOne) total += i
    println(total)
    val sumOfAll = allInOne.foldLeft(0)(_ + _)
    println(sumOfAll)
    val sumOfAll2 = allInOne.reduceLeft(_ + _)
    println(sumOfAll2)
    val sumOfAll3 = allInOne.sum
    println(sumOfAll3)

    // there is something called Option
    val opt1: Option[String] = Some("exists")
    val opt2: Option[String] = None
    println(opt1.isDefined)
    println(opt2.isDefined) // No NullPointer :)

  }

}

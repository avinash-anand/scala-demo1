// traits are like interfaces but can have concrete implementations as well, 
// which can be overridden in extending objects/classes

package com.demo.one.traits

trait TraitDemo {

  def printHello = {
    println("Hello")
  }

  def implementThis: Unit

}

trait MyTrait1 extends TraitDemo {

  def implementThis = {
    println("MyTrait1 implements it")
  }

}

trait MyTrait2 extends TraitDemo {

  override def printHello = {
    println("Hello from MyTrait2")
  }

  def implementThis = {
    println("MyTrait2 implements it")
  }

}

object Demo extends TraitDemo with MyTrait1 with MyTrait2 {

  override def implementThis = {
    println("Demo implements it")
  }

  def main(args: Array[String]): Unit = {
    Demo.printHello
  }

}

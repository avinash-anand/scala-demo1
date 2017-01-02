package com.demo.one.basics

object basics {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //how to define a variable - var & val
  var a = "a"                                     //> a  : String = a
  a = "b"
  val b = "b"                                     //> b  : String = b
  //b = "c" //doesn't compile
  // define class
  class A(a: Int, b: Int) {
    override def toString = s"a = $a, b = $b"
  }
  
  val z = new A(1,2)                              //> z  : com.demo.one.basics.basics.A = a = 1, b = 2
  
  // if you want to access a & b outside class
  class A1(val a: Int, val b: Int) {
    override def toString = s"a = $a, b = $b"
  }
  
  val z1 = new A1(1,2)                            //> z1  : com.demo.one.basics.basics.A1 = a = 1, b = 2
  z1.a                                            //> res0: Int = 1
  z1.b                                            //> res1: Int = 2
  
  
  
  
}
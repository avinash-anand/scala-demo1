package com.demo.one.interop

class Student(val name: String, val enrolmentNo: Int) extends Comparable[Student] {

  override def compareTo(that: Student) = {
    enrolmentNo.compareTo(that.enrolmentNo)
  }

  override def toString() = {
    "Enrolment No: " + enrolmentNo + ", Name: " + name
  }

}

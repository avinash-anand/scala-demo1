package com.demo.one.pattern

object MyMain {

  def main(args: Array[String]): Unit = {
    DbUpdateService.updateToDb(Data("some data")) match {
      case success: DbUpdateSuccess => println(s"success - data = ${success.data}")
      case failure: DbUpdateError   => println(s"failure - ${failure.msg}")
    }

  }

}

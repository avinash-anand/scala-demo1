package com.demo.one.pattern

import scala.util.Random

case class Data(data: String)

trait DbUpdate
case class DbUpdateSuccess(data: Data) extends DbUpdate
case class DbUpdateError(msg: String) extends DbUpdate

object DbUpdateService {

  def updateToDb(data: Data): DbUpdate = {
    println("started updating into DB...")
    // now you get result, whether it was successful or failure
    if (new Random().nextInt() % 2 == 0) DbUpdateSuccess(data)
    else DbUpdateError("Database error occurred")
  }

}

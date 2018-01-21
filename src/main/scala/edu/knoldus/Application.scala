package edu.knoldus

import java.io.{File, PrintWriter}

import org.apache.log4j.Logger
import org.json4s._
import org.json4s.jackson.Serialization.write

import scala.io.Source


object Application {

  def main(args: Array[String]): Unit = {
    val logger = Logger.getLogger(this.getClass)
    val name: String = "Ayush Singhal"
    val age: Int = 22
    val day: String = "Sunday"
    val society: String = "Amarpaali"
    val houseNo: String = "L701"
    val salary: Int = 25000
    val luckyNo: Int = 7
    val address = new AddressInformation(society, houseNo)
    val personDetails = new PersonDetails(name, age, day, address, salary, luckyNo)
    implicit val formats = DefaultFormats
    val personDetailsWriteJson = write(personDetails)
    val file = new File("personDetails.txt")
    val printWriter = new PrintWriter(file)
    printWriter.write(personDetailsWriteJson)
    printWriter.close()
    val fileContents = Source.fromFile("personDetails.txt").getLines.mkString
    logger.info(fileContents)
  }

}

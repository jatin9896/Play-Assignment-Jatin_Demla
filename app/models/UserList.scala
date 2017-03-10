package models

import com.google.common.collect.ImmutableList

import scala.collection.mutable.ListBuffer
import scala.collection.{mutable, immutable}

object UserList {

  val list:mutable.ListBuffer[String]=ListBuffer()
  def addData(data:String): String ={

    list+=data
    "data added"
  }

}

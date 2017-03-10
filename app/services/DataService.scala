package services

import models.Login
import models.User

/**
  * Created by knoldus on 8/3/17.
  */
trait DataService {
  def read(key:String):User
  def write(user:User):String
  def readAll():List[User]
  def remove(key:String):String
  def update(user:User):String

}

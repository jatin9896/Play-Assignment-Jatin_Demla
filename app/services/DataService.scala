package services

import models.Login
import models.User

/**
  * Created by knoldus on 8/3/17.
  */
trait DataService {
  def read(credential:Login):User
  def write(user:User):String

}

package services

import javax.inject.Inject

import models.{User, Login}
import play.api.cache
import play.api.cache.CacheApi

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class CacheService @Inject()(cache: CacheApi) extends DataService {
  val list:mutable.ListBuffer[String]=ListBuffer()
  override def read(credential: Login): User = {
    val output: Option[User] = cache.get[User](credential.id);
    output match {
      case None => throw new Exception("no User")
      case _ =>
        output.get
    }
  }

  override def write(user: User): String = {
    cache.set(user.id, user)
    list+=(user.id)
    Console.println("User created "+list);
    user.id
  }
}

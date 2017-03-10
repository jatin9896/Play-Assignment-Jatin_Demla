package services

import javax.inject.Inject


import models.{Login, User}
import play.api.cache.CacheApi

class CacheService @Inject()(cache: CacheApi) extends DataService {



  override def write(user: User): String = {
    cache.set(user.id, user)
    cache.get[List[String]]("userList").fold{
      cache.set("userList",List(user.id))
      user.id
    }{ list =>

      val output: List[String] = readAll().map(x=>x.id)
      val updatedList =  user.id :: output
      cache.remove("userList")
      cache.set("userList", updatedList)
      Console.println("Write cache User created " + updatedList);
      user.id
    }
  }


  override def readAll(): List[User] = {
    val output: Option[List[String]] = cache.get[List[String]]("userList")
    Console.println("List Data : "+output)
    output match {
      case None => throw new Exception("No user")
      case Some(userData) => userData.distinct.map(x => read(x))
    }
  }

  override def read(key: String): User = {
    val output: Option[User] = cache.get[User](key)
    output match {
      case None => throw new Exception("no User")
      case Some(user) => user
    }
  }
  override def remove(key:String):String={
    cache.remove(key)
    key+"removed"
  }

  override def update(updatedUser:User):String={
    val user:User=read(updatedUser.id)
    remove(user.id)
    write(updatedUser)
    updatedUser.id
  }
}

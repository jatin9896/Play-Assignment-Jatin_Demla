package controllers

import com.google.inject.Inject
import models.{Login, User}
import play.api.mvc.{Controller, Action}
import services.CacheService

import scala.collection.mutable.ListBuffer

/**
  * Created by knoldus on 8/3/17.
  */
class AuthenticateController @Inject()(cacheService: CacheService) extends Controller{
  def index = Action {
    val output:ListBuffer[String] = cacheService.list;
    Console.println("Cache List : "+output);
    val userlist=for(user<-output) yield (cacheService.read(Login(user,"")))
    Console.println(userlist)
   // val userlist=output.map(user=> cacheService.read(Login(user,""))

    Ok(views.html.users())
  }
}

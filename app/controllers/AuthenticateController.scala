package controllers

import com.google.inject.Inject
import models.{Login, User}
import play.api.mvc.{Controller, Action}
import services.{DataService, CacheService}

class AuthenticateController @Inject()(cacheService: DataService) extends Controller {
  def index = Action { implicit request =>
    val output = cacheService.readAll()
    Console.println("Cache List : " + output)

    Ok(views.html.users(output)).flashing("" -> "")
  }

  def suspend(id: String) = Action { implicit request =>
    if (id != "userlist") {
      val user = cacheService.read(id)
      println("User suspended before: " + user);
      val updatedUser = User(user.id, user.password, user.fname, user.mname, user.lname, user.mobile, user.isAdmin, true)
      Console.println("Suspended" + id)
      Console.println("Update user" + updatedUser)
      cacheService.update(updatedUser)
      Redirect(routes.AuthenticateController.index()).flashing("suspend" -> "suspend")
    }
    else
      Redirect(routes.AuthenticateController.index())

  }

  def resume(id: String) = Action { implicit request =>
    if (id != "userlist") {
      val user = cacheService.read(id)
      println("User suspended before: " + user);
      val updatedUser = User(user.id, user.password, user.fname, user.mname, user.lname, user.mobile, user.isAdmin, false)
      Console.println("Resumed" + id)
      Console.println("Update user" + updatedUser)
      cacheService.update(updatedUser)
      Redirect(routes.AuthenticateController.index()).flashing("resume" -> "resume")
    }
    else
      Redirect(routes.AuthenticateController.index())
  }
}

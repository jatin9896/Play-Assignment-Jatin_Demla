package controllers

import com.google.inject.Inject
import play.api.data.Form
import play.api.mvc.{Action, Controller}
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.data.Forms._
import play.api.cache._

import play.api.Play.current
import play.api.i18n.Messages.Implicits._
import services.CacheService
import sun.security.util.Password
import models.{Login, User}

class ProfileController @Inject()(cacheService: CacheService) extends Controller {

  def index = Action { implicit request=>
    request.session.get("mySession").map { user =>
      val output: User = cacheService.read(Login(user,""));
      Console.println(output);
      Ok(views.html.profile(output))
    }.getOrElse {
      Unauthorized("Oops, you are not connected")
    }

   // Ok("Login sucess")
  }
}

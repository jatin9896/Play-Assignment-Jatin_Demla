package controllers

import javax.inject.Inject

import play.api.data.Form
import play.api.mvc.{Action, Controller}
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.data.Forms._
import play.api.cache._
import javax.inject.Inject
import play.api.Play.current
import play.api.i18n.Messages.Implicits._
import sun.security.util.Password
import models.User

class ProfileController @Inject()(cache: CacheApi) extends Controller {

  def index = Action { implicit request=>
    val name = request.session.get("mySession").fold("unknown")(identity)
  val user = cache.get[User](name)

    user match {
      case Some(User(id,password)) =>  Ok(views.html.profile(id,""))
      case None =>  Redirect(routes.LoginController.login()).flashing("success" -> "Unauthorized")
    }
  }
}

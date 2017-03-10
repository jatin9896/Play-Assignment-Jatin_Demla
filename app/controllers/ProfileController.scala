package controllers

import com.google.inject.Inject
import models.User
import play.api.mvc.{Action, Controller}
import services.DataService
import play.api.Play.current
import play.api.i18n.Messages.Implicits._


class ProfileController @Inject()(cacheService: DataService) extends Controller {

  def index = Action { implicit request =>
    request.session.get("mySession").map { user =>
      val output: User = cacheService.read(user);
      Console.println(output);
      Ok(views.html.profile(output))
    }.getOrElse {
      Unauthorized("Oops, you are not connected")
    }

    // Ok("Login sucess")
  }
}

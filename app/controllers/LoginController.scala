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


class LoginController @Inject()(cache: CacheApi)(implicit val messagesApi: MessagesApi) extends Controller {

  def validate(id: String, password: String):Option[User] = {
    if(password.length > 3)
     Some(User(id,password))
    else
     // Console.println("Password should be of atleast 3 characters")
     None
  }
  val userForm = Form(mapping("id" -> nonEmptyText, "password" -> nonEmptyText)(User.apply)(User.unapply)
    verifying("Failed form constraints!", fields => fields match {
    case userData => validate(userData.id, userData.password).isDefined
  }))
  def login = Action {
    Ok(views.html.login(userForm,""))
  }
  def submit=Action{ implicit  request =>
    Console.println("Submit call");
    Console.println("cache data "+cache.toString());
    userForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.signup(formWithErrors,"Error Form"))
      },
      userData => {
        val newUser = User(userData.id, userData.password)
        Console.println("user in login "+newUser)
        val output: Option[User] =cache.get[User](userData.id);
        Console.println(cache.toString());
        Console.println("output :"+output.get);
        output match{
          case Some(User(id,password))=>Redirect(routes.ProfileController.index())withSession (request.session + ("mySession" -> s"${output}"))
          case _=> Redirect(routes.LoginController.login()).flashing("failure" -> "you are not valid user")
        }

      })


  }
}

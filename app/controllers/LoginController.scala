package controllers


import com.google.inject.Inject
import play.api.data.Form
import play.api.mvc.{Action, Controller}
import play.api.i18n.{MessagesApi}
import play.api.data.Forms._
import play.api.Play.current
import play.api.i18n.Messages.Implicits._
import services.{DataService}
import models.User
import models.Login


class LoginController @Inject()(cacheService:DataService)(implicit val messagesApi: MessagesApi) extends Controller {

  val loginForm = Form(mapping("id" -> nonEmptyText, "password" -> nonEmptyText)(Login.apply)(Login.unapply)
    verifying("Failed form constraints!", fields => fields match {
    case userData => validate(userData.id, userData.password).isDefined
  }))

  def validate(id: String, password: String): Option[Login] = {
    if (password.length > 3)
      Some(Login(id, password))
    else
       None
  }

  def login = Action {
    Ok(views.html.login(loginForm, ""))
  }

  def submit = Action { implicit request =>
    Console.println("Submit call");
    loginForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.login(formWithErrors, "Error Form"))
      },
      userData => {
        val output: User = cacheService.read(userData.id);
        Console.println("output :" + output);
        output match {
          case x:User =>
//            Console.println("Password need " + output.password);
//            Console.println("Password get  " + userData.password);
           if (userData.password == output.password) {
              val user=cacheService.read(userData.id)
             if(!user.isSuspended){
               Redirect(routes.ProfileController.index()).withSession("mySession" -> s"${output.id}")
             }
              else
               Redirect(routes.LoginController.login()).flashing("failure" -> "Admin Blocked your Account")
            }
            else {
              Redirect(routes.LoginController.login()).flashing("failure" -> "Password Incorrect")
            }
          case _ => Redirect(routes.LoginController.login()).flashing("failure" -> "you are not valid user")
        }
      })
  }
}

package controllers

import com.google.inject.Inject
import models.User
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.MessagesApi
import play.api.mvc.{Action, Controller}
import services.DataService
import play.api.Play.current
import play.api.i18n.Messages.Implicits._


class SignUpController @Inject()(cacheService: DataService)(implicit val messagesApi: MessagesApi) extends Controller {
  val userForm = Form(mapping("id" -> nonEmptyText, "password" -> nonEmptyText, "First_Name" -> nonEmptyText, "Middle_Name" -> text, "Last_Name" -> nonEmptyText, "mobile" -> nonEmptyText, "isAdmin" -> boolean, "isSuspended" -> boolean)(User.apply)(User.unapply)
    verifying("Failed form constraints!", fields => fields match {
    case userData => validate(userData.id, userData.password, userData.fname, userData.mname, userData.lname, userData.mobile, userData.isAdmin, userData.isSuspended).isDefined
  }))

  def validate(id: String, password: String, fname: String, mname: String, lname: String, mobile: String, admin: Boolean, suspend: Boolean): Option[User] = {
    if (password.length > 3)
      Some(User(id, password, fname, mname, lname, mobile, admin, suspend))
    else
      None
  }

  def signup = Action {
    implicit request =>
      //      val output=cacheService.write(User("Admin","Admin","hello","hello","hello","9540347119",true,false))
      //      Console.println("admin static : "+output)
      Ok(views.html.signup(userForm, ""))

  }

  def submit = Action { implicit request =>
    userForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.signup(formWithErrors, "Error Form"))
      },
      userData => {
        val newUser = User(userData.id, userData.password, userData.fname, userData.mname, userData.lname, userData.mobile, isAdmin(), false)
        cacheService.write(newUser)
        Console.println(newUser)
        //  Ok("Get data "+newUser.id+""+newUser.password)
        Redirect(routes.HomeController.index()).flashing("success" -> "Registration complete")
      })

  }

  private def isAdmin() = {
    if (play.Play.application().configuration().getString("Type") == "Admin") {
      Console.println("Admin")
      true
    }
    else {
      Console.println("Normal")
      false
    }
  }

}
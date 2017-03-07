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


/**
  * Created by knoldus on 6/3/17.
  */

//case class UserData(name: String,middlename: String,lastname: String, age: Int, pass:String,mobile:String,gender:String)

class SignUpController @Inject()(cache: CacheApi)(implicit val messagesApi: MessagesApi) extends Controller {
  def validate(id: String, password: String):Option[User] = {
   if(password.length > 3)
     return Some(User(id,password))
    else
     Console.println("Password should be of atleast 8 characters")
     return None
  }

  val userForm = Form(mapping("id" -> nonEmptyText, "password" -> nonEmptyText)(User.apply)(User.unapply)
    verifying("Failed form constraints!", fields => fields match {
    case userData => validate(userData.id, userData.password).isDefined
  }))
//  val anyData = Map("name" -> "bob", "age" -> "21")
//  val userData = userForm.bind(anyData).get
  def signup = Action {  implicit request =>
    Ok(views.html.signup(userForm,""))
  }
  def submit=Action{ implicit  request =>
    userForm.bindFromRequest.fold(
      formWithErrors => {
        BadRequest(views.html.signup(formWithErrors,"Error Form"))
      },
      userData => {
          val newUser = User(userData.id, userData.password)
          cache.set(newUser.id,newUser)
          Console.println(newUser)

          Ok("Get data "+newUser.id+""+newUser.password)
          Redirect(routes.HomeController.index()).flashing("sucess"->"Registration complete")
      })

  }

}
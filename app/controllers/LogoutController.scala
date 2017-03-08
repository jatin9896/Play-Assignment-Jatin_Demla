package controllers

import javax.inject.Inject

import play.api.mvc.{Action, Controller}


/**
  * Created by knoldus on 7/3/17.
  */
class LogoutController extends Controller {



  def logout = Action { implicit request=>

   /*Ok(views.html.logout("Bye")).withNewSession*/
    Redirect(routes.LoginController.login()).withNewSession
    }

}

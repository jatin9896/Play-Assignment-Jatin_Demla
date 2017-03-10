package controllers

import play.api.mvc.{Action, Controller}

class LogoutController extends Controller {


  def logout = Action { implicit request =>

    /*Ok(views.html.logout("Bye")).withNewSession*/
    Redirect(routes.LoginController.login()).withNewSession
  }

}

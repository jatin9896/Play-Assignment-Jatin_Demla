
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Documents/study-play/LoginProject/conf/routes
// @DATE:Wed Mar 08 10:02:45 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:8
  CountController_1: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:13
  Assets_7: controllers.Assets,
  // @LINE:16
  SignUpController_0: controllers.SignUpController,
  // @LINE:17
  LoginController_8: controllers.LoginController,
  // @LINE:19
  ProfileController_6: controllers.ProfileController,
  // @LINE:21
  LogoutController_5: controllers.LogoutController,
  // @LINE:22
  AuthenticateController_4: controllers.AuthenticateController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:13
    Assets_7: controllers.Assets,
    // @LINE:16
    SignUpController_0: controllers.SignUpController,
    // @LINE:17
    LoginController_8: controllers.LoginController,
    // @LINE:19
    ProfileController_6: controllers.ProfileController,
    // @LINE:21
    LogoutController_5: controllers.LogoutController,
    // @LINE:22
    AuthenticateController_4: controllers.AuthenticateController
  ) = this(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_7, SignUpController_0, LoginController_8, ProfileController_6, LogoutController_5, AuthenticateController_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_7, SignUpController_0, LoginController_8, ProfileController_6, LogoutController_5, AuthenticateController_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.SignUpController.signup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submit""", """controllers.SignUpController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.ProfileController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submitdetail""", """controllers.LoginController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LogoutController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userlist""", """controllers.AuthenticateController.index"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_1.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_SignUpController_signup4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_SignUpController_signup4_invoker = createInvoker(
    SignUpController_0.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_LoginController_login5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login5_invoker = createInvoker(
    LoginController_8.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_SignUpController_submit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submit")))
  )
  private[this] lazy val controllers_SignUpController_submit6_invoker = createInvoker(
    SignUpController_0.submit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "submit",
      Nil,
      "POST",
      """""",
      this.prefix + """submit"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ProfileController_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_ProfileController_index7_invoker = createInvoker(
    ProfileController_6.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_submit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitdetail")))
  )
  private[this] lazy val controllers_LoginController_submit8_invoker = createInvoker(
    LoginController_8.submit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "submit",
      Nil,
      "POST",
      """""",
      this.prefix + """submitdetail"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_LogoutController_logout9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LogoutController_logout9_invoker = createInvoker(
    LogoutController_5.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogoutController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_AuthenticateController_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userlist")))
  )
  private[this] lazy val controllers_AuthenticateController_index10_invoker = createInvoker(
    AuthenticateController_4.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthenticateController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """userlist"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_7.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_SignUpController_signup4_route(params) =>
      call { 
        controllers_SignUpController_signup4_invoker.call(SignUpController_0.signup)
      }
  
    // @LINE:17
    case controllers_LoginController_login5_route(params) =>
      call { 
        controllers_LoginController_login5_invoker.call(LoginController_8.login)
      }
  
    // @LINE:18
    case controllers_SignUpController_submit6_route(params) =>
      call { 
        controllers_SignUpController_submit6_invoker.call(SignUpController_0.submit)
      }
  
    // @LINE:19
    case controllers_ProfileController_index7_route(params) =>
      call { 
        controllers_ProfileController_index7_invoker.call(ProfileController_6.index)
      }
  
    // @LINE:20
    case controllers_LoginController_submit8_route(params) =>
      call { 
        controllers_LoginController_submit8_invoker.call(LoginController_8.submit)
      }
  
    // @LINE:21
    case controllers_LogoutController_logout9_route(params) =>
      call { 
        controllers_LogoutController_logout9_invoker.call(LogoutController_5.logout)
      }
  
    // @LINE:22
    case controllers_AuthenticateController_index10_route(params) =>
      call { 
        controllers_AuthenticateController_index10_invoker.call(AuthenticateController_4.index)
      }
  }
}

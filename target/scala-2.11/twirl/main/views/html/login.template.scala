
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Login],String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Login],m:String)(implicit message: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.63*/("""

"""),format.raw/*3.1*/("""<head>
    """),format.raw/*4.58*/("""

    """),format.raw/*6.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.50*/routes/*6.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*6.97*/("""">

    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("images/favicon.png")),format.raw/*8.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*9.89*/("""">
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("bootstrap/jquery.min.js")),format.raw/*10.69*/("""" type="text/javascript"></script>
    <script type='text/javascript' src=""""),_display_(/*11.42*/routes/*11.48*/.Assets.versioned("bootstrap/js/bootstrap.js")),format.raw/*11.94*/(""""></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*12.70*/("""" type="text/javascript"></script>
</head>
"""),_display_(/*14.2*/navbar("Login")),format.raw/*14.17*/("""
"""),format.raw/*15.1*/("""<p>Login</p>

<h1>"""),_display_(/*17.6*/m),format.raw/*17.7*/("""</h1>

<div class="form-group">
"""),_display_(/*20.2*/helper/*20.8*/.form(action = routes.LoginController.submit())/*20.55*/ {_display_(Seq[Any](format.raw/*20.57*/("""

"""),_display_(/*22.2*/helper/*22.8*/.inputText(loginForm("id"),'class -> "form-control",'placeholder -> "Unique Name" )),format.raw/*22.91*/("""

"""),_display_(/*24.2*/helper/*24.8*/.inputPassword(loginForm("password"),'class -> "form-control",'placeholder -> "Password")),format.raw/*24.97*/("""


"""),format.raw/*27.1*/("""<button type="submit" class="">Login</button>
""")))}),format.raw/*28.2*/("""
"""),format.raw/*29.1*/("""</div>
"""))
      }
    }
  }

  def render(loginForm:Form[Login],m:String,message:Messages): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,m)(message)

  def f:((Form[Login],String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,m) => (message) => apply(loginForm,m)(message)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Mar 07 16:57:22 IST 2017
                  SOURCE: /home/knoldus/Documents/study-play/LoginProject/app/views/login.scala.html
                  HASH: 5d301955f5da5f6bc164980a022e65f4e58897f5
                  MATRIX: 548->1|704->62|732->64|770->128|802->134|873->179|887->185|948->226|1032->284|1046->290|1106->329|1169->366|1183->372|1251->420|1299->441|1314->447|1379->491|1482->567|1497->573|1564->619|1625->653|1640->659|1702->700|1772->744|1808->759|1836->760|1881->779|1902->780|1961->813|1975->819|2031->866|2071->868|2100->871|2114->877|2218->960|2247->963|2261->969|2371->1058|2401->1061|2478->1108|2506->1109
                  LINES: 20->1|25->1|27->3|28->4|30->6|30->6|30->6|30->6|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|38->14|38->14|39->15|41->17|41->17|44->20|44->20|44->20|44->20|46->22|46->22|46->22|48->24|48->24|48->24|51->27|52->28|53->29
                  -- GENERATED --
              */
          

package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object navbar_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class navbar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">WebSiteName</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#">Page 1</a></li>
            <li><a href="#">Page 2</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href=""""),_display_(/*14.27*/routes/*14.33*/.SignUpController.signup()),format.raw/*14.59*/(""""><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
            <li><a href=""""),_display_(/*15.27*/routes/*15.33*/.LoginController.login()),format.raw/*15.57*/(""""><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        </ul>
    </div>
</nav>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object navbar extends navbar_Scope0.navbar
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 15:24:42 IST 2017
                  SOURCE: /home/knoldus/Documents/study-play/LoginProject/app/views/navbar.scala.html
                  HASH: 22d1850b7eb6168d51d5f5465bbf8835fd3f3c2a
                  MATRIX: 522->1|618->3|646->5|1125->457|1140->463|1187->489|1306->581|1321->587|1366->611
                  LINES: 20->1|25->1|27->3|38->14|38->14|38->14|39->15|39->15|39->15
                  -- GENERATED --
              */
          
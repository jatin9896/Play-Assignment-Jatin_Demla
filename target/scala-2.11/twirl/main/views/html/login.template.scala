
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[User],String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[User],m:String)(implicit message: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*3.1*/("""<head>
    """),format.raw/*4.58*/("""

    """),format.raw/*6.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.50*/routes/*6.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*6.97*/("""">

    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("images/favicon.png")),format.raw/*8.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*9.89*/("""">
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("bootstrap/jquery.min.js")),format.raw/*10.69*/("""" type="text/javascript"></script>
    <script type='text/javascript' src=""""),_display_(/*11.42*/routes/*11.48*/.Assets.versioned("bootstrap/js/bootstrap.js")),format.raw/*11.94*/(""""></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*12.70*/("""" type="text/javascript"></script>
</head>
"""),_display_(/*14.2*/navbar()),format.raw/*14.10*/("""
"""),format.raw/*15.1*/("""<p>Login</p>

<h1>"""),_display_(/*17.6*/m),format.raw/*17.7*/("""</h1>

<div class="form-group">
"""),_display_(/*20.2*/helper/*20.8*/.form(action = routes.LoginController.submit())/*20.55*/ {_display_(Seq[Any](format.raw/*20.57*/("""

"""),_display_(/*22.2*/helper/*22.8*/.inputText(userForm("id"),'class -> "form-control",'placeholder -> "Unique Name" )),format.raw/*22.90*/("""

"""),_display_(/*24.2*/helper/*24.8*/.inputPassword(userForm("password"),'class -> "form-control",'placeholder -> "Password")),format.raw/*24.96*/("""


"""),format.raw/*27.1*/("""<button type="submit" class="">Login</button>
""")))}),format.raw/*28.2*/("""
"""),format.raw/*29.1*/("""</div>
"""))
      }
    }
  }

  def render(userForm:Form[User],m:String,message:Messages): play.twirl.api.HtmlFormat.Appendable = apply(userForm,m)(message)

  def f:((Form[User],String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (userForm,m) => (message) => apply(userForm,m)(message)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Mar 07 05:51:00 IST 2017
                  SOURCE: /home/knoldus/Documents/study-play/LoginProject/app/views/login.scala.html
                  HASH: e0b015c9553f120dd18c0fac6b901091b4b33054
                  MATRIX: 547->1|701->60|729->62|767->126|799->132|870->177|884->183|945->224|1029->282|1043->288|1103->327|1166->364|1180->370|1248->418|1296->439|1311->445|1376->489|1479->565|1494->571|1561->617|1622->651|1637->657|1699->698|1769->742|1798->750|1826->751|1871->770|1892->771|1951->804|1965->810|2021->857|2061->859|2090->862|2104->868|2207->950|2236->953|2250->959|2359->1047|2389->1050|2466->1097|2494->1098
                  LINES: 20->1|25->1|27->3|28->4|30->6|30->6|30->6|30->6|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|38->14|38->14|39->15|41->17|41->17|44->20|44->20|44->20|44->20|46->22|46->22|46->22|48->24|48->24|48->24|51->27|52->28|53->29
                  -- GENERATED --
              */
          
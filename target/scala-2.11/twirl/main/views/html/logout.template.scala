
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logout_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class logout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<head>
    """),format.raw/*3.58*/("""

    """),format.raw/*5.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*5.97*/("""">

    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.versioned("images/favicon.png")),format.raw/*7.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*8.35*/routes/*8.41*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*8.89*/("""">
    <script src=""""),_display_(/*9.19*/routes/*9.25*/.Assets.versioned("bootstrap/jquery.min.js")),format.raw/*9.69*/("""" type="text/javascript"></script>
    <script type='text/javascript' src=""""),_display_(/*10.42*/routes/*10.48*/.Assets.versioned("bootstrap/js/bootstrap.js")),format.raw/*10.94*/(""""></script>
    <script src=""""),_display_(/*11.19*/routes/*11.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*11.66*/("""" type="text/javascript"></script>
</head>
"""),_display_(/*13.2*/navbar("Login")),format.raw/*13.17*/("""
"""),format.raw/*14.1*/("""<p>Login</p>

<h1>"""),_display_(/*16.6*/message),format.raw/*16.13*/("""</h1>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object logout extends logout_Scope0.logout
              /*
                  -- GENERATED --
                  DATE: Tue Mar 07 15:42:59 IST 2017
                  SOURCE: /home/knoldus/Documents/study-play/LoginProject/app/views/logout.scala.html
                  HASH: 91689f6949f9d3b478e3310f55e3621420384662
                  MATRIX: 529->1|640->17|667->18|705->82|737->88|808->133|822->139|883->180|967->238|981->244|1041->283|1104->320|1118->326|1186->374|1233->395|1247->401|1311->445|1414->521|1429->527|1496->573|1553->603|1568->609|1630->650|1700->694|1736->709|1764->710|1809->729|1837->736
                  LINES: 20->1|25->1|26->2|27->3|29->5|29->5|29->5|29->5|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|37->13|37->13|38->14|40->16|40->16
                  -- GENERATED --
              */
          
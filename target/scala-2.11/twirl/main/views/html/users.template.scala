
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object users_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class users extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<head>
    """),format.raw/*2.58*/("""

    """),format.raw/*4.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.50*/routes/*4.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*4.97*/("""">

    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*6.55*/routes/*6.61*/.Assets.versioned("images/favicon.png")),format.raw/*6.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*7.35*/routes/*7.41*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*7.89*/("""">
    <script src=""""),_display_(/*8.19*/routes/*8.25*/.Assets.versioned("bootstrap/jquery.min.js")),format.raw/*8.69*/("""" type="text/javascript"></script>
    <script type='text/javascript' src=""""),_display_(/*9.42*/routes/*9.48*/.Assets.versioned("bootstrap/js/bootstrap.js")),format.raw/*9.94*/(""""></script>
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*10.66*/("""" type="text/javascript"></script>
</head>
"""),_display_(/*12.2*/navbar("Logout")))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object users extends users_Scope0.users
              /*
                  -- GENERATED --
                  DATE: Wed Mar 08 10:00:11 IST 2017
                  SOURCE: /home/knoldus/Documents/study-play/LoginProject/app/views/users.scala.html
                  HASH: 73daefe211b8b7bdff34340cff686ef324fda947
                  MATRIX: 609->0|647->64|679->70|750->115|764->121|825->162|909->220|923->226|983->265|1046->302|1060->308|1128->356|1175->377|1189->383|1253->427|1355->503|1369->509|1435->555|1492->585|1507->591|1569->632|1639->676
                  LINES: 25->1|26->2|28->4|28->4|28->4|28->4|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|36->12
                  -- GENERATED --
              */
          
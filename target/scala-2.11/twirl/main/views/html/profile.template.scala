
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id:String,name:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""
"""),format.raw/*2.1*/("""<head>
    """),format.raw/*3.58*/("""

    """),format.raw/*5.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*5.97*/("""">

    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.versioned("images/favicon.png")),format.raw/*7.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*8.35*/routes/*8.41*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*8.89*/("""">
    <script src=""""),_display_(/*9.19*/routes/*9.25*/.Assets.versioned("bootstrap/jquery.min.js")),format.raw/*9.69*/("""" type="text/javascript"></script>
    <script type='text/javascript' src=""""),_display_(/*10.42*/routes/*10.48*/.Assets.versioned("bootstrap/js/bootstrap.js")),format.raw/*10.94*/(""""></script>
    <script src=""""),_display_(/*11.19*/routes/*11.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*11.66*/("""" type="text/javascript"></script>
</head>
<h1>Welcome """),_display_(/*13.14*/id),format.raw/*13.16*/("""</h1>"""))
      }
    }
  }

  def render(id:String,name:String): play.twirl.api.HtmlFormat.Appendable = apply(id,name)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (id,name) => apply(id,name)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Tue Mar 07 05:49:00 IST 2017
                  SOURCE: /home/knoldus/Documents/study-play/LoginProject/app/views/profile.scala.html
                  HASH: e4cae56e2eaec1c8807681f51437735bed905ab0
                  MATRIX: 538->1|656->24|683->25|721->89|753->95|824->140|838->146|899->187|983->245|997->251|1057->290|1120->327|1134->333|1202->381|1249->402|1263->408|1327->452|1430->528|1445->534|1512->580|1569->610|1584->616|1646->657|1729->713|1752->715
                  LINES: 20->1|25->1|26->2|27->3|29->5|29->5|29->5|29->5|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|37->13|37->13
                  -- GENERATED --
              */
          
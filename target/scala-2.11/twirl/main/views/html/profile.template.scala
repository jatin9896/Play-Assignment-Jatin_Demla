
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.13*/("""
"""),format.raw/*2.1*/("""<head>
    """),format.raw/*3.58*/("""

    """),format.raw/*5.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*5.97*/("""">

    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.55*/routes/*7.61*/.Assets.versioned("images/favicon.png")),format.raw/*7.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*8.35*/routes/*8.41*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*8.89*/("""">
    <script src=""""),_display_(/*9.19*/routes/*9.25*/.Assets.versioned("bootstrap/jquery.min.js")),format.raw/*9.69*/("""" type="text/javascript"></script>
    <script type='text/javascript' src=""""),_display_(/*10.42*/routes/*10.48*/.Assets.versioned("bootstrap/js/bootstrap.js")),format.raw/*10.94*/(""""></script>
    <script src=""""),_display_(/*11.19*/routes/*11.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*11.66*/("""" type="text/javascript"></script>
</head>
"""),_display_(/*13.2*/navbar("Logout")),format.raw/*13.18*/("""
"""),format.raw/*14.1*/("""<h1>Welcome """),_display_(/*14.14*/user/*14.18*/.id),format.raw/*14.21*/("""</h1>
<h3>Fname : """),_display_(/*15.14*/user/*15.18*/.fname),format.raw/*15.24*/("""</h3>
<h3>Mname : """),_display_(/*16.14*/user/*16.18*/.mname),format.raw/*16.24*/("""</h3>
<h3>Lname : """),_display_(/*17.14*/user/*17.18*/.lname),format.raw/*17.24*/("""</h3>
<h3>mobile : """),_display_(/*18.15*/user/*18.19*/.mobile),format.raw/*18.26*/("""</h3>

"""),_display_(/*20.2*/if(user.isAdmin==true)/*20.24*/{_display_(Seq[Any](format.raw/*20.25*/("""
  """),format.raw/*21.3*/("""<a href=""""),_display_(/*21.13*/routes/*21.19*/.AuthenticateController.index()),format.raw/*21.50*/(""""><h2>Manage Users</h2></a>
""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Wed Mar 08 09:20:49 IST 2017
                  SOURCE: /home/knoldus/Documents/study-play/LoginProject/app/views/profile.scala.html
                  HASH: a2f643a2fa8e33590e6a77690023e64cca627c4c
                  MATRIX: 529->1|635->12|662->13|700->77|732->83|803->128|817->134|878->175|962->233|976->239|1036->278|1099->315|1113->321|1181->369|1228->390|1242->396|1306->440|1409->516|1424->522|1491->568|1548->598|1563->604|1625->645|1695->689|1732->705|1760->706|1800->719|1813->723|1837->726|1883->745|1896->749|1923->755|1969->774|1982->778|2009->784|2055->803|2068->807|2095->813|2142->833|2155->837|2183->844|2217->852|2248->874|2287->875|2317->878|2354->888|2369->894|2421->925|2480->954
                  LINES: 20->1|25->1|26->2|27->3|29->5|29->5|29->5|29->5|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|37->13|37->13|38->14|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|44->20|44->20|44->20|45->21|45->21|45->21|45->21|46->22
                  -- GENERATED --
              */
          
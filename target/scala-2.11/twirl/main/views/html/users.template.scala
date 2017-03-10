
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

class users extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[User],Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users:List[User])(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*2.1*/("""<!--<script type="text/javascript">-->

 <!--alert("""),_display_(/*4.13*/flash/*4.18*/.get("suspend").getOrElse("Flash data Not Transfer")),format.raw/*4.70*/(""")-->
  <!--alert("""),_display_(/*5.14*/flash/*5.19*/.get("resume").getOrElse("Flash data Not Transfer")),format.raw/*5.70*/(""")-->

<!--<script>-->
<head>
    """),format.raw/*9.58*/("""

    """),format.raw/*11.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*11.97*/("""">

    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.55*/routes/*13.61*/.Assets.versioned("images/favicon.png")),format.raw/*13.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*14.35*/routes/*14.41*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*14.89*/("""">
    <script src=""""),_display_(/*15.19*/routes/*15.25*/.Assets.versioned("bootstrap/jquery.min.js")),format.raw/*15.69*/("""" type="text/javascript"></script>
    <script type='text/javascript' src=""""),_display_(/*16.42*/routes/*16.48*/.Assets.versioned("bootstrap/js/bootstrap.js")),format.raw/*16.94*/(""""></script>
    <script src=""""),_display_(/*17.19*/routes/*17.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.66*/("""" type="text/javascript"></script>
    <script type="text/javascript">
    if(""""),_display_(/*19.10*/flash/*19.15*/.get("suspend")),format.raw/*19.30*/(""""=="suspend")
     alert(""""),_display_(/*20.14*/flash/*20.19*/.get("suspend")),format.raw/*20.34*/("""")
     if(""""),_display_(/*21.11*/flash/*21.16*/.get("resume")),format.raw/*21.30*/(""""=="resume")
     alert(""""),_display_(/*22.14*/flash/*22.19*/.get("resume")),format.raw/*22.33*/("""")

    </script>
</head>
<body>


</body>

"""),_display_(/*31.2*/navbar("Logout")),_display_(/*31.19*/for(user<-users) yield /*31.35*/{_display_(Seq[Any](format.raw/*31.36*/("""
"""),format.raw/*32.1*/("""<h2>Name : """),_display_(/*32.13*/user/*32.17*/.fname),format.raw/*32.23*/("""</h2>
<h2>Id : """),_display_(/*33.11*/user/*33.15*/.id),format.raw/*33.18*/("""</h2>
<a href=""""),_display_(/*34.11*/routes/*34.17*/.AuthenticateController.suspend(user.id)),format.raw/*34.57*/(""""><button>Suspend</button></a>
<a href=""""),_display_(/*35.11*/routes/*35.17*/.AuthenticateController.resume(user.id)),format.raw/*35.56*/(""""><button>Resume</button></a>
""")))}),format.raw/*36.2*/("""
"""))
      }
    }
  }

  def render(users:List[User],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(users)(flash)

  def f:((List[User]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (users) => (flash) => apply(users)(flash)

  def ref: this.type = this

}


}

/**/
object users extends users_Scope0.users
              /*
                  -- GENERATED --
                  DATE: Thu Mar 09 13:52:49 IST 2017
                  SOURCE: /home/knoldus/Documents/study-play/LoginProject/app/views/users.scala.html
                  HASH: 78181a1319774b49a85cb2e1a12415070ec87812
                  MATRIX: 537->1|673->42|700->43|778->95|791->100|863->152|907->170|920->175|991->226|1051->312|1084->318|1156->363|1171->369|1233->410|1318->468|1333->474|1394->513|1458->550|1473->556|1542->604|1590->625|1605->631|1670->675|1773->751|1788->757|1855->803|1912->833|1927->839|1989->880|2096->960|2110->965|2146->980|2200->1007|2214->1012|2250->1027|2290->1040|2304->1045|2339->1059|2392->1085|2406->1090|2441->1104|2512->1149|2549->1166|2581->1182|2620->1183|2648->1184|2687->1196|2700->1200|2727->1206|2770->1222|2783->1226|2807->1229|2850->1245|2865->1251|2926->1291|2994->1332|3009->1338|3069->1377|3130->1408
                  LINES: 20->1|25->1|26->2|28->4|28->4|28->4|29->5|29->5|29->5|33->9|35->11|35->11|35->11|35->11|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|43->19|43->19|43->19|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|55->31|55->31|55->31|55->31|56->32|56->32|56->32|56->32|57->33|57->33|57->33|58->34|58->34|58->34|59->35|59->35|59->35|60->36
                  -- GENERATED --
              */
          
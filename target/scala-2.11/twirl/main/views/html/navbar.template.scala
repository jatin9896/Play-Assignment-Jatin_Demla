
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

class navbar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(status: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<script>
    function checking()"""),format.raw/*3.24*/("""{"""),format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""if(status=="Logout")"""),format.raw/*4.25*/("""{"""),format.raw/*4.26*/("""
     """),format.raw/*5.6*/("""window.location=""""),_display_(/*5.24*/routes/*5.30*/.LoginController.login()),format.raw/*5.54*/("""";
     """),format.raw/*6.6*/("""}"""),format.raw/*6.7*/("""
     """),format.raw/*7.6*/("""else"""),format.raw/*7.10*/("""{"""),format.raw/*7.11*/("""
      """),format.raw/*8.7*/("""window.location=""""),_display_(/*8.25*/routes/*8.31*/.LogoutController.logout()),format.raw/*8.57*/("""";
      """),format.raw/*9.7*/("""}"""),format.raw/*9.8*/("""
    """),format.raw/*10.5*/("""}"""),format.raw/*10.6*/("""
"""),format.raw/*11.1*/("""</script>

<nav class="navbar navbar-inverse">
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
            <li><a href=""""),_display_(/*24.27*/routes/*24.33*/.SignUpController.signup()),format.raw/*24.59*/(""""><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
            <li><a><button onclick="checking()"><span class="glyphicon glyphicon-log-in"></span> """),_display_(/*25.99*/status),format.raw/*25.105*/("""</button></a></li>
        </ul>
    </div>
</nav>"""))
      }
    }
  }

  def render(status:String): play.twirl.api.HtmlFormat.Appendable = apply(status)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (status) => apply(status)

  def ref: this.type = this

}


}

/**/
object navbar extends navbar_Scope0.navbar
              /*
                  -- GENERATED --
                  DATE: Wed Mar 08 06:07:48 IST 2017
                  SOURCE: /home/knoldus/Documents/study-play/LoginProject/app/views/navbar.scala.html
                  HASH: 0057d755c79fa61877c6ffd1b668b4ac484bb884
                  MATRIX: 529->1|640->17|667->18|726->50|754->51|785->56|832->76|860->77|892->83|936->101|950->107|994->131|1028->139|1055->140|1087->146|1118->150|1146->151|1179->158|1223->176|1237->182|1283->208|1318->217|1345->218|1377->223|1405->224|1433->225|1923->688|1938->694|1985->720|2176->884|2204->890
                  LINES: 20->1|25->1|26->2|27->3|27->3|28->4|28->4|28->4|29->5|29->5|29->5|29->5|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|32->8|33->9|33->9|34->10|34->10|35->11|48->24|48->24|48->24|49->25|49->25
                  -- GENERATED --
              */
          
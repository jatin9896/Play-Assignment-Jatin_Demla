
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object signup_Scope1 {
import play.api.i18n.MessagesApi
import play.api.i18n.Messages

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[User],String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(userForm: Form[User],m:String)(implicit message: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*4.61*/("""

"""),format.raw/*7.1*/("""<head>
    """),format.raw/*8.58*/("""

    """),format.raw/*10.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.97*/("""">

    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.55*/routes/*12.61*/.Assets.versioned("images/favicon.png")),format.raw/*12.100*/("""">
    <link rel="stylesheet" href=""""),_display_(/*13.35*/routes/*13.41*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*13.89*/("""">
    <script src=""""),_display_(/*14.19*/routes/*14.25*/.Assets.versioned("bootstrap/jquery.min.js")),format.raw/*14.69*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*15.19*/routes/*15.25*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*15.75*/("""" type="text/javascript"></script>

    <script src=""""),_display_(/*17.19*/routes/*17.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.66*/("""" type="text/javascript"></script>
</head>

"""),_display_(/*20.2*/navbar("Login")),format.raw/*20.17*/("""

"""),format.raw/*22.1*/("""<h1>"""),_display_(/*22.6*/m),format.raw/*22.7*/("""</h1>

<div class="form-group">
"""),_display_(/*25.2*/helper/*25.8*/.form(action = routes.SignUpController.submit(),'name -> "userform", 'onsubmit -> "return validate()")/*25.110*/ {_display_(Seq[Any](format.raw/*25.112*/("""

"""),_display_(/*27.2*/helper/*27.8*/.inputText(userForm("id"),'class -> "form-control",'placeholder -> "Unique User Name" )),format.raw/*27.95*/("""
"""),_display_(/*28.2*/helper/*28.8*/.inputText(userForm("First_Name"),'class -> "form-control",'placeholder -> "First Name" )),format.raw/*28.97*/("""
"""),_display_(/*29.2*/helper/*29.8*/.inputText(userForm("Middle_Name"),'class -> "form-control",'placeholder -> "Middle Name" )),format.raw/*29.99*/("""
"""),_display_(/*30.2*/helper/*30.8*/.inputText(userForm("Last_Name"),'class -> "form-control",'placeholder -> "Last Name" )),format.raw/*30.95*/("""
"""),_display_(/*31.2*/helper/*31.8*/.inputPassword(userForm("password"),'class -> "form-control",'placeholder -> "Password")),format.raw/*31.96*/("""
"""),_display_(/*32.2*/helper/*32.8*/.inputPassword(userForm("confirmpassword"),'class -> "form-control",'placeholder -> "Confirm Password")),format.raw/*32.111*/("""
"""),_display_(/*33.2*/helper/*33.8*/.inputText(userForm("mobile"),'class -> "form-control",'placeholder -> "Mobile")),format.raw/*33.88*/("""
 """),format.raw/*34.2*/("""<label>Gender:</label>
    <label><input type="radio" name="gender" value="Male">Male</label>
    <label><input type="radio" name="gender" value="Female">Female</label><br><br>

    <label>Hobbies:</label>
    <label class="checkbox-inline"><input type="checkbox" value="chess" name="hobbies[]">Hockey</label>
    <label class="checkbox-inline"><input type="checkbox" value="hockey"  name="hobbies[]">Chess</label>
    <label class="checkbox-inline"><input type="checkbox" value="football"  name="hobbies[]">Football</label>
    <br/>


<button type="submit" class="">Submit</button>
""")))}),format.raw/*46.2*/("""
"""),format.raw/*47.1*/("""</div>

<script type="text/javascript" charset="utf-8">
    function validate()"""),format.raw/*50.24*/("""{"""),format.raw/*50.25*/("""

   """),format.raw/*52.4*/("""var mobile = (userform.mobile.value).length;
    var password = (userform.password.value);
    var cpassword = (userform.confirmpassword.value);
    if(password!=cpassword)"""),format.raw/*55.28*/("""{"""),format.raw/*55.29*/("""
     """),format.raw/*56.6*/("""alert("Confirm password doesnot match");
     return false;
    """),format.raw/*58.5*/("""}"""),format.raw/*58.6*/("""
    """),format.raw/*59.5*/("""if(password.length < 3 )"""),format.raw/*59.29*/("""{"""),format.raw/*59.30*/("""
      """),format.raw/*60.7*/("""alert("Atleast 3 char requires in password");
      return false;
    """),format.raw/*62.5*/("""}"""),format.raw/*62.6*/("""
       """),format.raw/*63.8*/("""if(mobile < 10 || mobile > 10)"""),format.raw/*63.38*/("""{"""),format.raw/*63.39*/("""
       """),format.raw/*64.8*/("""alert("mobile number should have 10 character ");
       return false;
       """),format.raw/*66.8*/("""}"""),format.raw/*66.9*/("""

    """),format.raw/*68.5*/("""}"""),format.raw/*68.6*/("""
"""),format.raw/*69.1*/("""</script>"""))
      }
    }
  }

  def render(userForm:Form[User],m:String,message:Messages): play.twirl.api.HtmlFormat.Appendable = apply(userForm,m)(message)

  def f:((Form[User],String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (userForm,m) => (message) => apply(userForm,m)(message)

  def ref: this.type = this

}


}
}

/**/
object signup extends signup_Scope0.signup_Scope1.signup
              /*
                  -- GENERATED --
                  DATE: Tue Mar 07 16:23:26 IST 2017
                  SOURCE: /home/knoldus/Documents/study-play/LoginProject/app/views/signup.scala.html
                  HASH: c666c4bf951ae6d560a08da7889b196cdb04c18d
                  MATRIX: 641->68|810->127|838->146|876->210|909->216|981->261|996->267|1058->308|1143->366|1158->372|1219->411|1283->448|1298->454|1367->502|1415->523|1430->529|1495->573|1575->626|1590->632|1661->682|1742->736|1757->742|1819->783|1890->828|1926->843|1955->845|1986->850|2007->851|2066->884|2080->890|2192->992|2233->994|2262->997|2276->1003|2384->1090|2412->1092|2426->1098|2536->1187|2564->1189|2578->1195|2690->1286|2718->1288|2732->1294|2840->1381|2868->1383|2882->1389|2991->1477|3019->1479|3033->1485|3158->1588|3186->1590|3200->1596|3301->1676|3330->1678|3945->2263|3973->2264|4080->2343|4109->2344|4141->2349|4341->2521|4370->2522|4403->2528|4494->2592|4522->2593|4554->2598|4606->2622|4635->2623|4669->2630|4766->2700|4794->2701|4829->2709|4887->2739|4916->2740|4951->2748|5056->2826|5084->2827|5117->2833|5145->2834|5173->2835
                  LINES: 24->4|29->4|31->7|32->8|34->10|34->10|34->10|34->10|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|41->17|41->17|41->17|44->20|44->20|46->22|46->22|46->22|49->25|49->25|49->25|49->25|51->27|51->27|51->27|52->28|52->28|52->28|53->29|53->29|53->29|54->30|54->30|54->30|55->31|55->31|55->31|56->32|56->32|56->32|57->33|57->33|57->33|58->34|70->46|71->47|74->50|74->50|76->52|79->55|79->55|80->56|82->58|82->58|83->59|83->59|83->59|84->60|86->62|86->62|87->63|87->63|87->63|88->64|90->66|90->66|92->68|92->68|93->69
                  -- GENERATED --
              */
          
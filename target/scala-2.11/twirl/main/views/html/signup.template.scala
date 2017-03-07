
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

"""),_display_(/*20.2*/navbar()),format.raw/*20.10*/("""

"""),format.raw/*22.1*/("""<h1>"""),_display_(/*22.6*/m),format.raw/*22.7*/("""</h1>

<div class="form-group">
"""),_display_(/*25.2*/helper/*25.8*/.form(action = routes.SignUpController.submit(),'name -> "userform", 'onsubmit -> "return validate()")/*25.110*/ {_display_(Seq[Any](format.raw/*25.112*/("""

"""),_display_(/*27.2*/helper/*27.8*/.inputText(userForm("id"),'class -> "form-control",'placeholder -> "Unique User Name" )),format.raw/*27.95*/("""
"""),_display_(/*28.2*/helper/*28.8*/.inputText(userForm("First Name"),'class -> "form-control",'placeholder -> "First Name" )),format.raw/*28.97*/("""
"""),_display_(/*29.2*/helper/*29.8*/.inputText(userForm("Middle Name"),'class -> "form-control",'placeholder -> "Middle Name" )),format.raw/*29.99*/("""
"""),_display_(/*30.2*/helper/*30.8*/.inputText(userForm("Last Name"),'class -> "form-control",'placeholder -> "Last Name" )),format.raw/*30.95*/("""
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
    alert("password "+password)
      alert("password "+cpassword)
    if(password!=confirmpassword)"""),format.raw/*57.34*/("""{"""),format.raw/*57.35*/("""
     """),format.raw/*58.6*/("""alert("Confirm password doesnot match");
     return false;
    """),format.raw/*60.5*/("""}"""),format.raw/*60.6*/("""
    """),format.raw/*61.5*/("""if(password.length < 3 )"""),format.raw/*61.29*/("""{"""),format.raw/*61.30*/("""
      """),format.raw/*62.7*/("""alert("Atleast 3 char requires in password");
      return false;
    """),format.raw/*64.5*/("""}"""),format.raw/*64.6*/("""
       """),format.raw/*65.8*/("""if(mobile < 10 || mobile > 10)"""),format.raw/*65.38*/("""{"""),format.raw/*65.39*/("""
       """),format.raw/*66.8*/("""alert("mobile number should have 10 character ");
       return false;
       """),format.raw/*68.8*/("""}"""),format.raw/*68.9*/("""

    """),format.raw/*70.5*/("""}"""),format.raw/*70.6*/("""
"""),format.raw/*71.1*/("""</script>"""))
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
                  DATE: Tue Mar 07 10:14:11 IST 2017
                  SOURCE: /home/knoldus/Documents/study-play/LoginProject/app/views/signup.scala.html
                  HASH: 273080113bd4085686603f237ed9658a58adba8f
                  MATRIX: 641->68|810->127|838->146|876->210|909->216|981->261|996->267|1058->308|1143->366|1158->372|1219->411|1283->448|1298->454|1367->502|1415->523|1430->529|1495->573|1575->626|1590->632|1661->682|1742->736|1757->742|1819->783|1890->828|1919->836|1948->838|1979->843|2000->844|2059->877|2073->883|2185->985|2226->987|2255->990|2269->996|2377->1083|2405->1085|2419->1091|2529->1180|2557->1182|2571->1188|2683->1279|2711->1281|2725->1287|2833->1374|2861->1376|2875->1382|2984->1470|3012->1472|3026->1478|3151->1581|3179->1583|3193->1589|3294->1669|3323->1671|3938->2256|3966->2257|4073->2336|4102->2337|4134->2342|4407->2587|4436->2588|4469->2594|4560->2658|4588->2659|4620->2664|4672->2688|4701->2689|4735->2696|4832->2766|4860->2767|4895->2775|4953->2805|4982->2806|5017->2814|5122->2892|5150->2893|5183->2899|5211->2900|5239->2901
                  LINES: 24->4|29->4|31->7|32->8|34->10|34->10|34->10|34->10|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|41->17|41->17|41->17|44->20|44->20|46->22|46->22|46->22|49->25|49->25|49->25|49->25|51->27|51->27|51->27|52->28|52->28|52->28|53->29|53->29|53->29|54->30|54->30|54->30|55->31|55->31|55->31|56->32|56->32|56->32|57->33|57->33|57->33|58->34|70->46|71->47|74->50|74->50|76->52|81->57|81->57|82->58|84->60|84->60|85->61|85->61|85->61|86->62|88->64|88->64|89->65|89->65|89->65|90->66|92->68|92->68|94->70|94->70|95->71
                  -- GENERATED --
              */
          
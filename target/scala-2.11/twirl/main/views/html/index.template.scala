
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Welcome to Play")/*12.25*/ {_display_(Seq[Any](format.raw/*12.27*/("""

    """),format.raw/*17.8*/("""
    """),_display_(/*18.6*/play20/*18.12*/.welcome(message, style = "Scala")),format.raw/*18.46*/("""

""")))}),format.raw/*20.2*/("""
"""),_display_(/*21.2*/navbar()),format.raw/*21.10*/("""

"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Mar 06 15:21:15 IST 2017
                  SOURCE: /home/knoldus/Documents/study-play/LoginProject/app/views/index.scala.html
                  HASH: f645daa05d214e5b1ee80c31646c11ab7d43b5bd
                  MATRIX: 616->95|728->112|757->308|785->310|817->333|857->335|890->464|922->470|937->476|992->510|1025->513|1053->515|1082->523
                  LINES: 23->5|28->5|30->11|31->12|31->12|31->12|33->17|34->18|34->18|34->18|36->20|37->21|37->21
                  -- GENERATED --
              */
          
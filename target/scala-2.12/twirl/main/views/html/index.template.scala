
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(question: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

        """),format.raw/*5.9*/("""<!-- Modal Structure -->

    <div class="col s12 m7">
        <h2 class="header">Questions</h2>
        <div class="card horizontal">
            <div class="card-stacked">
                <div class="card-content">
                    <p>"""),_display_(/*12.25*/question),format.raw/*12.33*/("""</p>
                </div>
                <div class="card-action">
                    <a href="#">Yes</a>
                    <a href="#">NO</a>
                </div>
            </div>
        </div>
    </div>
  <div class="fixed-action-btn">
    <a class="btn-floating btn-large red" href=""""),_display_(/*22.50*/controllers/*22.61*/.routes.ViewsController.create),format.raw/*22.91*/("""">
      <i class="material-icons">+</i>
    </a>
  </div>
""")))}),format.raw/*26.2*/("""
"""))
      }
    }
  }

  def render(question:String): play.twirl.api.HtmlFormat.Appendable = apply(question)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (question) => apply(question)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 02 20:38:22 COT 2018
                  SOURCE: /home/agile-monkey-g3/Dev/play-framework/expert-system/app/views/index.scala.html
                  HASH: ca7554acb9d500791c8a95d054489795e5393a9d
                  MATRIX: 948->1|1060->20|1087->22|1118->45|1157->47|1193->57|1461->298|1490->306|1816->605|1836->616|1887->646|1977->706
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|43->12|43->12|53->22|53->22|53->22|57->26
                  -- GENERATED --
              */
          
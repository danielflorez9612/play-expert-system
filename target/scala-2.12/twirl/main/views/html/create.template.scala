
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[play.data.Form[TObject],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(objectForm: play.data.Form[TObject]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Create an object")/*2.26*/ {_display_(Seq[Any](format.raw/*2.28*/("""
    """),format.raw/*3.5*/("""<h2>Add a new Object</h2>
    <div class="row">
    """),_display_(/*5.6*/helper/*5.12*/.form(action=routes.ApiController.addObject,'_class ->"col s12")/*5.76*/ {_display_(Seq[Any](format.raw/*5.78*/("""
        """),format.raw/*6.9*/("""<div class="row">
            <div class="input-field col s12">
            """),_display_(/*8.14*/helper/*8.20*/.inputText(objectForm("name"),'required -> "required",'_class -> "validate")),format.raw/*8.96*/("""
            """),format.raw/*9.13*/("""</div>
        </div>
    """)))}),format.raw/*11.6*/("""
    """),format.raw/*12.5*/("""</div>
    <div class="row">
    """),_display_(/*14.6*/helper/*14.12*/.repeat(objectForm("characteristics"), min = 5)/*14.59*/ { characteristicField =>_display_(Seq[Any](format.raw/*14.84*/("""
        """),_display_(/*15.10*/helper/*15.16*/.inputText(characteristicField)),format.raw/*15.47*/("""
    """)))}),format.raw/*16.6*/("""
    """),format.raw/*17.5*/("""</div>
    <div class="row">
        <a class="btn red" href=""""),_display_(/*19.35*/controllers/*19.46*/.routes.ViewsController.index),format.raw/*19.75*/("""">Back</a>
        <input type="submit" class="btn green" value="Create">
    </div>
""")))}))
      }
    }
  }

  def render(objectForm:play.data.Form[TObject]): play.twirl.api.HtmlFormat.Appendable = apply(objectForm)

  def f:((play.data.Form[TObject]) => play.twirl.api.HtmlFormat.Appendable) = (objectForm) => apply(objectForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 02 20:38:22 COT 2018
                  SOURCE: /home/agile-monkey-g3/Dev/play-framework/expert-system/app/views/create.scala.html
                  HASH: 35734a8728ddc15a15f76f8fed568f1382f04ecf
                  MATRIX: 966->1|1097->40|1129->64|1168->66|1199->71|1277->124|1291->130|1363->194|1402->196|1437->205|1540->282|1554->288|1650->364|1690->377|1747->404|1779->409|1839->443|1854->449|1910->496|1973->521|2010->531|2025->537|2077->568|2113->574|2145->579|2235->642|2255->653|2305->682
                  LINES: 28->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|42->11|43->12|45->14|45->14|45->14|45->14|46->15|46->15|46->15|47->16|48->17|50->19|50->19|50->19
                  -- GENERATED --
              */
          
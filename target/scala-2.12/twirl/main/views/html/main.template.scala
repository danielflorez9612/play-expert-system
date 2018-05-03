
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>

            <!--Import Google Icon Font-->
            <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" media="screen,projection" href=""""),_display_(/*17.81*/routes/*17.87*/.Assets.versioned("stylesheets/materialize.min.css")),format.raw/*17.139*/("""">
            <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link rel="stylesheet" media="screen" href=""""),_display_(/*21.54*/routes/*21.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*21.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*22.59*/routes/*22.65*/.Assets.versioned("images/favicon.png")),format.raw/*22.104*/("""">
    </head>
    <body class="grey lighten-3">
        <script type="text/javascript" src=""""),_display_(/*25.46*/routes/*25.52*/.Assets.versioned("javascripts/materialize.min.js")),format.raw/*25.103*/(""""></script>
        <script src=""""),_display_(/*26.23*/routes/*26.29*/.Assets.versioned("javascripts/main.js")),format.raw/*26.69*/("""" type="text/javascript"></script>

        <div class="container">
            """),format.raw/*30.35*/("""
            """),_display_(/*31.14*/content),format.raw/*31.21*/("""
        """),format.raw/*32.9*/("""</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 02 20:38:22 COT 2018
                  SOURCE: /home/agile-monkey-g3/Dev/play-framework/expert-system/app/views/main.scala.html
                  HASH: c0c3efe0cd2a89190eb1a7f19c9623903558de9c
                  MATRIX: 1206->260|1330->291|1357->292|1437->397|1473->406|1508->414|1534->419|1736->594|1751->600|1825->652|2057->857|2072->863|2135->904|2223->965|2238->971|2299->1010|2420->1104|2435->1110|2508->1161|2569->1195|2584->1201|2645->1241|2753->1414|2794->1428|2822->1435|2858->1444
                  LINES: 33->7|38->8|39->9|42->12|43->13|43->13|43->13|47->17|47->17|47->17|51->21|51->21|51->21|52->22|52->22|52->22|55->25|55->25|55->25|56->26|56->26|56->26|59->30|60->31|60->31|61->32
                  -- GENERATED --
              */
          

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
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html lang="en">
    <head>
        <title>"""),_display_(/*5.17*/title),format.raw/*5.22*/("""</title>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*6.101*/("""'>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*7.110*/("""'>
        <link rel="shortcut icon" type="image/png" href='"""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/("""'>
        <script src='"""),_display_(/*9.23*/routes/*9.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*9.70*/("""' type="text/javascript"></script>
    </head>
    <body>
        <nav class="navbar navbar-dark">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">
                        <img alt="Brand" src='"""),_display_(/*16.48*/routes/*16.54*/.Assets.versioned("images/logo.png")),format.raw/*16.90*/("""'>
                    </a>
                    Email formatter
                </div>
                by Gustavo Saudade
            </div>
        </nav>
        <div class="content">
            """),_display_(/*24.14*/content),format.raw/*24.21*/("""
        """),format.raw/*25.9*/("""</div>
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
                  SOURCE: app/views/main.scala.html
                  HASH: 01dd2ba02b132c035663ec81d1232f6a0714e48b
                  MATRIX: 733->1|857->32|884->33|954->77|979->82|1067->144|1081->150|1143->191|1225->247|1239->253|1310->303|1397->364|1411->370|1471->409|1522->434|1536->440|1597->481|1910->767|1925->773|1982->809|2208->1008|2236->1015|2272->1024
                  LINES: 21->1|26->2|27->3|29->5|29->5|30->6|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|40->16|40->16|40->16|48->24|48->24|49->25
                  -- GENERATED --
              */
          
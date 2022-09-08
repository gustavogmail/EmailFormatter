
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

object formattedEmail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formattedMessage: String, originalText: String)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.91*/("""

"""),_display_(/*3.2*/main("Email Formatter")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

    """),format.raw/*5.5*/("""<div class="alert alert-secondary" role="alert">
        """),_display_(/*6.10*/request/*6.17*/.flash.data.map/*6.32*/{ case (name, value) =>_display_(Seq[Any](format.raw/*6.55*/("""
            """),format.raw/*7.13*/("""<h4 class="alert-heading">"""),_display_(/*7.40*/value),format.raw/*7.45*/("""</h4>
        """)))}),format.raw/*8.10*/("""
    """),format.raw/*9.5*/("""</div>
    <div class="row">
        <div class="col-1"></div>
        <div class="col-5">
            <div class="alert alert-warning" role="alert">
                <h3>Original Text</h3>
                <span>"""),_display_(/*15.24*/originalText),format.raw/*15.36*/("""</span>
            </div>
        </div>
        <div class="col-5">
            <div class="alert alert-success" role="alert">
                <h3>Formatted text</h3>
                <span style="white-space: pre-line">"""),_display_(/*21.54*/formattedMessage),format.raw/*21.70*/("""</span>
            </div>
        </div>
        <div class="col-1"></div>
    </div>
""")))}),format.raw/*26.2*/("""
"""))
      }
    }
  }

  def render(formattedMessage:String,originalText:String,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(formattedMessage,originalText)(request)

  def f:((String,String) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (formattedMessage,originalText) => (request) => apply(formattedMessage,originalText)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/formattedEmail.scala.html
                  HASH: 7954ef9e8267a3361e26b25ff873b22eddca745b
                  MATRIX: 767->1|951->90|981->95|1012->118|1051->120|1085->128|1170->187|1185->194|1208->209|1268->232|1309->246|1362->273|1387->278|1433->294|1465->300|1710->518|1743->530|1998->758|2035->774|2158->867
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|31->6|31->6|31->6|31->6|32->7|32->7|32->7|33->8|34->9|40->15|40->15|46->21|46->21|51->26
                  -- GENERATED --
              */
          
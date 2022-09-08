
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

object emailForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[EmailForm.Data],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[EmailForm.Data], postUrl: Call)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""

"""),_display_(/*3.2*/main("Email Formatter")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.66*/("""
    """),_display_(/*5.6*/if(form.hasGlobalErrors)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
        """),_display_(/*6.10*/form/*6.14*/.globalErrors.map/*6.31*/ { error: FormError =>_display_(Seq[Any](format.raw/*6.53*/("""
            """),format.raw/*7.13*/("""<div>
                """),_display_(/*8.18*/error/*8.23*/.key),format.raw/*8.27*/(""": """),_display_(/*8.30*/error/*8.35*/.message),format.raw/*8.43*/("""
            """),format.raw/*9.13*/("""</div>
        """)))}),format.raw/*10.10*/("""
    """)))}),format.raw/*11.6*/("""
    """),format.raw/*12.5*/("""<br>
    """),_display_(/*13.6*/helper/*13.12*/.form(postUrl)/*13.26*/ {_display_(Seq[Any](format.raw/*13.28*/("""
        """),_display_(/*14.10*/helper/*14.16*/.CSRF.formField),format.raw/*14.31*/("""
            """),format.raw/*15.13*/("""<div class="row">
                <div class="col-3"></div>
                <div class="col-6">
                    <div class="row">
                        <div class="col-12">
                            """),_display_(/*20.30*/helper/*20.36*/.inputText(form("Limit"))),format.raw/*20.61*/("""
                        """),format.raw/*21.25*/("""</div>
                        <div class="col-12">
                            """),_display_(/*23.30*/helper/*23.36*/.textarea(form("Text"))),format.raw/*23.59*/("""
                        """),format.raw/*24.25*/("""</div>
                        <div class="col-12">
                            <button class="btn btn-block btn-secondary">Format email</button>
                        </div>
                    </div>
                </div>
                <div class="col-3"></div>
            </div>
    """)))}),format.raw/*32.6*/("""
""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(form:Form[EmailForm.Data],postUrl:Call,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(form,postUrl)(request)

  def f:((Form[EmailForm.Data],Call) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (form,postUrl) => (request) => apply(form,postUrl)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/emailForm.scala.html
                  HASH: 1676e7fd109226f26efb00eaa29f68431661083b
                  MATRIX: 774->1|953->85|983->90|1014->113|1053->115|1086->182|1118->189|1150->213|1189->215|1226->226|1238->230|1263->247|1322->269|1363->283|1413->307|1426->312|1450->316|1479->319|1492->324|1520->332|1561->346|1609->363|1646->370|1679->376|1716->387|1731->393|1754->407|1794->409|1832->420|1847->426|1883->441|1925->455|2165->668|2180->674|2226->699|2280->725|2390->808|2405->814|2449->837|2503->863|2834->1164|2867->1167
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|30->5|30->5|30->5|31->6|31->6|31->6|31->6|32->7|33->8|33->8|33->8|33->8|33->8|33->8|34->9|35->10|36->11|37->12|38->13|38->13|38->13|38->13|39->14|39->14|39->14|40->15|45->20|45->20|45->20|46->21|48->23|48->23|48->23|49->24|57->32|58->33
                  -- GENERATED --
              */
          
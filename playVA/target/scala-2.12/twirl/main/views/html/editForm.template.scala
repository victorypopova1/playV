
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

object editForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Long,Form[Feature],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, featureForm: Form[Feature]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""

"""),format.raw/*7.1*/("""<h1>Фича</h1>

"""),_display_(/*9.2*/form(routes.HomeController.update(id))/*9.40*/ {_display_(Seq[Any](format.raw/*9.42*/("""

"""),format.raw/*11.1*/("""<fieldset>
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
    """),_display_(/*13.6*/inputText(featureForm("title"), '_label -> "Название", '_help -> "")),format.raw/*13.74*/("""
    """),_display_(/*14.6*/bootstrap/*14.15*/.editor(featureForm("description"), '_label -> "Описание", '_help -> "")),format.raw/*14.87*/("""
    """),_display_(/*15.6*/inputText(featureForm("imageUrl"), '_label -> "Ссылка на картинку", '_help -> "")),format.raw/*15.87*/("""

    """),format.raw/*17.5*/("""<input type="hidden" name=""""),_display_(/*17.33*/featureForm("id")/*17.50*/.getName),format.raw/*17.58*/("""" value=""""),_display_(/*17.68*/featureForm("id")/*17.85*/.getValue),format.raw/*17.94*/("""">
</fieldset>

<div class="actions">
    <input type="submit" value="Сохранить" class="btn primary">
    <a href=""""),_display_(/*22.15*/routes/*22.21*/.HomeController.list()),format.raw/*22.43*/("""" class="btn btn-default">Отменить</a>
    """),_display_(/*23.6*/form(routes.HomeController.delete(id), 'class -> "topRight")/*23.66*/ {_display_(Seq[Any](format.raw/*23.68*/("""
    """),_display_(/*24.6*/CSRF/*24.10*/.formField),format.raw/*24.20*/("""
    """),format.raw/*25.5*/("""<input type="submit" value="Удалить" class="btn btn-danger">
    """)))}),format.raw/*26.6*/("""
"""),format.raw/*27.1*/("""</div>
""")))}),format.raw/*28.2*/("""
""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(id:Long,featureForm:Form[Feature]): play.twirl.api.HtmlFormat.Appendable = apply(id,featureForm)

  def f:((Long,Form[Feature]) => play.twirl.api.HtmlFormat.Appendable) = (id,featureForm) => apply(id,featureForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Nov 11 14:54:18 IRKT 2017
                  SOURCE: E:/web/playVA/playVA/app/views/editForm.scala.html
                  HASH: a4d998e864378a28c1a3b1049eac1ca4b149a97c
                  MATRIX: 963->1|1074->42|1119->39|1147->58|1174->60|1185->64|1223->66|1251->68|1292->84|1338->122|1377->124|1406->126|1448->142|1461->146|1492->156|1524->162|1613->230|1645->236|1663->245|1756->317|1788->323|1890->404|1923->410|1978->438|2004->455|2033->463|2070->473|2096->490|2126->499|2269->615|2284->621|2327->643|2397->687|2466->747|2506->749|2538->755|2551->759|2582->769|2614->774|2710->840|2738->841|2776->849|2808->851
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|41->9|41->9|41->9|43->11|44->12|44->12|44->12|45->13|45->13|46->14|46->14|46->14|47->15|47->15|49->17|49->17|49->17|49->17|49->17|49->17|49->17|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|58->26|59->27|60->28|61->29
                  -- GENERATED --
              */
          

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

object createForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Feature],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(featureForm: Form[Feature]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import bootstrap._


Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main/*6.6*/ {_display_(Seq[Any](format.raw/*6.8*/("""

"""),format.raw/*8.1*/("""<h1>Новая фича</h1>

"""),_display_(/*10.2*/form(routes.HomeController.save())/*10.36*/ {_display_(Seq[Any](format.raw/*10.38*/("""

"""),format.raw/*12.1*/("""<fieldset>
    """),_display_(/*13.6*/CSRF/*13.10*/.formField),format.raw/*13.20*/("""
    """),_display_(/*14.6*/text(featureForm("title"), '_label -> "Название", '_help -> "")),format.raw/*14.69*/("""
    """),_display_(/*15.6*/bootstrap/*15.15*/.editor(featureForm("description"), '_label -> "Описание", '_help -> "")),format.raw/*15.87*/("""
    """),_display_(/*16.6*/text(featureForm("imageUrl"), '_label -> "Ссылка на картинку", '_help -> "")),format.raw/*16.82*/("""
"""),format.raw/*17.1*/("""</fieldset>

<div class="actions">
    <input type="submit" value="Создать фичу" class="btn btn-primary"> или
    <a href=""""),_display_(/*21.15*/routes/*21.21*/.HomeController.list()),format.raw/*21.43*/("""" class="btn btn-default">Отменить</a>
</div>
""")))}),format.raw/*23.2*/("""
""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(featureForm:Form[Feature]): play.twirl.api.HtmlFormat.Appendable = apply(featureForm)

  def f:((Form[Feature]) => play.twirl.api.HtmlFormat.Appendable) = (featureForm) => apply(featureForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Nov 11 14:57:07 IRKT 2017
                  SOURCE: E:/web/playVA/playVA/app/views/createForm.scala.html
                  HASH: 6db4a734c1a53e7a4d6433f33bae5451f508efd0
                  MATRIX: 960->1|1061->32|1084->49|1132->29|1160->68|1187->70|1198->74|1236->76|1264->78|1312->100|1355->134|1395->136|1424->138|1466->154|1479->158|1510->168|1542->174|1626->237|1658->243|1676->252|1769->324|1801->330|1898->406|1926->407|2077->531|2092->537|2135->559|2212->606|2244->608
                  LINES: 28->1|31->3|32->4|35->1|37->5|38->6|38->6|38->6|40->8|42->10|42->10|42->10|44->12|45->13|45->13|45->13|46->14|46->14|47->15|47->15|47->15|48->16|48->16|49->17|53->21|53->21|53->21|55->23|56->24
                  -- GENERATED --
              */
          

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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Feature],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(all: List[Feature]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""

"""),_display_(/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""

    """),format.raw/*5.5*/("""<h1 id="homeTitle">Фичи</h1>
    """),_display_(/*6.6*/if(all.isEmpty)/*6.21*/ {_display_(Seq[Any](format.raw/*6.23*/("""
        """),format.raw/*7.9*/("""<div class="well">
            <em>Нет данных для отображения</em>
        </div>

    """)))}/*11.7*/else/*11.12*/{_display_(Seq[Any](format.raw/*11.13*/("""

        """),format.raw/*13.9*/("""<table class="table table-striped">
            <thead>
                <tr>
                    <th>Название</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>

                """),_display_(/*22.18*/for(feature <- all.asScala) yield /*22.45*/ {_display_(Seq[Any](format.raw/*22.47*/("""
                    """),format.raw/*23.21*/("""<tr>
                        <td><a href=""""),_display_(/*24.39*/routes/*24.45*/.HomeController.edit(feature.id)),format.raw/*24.77*/("""">"""),_display_(/*24.80*/feature/*24.87*/.title),format.raw/*24.93*/("""</a></td>
                    </tr>
                """)))}),format.raw/*26.18*/("""
            """),format.raw/*27.13*/("""</tbody>
        </table>
    """)))}),format.raw/*29.6*/("""
    """),format.raw/*30.5*/("""<a href=""""),_display_(/*30.15*/routes/*30.21*/.HomeController.create()),format.raw/*30.45*/("""" class="btn btn-primary">Добавить фичу</a>
""")))}))
      }
    }
  }

  def render(all:List[Feature]): play.twirl.api.HtmlFormat.Appendable = apply(all)

  def f:((List[Feature]) => play.twirl.api.HtmlFormat.Appendable) = (all) => apply(all)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Nov 11 14:08:10 IRKT 2017
                  SOURCE: E:/web/playVA/playVA/app/views/list.scala.html
                  HASH: 87b5b832c03b77f4a48e348cdd00b5a7472f21f1
                  MATRIX: 954->1|1069->21|1097->24|1108->28|1146->30|1178->36|1237->70|1260->85|1299->87|1334->96|1440->185|1453->190|1492->191|1529->201|1782->427|1825->454|1865->456|1914->477|1984->520|1999->526|2052->558|2082->561|2098->568|2125->574|2209->627|2250->640|2311->671|2343->676|2380->686|2395->692|2440->716
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|38->6|38->6|38->6|39->7|43->11|43->11|43->11|45->13|54->22|54->22|54->22|55->23|56->24|56->24|56->24|56->24|56->24|56->24|58->26|59->27|61->29|62->30|62->30|62->30|62->30
                  -- GENERATED --
              */
          
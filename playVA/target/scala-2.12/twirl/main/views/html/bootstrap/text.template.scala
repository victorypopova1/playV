
package views.html.bootstrap

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

object text extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],helper.FieldConstructor,play.api.i18n.Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**
* Генерирует HTML input.
*
* Пример:
* {{{
* @text(field = myForm("name"), args = 'size -> 10, 'placeholder -> "Your name")
* }}}
*
* @param Поле для формы.
* @param args Множество дополнительных атрибутов.
* @param handler конструктор поля.
*/
  def apply/*13.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: helper.FieldConstructor, lang: play.api.i18n.Lang):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*15.2*/import helper._;

def /*17.2*/inputType/*17.11*/ = {{ args.toMap.get('type).map(_.toString).getOrElse("text") }};def /*18.2*/invalid/*18.9*/ = {{if (field.hasErrors){"is-invalid"} else if(!field.value.isEmpty){"is-valid"} else {""}}};
Seq[Any](format.raw/*13.120*/("""

"""),format.raw/*16.1*/("""
"""),format.raw/*17.74*/("""
"""),format.raw/*18.101*/("""

"""),format.raw/*20.1*/("""<div class="form-group """),_display_(/*20.25*/if(field.hasErrors)/*20.44*/{_display_(Seq[Any](format.raw/*20.45*/("""error""")))}),format.raw/*20.51*/("""">
    <label class="control-label" for=""""),_display_(/*21.40*/field/*21.45*/.id),format.raw/*21.48*/("""">"""),_display_(/*21.51*/{args.toMap.get('_label).map(_.toString).getOrElse(field.name)}),format.raw/*21.114*/("""</label>

    <input class="form-control """),_display_(/*23.33*/invalid),format.raw/*23.40*/("""" type=""""),_display_(/*23.49*/inputType),format.raw/*23.58*/("""" id=""""),_display_(/*23.65*/field/*23.70*/.id),format.raw/*23.73*/("""" name=""""),_display_(/*23.82*/field/*23.87*/.name),format.raw/*23.92*/("""" value=""""),_display_(/*23.102*/field/*23.107*/.value),format.raw/*23.113*/("""" """),_display_(/*23.116*/toHtmlArgs(args.filter(arg => !arg._1.name.startsWith("_") && arg._1 != 'id).toMap)),format.raw/*23.199*/(""" """),format.raw/*23.200*/("""/>
    <div class="invalid-feedback">"""),_display_(/*24.36*/{field.error.map { error => error.message }}),format.raw/*24.80*/("""</div>
    <div class="help-block">"""),_display_(/*25.30*/{args.toMap.get('_help).map(_.toString).getOrElse("")}),format.raw/*25.84*/("""</div>

</div>




"""))
      }
    }
  }

  def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:helper.FieldConstructor,lang:play.api.i18n.Lang): play.twirl.api.HtmlFormat.Appendable = apply(field,args:_*)(handler,lang)

  def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (helper.FieldConstructor,play.api.i18n.Lang) => play.twirl.api.HtmlFormat.Appendable) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Nov 11 14:08:11 IRKT 2017
                  SOURCE: E:/web/playVA/playVA/app/views/bootstrap/text.scala.html
                  HASH: ef6a550c21babccdebd8557c4f5a737b1ab24a8e
                  MATRIX: 1302->262|1494->385|1524->406|1542->415|1619->481|1634->488|1758->380|1789->403|1819->478|1850->580|1881->584|1932->608|1960->627|1999->628|2036->634|2106->677|2120->682|2144->685|2174->688|2259->751|2330->795|2358->802|2394->811|2424->820|2458->827|2472->832|2496->835|2532->844|2546->849|2572->854|2610->864|2625->869|2653->875|2684->878|2789->961|2819->962|2885->1001|2950->1045|3014->1082|3089->1136
                  LINES: 39->13|42->15|44->17|44->17|44->18|44->18|45->13|47->16|48->17|49->18|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|56->25|56->25
                  -- GENERATED --
              */
          
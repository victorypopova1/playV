
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

object textarea extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],helper.FieldConstructor,play.api.i18n.Lang,play.twirl.api.HtmlFormat.Appendable] {

  /**
* Generate an HTML input text.
*
* Example:
* {{{
* @inputText(field = myForm("name"), args = 'size -> 10, 'placeholder -> "Your name")
* }}}
*
* @param field The form field.
* @param args Set of extra attributes.
* @param handler The field constructor.
*/
  def apply/*13.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: helper.FieldConstructor, lang: play.api.i18n.Lang):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*15.2*/import helper._;

def /*16.2*/invalid/*16.9*/ = {{if (field.hasErrors){"is-invalid"} else if(!field.value.isEmpty){"is-valid"} else {""}}};
Seq[Any](format.raw/*13.120*/("""

"""),format.raw/*16.101*/("""

  """),format.raw/*18.3*/("""<div class="form-group">
    <label class="control-label" for=""""),_display_(/*19.40*/field/*19.45*/.id),format.raw/*19.48*/("""">"""),_display_(/*19.51*/{args.toMap.get('_label).map(_.toString).getOrElse(field.name)}),format.raw/*19.114*/("""</label>
    <textarea class="form-control" id="editor" name=""""),_display_(/*20.55*/field/*20.60*/.name),format.raw/*20.65*/("""" """),_display_(/*20.68*/toHtmlArgs(args.filter(arg => !arg._1.name.startsWith("_") && arg._1 != 'id).toMap)),format.raw/*20.151*/(""">"""),_display_(/*20.153*/field/*20.158*/.value),format.raw/*20.164*/("""</textarea>

    <div class="help-block">"""),_display_(/*22.30*/{args.toMap.get('_help).map(_.toString).getOrElse("")}),format.raw/*22.84*/("""</div>
  </div>
<script src=""""),_display_(/*24.15*/routes/*24.21*/.Assets.versioned("tinymce/tinymce.min.js")),format.raw/*24.64*/("""" type="text/javascript"></script>
<script type="text/javascript" src=""""),_display_(/*25.38*/routes/*25.44*/.Assets.versioned("edit.js")),format.raw/*25.72*/(""""></script>"""))
      }
    }
  }

  def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:helper.FieldConstructor,lang:play.api.i18n.Lang): play.twirl.api.HtmlFormat.Appendable = apply(field,args:_*)(handler,lang)

  def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (helper.FieldConstructor,play.api.i18n.Lang) => play.twirl.api.HtmlFormat.Appendable) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Nov 11 14:51:44 IRKT 2017
                  SOURCE: E:/web/playVA/playVA/app/views/bootstrap/textarea.scala.html
                  HASH: 2b93b89c7f87435799d2344ab3c141e3f83c3af6
                  MATRIX: 1307->262|1499->383|1529->401|1544->408|1668->380|1699->500|1730->504|1821->568|1835->573|1859->576|1889->579|1974->642|2064->705|2078->710|2104->715|2134->718|2239->801|2269->803|2284->808|2312->814|2381->856|2456->910|2513->940|2528->946|2592->989|2691->1061|2706->1067|2755->1095
                  LINES: 39->13|42->15|44->16|44->16|45->13|47->16|49->18|50->19|50->19|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|53->22|53->22|55->24|55->24|55->24|56->25|56->25|56->25
                  -- GENERATED --
              */
          
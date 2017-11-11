
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

object editor extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],helper.FieldConstructor,play.api.i18n.Lang,play.twirl.api.HtmlFormat.Appendable] {

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

"""),format.raw/*18.1*/("""<div class="form-group">

    <label class="control-label" for=""""),_display_(/*20.40*/field/*20.45*/.id),format.raw/*20.48*/("""">"""),_display_(/*20.51*/{args.toMap.get('_label).map(_.toString).getOrElse(field.name)}),format.raw/*20.114*/("""</label>
    <textarea  class="form-control" id="editor" name=""""),_display_(/*21.56*/field/*21.61*/.name),format.raw/*21.66*/("""" """),_display_(/*21.69*/toHtmlArgs(args.filter(arg => !arg._1.name.startsWith("_") && arg._1 != 'id).toMap)),format.raw/*21.152*/(""">"""),_display_(/*21.154*/field/*21.159*/.value),format.raw/*21.165*/(""" """),format.raw/*21.166*/("""</textarea>

</div>

<script src=""""),_display_(/*25.15*/routes/*25.21*/.Assets.versioned("tinymce/tinymce.min.js")),format.raw/*25.64*/("""" type="text/javascript"></script>
<script type="text/javascript" src=""""),_display_(/*26.38*/routes/*26.44*/.Assets.versioned("edit.js")),format.raw/*26.72*/(""""></script>
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
                  DATE: Sat Nov 11 14:35:32 IRKT 2017
                  SOURCE: E:/web/playVA/playVA/app/views/bootstrap/editor.scala.html
                  HASH: 32cbdb9750404419f66406d6c652c2bd9c775889
                  MATRIX: 1316->274|1508->397|1538->416|1553->423|1677->392|1710->515|1741->519|1835->586|1849->591|1873->594|1903->597|1988->660|2080->725|2094->730|2120->735|2150->738|2255->821|2285->823|2300->828|2328->834|2358->835|2424->874|2439->880|2503->923|2603->996|2618->1002|2667->1030
                  LINES: 39->13|42->15|44->16|44->16|45->13|47->16|49->18|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|56->25|56->25|56->25|57->26|57->26|57->26
                  -- GENERATED --
              */
          
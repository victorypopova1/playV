
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>Администрирование</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("vendor/bootstrap/css/bootstrap.css")),format.raw/*8.115*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">

    </head>
    <body>

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="/">Лэндинг</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href=""""),_display_(/*24.52*/routes/*24.58*/.HomeController.list()),format.raw/*24.80*/("""">Фичи <span class="sr-only"></span></a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container">
            """),_display_(/*31.14*/content),format.raw/*31.21*/("""
        """),format.raw/*32.9*/("""</div><!-- /.container -->


        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src=""""),_display_(/*38.23*/routes/*38.29*/.Assets.versioned("vendor/jquery/jquery.min.js")),format.raw/*38.77*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Nov 11 14:08:10 IRKT 2017
                  SOURCE: E:/web/playVA/playVA/app/views/main.scala.html
                  HASH: 96af4b942f56dc0f86c9fac86bd256397f79c507
                  MATRIX: 945->1|1055->16|1083->18|1238->147|1252->153|1328->208|1410->264|1424->270|1486->311|1574->372|1589->378|1650->417|2349->1089|2364->1095|2407->1117|2603->1286|2631->1293|2667->1302|2923->1531|2938->1537|3007->1585
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|56->24|56->24|56->24|63->31|63->31|64->32|70->38|70->38|70->38
                  -- GENERATED --
              */
          
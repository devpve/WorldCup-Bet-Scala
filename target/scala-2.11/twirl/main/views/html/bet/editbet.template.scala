
package views.html.bet

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editbet_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class editbet extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,models.Game,models.Bet,Form[betVO],Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(email: String, game: models.Game, bet: models.Bet, form: Form[betVO])(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

"""),_display_(/*3.2*/main("Bolão Copa 2018 - Aposta")/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""

    """),format.raw/*5.5*/("""<h1>Bolão Copa 2018 - """),_display_(/*5.28*/game/*5.32*/.teams),format.raw/*5.38*/("""</h1>

    <h2>Tem certeza que deseja editar sua aposta: """),_display_(/*7.52*/bet/*7.55*/.bet),format.raw/*7.59*/("""</h2>
    <br>
    """),_display_(/*9.6*/helper/*9.12*/.form(routes.BetController.tryEditBet(game.teams))/*9.62*/ {_display_(Seq[Any](format.raw/*9.64*/("""
        
        """),_display_(/*11.10*/form/*11.14*/.globalError.map/*11.30*/ { error =>_display_(Seq[Any](format.raw/*11.41*/("""
            """),format.raw/*12.13*/("""<p class="error">
                """),_display_(/*13.18*/error/*13.23*/.message),format.raw/*13.31*/("""
            """),format.raw/*14.13*/("""</p>
        """)))}),format.raw/*15.10*/(""" 
        
        """),_display_(/*17.10*/flash/*17.15*/.get("success").map/*17.34*/ { message =>_display_(Seq[Any](format.raw/*17.47*/("""
            """),format.raw/*18.13*/("""<p class="success">
                """),_display_(/*19.18*/message),format.raw/*19.25*/("""
            """),format.raw/*20.13*/("""</p>
        """)))}),format.raw/*21.10*/("""

        """),format.raw/*23.9*/("""<p>
            <input type="text" pattern="^\d"""),format.raw/*24.44*/("""{"""),format.raw/*24.45*/("""1,2"""),format.raw/*24.48*/("""}"""),format.raw/*24.49*/(""" """),format.raw/*24.50*/("""x \d"""),format.raw/*24.54*/("""{"""),format.raw/*24.55*/("""1,2"""),format.raw/*24.58*/("""}"""),format.raw/*24.59*/("""" name="bet" placeholder="00 x 00" id="bet" value=""""),_display_(/*24.111*/form("bet")/*24.122*/.value),format.raw/*24.128*/("""">
        </p>
        <p>
            <button type="submit" id="betButton">Editar</button>
        </p>
        
    """)))}),format.raw/*30.6*/("""

    """),format.raw/*32.5*/("""<br>
    <br>
    <br>
    <br>
    <button id="returnButton"><a href=""""),_display_(/*36.41*/routes/*36.47*/.Restricted.index),format.raw/*36.64*/("""">Retornar</a></button>
    <button id="logoutButton"><a href=""""),_display_(/*37.41*/routes/*37.47*/.Authentication.logout),format.raw/*37.69*/("""">Logout</a></button>
    
""")))}),format.raw/*39.2*/("""
"""))
      }
    }
  }

  def render(email:String,game:models.Game,bet:models.Bet,form:Form[betVO],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(email,game,bet,form)(flash)

  def f:((String,models.Game,models.Bet,Form[betVO]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (email,game,bet,form) => (flash) => apply(email,game,bet,form)(flash)

  def ref: this.type = this

}


}

/**/
object editbet extends editbet_Scope0.editbet
              /*
                  -- GENERATED --
                  DATE: Mon Jul 02 18:26:57 BRT 2018
                  SOURCE: /home/pv/Documents/bolaoCopa/app/views/bet/editbet.scala.html
                  HASH: 3a772e3b38b1868dd05d06cf32d638b4e4ebb54a
                  MATRIX: 576->1|764->94|792->97|832->129|871->131|903->137|952->160|964->164|990->170|1074->228|1085->231|1109->235|1154->255|1168->261|1226->311|1265->313|1311->332|1324->336|1349->352|1398->363|1439->376|1501->411|1515->416|1544->424|1585->437|1630->451|1677->471|1691->476|1719->495|1770->508|1811->521|1875->558|1903->565|1944->578|1989->592|2026->602|2101->649|2130->650|2161->653|2190->654|2219->655|2251->659|2280->660|2311->663|2340->664|2420->716|2441->727|2469->733|2619->853|2652->859|2751->931|2766->937|2804->954|2895->1018|2910->1024|2953->1046|3011->1074
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|29->5|29->5|29->5|31->7|31->7|31->7|33->9|33->9|33->9|33->9|35->11|35->11|35->11|35->11|36->12|37->13|37->13|37->13|38->14|39->15|41->17|41->17|41->17|41->17|42->18|43->19|43->19|44->20|45->21|47->23|48->24|48->24|48->24|48->24|48->24|48->24|48->24|48->24|48->24|48->24|48->24|48->24|54->30|56->32|60->36|60->36|60->36|61->37|61->37|61->37|63->39
                  -- GENERATED --
              */
          

package views.html.bet

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newbet_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class newbet extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,models.Game,Form[betVO],Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(email: String, game: models.Game, form: Form[betVO])(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.78*/("""

"""),_display_(/*3.2*/main("Bolão Copa 2018 - Aposta")/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""

        """),format.raw/*5.9*/("""<h1 align="center">Bolão Copa 2018 - """),_display_(/*5.47*/game/*5.51*/.teams),format.raw/*5.57*/("""</h1>

        <h4>Faça uma nova aposta!</h4>
        <br>
        <br>
        """),_display_(/*10.10*/helper/*10.16*/.form(routes.BetController.tryNewBet(game.teams))/*10.65*/ {_display_(Seq[Any](format.raw/*10.67*/("""
            
        """),_display_(/*12.10*/form/*12.14*/.globalError.map/*12.30*/ { error =>_display_(Seq[Any](format.raw/*12.41*/("""
            """),format.raw/*13.13*/("""<p class="error">
                """),_display_(/*14.18*/error/*14.23*/.message),format.raw/*14.31*/("""
            """),format.raw/*15.13*/("""</p>
        """)))}),format.raw/*16.10*/(""" 
        
        """),_display_(/*18.10*/flash/*18.15*/.get("success").map/*18.34*/ { message =>_display_(Seq[Any](format.raw/*18.47*/("""
            """),format.raw/*19.13*/("""<p class="success">
                """),_display_(/*20.18*/message),format.raw/*20.25*/("""
            """),format.raw/*21.13*/("""</p>
        """)))}),format.raw/*22.10*/("""
            """),format.raw/*23.13*/("""<p>
                <input type="text" pattern="^\d"""),format.raw/*24.48*/("""{"""),format.raw/*24.49*/("""1,2"""),format.raw/*24.52*/("""}"""),format.raw/*24.53*/(""" """),format.raw/*24.54*/("""x \d"""),format.raw/*24.58*/("""{"""),format.raw/*24.59*/("""1,2"""),format.raw/*24.62*/("""}"""),format.raw/*24.63*/("""" name="bet" placeholder="00 x 00" id="bet" value=""""),_display_(/*24.115*/form("bet")/*24.126*/.value),format.raw/*24.132*/("""">
            </p>
            <p>
                <button type="submit" id="betButton">Cadastro</button>
            </p>

    """)))}),format.raw/*30.6*/("""

    """),format.raw/*32.5*/("""<br>
    <br>
    <br>
    <br>
    <button id="returnButton"><a href=""""),_display_(/*36.41*/routes/*36.47*/.Restricted.index),format.raw/*36.64*/("""">Retornar</a></button>
    <button id="logoutButton"><a href=""""),_display_(/*37.41*/routes/*37.47*/.Authentication.logout),format.raw/*37.69*/("""">Logout</a></button>
    
""")))}))
      }
    }
  }

  def render(email:String,game:models.Game,form:Form[betVO],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(email,game,form)(flash)

  def f:((String,models.Game,Form[betVO]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (email,game,form) => (flash) => apply(email,game,form)(flash)

  def ref: this.type = this

}


}

/**/
object newbet extends newbet_Scope0.newbet
              /*
                  -- GENERATED --
                  DATE: Mon Jul 02 18:26:57 BRT 2018
                  SOURCE: /home/pv/Documents/bolaoCopa/app/views/bet/newbet.scala.html
                  HASH: aa08ec0c1cf72da3c3ddc76ca60973d44e774f50
                  MATRIX: 563->1|734->77|762->80|802->112|841->114|877->124|941->162|953->166|979->172|1087->253|1102->259|1160->308|1200->310|1250->333|1263->337|1288->353|1337->364|1378->377|1440->412|1454->417|1483->425|1524->438|1569->452|1616->472|1630->477|1658->496|1709->509|1750->522|1814->559|1842->566|1883->579|1928->593|1969->606|2048->657|2077->658|2108->661|2137->662|2166->663|2198->667|2227->668|2258->671|2287->672|2367->724|2388->735|2416->741|2576->871|2609->877|2708->949|2723->955|2761->972|2852->1036|2867->1042|2910->1064
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|29->5|29->5|29->5|34->10|34->10|34->10|34->10|36->12|36->12|36->12|36->12|37->13|38->14|38->14|38->14|39->15|40->16|42->18|42->18|42->18|42->18|43->19|44->20|44->20|45->21|46->22|47->23|48->24|48->24|48->24|48->24|48->24|48->24|48->24|48->24|48->24|48->24|48->24|48->24|54->30|56->32|60->36|60->36|60->36|61->37|61->37|61->37
                  -- GENERATED --
              */
          
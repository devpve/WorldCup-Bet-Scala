
package views.html.bet

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object deletebet_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class deletebet extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,models.Game,models.Bet,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(email: String, game: models.Game, bet: models.Bet)(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.76*/("""

"""),_display_(/*3.2*/main("Bolão Copa 2018 - Aposta")/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""

    """),format.raw/*5.5*/("""<h1>Bolão Copa 2018 - """),_display_(/*5.28*/game/*5.32*/.teams),format.raw/*5.38*/(""" """),format.raw/*5.39*/("""- """),_display_(/*5.42*/game/*5.46*/.datetime),format.raw/*5.55*/(""" """),format.raw/*5.56*/("""</h1>

    """),_display_(/*7.6*/helper/*7.12*/.form(routes.BetController.tryDeleteBet(game.teams))/*7.64*/ {_display_(Seq[Any](format.raw/*7.66*/("""
        """),format.raw/*8.9*/("""<h2>Tem certeza que deseja deletar sua aposta: """),_display_(/*8.57*/bet/*8.60*/.bet),format.raw/*8.64*/("""</h2>
        <br>
        <button type="submit" id="deleteButton">Deletar</button>
    """)))}),format.raw/*11.6*/("""

    """),format.raw/*13.5*/("""<br>
    <br>
    <br>
    <br>
    <button id="returnButton"><a href=""""),_display_(/*17.41*/routes/*17.47*/.Restricted.index),format.raw/*17.64*/("""">Retornar</a></button>
    <button id="logoutButton"><a href=""""),_display_(/*18.41*/routes/*18.47*/.Authentication.logout),format.raw/*18.69*/("""">Logout</a></button>
    
""")))}))
      }
    }
  }

  def render(email:String,game:models.Game,bet:models.Bet,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(email,game,bet)(flash)

  def f:((String,models.Game,models.Bet) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (email,game,bet) => (flash) => apply(email,game,bet)(flash)

  def ref: this.type = this

}


}

/**/
object deletebet extends deletebet_Scope0.deletebet
              /*
                  -- GENERATED --
                  DATE: Mon Jul 02 18:26:57 BRT 2018
                  SOURCE: /home/pv/Documents/bolaoCopa/app/views/bet/deletebet.scala.html
                  HASH: 2ab555ad1a8ab97c6703b70bdf15b83799de7f41
                  MATRIX: 568->1|737->75|765->78|805->110|844->112|876->118|925->141|937->145|963->151|991->152|1020->155|1032->159|1061->168|1089->169|1126->181|1140->187|1200->239|1239->241|1274->250|1348->298|1359->301|1383->305|1502->394|1535->400|1634->472|1649->478|1687->495|1778->559|1793->565|1836->587
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|29->5|29->5|29->5|29->5|29->5|29->5|29->5|29->5|31->7|31->7|31->7|31->7|32->8|32->8|32->8|32->8|35->11|37->13|41->17|41->17|41->17|42->18|42->18|42->18
                  -- GENERATED --
              */
          
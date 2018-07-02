
package views.html.bet

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mainpage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class mainpage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.User,List[Game],List[Bet],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, games: List[Game], bets: List[Bet]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),_display_(/*3.2*/main("Bolão Copa 2018")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

    """),format.raw/*5.5*/("""<h1 align="center">Bolão Copa 2018</h1>

    <h3>Bem vindo, <strong>"""),_display_(/*7.29*/user/*7.33*/.name),format.raw/*7.38*/("""</strong> !</h3>
    <br>
    <h2 align="center"> Próximos Jogos </h2>
    <table align="center" class="table table-striped table-bordered table-hover" cellspacing="15">
    <thead>
      <tr>
          <th>Jogo</th>
          <th>Data</th>
          <th>Local</th>
          <th>Ação</th>
      </tr>
    </thead>
		"""),_display_(/*19.4*/for(game <- games) yield /*19.22*/ {_display_(Seq[Any](format.raw/*19.24*/("""
      """),format.raw/*20.7*/("""<tfoot>
        <tr>
			    <th>"""),_display_(/*22.13*/game/*22.17*/.teams),format.raw/*22.23*/("""</th>
          <th>("""),_display_(/*23.17*/game/*23.21*/.datetime),format.raw/*23.30*/(""")</th> 
          <th>"""),_display_(/*24.16*/game/*24.20*/.place),format.raw/*24.26*/("""</th>
          <th><a href=""""),_display_(/*25.25*/routes/*25.31*/.BetController.newBet(game.teams)),format.raw/*25.64*/("""">Apostar</a></th>
        </tr>
		  </tfoot>
    """)))}),format.raw/*28.6*/("""
   """),format.raw/*29.4*/("""</table>

   <br><br><h2 align="center"> Minhas Apostas </h2><br>
    <table align="center" class="table table-striped table-bordered table-hover" cellspacing="0">
      <thead>
        <tr>
          <th>Jogo</th>
          <th>Aposta</th>
          <th>Editar</th>
          <th>Deletar</th>
        </tr>
      </thead>   		
      """),_display_(/*41.8*/for(bet <- bets) yield /*41.24*/ {_display_(Seq[Any](format.raw/*41.26*/("""
   			"""),format.raw/*42.7*/("""<tfoot>
          <tr>
    				<th>"""),_display_(/*44.14*/games/*44.19*/.find(_.id == bet.gameID).get.teams),format.raw/*44.54*/("""</th>
            <th>"""),_display_(/*45.18*/bet/*45.21*/.bet),format.raw/*45.25*/("""</th>
            <th><a href=""""),_display_(/*46.27*/routes/*46.33*/.BetController.editBet(games.find(_.id == bet.gameID).get.teams)),format.raw/*46.97*/("""">Editar</a></th>
            <th><a href=""""),_display_(/*47.27*/routes/*47.33*/.BetController.deleteBet(games.find(_.id == bet.gameID).get.teams)),format.raw/*47.99*/("""">Deletar</a></th>
          </tr>
        </tfoot>
   		""")))}),format.raw/*50.7*/("""
    """),format.raw/*51.5*/("""</table>

    <br>
    <br>
    <br>
    <br>
    <button id="returnButton"><a href=""""),_display_(/*57.41*/routes/*57.47*/.Restricted.index),format.raw/*57.64*/("""">Retornar</a></button>
    <button id="logoutButton"><a href=""""),_display_(/*58.41*/routes/*58.47*/.Authentication.logout),format.raw/*58.69*/("""">Logout</a></button>
""")))}))
      }
    }
  }

  def render(user:models.User,games:List[Game],bets:List[Bet]): play.twirl.api.HtmlFormat.Appendable = apply(user,games,bets)

  def f:((models.User,List[Game],List[Bet]) => play.twirl.api.HtmlFormat.Appendable) = (user,games,bets) => apply(user,games,bets)

  def ref: this.type = this

}


}

/**/
object mainpage extends mainpage_Scope0.mainpage
              /*
                  -- GENERATED --
                  DATE: Mon Jul 02 18:26:57 BRT 2018
                  SOURCE: /home/pv/Documents/bolaoCopa/app/views/bet/mainpage.scala.html
                  HASH: e61057cf78aa8d2a812362de7e5bc000f2e66e1c
                  MATRIX: 563->1|713->56|741->59|772->82|811->84|843->90|938->159|950->163|975->168|1319->486|1353->504|1393->506|1427->513|1487->546|1500->550|1527->556|1576->578|1589->582|1619->591|1669->614|1682->618|1709->624|1766->654|1781->660|1835->693|1916->744|1947->748|2308->1083|2340->1099|2380->1101|2414->1108|2477->1144|2491->1149|2547->1184|2597->1207|2609->1210|2634->1214|2693->1246|2708->1252|2793->1316|2864->1360|2879->1366|2966->1432|3054->1490|3086->1495|3199->1581|3214->1587|3252->1604|3343->1668|3358->1674|3401->1696
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|31->7|31->7|31->7|43->19|43->19|43->19|44->20|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|52->28|53->29|65->41|65->41|65->41|66->42|68->44|68->44|68->44|69->45|69->45|69->45|70->46|70->46|70->46|71->47|71->47|71->47|74->50|75->51|81->57|81->57|81->57|82->58|82->58|82->58
                  -- GENERATED --
              */
          
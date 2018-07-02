
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[scala.Tuple3[String, String, String]],Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[(String,String, String)])(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.62*/("""

"""),_display_(/*3.2*/main("Bolão Copa 2018 - Cadastro")/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""
    
    """),format.raw/*5.5*/("""<h1>Bolão Copa 2018 - Cadastro</h1>

    <p>Por favor informe suas credenciais</p>

    <br>

    """),_display_(/*11.6*/helper/*11.12*/.form(routes.SignUp.trySignUp)/*11.42*/ {_display_(Seq[Any](format.raw/*11.44*/("""
        
        """),_display_(/*13.10*/form/*13.14*/.globalError.map/*13.30*/ { error =>_display_(Seq[Any](format.raw/*13.41*/("""
            """),format.raw/*14.13*/("""<p class="error">
                """),_display_(/*15.18*/error/*15.23*/.message),format.raw/*15.31*/("""
            """),format.raw/*16.13*/("""</p>
        """)))}),format.raw/*17.10*/(""" 
        
        """),_display_(/*19.10*/flash/*19.15*/.get("success").map/*19.34*/ { message =>_display_(Seq[Any](format.raw/*19.47*/("""
            """),format.raw/*20.13*/("""<p class="success">
                """),_display_(/*21.18*/message),format.raw/*21.25*/("""
            """),format.raw/*22.13*/("""</p>
        """)))}),format.raw/*23.10*/("""
        
        """),format.raw/*25.9*/("""<p>
            <input type="text" name="name" placeholder="Nome" id="name" value=""""),_display_(/*26.81*/form("name")/*26.93*/.value),format.raw/*26.99*/("""">
        </p>
        <p>
            <input type="email" name="email" placeholder="Email" id="email" value=""""),_display_(/*29.85*/form("email")/*29.98*/.value),format.raw/*29.104*/("""">
        </p>
        <p>
            <input type="password" name="password" id="password" placeholder="Senha">
        </p>
        <p>
            <button type="submit" id="button">Cadastro</button>
        </p>
        
    """)))}),format.raw/*38.6*/("""
    
""")))}),format.raw/*40.2*/("""

"""))
      }
    }
  }

  def render(form:Form[scala.Tuple3[String, String, String]],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash)

  def f:((Form[scala.Tuple3[String, String, String]]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash) => apply(form)(flash)

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Mon Jul 02 17:42:47 BRT 2018
                  SOURCE: /home/pv/Documents/bolaoCopa/app/views/user/signup.scala.html
                  HASH: 12bcce02b159d30fc93118d2acaf695a759d6324
                  MATRIX: 576->1|731->61|759->64|801->98|840->100|876->110|1001->209|1016->215|1055->245|1095->247|1141->266|1154->270|1179->286|1228->297|1269->310|1331->345|1345->350|1374->358|1415->371|1460->385|1507->405|1521->410|1549->429|1600->442|1641->455|1705->492|1733->499|1774->512|1819->526|1864->544|1975->628|1996->640|2023->646|2162->758|2184->771|2212->777|2472->1007|2509->1014
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|35->11|35->11|35->11|35->11|37->13|37->13|37->13|37->13|38->14|39->15|39->15|39->15|40->16|41->17|43->19|43->19|43->19|43->19|44->20|45->21|45->21|46->22|47->23|49->25|50->26|50->26|50->26|53->29|53->29|53->29|62->38|64->40
                  -- GENERATED --
              */
          
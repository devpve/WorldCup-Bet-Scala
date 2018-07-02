
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Bolão Copa 2018")/*1.25*/ {_display_(Seq[Any](format.raw/*1.27*/("""
  """),format.raw/*2.3*/("""<br><h1 align="center">Bem vindo ao Bolão Copa 2018</h1></br></br>
  <ul>
      <button id="buttonLogin"><a href=""""),_display_(/*4.42*/routes/*4.48*/.Authentication.login),format.raw/*4.69*/(""""><div class="btn tn-primary">Login</div></a></button>
      <button id="buttonCadastro"><a href=""""),_display_(/*5.45*/routes/*5.51*/.SignUp.signUp),format.raw/*5.65*/("""">Cadastro</a></button>
  </ul>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Jul 02 17:48:26 BRT 2018
                  SOURCE: /home/pv/Documents/bolaoCopa/app/views/index.scala.html
                  HASH: 70dab6c14add05d81ef1fede6aa6e33aa36fa487
                  MATRIX: 609->1|640->24|679->26|708->29|849->144|863->150|904->171|1029->270|1043->276|1077->290
                  LINES: 25->1|25->1|25->1|26->2|28->4|28->4|28->4|29->5|29->5|29->5
                  -- GENERATED --
              */
          

package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[scala.Tuple2[String, String]],Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[(String,String)])(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/main("Bem vindo ao Bolão da Copa de 2018")/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""

    """),format.raw/*5.5*/("""<h1>Bolão Copa 2018 - Login</h1>

    <p>Por favor informe suas credenciais.</p>
    <br>
    <br>
    """),_display_(/*10.6*/helper/*10.12*/.form(routes.Authentication.authenticate)/*10.53*/ {_display_(Seq[Any](format.raw/*10.55*/("""
        
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
        
        """),format.raw/*24.9*/("""<p>
            <input type="email" name="email" placeholder="Email" id="email" value=""""),_display_(/*25.85*/form("email")/*25.98*/.value),format.raw/*25.104*/("""">
        </p>
        <p>
            <input type="password" name="password" id="password" placeholder="Senha">
        </p>

        <p>
            <button type="submit" id="button">Login</button>
        </p>
        
    """)))}),format.raw/*35.6*/("""
    
""")))}))
      }
    }
  }

  def render(form:Form[scala.Tuple2[String, String]],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash)

  def f:((Form[scala.Tuple2[String, String]]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash) => apply(form)(flash)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Mon Jul 02 17:42:47 BRT 2018
                  SOURCE: /home/pv/Documents/bolaoCopa/app/views/user/login.scala.html
                  HASH: f3f1165f3ddb6abfcd149855ec7b492d6b140e63
                  MATRIX: 566->1|713->53|741->56|791->98|830->100|862->106|992->210|1007->216|1057->257|1097->259|1143->278|1156->282|1181->298|1230->309|1271->322|1333->357|1347->362|1376->370|1417->383|1462->397|1509->417|1523->422|1551->441|1602->454|1643->467|1707->504|1735->511|1776->524|1821->538|1866->556|1981->644|2003->657|2031->663|2289->891
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|34->10|34->10|34->10|34->10|36->12|36->12|36->12|36->12|37->13|38->14|38->14|38->14|39->15|40->16|42->18|42->18|42->18|42->18|43->19|44->20|44->20|45->21|46->22|48->24|49->25|49->25|49->25|59->35
                  -- GENERATED --
              */
          

// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pv/Documents/bolaoCopa/conf/routes
// @DATE:Mon Jul 02 17:55:38 BRT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Restricted_3: controllers.Restricted,
  // @LINE:10
  Authentication_0: controllers.Authentication,
  // @LINE:18
  SignUp_1: controllers.SignUp,
  // @LINE:22
  BetController_4: controllers.BetController,
  // @LINE:33
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Restricted_3: controllers.Restricted,
    // @LINE:10
    Authentication_0: controllers.Authentication,
    // @LINE:18
    SignUp_1: controllers.SignUp,
    // @LINE:22
    BetController_4: controllers.BetController,
    // @LINE:33
    Assets_2: controllers.Assets
  ) = this(errorHandler, Restricted_3, Authentication_0, SignUp_1, BetController_4, Assets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Restricted_3, Authentication_0, SignUp_1, BetController_4, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Restricted.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Authentication.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Authentication.authenticate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Authentication.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """main""", """controllers.Restricted.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.SignUp.signUp"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.SignUp.trySignUp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aposta/""" + "$" + """game<[^/]+>""", """controllers.BetController.newBet(game:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aposta/""" + "$" + """game<[^/]+>""", """controllers.BetController.tryNewBet(game:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aposta/edit/""" + "$" + """game<[^/]+>""", """controllers.BetController.editBet(game:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aposta/edit/""" + "$" + """game<[^/]+>""", """controllers.BetController.tryEditBet(game:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aposta/delete/""" + "$" + """game<[^/]+>""", """controllers.BetController.deleteBet(game:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aposta/delete/""" + "$" + """game<[^/]+>""", """controllers.BetController.tryDeleteBet(game:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Restricted_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Restricted_index0_invoker = createInvoker(
    Restricted_3.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Restricted",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Authentication_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Authentication_login1_invoker = createInvoker(
    Authentication_0.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "login",
      Nil,
      "GET",
      """ Autenticacao""",
      this.prefix + """login"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Authentication_authenticate2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Authentication_authenticate2_invoker = createInvoker(
    Authentication_0.authenticate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Authentication_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Authentication_logout3_invoker = createInvoker(
    Authentication_0.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Restricted_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("main")))
  )
  private[this] lazy val controllers_Restricted_index4_invoker = createInvoker(
    Restricted_3.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Restricted",
      "index",
      Nil,
      "GET",
      """ Area restritra""",
      this.prefix + """main"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_SignUp_signUp5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_SignUp_signUp5_invoker = createInvoker(
    SignUp_1.signUp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUp",
      "signUp",
      Nil,
      "GET",
      """ Cadastro""",
      this.prefix + """signup"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_SignUp_trySignUp6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_SignUp_trySignUp6_invoker = createInvoker(
    SignUp_1.trySignUp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUp",
      "trySignUp",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_BetController_newBet7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aposta/"), DynamicPart("game", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BetController_newBet7_invoker = createInvoker(
    BetController_4.newBet(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BetController",
      "newBet",
      Seq(classOf[String]),
      "GET",
      """ Aposta""",
      this.prefix + """aposta/""" + "$" + """game<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_BetController_tryNewBet8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aposta/"), DynamicPart("game", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BetController_tryNewBet8_invoker = createInvoker(
    BetController_4.tryNewBet(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BetController",
      "tryNewBet",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """aposta/""" + "$" + """game<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_BetController_editBet9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aposta/edit/"), DynamicPart("game", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BetController_editBet9_invoker = createInvoker(
    BetController_4.editBet(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BetController",
      "editBet",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """aposta/edit/""" + "$" + """game<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_BetController_tryEditBet10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aposta/edit/"), DynamicPart("game", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BetController_tryEditBet10_invoker = createInvoker(
    BetController_4.tryEditBet(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BetController",
      "tryEditBet",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """aposta/edit/""" + "$" + """game<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_BetController_deleteBet11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aposta/delete/"), DynamicPart("game", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BetController_deleteBet11_invoker = createInvoker(
    BetController_4.deleteBet(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BetController",
      "deleteBet",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """aposta/delete/""" + "$" + """game<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_BetController_tryDeleteBet12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aposta/delete/"), DynamicPart("game", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BetController_tryDeleteBet12_invoker = createInvoker(
    BetController_4.tryDeleteBet(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BetController",
      "tryDeleteBet",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """aposta/delete/""" + "$" + """game<[^/]+>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Assets_at13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at13_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Restricted_index0_route(params) =>
      call { 
        controllers_Restricted_index0_invoker.call(Restricted_3.index)
      }
  
    // @LINE:10
    case controllers_Authentication_login1_route(params) =>
      call { 
        controllers_Authentication_login1_invoker.call(Authentication_0.login)
      }
  
    // @LINE:11
    case controllers_Authentication_authenticate2_route(params) =>
      call { 
        controllers_Authentication_authenticate2_invoker.call(Authentication_0.authenticate)
      }
  
    // @LINE:12
    case controllers_Authentication_logout3_route(params) =>
      call { 
        controllers_Authentication_logout3_invoker.call(Authentication_0.logout)
      }
  
    // @LINE:15
    case controllers_Restricted_index4_route(params) =>
      call { 
        controllers_Restricted_index4_invoker.call(Restricted_3.index)
      }
  
    // @LINE:18
    case controllers_SignUp_signUp5_route(params) =>
      call { 
        controllers_SignUp_signUp5_invoker.call(SignUp_1.signUp)
      }
  
    // @LINE:19
    case controllers_SignUp_trySignUp6_route(params) =>
      call { 
        controllers_SignUp_trySignUp6_invoker.call(SignUp_1.trySignUp)
      }
  
    // @LINE:22
    case controllers_BetController_newBet7_route(params) =>
      call(params.fromPath[String]("game", None)) { (game) =>
        controllers_BetController_newBet7_invoker.call(BetController_4.newBet(game))
      }
  
    // @LINE:23
    case controllers_BetController_tryNewBet8_route(params) =>
      call(params.fromPath[String]("game", None)) { (game) =>
        controllers_BetController_tryNewBet8_invoker.call(BetController_4.tryNewBet(game))
      }
  
    // @LINE:25
    case controllers_BetController_editBet9_route(params) =>
      call(params.fromPath[String]("game", None)) { (game) =>
        controllers_BetController_editBet9_invoker.call(BetController_4.editBet(game))
      }
  
    // @LINE:26
    case controllers_BetController_tryEditBet10_route(params) =>
      call(params.fromPath[String]("game", None)) { (game) =>
        controllers_BetController_tryEditBet10_invoker.call(BetController_4.tryEditBet(game))
      }
  
    // @LINE:28
    case controllers_BetController_deleteBet11_route(params) =>
      call(params.fromPath[String]("game", None)) { (game) =>
        controllers_BetController_deleteBet11_invoker.call(BetController_4.deleteBet(game))
      }
  
    // @LINE:29
    case controllers_BetController_tryDeleteBet12_route(params) =>
      call(params.fromPath[String]("game", None)) { (game) =>
        controllers_BetController_tryDeleteBet12_invoker.call(BetController_4.tryDeleteBet(game))
      }
  
    // @LINE:33
    case controllers_Assets_at13_route(params) =>
      call(Param[String]("path", Right("/public/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at13_invoker.call(Assets_2.at(path, file))
      }
  }
}

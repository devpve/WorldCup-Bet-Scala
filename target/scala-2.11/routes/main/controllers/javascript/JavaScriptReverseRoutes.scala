
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pv/Documents/bolaoCopa/conf/routes
// @DATE:Mon Jul 02 17:55:38 BRT 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:33
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAuthentication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:11
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:10
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseSignUp(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUp.signUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:19
    def trySignUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUp.trySignUp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseBetController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def newBet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BetController.newBet",
      """
        function(game0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aposta/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("game", encodeURIComponent(game0))})
        }
      """
    )
  
    // @LINE:29
    def tryDeleteBet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BetController.tryDeleteBet",
      """
        function(game0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "aposta/delete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("game", encodeURIComponent(game0))})
        }
      """
    )
  
    // @LINE:23
    def tryNewBet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BetController.tryNewBet",
      """
        function(game0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "aposta/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("game", encodeURIComponent(game0))})
        }
      """
    )
  
    // @LINE:26
    def tryEditBet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BetController.tryEditBet",
      """
        function(game0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "aposta/edit/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("game", encodeURIComponent(game0))})
        }
      """
    )
  
    // @LINE:28
    def deleteBet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BetController.deleteBet",
      """
        function(game0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aposta/delete/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("game", encodeURIComponent(game0))})
        }
      """
    )
  
    // @LINE:25
    def editBet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BetController.editBet",
      """
        function(game0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aposta/edit/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("game", encodeURIComponent(game0))})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseRestricted(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Restricted.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }


}

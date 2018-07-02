
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pv/Documents/bolaoCopa/conf/routes
// @DATE:Mon Jul 02 17:55:38 BRT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

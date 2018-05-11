// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agile-monkey-g3/Dev/expert-monkey/conf/routes
// @DATE:Fri May 11 09:34:09 COT 2018


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

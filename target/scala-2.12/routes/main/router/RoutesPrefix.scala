// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agile-monkey-g3/Dev/play-framework/expert-system/conf/routes
// @DATE:Wed May 02 20:38:22 COT 2018


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


// @GENERATOR:play-routes-compiler
// @SOURCE:E:/web/playVA/playVA/conf/routes
// @DATE:Sat Nov 11 14:08:08 IRKT 2017


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

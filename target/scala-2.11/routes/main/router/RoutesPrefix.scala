
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Documents/study-play/LoginProject/conf/routes
// @DATE:Tue Mar 07 06:34:02 IST 2017


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

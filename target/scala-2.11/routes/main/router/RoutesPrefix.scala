
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knoldus/Documents/study-play/Play-Assignment-Jatin_Demla/conf/routes
// @DATE:Fri Mar 10 07:56:47 IST 2017


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

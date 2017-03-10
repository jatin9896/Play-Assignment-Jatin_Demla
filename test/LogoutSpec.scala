import org.scalatestplus.play.{OneAppPerTest, PlaySpec}
import play.api.test.FakeRequest
import play.api.test.Helpers._

/**
  * Created by knoldus on 9/3/17.
  */
class LogoutSpec extends PlaySpec with OneAppPerTest {

  "LogoutController" should {

    "redirect to Login page " in {
      val home = route(app, FakeRequest(GET, "/logout")).get

      status(home) equals 303
    }
  }
}

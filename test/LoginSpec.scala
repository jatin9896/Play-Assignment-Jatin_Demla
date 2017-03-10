import org.scalatestplus.play.{OneAppPerTest, PlaySpec}
import play.api.test.FakeRequest
import play.api.test.Helpers._

/**
  * Created by knoldus on 9/3/17.
  */
class LoginSpec extends PlaySpec with OneAppPerTest {

  "LoginController" should {
    "show login page" in {
      val home = route(app, FakeRequest(GET, "/login")).get
      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include("Login")
    }
  }

}
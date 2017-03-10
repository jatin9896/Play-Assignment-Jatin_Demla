import models.User
import org.scalatestplus.play.{OneAppPerTest, PlaySpec}
import play.api.mvc.Results
import play.api.test.FakeRequest
import play.api.test.Helpers._
import services.DataService
import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito.when


class SignUpSpec extends PlaySpec with OneAppPerTest with Results with MockitoSugar {

  "SignUpController" should {
    "show signup page" in {
      val home = route(app, FakeRequest(GET, "/signup")).get
      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include("Submit")
    }
  }

  "SignupController" should {

    "render the Profile page" in {
      val mockDataService = mock[DataService]
      when(mockDataService.write(models.User("hello","password","fname","mname","lname","1234567890",true,true))) thenReturn ""
      val home = route(app, FakeRequest(POST, "/submit")).get
      status(home) equals 303
      contentType(home) mustBe Some("text/html")
    //  contentAsString(home) must include("User")
    }

  }
}

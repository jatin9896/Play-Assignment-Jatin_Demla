import org.scalatest.mock.MockitoSugar
import org.scalatestplus.play.PlaySpec
import play.api.cache.CacheApi
import services.CacheService
import org.mockito.Mockito._
import models.User

class CacheServiceSpec extends PlaySpec with MockitoSugar{

  "CacheService should " should {

    "write one user object in empty ccache" in {
      val cache = mock[CacheApi]
      val cacheService = new CacheService(cache)
      val newUser = models.User("hello","password","fname","mname","lname","1234567890",true,true)
      when(cache.get[List[String]]("userList")) thenReturn Some(List[String]())
      cacheService.write(newUser) mustBe "hello"
    }

  }

}

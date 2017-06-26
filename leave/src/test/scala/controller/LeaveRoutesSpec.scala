package controller

import akka.http.scaladsl.testkit.ScalatestRouteTest
import com.knoldus.LeaveRoutes
import org.scalatest.{Matchers, WordSpec}

/**
  * Created by akash on 23/6/17.
  */
class LeaveRoutesSpec extends WordSpec with Matchers with ScalatestRouteTest {

  val leaveRoutes = new LeaveRoutes


  "Routes" should {

    "be able to validate get call" in {
      Get("/getData") ~> leaveRoutes.leaveRoutes ~> check {
        val response = responseAs[String]
        response shouldEqual "Get data"
      }
    }

    "be able to validate Post call" in {
      Post("/empSignUp") ~> leaveRoutes.leaveRoutes ~> check {
        val response = responseAs[String]
        response shouldEqual "Employee SignUp Working Fine"
      }
    }

    "be able to validate Login call" in {
      Post("/empLogin") ~> leaveRoutes.leaveRoutes ~> check {
        val response = responseAs[String]
        response shouldEqual "Employee Login"
      }
    }

    "be able to validate teamSignUp call" in {
      Post("/teamSignUp") ~> leaveRoutes.leaveRoutes ~> check {
        val response = responseAs[String]
        response shouldEqual "Team Sign Up"
      }
    }

    "be able to validate leave call" in {
      Post("/leave") ~> leaveRoutes.leaveRoutes ~> check {
        val response = responseAs[String]
        response shouldEqual "Leave Form"
      }
    }

    "be able to validate details call" in {
      Get("/details") ~> leaveRoutes.leaveRoutes ~> check {
        val response = responseAs[String]
        response shouldEqual "Employee Detail"
      }
    }
  }
}

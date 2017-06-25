package com.knoldus.controller

import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{Matchers, WordSpec}

/**
  * Created by akash on 23/6/17.
  */
class WordPressRoutesSpec extends WordSpec with Matchers with ScalatestRouteTest {

  val wordPressRoute = new WordPressRoutes

  "Routes" should {

    "be able to validate get call" in {
      Get("/getData") ~> wordPressRoute.wordPressRoute ~> check {
        val response = responseAs[String]
        response shouldEqual "Working Fine"
      }
    }
  }
}

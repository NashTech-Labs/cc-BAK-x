package com.knoldus.controller

import akka.http.scaladsl.model.{HttpResponse, StatusCodes}
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.{ExceptionHandler, Route}

class WordPressRoutes {

  val wordPressRoute: Route = {
    path("getData") {
      get {
        complete {
          HttpResponse(StatusCodes.OK, entity = "Working Fine")
        }
      }
    }
  }

}

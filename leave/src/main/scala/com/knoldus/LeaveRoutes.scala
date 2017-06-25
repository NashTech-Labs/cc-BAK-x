package com.knoldus

import akka.http.scaladsl.model.{HttpResponse, StatusCodes}
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import com.google.inject.Inject
import com.typesafe.config.ConfigFactory

/**
  * Created by akash on 23/6/17.
  */
class LeaveRoutes @Inject()() {

  val config = ConfigFactory.load("application.conf")

  val leaveRoutes: Route = {
    post {
      path("empSignUp") {
        entity(as[String]) { _ =>
          complete {
            HttpResponse(StatusCodes.OK, entity = "Employee SignUp Working Fine")
          }
        }
      }
    } ~ path("getData") {
      get {
        complete {
          HttpResponse(StatusCodes.OK, entity = "Get data")
        }
      }
    } ~ path("empLogin") {
      post {
        complete {
          HttpResponse(StatusCodes.OK, entity = "Employee Login")
        }
      }
    } ~ path("teamSignUp") {
      post {
        complete {
          HttpResponse(StatusCodes.OK, entity = "Team Sign Up")
        }
      }
    } ~ path("leave") {
      post {
        complete {
          HttpResponse(StatusCodes.OK, entity = "Leave Form")
        }
      }
    } ~ path("details") {
      get {
        complete {
          HttpResponse(StatusCodes.OK, entity = "Employee Detail")
        }
      }
    }

  }
}

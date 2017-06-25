package com.knoldus

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer

/**
  * Created by akash on 23/6/17.
  */
object Boot {

  def main(args: Array[String]): Unit = {

    implicit val system = ActorSystem("Leave-Service")
    implicit val executor = system.dispatcher
    implicit val materialized = ActorMaterializer()

    val serverURL = "localhost"
    val port = 8889

    val leaveRoutes = new LeaveRoutes

    Http().bindAndHandle(leaveRoutes.leaveRoutes, serverURL, port)
  }
}
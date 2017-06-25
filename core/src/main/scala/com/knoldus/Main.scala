package com.knoldus

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import com.knoldus.controller.WordPressRoutes

/**
  * Created by akash on 16/6/17.
  */
object Main {

  def main(args: Array[String]): Unit = {

    implicit val system = ActorSystem("WordPress-Service")
    implicit val executor = system.dispatcher
    implicit val materialized = ActorMaterializer()

    val serverURL = "localhost"
    val port = 8888

    val wordPressRoutes = new WordPressRoutes

    Http().bindAndHandle(wordPressRoutes.wordPressRoute, serverURL, port)
  }
}

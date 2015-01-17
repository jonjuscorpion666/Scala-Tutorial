package com.john.test

object AwesomeFactorial {

  def main(args:Array[String])
  {
    println(List.range(1, 5).foldLeft(1)(_*_))
  }
}
package com.john.test

object ListReverseAndRandomSelect {

  def main (args:Array[String]){
    println(reverse(List(3,4,5,2,1,45)))
     println((List(3,4,5,2,1,45).drop(3).head))
    println((List(3,4,5,2,1,45).indices))
  }
  def reverse[T](xs: List[T]): List[T]=
   xs match {
    case List()   =>Nil
    case x :: xs1 => reverse(xs1) ::: List(x)
    
  }
}
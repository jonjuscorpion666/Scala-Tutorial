package com.john.test
import scala.annotation.tailrec


object AwesomeFactorial {

  def main(args:Array[String]) {
    //Factorial in one line .Awesome and coool!!!
    println("Factorial using foldleft"+List.range(1, 5).foldLeft(1)(_*_))
        println("Factorial using foldright"+List.range(1, 5).foldRight(1)(_*_))
    println("Factoril using higer Order and case class "+ fact(4))
    println("Factorial using Higher Order and if"+fact_if(4))
    println("Factorial in another Higher order if "+fact_if2(4))
  }

  def fact(x: Int): Int={
   x match {
     case 0 =>1
     case x => x * fact(x-1)
   } 
  }
  
  def fact_if(y: Int): Int={
    if (y == 0) 1
    else y*fact(y-1)
  }
   
 
    def fact_if2(y:Int): Int={
      @tailrec def go(n:Int,acc:Int): Int={
        if(n==0) acc
        else go(n-1,n*acc)
      }
        go(y,1)
   }



}

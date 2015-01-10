package com.john.test

object sortingListWithCaseClass {

  def main(args:Array[String]){
 println( isort(List(1,4,5,3,33,45)))
  }
  /* Implementing iSort using "Cons" In List */
  def isort(xs: List[Int]):List[Int] = xs match{
  case List() => List()
  case x::xs1  => insert(x,isort(xs1))
  }
  /*Case Class implementationss*/    
  def insert(x:Int,xs1: List[Int]) :List[Int] =xs1 match{
  case List() =>List(x)
  case y::ys1  => if(x<=y) x::xs1 else y::insert(x,ys1)
  }    
}
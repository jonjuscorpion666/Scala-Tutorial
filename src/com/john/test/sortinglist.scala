package com.john.test

object sortinglist {

 def main(args: Array[String]) {
  
println(isort(List(1,3,5,2,44,5,7)))
  }  
    def isort(xs: List[Int]) :List[Int]={
      if(xs.isEmpty) Nil
      else
        insert(xs.head,isort(xs.tail))
   }
    def insert(x:Int,xs:List[Int]):List[Int]={
      if(xs.isEmpty || x>=xs.head) x::xs
      else xs.head :: insert(x,xs.tail) 
    }
}
  

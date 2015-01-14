package com.john.test

object HigherOrderFunctionList {
def main(args:Array[String])
{
  val Test=List(1,34,2,4,234,223)
  println("Filter"+Test.filter { x => x%2==0 })
  println("Partiton"+Test.partition { x => x<100 })
  println("Take while x=4--"+Test.takeWhile { x => x%2==0 })
  println("Drop While x=4--"+Test.dropWhile { x =>x%2==0 })
    println("span x=4--"+Test.span { x =>x>40 })
  println("Find While x=4--"+Test.find { x =>x==4 })
  
  }
}
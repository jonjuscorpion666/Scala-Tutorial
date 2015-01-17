package com.john.test

object IsSortedPolymorphic {
  
  def main(args:Array[String]): Unit= {
    
    println(isSorted(Array(1,4,5,24),(x: Int,y: Int ) => x<y))
   
  }
def isSorted[A](ss: Array[A], ordered: (A,A) => Boolean): Boolean = {
 def loop(n:Int):Boolean={
    if(n+1>=ss.length) true
    else if(!ordered(ss(n),ss(n+1))) false
   else
     loop(n+1)
 }
loop(0)
}


}


package com.john.test

object FirstElementInArrayPolymorphic {
  def main(args:Array[String])
  {
    println(FirstElement(Array(1,2,4,9,5),(x :Int) => x==9))
  }
  def FirstElement[A](ss:Array[A],p: A=>Boolean) :Int = {
    def loop(n:Int): Int = {
      if(n>=ss.length-1) -1
      else if(p(ss(n))) n
      else
        loop(n+1)
    }
      loop(0)
  }

}
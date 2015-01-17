package com.john.test

object Fibnocii_series {
  def main(args:Array[String]){
    fibnocii(10)
  }
  
def fibnocii(x:Int):Int={
  def calc(a:Int,b:Int,n:Int):Int={
    println("Fibnocii series in tail recursion "+a)
    n match{
    case 0   => a
    case _   =>calc(b,a+b,n-1)
    }
  }
  calc(0,1,x)
}

}
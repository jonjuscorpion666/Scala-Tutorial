package com.john.test

import scala.collection.immutable.Stream.Cons

object FoldLeftExamples {

  def main(args:Array[String]){
    print(length(List("a","d","f","e","er")))
  }
  
  
  def length[E](Item:List[E]):Int={
    //or use Item.foldleft(0)(acc,x)=>acc+1)
    Item.foldRight(0)((x,acc)=>acc+1)
  }
  def sum(item:List[Int]):Int={
    item.foldLeft(1)((x,y)=>x+y)
    
  }
  
  def product(item:List[Int]):Int={
    
    item.foldLeft(0)(_*_)
  }
  
  def reverse[E](item:List[E]):List[E]={

    item.map { x => x }
 
  }
}

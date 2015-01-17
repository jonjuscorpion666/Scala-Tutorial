package com.john.test

import com.sun.org.apache.xalan.internal.xsltc.compiler.LastCall

object Append2list {
  def main(args:Array[String]){
  println(append(List(1,2,4,52,98),List(342,4,5,2,33,333)))
  InitLastHeadTail(List(342,4,5,2,33,333))
  }

  def append[T](xs: List[T],ys: List[T]): List[T]=
  xs match {
   case List() =>ys
   case x::xs1 => x::append(xs1,ys)
  }

  /* *Head Tail Init and last examples */
  def InitLastHeadTail[T](xs:List[T])={
  println("Head"+xs.head)
  println("Tail"+xs.tail)
  println("init"+xs.init)
  println("last"+xs.last)
  }


}
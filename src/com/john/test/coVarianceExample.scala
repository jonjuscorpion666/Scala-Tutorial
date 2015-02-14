package com.john.test

class coVarianceExample {
  
  def main(args:Array[String]){
 
sayHi(empList)
sayHi(peopleList) // compilation ERROR
  }
class Person(val name: String) {
 override def toString = name
}

class Employee(override val name: String) extends Person(name)

val empList = List(new Employee("Joao"), new Employee("Andre"))
val peopleList = List(new Person("Martin"), new Person("Jonas"))
 
//def sayHi(people:List[Employee]) = people.map { println _ }

//T sould be of Type Person or any class that derives from Person, 
def sayHi[T <: Person](people: List[T]) = people.map { println _ }
}
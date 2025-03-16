package Polymorphism;

public class Parent{
  int age;
  String name;
 
  public Parent(){
    System.out.println("Parent Constructor is called");
  }
  public Parent(int age,String name){
    this.age=age;
    this.name=name;
  }
  String getname(){
    return this.name;
  }

  int getAge(){
    return this.age;
  }

  void fun(){
    System.out.println("Parent class is Called");
  }
}
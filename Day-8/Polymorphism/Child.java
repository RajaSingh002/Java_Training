package Polymorphism;
public class Child extends Parent{
    
    int age;
    String name;
    int weight;

    public Child(int age,String name,int weight){
        super(age,name);
        this.weight=weight;
    }

    
    @Override
    public void fun(){
      super.fun();
      System.out.println("Child class is called");
    }
}

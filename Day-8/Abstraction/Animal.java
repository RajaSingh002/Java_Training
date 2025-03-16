package Abstraction;

public abstract class Animal {
    private int age;
    protected int weight;
    public Animal(int weight,int age){
      this.weight=weight;
      this.age=age;
    }
  
    
    public abstract void makeNoise();

    public abstract void makeMove();

    public void fun(){
        System.out.println("Animal class is called");
    }

}

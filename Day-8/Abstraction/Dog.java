package Abstraction;

public class Dog extends Animal {
     private String color;
    public Dog(int age,int weight,String color){
        super(age,weight);
        this.color=color;
    }
    @Override
    public void makeMove() {
        // TODO Auto-generated method stub
        System.out.println("DOg Walk");
        
    }

    @Override
    public void makeNoise() {
        // TODO Auto-generated method stub
        System.out.println("Woof");
        
    }
    
}

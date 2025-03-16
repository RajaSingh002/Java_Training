package Abstraction;

public class Main {

    private static void makeAnimalStuff(Animal animal){
       animal.makeMove();
       animal.makeNoise();
    }
    
    public static void main(String[] args) {
       Dog d=new Dog(12,44,"Black");
       d.fun();
       d.makeMove();
       d.makeNoise();
       makeAnimalStuff(d);
    }
}

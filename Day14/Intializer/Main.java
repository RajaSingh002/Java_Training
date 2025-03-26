package Intializer;
class Example{
   public final int num;
   
    {
        num=100;
        System.out.println("Instance Initialzer Block exexuted");
    }

    public Example() {
        System.out.println("Constructor executed");
    }

    static{
        System.err.println("Static block is called");
       }
}

class Child extends Example{

}

 record Car(String brand, String model, int year) {
    // Custom Constructor with Default Year
    public Car(String brand, String model) {
        this(brand, model, 2024); // Calls the canonical constructor
    }
}
public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        Example obj2=new Example();
        Child obj1 = new Child();
        Car c=new Car("TATA","BAC");
        System.out.println(c);
        System.out.println("Value of num: " + obj.num);
        // Parent parent = new Parent("Jane Doe", "01/01/1950", 4);
        // Child child = new Child();

        // System.out.println("Parent: " + parent);
        // System.out.println("Child: " + child);
    }
}

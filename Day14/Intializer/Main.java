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
}

class Child extends Example{

}
public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        Child obj1 = new Child();
        System.out.println("Value of num: " + obj.num);
        Parent parent = new Parent("Jane Doe", "01/01/1950", 4);
        Child child = new Child();

        System.out.println("Parent: " + parent);
        System.out.println("Child: " + child);
    }
}

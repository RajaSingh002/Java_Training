package Mutable;
public class Child extends parent {
    Child(){
        super(0, "Ishan Kishan");
    }

    @Override
    void fun() {
        // TODO Auto-generated method stub
        // super.fun();
        System.out.println("child Fun");
    }
    
    public static void fun1(){
        System.out.println("Child class fun1 is called");
    }

}

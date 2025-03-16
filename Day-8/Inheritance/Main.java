package Inheritance;

public class Main {
    
    public static void main(String[] args) {
        Parent obj=new Child();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        System.out.println(((Child)(obj)).d2);
        obj.fun();
        obj.fun1();
        
        
    }
}

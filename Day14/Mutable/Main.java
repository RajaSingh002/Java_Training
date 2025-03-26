package Mutable;

public class Main {
    public static void main(String[] args) {
        parent p1=new parent(44, "JHon");
        parent p2=new Child();
        Child c=new Child();
        
        // Child c=new Child();
        System.out.println(p1.getName());
        // parent p2=p1;
        // p2.setName("Travis Tulla");
        System.out.println(p2.getName());
        // c.fun();

        c.fun1();
        p1.fun1();
        p2.fun1();
    }
}

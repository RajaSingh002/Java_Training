package Day10.Static;

public class Outer1 {
    private static int a=3;
    protected static int b;
     static int c;
    private int id=1;
    protected int roll;
    String name="Raja";

     void display(){
        System.out.println("Show");
    }

    class MemberInner{
        
        void display(){
            System.out.println(name+id);
        }
    }
}

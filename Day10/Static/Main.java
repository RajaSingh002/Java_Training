package Day10.Static;

import Day10.Static.Outer1.MemberInner;

public class Main {
    public static void main(String[] args) {
        // Outer n=new Outer();
        // n.display();
        Outer.inner inn=new Outer.inner();
        System.out.println(inn.x);
        inn.display();
        

        Outer1 obj=new Outer1();
        MemberInner inner1=obj.new MemberInner();
        inner1.display();
    }
}

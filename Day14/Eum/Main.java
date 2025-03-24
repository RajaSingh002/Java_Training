package Eum;
import java.util.*;
 enum Color {
    RED,BLACK,GREEN;

    private Color(){
       System.out.println("Constructor is called");
    }

    public void fun(){
        System.out.println("fun1 is called");
    }
}


public class Main {
    public static void main(String[] args) {
        Color c1=Color.GREEN;
        System.out.println(c1);
        EnumMap<Color,String>e=new EnumMap<>(Color.class);
        e.put(Color.BLACK,"Color is black");
        for(Color c:e.keySet()){
            System.out.println(c+" "+e.get(c));
        }
        c1.fun();
    }
}


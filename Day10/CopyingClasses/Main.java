package Day10.CopyingClasses;

import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        Address ad=new Address("Jaipur");
        Person p1=new Person("Raja",ad);

        //Shallow Copy using Constrcutor
        // Person p2=new Person(p1);
        // p2.address.city="Noida";
        // System.out.println(p1.address.city);

        
        //Deep Copy
        Person p2=new Person(p1);
        p2.address.city="Noida";
        System.out.println(p1.address.city);

    }
    
}

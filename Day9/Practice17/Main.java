package Day9.Practice17;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
         set.add(1);
         set.add(2);
        ImmutableClass c=new ImmutableClass(1,"Raja",set);
        int id=c.getId();
        String str=c.getName();
        Set<Integer>x=c.getSet();
        System.out.println(x);
        System.out.println(str);
        System.out.println(id);
        set.add(7);
        id=4;
        str=str+"singh";
        System.out.println(c.getId());
        System.out.println(c.getName());
        System.out.println(c.getSet());
    }
}

package Day11;
import java.util.*;

record Item(String name,String type ,int count){
    Item(String name){
        this(name, "TER", 2);
    }
}
public class Main {
    public static void main(String[] args) {
        Item[] groceryItem=new Item[3];
        groceryItem[0]=new Item("ABC", "A", 1);
        groceryItem[1]=new Item("Cookie");
        // groceryItem[2]="Hello";

        System.out.println(Arrays.toString(groceryItem));

       

        String [] str={"Apple","Banana","Grapes"};

        List<String> list2=Arrays.asList(str);                                                                                                                                    
        System.out.println(list2);

        ArrayList <String> list=new ArrayList <>(list2);
        // list.add("Raja");
        list.add("Virat");
        list.add("Virat");

        System.out.println(list);
        String s=list.get(4);
        System.out.println(s);
        int s1=list.lastIndexOf("Apple");
        System.out.println(s1);

        int s3=list.indexOf("Apple");
        System.out.println(s3);

        list.remove(2);
        System.out.println(  list.remove(2));
        System.out.println(list);


      ArrayList<Integer> list3=new ArrayList<>(List.of(1,2,3));
      Object arr[]=list3.toArray();
      System.out.println(Arrays.toString(arr));

    }
}

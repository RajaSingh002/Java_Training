package Day12.CollectionFrameWork;

import java.util.*;
    

public class Main implements Comparator<String>{
    @Override
    public int compare(String s,String s1){
        return s1.length()-s.length();
    }

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        String []names={"David","Anna","Bob","Carol",};

        list.addAll(Arrays.asList(names));

        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("Geroge","Grat","Fase"));

        System.out.println(list);

        System.out.println(list.contains("Grat"));

        list.removeIf(n -> (n.charAt(0))=='G');
        System.out.println(list);
        Collections.sort(list,new Main());
        
        System.out.println(list);

      
    }
}

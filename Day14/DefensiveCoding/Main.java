package DefensiveCoding;
import java.util.*;
class Student{
    private String name;
    private List<String> str;

    
    public Student(String name, List<String> str) {
        this.name = name;
        // this.str=str;//shalllow copy
        this.str = new ArrayList<>(str);//Defensive coding means i have created deep copy;
    }


    public List<String> getStr() {
        return str;
    }

    

}
public class Main {
    public static void main(String[] args) {
        List<String> str1=new ArrayList<>(Arrays.asList("a"));
        Student s=new Student("DHoni",   str1);
        System.out.println(s.getStr());
        str1.add("b");
        System.out.println(s.getStr());
    }
}

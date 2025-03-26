package Day15.Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void checkStringAgainstRe(String re,String str){
                   Pattern pattern=Pattern.compile(re);
                   Matcher matcher=pattern.matcher(str);
                   boolean matches=matcher.matches();
                   System.out.println(matches);
    }
    
    public static void main(String[] args) {
        //  System.out.println(Pattern.matches(
        //     "geeksforge*ks", "geeksforgeeks"));

        // System.out.println(Pattern.matches(
        //       "g*geeks*", "geeksforgeeks"));

        // String helloWorld="%s %s" .formatted("Hello","world");
        // String helloworld2=String.format("%s %s", "Hello","World");
        // System.out.println(helloWorld);
        // System.out.println(helloworld2);
      while(true){
        System.out.println("Enter Regular Epression");

        Scanner sc=new Scanner(System.in);
        String re=sc.nextLine();
        System.out.println("Enter Your String");
        String str=sc.nextLine();
 
        checkStringAgainstRe(re, str);
 
        System.out.println("Want to exit [Y/N]");
 
        String choice=sc.nextLine();
 
        if(choice.equalsIgnoreCase("Y")){
             System.out.println("Thankyou for using");
             break;
        }
      }

    }
}

package Day17;
import java.io.*;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        //Use of Scanner Class
        // Scanner sc=new Scanner(System.in);
        // String str=sc.nextLine();
        // int n=sc.nextInt();
        // double d=sc.nextDouble();
        try {
            File file=new File("sample.txt");
            String data="apple,banana,grape,orange";
            Scanner sc=new Scanner(data);
            sc.useDelimiter(",");
            while(sc.hasNext()){
                String line=sc.next();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("FIle not found"+e.getMessage());
        }
      
    }
}

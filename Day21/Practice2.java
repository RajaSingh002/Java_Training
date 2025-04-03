package Day21;

import java.io.FileInputStream;
import java.io.InputStream;

public class Practice2 {
    public static void main(String[] args) {
        byte arr[]=new byte[1000];
        try {
            InputStream input =new FileInputStream("sample.txt");
            input.read(arr);
            System.out.println(input.available());
            String str=new String(arr);
            System.out.println(str);
            input.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
       
    }
}

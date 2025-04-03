package Day21;

import java.io.FileInputStream;

public class Practice4 {
    public static void main(String[] args) {
        try {
            FileInputStream input =new FileInputStream("sample.txt");
            int i=input.read();
            while(i!=-1){
                System.out.print((char)i);
                i=input.read();
            }
            input.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.getStackTrace();
        }
      
    }
}

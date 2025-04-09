package Day22;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestWrite {
    public static void main(String[] args) {
        try {
            // FileOutputStream fs=new FileOutputStream("D://Data/Student.txt",true);
            // System.out.println("File Created");
            // char ch='c';
            // fs.flush();
            // fs.write(ch);
            FileInputStream fs=new FileInputStream("D://Data/Student.txt");
            char ch;
            int n;
            while((n=fs.read())!=-1){
                ch=(char)n;
                System.out.print(ch);
            }
          
          
            fs.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }
}

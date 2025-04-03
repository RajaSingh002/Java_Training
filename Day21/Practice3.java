package Day21;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Practice3 {
    public static void main(String[] args) {
        String data="This is a new line";
        try {
            OutputStream output=new FileOutputStream("sample.txt");
            byte []dataBytes=data.getBytes();
            output.write(dataBytes);
            System.out.println("file is written");
            output.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}

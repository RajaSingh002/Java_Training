package Day21;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Practice7 {
    public static void main(String[] args) {
        String data = "This is a line of text inside the file";

        try {

            FileOutputStream file = new FileOutputStream("output.txt");

            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            output.write(array);
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

package Day21;

import java.io.InputStreamReader;

public class Practice1 {
    public static void main(String[] args) {
        try (InputStreamReader isr=new InputStreamReader(System.in)) {
            System.out.print("Emter some letters");
            int letters=isr.read();
            while (isr.ready()) {
                System.out.println((char) letters);
                letters=isr.read();
            }
            isr.close();
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}

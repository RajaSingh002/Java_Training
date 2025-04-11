package Day25;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args) {
        try {
            FileInputStream file=new FileInputStream("ob.txt");
            ObjectInputStream oos=new ObjectInputStream(file);

            Student s=(Student)oos.readObject();


              s.displayName();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

package Day25;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
       
     try {
        Student student=new Student("Raja","rajasingh.rk007@gamil.com",23,"Noida");
        FileOutputStream file=new FileOutputStream("ob.txt");
        ObjectOutputStream oos=new ObjectOutputStream(file);

        oos.writeObject(student);
        file.close();
        oos.close();
        System.out.println("object statte is transfer is file");
     } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
     }

    }
}

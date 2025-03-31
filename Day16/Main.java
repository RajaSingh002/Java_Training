package Day16;
import java.io.File;
import java.nio.file.*;
import java.util.*;

public abstract class Main {

   abstract void fun();
    private static void testFile(String filename){
        Path path=Paths.get(filename);
        try {
            List<String> lines=Files.readAllLines(path);
        } catch (Exception e) {
            // TODO: handle exception
            throw new RuntimeException(e);
        }

        finally{
            System.out.println("Print me");
        }
    }
    public static void main(String[] args) {
        String filename="testing.csv";
        Path path=Paths.get(filename);
        try {
            List<String>lines=Files.readAllLines(path);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("File Not found");
        }
        System.out.println("I'm good to go");
        testFile(filename);
        File file=new File(filename);
        if(!file.exists()){
            System.out.println("I cant run unless file exists");
            System.out.println("Quitting Application , go figure it out");
            return;
        }

       
    }
}

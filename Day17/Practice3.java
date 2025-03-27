package Day17;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;
public class Practice3 {
    public static void main(String[] args) {
        File file=new File("sample.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter=new FileWriter("sample.txt");
            fileWriter.write("Hello My Name is Raja\nI am , from Greater Noida");
            fileWriter.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // try (FileReader reader=new FileReader("sample.txt")){
        //     int character;
        //     while((character=reader.read())!= -1){
        //         System.out.println((char)(character));
        //     }
            
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }

        // try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
        //     String line;
        //     while ((line = br.readLine()) != null) { // Reads one line at a time
        //         System.out.println(line);
        //     }
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }


         try {
            Path dirPath=Path.of("sample.txt");
            List<String> lines = Files.readAllLines(dirPath);
            for (String line : lines) {
                System.out.println(line);
            }
         } catch (Exception e) {
            // TODO: handle exception
         }
         
        
        
    }
}

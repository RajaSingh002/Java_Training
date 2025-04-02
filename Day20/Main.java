package Day20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class Main {
     //Recursive copy a folder
    //  public static void recurseCopy(Path source, Path target) throws IOException {
    //     if (Files.isDirectory(source)) {
          
    //         Files.createDirectories(target);

    //         try (Stream<Path> children = Files.list(source)) {
    //             children.forEach(p -> {
    //                 try {
    //                     recurseCopy(p, target.resolve(p.getFileName()));
    //                 } catch (IOException e) {
    //                     e.printStackTrace();
    //                 }
    //             });
    //         }
    //     } else {
           
    //         Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    //     }
    // }


     public static void recurseDelete(Path target) throws IOException {
        if (Files.isDirectory(target)) {
            try (Stream<Path> children = Files.list(target)) {
                children.forEach(p -> {
                    try {
                        recurseDelete(p);
                    } catch (IOException e) {
                        e.printStackTrace();  
                    }
                });
            }
        }
        Files.delete(target); 
    }
    public static void main(String[] args) {
       Path target = Paths.get("Day13"); 
        try {
            recurseDelete(target);
            System.out.println("Deletion completed successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

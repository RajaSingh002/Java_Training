package Day17;

import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

public class Practice1 {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current Directory: " + currentDir);
        Path dirPath = Paths.get("D:/Java");

        // try (Stream<Path> files = Files.list(dirPath)) {
        // files.forEach(System.out::println);
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // try (Stream<Path> files = Files.walk(dirPath, 2)) { // depth=2
        //     files.forEach(System.out::println);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        try (Stream<Path> files = Files.find(dirPath, Integer.MAX_VALUE,
                (path, attr) -> path.toString().endsWith("Practice1.java"))) {
            files.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

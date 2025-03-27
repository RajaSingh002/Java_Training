package Day17;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Practice2 {

     static class MyFileVisitor extends SimpleFileVisitor<Path> {

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            System.out.println("File: " + file);
            return FileVisitResult.CONTINUE; 
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) {
            System.err.println("Failed to access file: " + file);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
            System.out.println("Directory: " + dir);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
            System.out.println("Completed directory: " + dir);
            return FileVisitResult.CONTINUE;
        }
    }
    public static void main(String[] args) {
          Path startDir = Paths.get("D:/Java"); 

        try {
            Files.walkFileTree(startDir, new MyFileVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}

package Day19;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
public class WriteFile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);





        // File file=new File("sample.pdf");
        // try {
        //     file.createNewFile();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }







        // System.out.println("Enter File name");
        // String filename=sc.nextLine();
        // try {
        //     FileWriter writer=new FileWriter(filename);
        //     writer.write("Hello Raja");
        //     System.out.println("Hello");
        //     writer.close();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }



        // try {
        //     BufferedWriter writer=new BufferedWriter(new FileWriter("sample.pdf"));
        //     writer.write("BufferedWriter writes data efficiently");
        //     writer.newLine();
        //     writer.write("It reduces the number of disk writes. Hello Raja");
        //     writer.close();
        //     System.out.println("Data written using BufferedWriter");
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }


        // try {
        //     PrintWriter writer=new PrintWriter("sample.pdf");
        //     writer.println("Using PrintWriter.");
        //     writer.printf("Number: %d, String: %s%n", 100, "Hello");
        //     writer.close();
        //     System.out.println("Data written using PrintWriter.");
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }



        // File oldFile=new File("sample.pdf");
        // File newFile=new File("Sample.pdf");
        // if(oldFile.renameTo(newFile)){
        //     System.out.println("File renamed successfully");
        // }
        // else{
        //     System.out.println("Failed to rename file");
        // }



        //Copy a File

        // Path source=Paths.get("Sample.pdf");
        // Path des=Paths.get("copy.pdf");

        // try {
        //     Files.copy(source,des);
        //     System.out.println("Files copied successfully");
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }


        // Path filePath=Paths.get("copy.pdf");
        // try {
        //     Files.deleteIfExists(filePath);
        //     System.out.println("File deleted Successfully");
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }


        Path source = Paths.get("Sample.pdf");
        Path destination = Paths.get("Day19/Sample.pdf");

        try {
            Files.move(source, destination);
            System.out.println("File moved successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }
}



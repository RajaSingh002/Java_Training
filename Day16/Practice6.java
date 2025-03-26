package Day16;
import java.io.*;
import java.util.Scanner;
public class Practice6 {
    public static void main(String[] args) {

        //  File myFile=new File("email.txt");
        //  try {
        //     myFile.createNewFile();
        //  } catch (IOException e) {
           
        //     System.out.println("Unable to create this file");
        //     e.printStackTrace();
        //  }



        // try {
        //     FileWriter fileWriter=new FileWriter("email.txt");
        //     fileWriter.write("This is my first filen\n Okay bye");
        //     fileWriter.close();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }


    //   File myFile=new File("email.txt");

    //     try {
    //         Scanner sc=new Scanner(myFile);
    //         while(sc.hasNextLine()){
    //             String str=sc.nextLine();
    //             System.out.println(str);
    //         }
    //         sc.close();
    //     } catch (Exception e) {
    //         // TODO: handle exception
    //         e.printStackTrace();
    //     }

    File myfile=new File("email.txt");
    if(myfile.delete()){
        System.out.println("My file is deleted"+myfile.getName());
    }
    else{
        System.out.println("Error");
    }
    }
}

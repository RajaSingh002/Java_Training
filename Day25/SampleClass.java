package Day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SampleClass {
    public static void main(String[] args){
     //How to create and write file
        // try {
        // String path="D:/Java/file2.txt";

        // File file =new File(path);

        // boolean val=file.createNewFile();
        // if(val){
        //     System.out.println("file is created");
        // }
        // else{
        //     System.out.println("File is already exists");
        // }

        // FileWriter file1=new FileWriter(file,true);

        // BufferedWriter bw =new BufferedWriter(file1);

        // Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();

        // bw.write(s);
        // bw.close();
        // file1.close();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }

        //How to read a File
        // try {
        //     String path="D:/Java/file2.txt";
        //     File file =new File(path);
        //     FileReader fr=new FileReader(file);
        //     BufferedReader br=new BufferedReader(fr);
        //     int c;
        //     while((c=br.read())!=-1){
        //         System.out.print((char)c);
        //     }
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        
        //How to count number of character in file

        // try {
        //     String path="D:/Java/file2.txt";
        //     File file =new File(path);
        //     FileReader fr=new FileReader(file);
        //     BufferedReader br=new BufferedReader(fr);
        //     int c;
        //     int count=0;
        //     while((c=br.read())!=-1){
        //         System.out.print((char)c);
        //         count++;
        //     }

        //     System.out.println(count);
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        






        try {
            String path="D:/Java/file2.txt";
            File file =new File(path);
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            int c;
            int count=0;
            while((c=br.read())!=-1){
                if((char)c=='\n'){
                    count++;
                }
               
            }

            System.out.println(count+1);
        } catch (Exception e) {
            // TODO: handle exception
        }
     
        
    }
}

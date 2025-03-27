package Day17;
import java.io.*;
import java.util.*;
public class Challenge {
    public static void main(String[] args) {
        //calculate count of words.
        // int wordcount=0;
        // try(BufferedReader br=new BufferedReader(new FileReader("sample.txt"))) {
        //    String line;
        //    while((line=br.readLine())!=null){
        //     String[] words=line.split("\\s+");
        //     wordcount+=words.length;
        //    }
        //    System.out.println(wordcount);
        // // System.out.println(br.lines().count());
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }

        Map<String,Integer>mp=new HashMap<>();
        try(BufferedReader buffer=new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while((line=buffer.readLine())!=null){
                line =line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");
                String[] words=line.split("\\s+");

                for(String word : words){
                    if(!word.isEmpty()){
                        mp.put(word,mp.getOrDefault(word, 0)+1);
                    }
                }
            }

            for(Map.Entry<String,Integer> entry:mp.entrySet()){
                System.out.println(entry.getKey()+": "+entry.getValue());
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}

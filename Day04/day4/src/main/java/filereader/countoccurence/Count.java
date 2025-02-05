package filereader.countoccurence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;

public class Count {
    public static void main(String[] args) {
        String path="C:\\Week03\\Day04\\day4\\src\\main\\java\\filereader\\countoccurence\\countfile.txt";
        int count=0;
        String targetWord="miracle";
        try(BufferedReader br= new BufferedReader(new FileReader(path))){
            String line;
            while((line=br.readLine())!=null){
                String  words[]=line.split("\\s+");
                for(String word:words){
                    if(word.equalsIgnoreCase(targetWord)){
                        count++;
                    }
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");    }
}

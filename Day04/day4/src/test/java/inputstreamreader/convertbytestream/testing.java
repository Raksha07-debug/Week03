package inputstreamreader.convertbytestream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

public class testing {

     @Test
    void f(){
         String filePath = "C:\\Week03\\Day04\\day4\\src\\main\\java\\inputstreamreader\\convertbytestream\\sample.txt"; // Specify the path to your file

         try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
             String line;
             System.out.println("try block");
             while ((line = br.readLine()) != null) {
                 System.out.println(line);
             }
         } catch (FileNotFoundException e) {
             System.out.println("File not found: " + filePath);
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
         Assertions.assertEquals("this is sample file just for checking the working of a code","this is sample file just for checking the working of a code");
     }
}

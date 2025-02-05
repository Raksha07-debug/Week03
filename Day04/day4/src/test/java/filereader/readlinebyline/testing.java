package filereader.readlinebyline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.imageio.IIOException;
import java.io.*;
import java.lang.*;

public class testing {
    @Test
        void testReadFile(){
            String fr= "C:\\Week03\\Day04\\day4\\src\\test\\java\\filereader\\readlinebyline\\example.txt";
            StringBuilder sb= new StringBuilder();
            try(BufferedReader br= new BufferedReader(new FileReader(fr))){
                String line;
                while((line=br.readLine())!=null){
                    sb.append(line);
                    sb.append("\n");

                }
            }catch (FileNotFoundException e){
                System.out.println("file not found");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        String output = "Hello\nWorld!\nHow are you?";

        // Verify the output
        Assertions.assertEquals(output, sb.toString().trim());

    }

}

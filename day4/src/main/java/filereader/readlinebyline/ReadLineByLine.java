package filereader.readlinebyline;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadLineByLine {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\Week03\\Day04\\day4\\src\\main\\java\\filereader\\readlinebyline\\example.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);  // Reads and prints the file's characters
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }


}

package inputstreamreader.convertbytestream;

import java.io.*;

public class Convert{
    public static void main(String[] args) {
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
    }
}

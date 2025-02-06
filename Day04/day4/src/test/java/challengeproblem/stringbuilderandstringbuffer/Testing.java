package challengeproblem.stringbuilderandstringbuffer;

import challengeproblem.FileReaderVsInputStreamReader;
import challengeproblem.StringBuilderVsStringBuffer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Testing {
    @Test
    void stringBuilderStringBuffer(){
        Long arr[]= StringBuilderVsStringBuffer.stringBuilderVsStringBuffer("Raksha");
        assertTrue(arr[0] > arr[1]);

    }
    @Test
    void fileReaderInputStreamReader(){
        long arr[]= FileReaderVsInputStreamReader.fileReaderVsInputReader("C:\\Week03\\Day04\\day4\\UserInputFile.txt");
        assertTrue(arr[0] > arr[1]);
    }
}

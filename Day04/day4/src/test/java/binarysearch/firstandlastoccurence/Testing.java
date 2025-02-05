package binarysearch.firstandlastoccurence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing {
    int[] array = {2, 4, 10, 10, 10, 18, 20};
    int target=10;

    @Test
    void f(){
        Assertions.assertEquals(2,FirstAndLastOccurrence.findFirst(array,target));
    }
    @Test
     void f1(){
        Assertions.assertEquals(4,FirstAndLastOccurrence.findLast(array,target));
    }
}

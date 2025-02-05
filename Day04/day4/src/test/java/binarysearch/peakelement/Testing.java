package binarysearch.peakelement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing {
    int[] array = {1, 3, 20, 4, 1, 0, 8, 7, 5, 10, 9, 2};

    @Test
    void f(){
        Assertions.assertEquals(9,Peak.findPeakElement(array));
    }
}

package binarysearch.rotated;

import binarysearch.rotatedarray.RotateArr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing {

    int arr[]={15,16,2,8,10};

    @Test
    void f(){
        Assertions.assertEquals(2, RotateArr.findRotationIndex(arr));
    }
}

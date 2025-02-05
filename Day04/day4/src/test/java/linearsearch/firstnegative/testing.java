package linearsearch.firstnegative;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testing {
    int arr[]={7,9,1,4,-5,3};
    @Test
    void f(){
        Assertions.assertEquals(-5,Negative.search(arr));
    }
}

package linearsearch.firstnegative;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testing {

    int arr[]={1,2,-5,4,8,9};
    @Test
    void f(){
        Assertions.assertEquals(-5,Negative.search(arr));
    }
}

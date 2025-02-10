package largefilereadingefficiency;

import com.largefilereadingefficiency.LargeFileReadingEfficiency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargeFileReadingEfficiencytest {
    @Test
    void filereadTime(){
        int arr[]= LargeFileReadingEfficiency.compares();
//        arr[0]=FileReader Time;
//        arr[1]= InputStreamReader Time;
        Assertions.assertTrue(arr[0]>arr[1]);

    }
}

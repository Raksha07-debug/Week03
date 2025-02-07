package stringbuilderque.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuilderque.Reverse;

public class testing {
    @Test
    void rev(){
        String str="level";
        Assertions.assertEquals(Reverse.reverseString(str),"level");
    }
}

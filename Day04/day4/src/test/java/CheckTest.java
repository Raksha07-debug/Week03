import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import removeduplicate.RemoveDuplicate;
import stringbuilderque.Reverse;

public class CheckTest {
@Test
    void rev(){
    String str="level";
    Assertions.assertEquals(Reverse.reverseString(str),"level");
}
@Test
    void rem(){
    String str="rrraaaaksha";
    Assertions.assertEquals("raksh",RemoveDuplicate.removeDuplicate(str));
 }
}

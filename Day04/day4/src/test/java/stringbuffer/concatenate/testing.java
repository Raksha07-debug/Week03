package stringbuffer.concatenate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import removeduplicate.RemoveDuplicate;
import stringbufferque.concatenate.Concatenate;

public class testing {
    @Test
    void concat(){
        String str[]={"the","raksha"};
        Assertions.assertEquals("theraksha", Concatenate.concatString(str,str.length));
    }

}

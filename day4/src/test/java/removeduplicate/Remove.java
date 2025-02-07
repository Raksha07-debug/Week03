package removeduplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Remove {

    @Test
    void rem() {
        String str = "rrraaaaksha";
        Assertions.assertEquals("raksh", RemoveDuplicate.removeDuplicate(str));
    }
}

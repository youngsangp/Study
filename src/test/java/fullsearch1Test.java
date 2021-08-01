import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class fullsearch1Test {
    @Test
    void fullsearch1Test() {
        String args1 = "17";

        fullsearch1 fullsearch1 = new fullsearch1();

        int result = fullsearch1.fullsearch1(args1);
        int expected = 3;
        assertEquals(expected, result);
    }
}

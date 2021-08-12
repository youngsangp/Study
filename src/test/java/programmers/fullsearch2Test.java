package programmers;

import org.junit.jupiter.api.Test;
import programmers.fullsearch2;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class fullsearch2Test {
    @Test
    void fullsearch2Test() {
        //String args1 = "17";
        String args1 = "011";

        fullsearch2 fullsearch2 = new fullsearch2();

        int result = fullsearch2.fullsearch2(args1);

        int expected = 2;
        assertEquals(expected, result);
    }
}

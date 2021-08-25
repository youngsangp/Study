package programmers.fullsearch;

import org.junit.jupiter.api.Test;
import programmers.fullsearch.fullsearch1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class fullsearch1Test {
    @Test
    void fullsearch1Test() {
        //int[] args1 = {1,2,3,4,5};
        int[] args1 = {1,3,2,4,2};

        fullsearch1 fullsearch1 = new fullsearch1();

        int[] result = fullsearch1.fullsearch1(args1);
        //int[] expected = {1};
        int[] expected = {1,2,3};
        assertArrayEquals(expected, result);
    }
}

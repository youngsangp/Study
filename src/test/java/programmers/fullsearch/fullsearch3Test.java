package programmers.fullsearch;

import org.junit.jupiter.api.Test;
import programmers.fullsearch.fullsearch3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class fullsearch3Test {
    @Test
    void fullsearch3Test() {

        int args1 = 10;
        int args2 = 2;

//        int args1 = 10;
//        int args2 = 2;

        fullsearch3 fullsearch3 = new fullsearch3();

        int[] result = fullsearch3.fullsearch3(args1, args2);

        int[] expected = {4, 3};
//        int[] expected = {3, 3};
        assertArrayEquals(expected, result);
    }
}

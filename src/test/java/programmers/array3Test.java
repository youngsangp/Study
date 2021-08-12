package programmers;

import org.junit.jupiter.api.Test;
import programmers.array3;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class array3Test {
    @Test
    void array3Test() {
        //int[] args1 = {3, 0, 6, 1, 5};
        //int[] args1 = {0, 2, 4, 4, 4};
        int[] args1 = {4,4,4};

        array3 array3 = new array3();

        int result = array3.array3(args1);
        int expected = 3;
        assertEquals(expected, result);
    }
}

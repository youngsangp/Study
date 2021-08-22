package programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class stackqueue1Test {
    @Test
    void name() {
        int[] args1 = {93, 30, 55};
        int[] args2 = {1, 30, 5};

//        int[] args1 = {95, 90, 99, 99, 80, 99};
//        int[] args2 = {1, 1, 1, 1, 1, 1};
        stackqueue1 stackqueue1 = new stackqueue1();

        int[] result = stackqueue1.solution(args1, args2);
        int[] expected = {2, 1};
//        int[] expected = {1, 3, 2};
        assertArrayEquals(expected, result);
    }
}

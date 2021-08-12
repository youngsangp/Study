package programmers;

import org.junit.jupiter.api.Test;
import programmers.array1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class array1Test {
    @Test
    void array1Test(){
        int[] args1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] args2 = {{2,5,3}, {4, 4, 1}, {1, 7, 3}};

        array1 array1 = new array1();

        int[] result = array1.array1(args1, args2);
        int[] expected = {5, 6, 3};
        assertArrayEquals(expected, result);
    }
}

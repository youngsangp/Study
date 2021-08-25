package programmers.stackqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class stackqueue4Test {
    @Test
    void name() {
        int[] args1 = {1, 2, 3, 2, 3};

        stackqueue4 stackqueue4 = new stackqueue4();
        int[] result = stackqueue4.solution(args1);

        int[] expected = {4, 3, 1, 1, 0};
        assertArrayEquals(expected, result);
    }
}

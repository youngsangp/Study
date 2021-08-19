package kakaobank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class programming5Test {
    @Test
    void name() {
        int[] args1 = {5, 3, 7, 9, 5, 2, 4, 9, 10, 6};

        programming5 programming5 = new programming5();
        int[] result = programming5.solution(args1);
        int[] expected = {5, 7, 3, 1, 3, 4, 3, 1, 0, 0};

        assertArrayEquals(expected, result);
    }
}

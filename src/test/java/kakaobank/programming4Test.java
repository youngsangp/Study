package kakaobank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class programming4Test {
    @Test
    void name() {
        int[] args1 = {5, 8, 3, 7, 10, 5, 4};
        int[][] args2 = {{1, 2}, {2, 4}, {1, 4}, {6, 5}, {3, 5}, {4, 6}};
        int args3 = 5;

        programming4 programming4 = new programming4();
        int result = programming4.solution(args1, args2, args3);
        int expected = 35;

        assertEquals(expected, result);
    }
}

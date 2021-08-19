package kakaobank;

import kakaoblind2021.Adinsertion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class programming2Test {
    @Test
    void name() {
        int[][] args1 = {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1} };
        int args2 = 2;

        programming2 programming2 = new programming2();
        int result = programming2.solution(args1, args2);
        int expected = 4;

        assertEquals(expected, result);
    }
}

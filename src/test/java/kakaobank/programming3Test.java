package kakaobank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class programming3Test {
    @Test
    void name() {
        int args1 = 3;
        int[] args2 = {0, 1, 2};

        programming3 programming3 = new programming3();
        int result = programming3.solution(args1, args2);
        int expected = 2;

        assertEquals(expected, result);
    }
}

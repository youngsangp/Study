package programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class stackqueue3Test {
    @Test
    void name() {
//        int args1 = 2;
//        int args2 = 10;
//        int[] args3 = {7, 4, 5, 6};

        int args1 = 100;
        int args2 = 100;
        int[] args3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        stackqueue3 stackqueue3 = new stackqueue3();

        int result = stackqueue3.solution(args1, args2, args3);
        int expected = 110;

        assertEquals(expected, result);
    }
}

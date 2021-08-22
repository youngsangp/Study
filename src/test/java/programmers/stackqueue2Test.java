package programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class stackqueue2Test {
    @Test
    void name() {
        int[] args1 = {2, 1, 3, 2};
        int args2 = 2;
//        int[] args1 = {1, 1, 9, 1, 1, 1};
//        int args2 = 0;

        stackqueue2 stackqueue2 = new stackqueue2();

        int result = stackqueue2.solution(args1, args2);
        int expected = 1;
//        int expected = 5;

        assertEquals(expected, result);
    }
}

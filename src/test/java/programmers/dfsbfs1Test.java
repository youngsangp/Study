package programmers;

import org.junit.jupiter.api.Test;
import programmers.dfsbfs1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class dfsbfs1Test {
    @Test
    void array2Test() {
        int[] args1 = {1, 1, 1, 1, 1};
        int args2 = 3;

        dfsbfs1 dfsbfs1 = new dfsbfs1();

        int result = dfsbfs1.dfsbfs1(args1, args2);
        int expected = 5;
        assertEquals(expected, result);
    }
}

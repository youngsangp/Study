package programmers.dfsbfs;

import org.junit.jupiter.api.Test;
import programmers.dfsbfs.dfsbfs2;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class dfsbfs2Test {
    @Test
    void name() {

        int args1 = 3;
        int[][] args2 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        dfsbfs2 dfsbfs2 = new dfsbfs2();

        int result = dfsbfs2.solution(args1, args2);
        int expected = 2;
        assertEquals(expected, result);
    }
}

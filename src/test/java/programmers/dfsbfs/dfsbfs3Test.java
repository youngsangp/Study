package programmers.dfsbfs;

import org.junit.jupiter.api.Test;
import programmers.dfsbfs.dfsbfs3;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class dfsbfs3Test {
    @Test
    void name() {
        String args1 = "hit";
        String args2 = "cog";
        String[] args3 = {"hot", "dot", "dog", "lot", "log", "cog"};

        dfsbfs3 dfsbfs3 = new dfsbfs3();

        int result = dfsbfs3.solution(args1, args2, args3);
        int expected = 4;

        assertEquals(expected, result);
    }
}

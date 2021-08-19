package programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class dfsbfs4Test {
    @Test
    void name() {
//      String[][] args1 = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
//      String[][] args1 = {{"ICN", "B"}, {"B", "ICN"}, {"ICN", "A"}, {"A", "D"}, {"D", "A"}};
        String[][] args1 = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
        dfsbfs4 dfsbfs4 = new dfsbfs4();

        String[] result = dfsbfs4.solution(args1);
        //String[] expected = {"ICN", "JFK", "HND", "IAD"};
        String[] expected = {"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"};

        assertArrayEquals(expected, result);
    }
}

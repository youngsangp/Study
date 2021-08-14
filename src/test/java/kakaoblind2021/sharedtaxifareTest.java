package kakaoblind2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sharedtaxifareTest {
    @Test
    void name() {
//        int args1 = 6;
//        int args2 = 4;
//        int args3 = 6;
//        int args4 = 2;
//        int[][] args5 = {{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}};

        int args1 = 6;
        int args2 = 4;
        int args3 = 5;
        int args4 = 6;
        int[][] args5 = {{2, 6, 6}, {6, 3, 7}, {4, 6, 7}, {6, 5, 11}, {2, 5, 12}, {5, 3, 20}, {2, 4, 8}, {4, 3, 9}};

        sharedtaxifare sharedtaxifare = new sharedtaxifare();
        int result = sharedtaxifare.solution(args1, args2, args3, args4, args5);
        int expected = 18;

        assertEquals(expected, result);
    }
}

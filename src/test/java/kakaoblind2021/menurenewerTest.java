package kakaoblind2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class menurenewerTest {
    @Test
    void name() {
        //String[] args1 = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        String[] args1 = {"XYZ", "XWY", "WXA"};
        //int[] args2 = {2,3,4};
        int[] args2 = {2,3,4};

        menurenewer menurenewer = new menurenewer();
        String[] result = menurenewer.solution(args1, args2);

        //String[] expected = {"AC", "ACDE", "BCFG", "CDE"};
        String[] expected = {"WX", "XY"};

//        assertEquals(expected, expected);
        assertArrayEquals(expected, expected);
    }
}

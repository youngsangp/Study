package kakaoblind2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class newidrecommendationTest {
    @Test
    void newidrecommendationTest(){
        String args1 = "...!@BaT#*..y.abcdefghijklm";
        String args2 = "z-+.^.";
        String args3 = "=.=";
        String args4 = "123_.def";
        String args5 = "abcdefghijklmn.p";
        String args6 = ".......aaa.......";
        newidrecommendation newidrecommendation = new newidrecommendation();

        String result = newidrecommendation.New_ID_recommendation(args6);
        String expected1 = "bat.y.abcdefghi";
        String expected2 = "z--";
        String expected3 = "aaa";
        String expected4 = "123_.def";
        String expected5 = "abcdefghijklmn";
        String expected6 = "aaa";

        assertEquals(expected6, result);

    }
}

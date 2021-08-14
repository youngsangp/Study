package kakaoblind2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdinsertionTest {
    @Test
    void name() {
        String args1 = "50:00:00";
        String args2 = "50:00:00";
        String[] args3 = {"15:36:51-38:21:49", "10:14:18-15:36:51", "38:21:49-42:51:45"};

        Adinsertion Adinsertion = new Adinsertion();
        String result = Adinsertion.solution(args1, args2, args3);
        String expected = "00:00:00";

        assertEquals(expected, result);
    }
}

package programmers.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class array2Test {
    @Test
    void array2Test() {
        int[] args1 = {6, 10, 2};

        array2 array2 = new array2();

        String result = array2.array2(args1);
        String expected = "6210";
        assertEquals(expected, result);
    }
}

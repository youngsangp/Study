package programmers;

import org.junit.jupiter.api.Test;
import programmers.hash4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class hash4Test {
    @Test
    void hash4(){
        String[] args1 = { "classic", "pop", "classic", "classic", "pop" };
        int[] args2 = { 500, 600, 150, 800, 2500 };

        hash4 hash4 = new hash4();

        int[] reuslt = hash4.hash4(args1, args2);

        int[] expected = {4, 1, 3, 0};
        assertArrayEquals(expected, reuslt);
    }
}

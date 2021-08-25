package programmers.hash;

import org.junit.jupiter.api.Test;
import programmers.hash.hash1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class hash1Test {
    @Test
    void hash1(){
        String[] args1 = {
                "leo"
                , "kiki"
                , "eden"
        };
        String[] args2 = {
                "eden"
                , "kiki"
        };

        hash1 hash1 = new hash1();

        String result = hash1.hash1(args1, args2);
        assertEquals("leo", result);
    }
}

package programmers.hash;

import org.junit.jupiter.api.Test;
import programmers.hash.hash2;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class hash2Test {
    @Test
    void hash2(){
        String[] args1 = {
                "119"
                , "97674223"
                , "1195524421"
        };
        String[] args2 = {
                "123"
                ,"456"
                ,"789"
        };
        String[] args3 = {
                "12"
                ,"123"
                ,"1235"
                ,"567"
                ,"88"
        };

        hash2 hash2 = new hash2();

        boolean reuslt = hash2.hash2(args3);
        assertEquals(false, reuslt);
    }
}

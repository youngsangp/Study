import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TEST {
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

    @Test
    void hash3(){
        String[][] args1 = {{
                "yellowhat", "headgear"
        }, {
                "bluesunglasses", "eyewear"
        }, {
                "green_turban", "headgear"
        }};   //5
        String[][] args2 = {{
                "crowmask", "face"
        }, {
                "bluesunglasses", "face"
        }, {
                "smoky_makeup", "face"
        }};  //3

        hash3 hash3 = new hash3();

        int reuslt = hash3.hash3(args1);
        assertEquals(5, reuslt);
    }
}

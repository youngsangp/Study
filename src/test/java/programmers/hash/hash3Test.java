package programmers.hash;

import org.junit.jupiter.api.Test;
import programmers.hash.hash3;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class hash3Test {
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

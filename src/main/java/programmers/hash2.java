package programmers;

import java.util.HashMap;
import java.util.Map;

public class hash2 {
    public boolean hash2(String[] phone_book) {
        boolean answer = true;

        Map<String, String> phone_bookMap = new HashMap<>();

        for(String phone : phone_book){
            phone_bookMap.put(phone, "");
        }

        for(String Number : phone_bookMap.keySet()) {
            for(int i=0; i<Number.length(); i++){
                if(phone_bookMap.containsKey(Number.substring(0,i))){
                    answer = false;
                    return answer;
                }
            }
        }

        return answer;
    }
}

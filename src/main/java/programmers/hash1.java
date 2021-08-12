package programmers;

import java.lang.reflect.Array;
import java.util.*;

public class hash1 {
    public String hash1(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> partMap = new HashMap<>();

        for(String Name : participant){
            if(partMap.get(Name) == null){
                partMap.put(Name, 1);
            }else{
                partMap.put(Name, partMap.get(Name)+1);
            }
        }

        for(String Name : completion){
            partMap.put(Name, partMap.get(Name)-1);
        }

        for(String key: partMap.keySet()){
            int value = partMap.get(key);
            if(value != 0){
                answer = key;
            }
        }

        return answer;
    }
}

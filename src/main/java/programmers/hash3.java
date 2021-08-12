package programmers;

import java.util.HashMap;
import java.util.Map;

public class hash3 {
    public int hash3(String[][] clothes) {
        int answer = 0;

        Map<String, String> clothesMap = new HashMap<>();
        Map<String, Integer> clothesCount = new HashMap<>();

        for(String[] clothesArray : clothes){
            clothesMap.put(clothesArray[0], clothesArray[1]);
        }

        if(clothesMap.keySet().size() == 1){
            answer = clothes.length;
            return answer;
        }

        for(String clothesName : clothesMap.keySet()){
            String clothesKinds = clothesMap.get(clothesName);
            if(!clothesCount.containsKey(clothesKinds)){ //처음 세팅
                clothesCount.put(clothesKinds, 1+1); //선택하지 않는다 라는 항목 추가
            }else{
                clothesCount.put(clothesKinds, clothesCount.get(clothesKinds)+1);
            }
        }

        int multip = 1;
        for(String key : clothesCount.keySet()) {
            multip = multip * clothesCount.get(key);
        }
        answer=multip-1;

        return answer;
    }
}

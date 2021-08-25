package programmers.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class array2 {
    public String array2(int[] numbers) {
        String answer = "";

        String[] strArray = new String[numbers.length];

        for(int i=0; i<numbers.length; i++){
            strArray[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        for(String num : strArray){
            answer += num;
        }

        if(answer.charAt(0) == "0".charAt(0)){
            answer = "0";
        };


        return answer;
    }
}

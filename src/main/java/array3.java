import java.util.Arrays;

public class array3 {
    public int array3(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        if( citations[0] == citations[citations.length-1]){
            answer = citations[0];
        }

        for(int i=0; i<citations[citations.length-1]; i++){
            int cnt = 0;
            for(int num : citations){
                if(num >= i){
                    cnt += 1;
                }

                if(cnt >= i){
                    answer = i;
                }
            }
        }

//        for(int i=0; i<citations.length;i++) {
//            if(citations[i] <= (citations.length - i)){
//                answer =citations[i];
//            }
//        }

        return answer;
    }
}


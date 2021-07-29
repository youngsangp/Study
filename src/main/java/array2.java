import java.util.Arrays;

public class array2 {
    public String array2(int[] numbers) {
        String answer = "";

        //System.out.println(1<<numbers.length);
        int[] tempArray = new int[1<<numbers.length];

        for(int i = 0; i < (1<<numbers.length); i++){
            for(int j=0; j<numbers.length; j++){
                //numbers[]

            }
        }
        Arrays.sort(tempArray);
        answer = Integer.toString(tempArray[0]);

        return answer;
    }
}

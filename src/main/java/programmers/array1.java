package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class array1 {
    public int[] array1(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] tempArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(tempArray);

            int idx = commands[i][2] - 1;
            answer[i] = tempArray[idx];
        }

        return answer;
    }
}

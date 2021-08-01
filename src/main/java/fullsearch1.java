public class fullsearch1 {
    public int fullsearch1(String numbers) {
        int answer = 3;

        char[] txt = numbers.toCharArray();

        for(int i=1; i < (1<<txt.length); i++){
            for(int j=0; j<txt.length; j++){
                if((i & 1<<j) != 0){

                }
            }
        }

        System.out.println();

        return answer;
    }
}

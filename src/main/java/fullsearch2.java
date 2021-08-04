import java.util.ArrayList;
/*
    #문제 설명
        한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

        각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

    #제한사항
        numbers는 길이 1 이상 7 이하인 문자열입니다.
        numbers는 0~9까지 숫자만으로 이루어져 있습니다.
        "013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
 */
public class fullsearch2 {
    public int isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return 0;
        }
        return 1;
    }

    public void setValue(int digit, String str, ArrayList numArr){  //digit: 자릿수 || str: 주어진 numbers
        //base condition
        if(str.length() == digit){
            int intStr = Integer.parseInt(str);
            if(!numArr.contains(intStr))  numArr.add(intStr);
            return;
        }else{
            for(int i=0; i<args.length(); i++){
                if(useArray[i]) continue; // 사용여부 판단

                str += String.valueOf(args.charAt(i));
                useArray[i] = true;
                setValue(digit, str, numArr);
                useArray[i] = false;
                str = str.substring(0, str.length()-1);
            }
        }
    }

    static String args = "";
    static int answer = 0;
    static boolean[] useArray = new boolean[7];

    public int fullsearch2(String numbers) {
        args = numbers;
        String str = "";

        ArrayList<Integer> numArray = new ArrayList<Integer>();

        for(int i=1; i<=numbers.length(); i++){
            setValue(i, str, numArray);
        }

        for(int j=0; j<numArray.size(); j++){
            if(numArray.get(j) == 0) continue;
            if(numArray.get(j) == 1) continue;

            //System.out.println(numArray.get(j));
            answer += isPrime(numArray.get(j));
        }

        return answer;
    }
}

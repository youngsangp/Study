package kakaoblind2021;

/*
        -------------------------------------------------------------------------------------------------------
        아이디의 길이는 3자 이상 15자 이하여야 합니다.
        아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
        단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
        -------------------------------------------------------------------------------------------------------
        [문제]
        신규 유저가 입력한 아이디를 나타내는 new_id가 매개변수로 주어질 때, "네오"가 설계한 7단계의 처리 과정을 거친 후의 추천 아이디를 return 하도록 solution 함수를 완성해 주세요.
        -------------------------------------------------------------------------------------------------------
        1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
             만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        -------------------------------------------------------------------------------------------------------

        [제한사항]
        new_id는 길이 1 이상 1,000 이하인 문자열입니다.
        new_id는 알파벳 대문자, 알파벳 소문자, 숫자, 특수문자로 구성되어 있습니다.
        new_id에 나타날 수 있는 특수문자는 -_.~!@#$%^&*()=+[{]}:?,<>/ 로 한정됩니다.
 */

import java.util.regex.Pattern;

public class newidrecommendation {
    public String New_ID_recommendation(String new_id) {
        String answer = "";
        StringBuilder rec_id = new StringBuilder(new_id);

        // STEP1
        for(int i=0; i<rec_id.length(); i++){
            if(Character.isUpperCase(rec_id.charAt(i))){
                rec_id.setCharAt(i, Character.toLowerCase(rec_id.charAt(i)));
            }
        }
        System.out.println("STEP1 END: "+ rec_id);
        // STEP2
        for(int i=0; i<rec_id.length(); i++){
            if(Pattern.matches("[a-z]",rec_id.subSequence(i, i+1))) continue;
            if(Pattern.matches("[0-9]",rec_id.subSequence(i, i+1))) continue;
            if(Pattern.matches("[-]",rec_id.subSequence(i, i+1)))   continue;
            if(Pattern.matches("[_]",rec_id.subSequence(i, i+1)))   continue;
            if(Pattern.matches("[.]",rec_id.subSequence(i, i+1)))   continue;

            rec_id.deleteCharAt(i--);
        }
        System.out.println("STEP2 END: "+ rec_id);

        // STEP3
        int cnt = 0;
        for(int i=0; i<rec_id.length(); i++){
            if(Pattern.matches("[.]", rec_id.subSequence(i, i+1))){
                cnt++;

                if(i == rec_id.length()-1){
                    rec_id.replace(i-cnt+1, i+1, ".");
                }
            }else{
                if(cnt > 1){
                    rec_id.replace(i-cnt, i, ".");
                    i = i - cnt;
                }
                cnt = 0;
            }
        }
        System.out.println("STEP3 END: "+ rec_id);

        // STEP4
        if(Pattern.matches("[.]",rec_id.subSequence(0, 0+1))){
            rec_id.deleteCharAt(0);
        }
        if(rec_id.length() > 0){
            if(Pattern.matches("[.]",rec_id.subSequence(rec_id.length()-1, rec_id.length()))){
                rec_id.deleteCharAt(rec_id.length()-1);
            }
        }
        System.out.println("STEP4 END: "+ rec_id);

        // STEP5
        if(rec_id.length() == 0){
            rec_id.append("a");
        }
        System.out.println("STEP5 END: "+ rec_id);

        // STEP6
        if(rec_id.length() >= 16){
            rec_id.delete(15, rec_id.length());
        }
        if(Pattern.matches("[.]",rec_id.subSequence(rec_id.length()-1, rec_id.length()))){
            rec_id.deleteCharAt(rec_id.length()-1);
        }
        System.out.println("STEP6 END: "+ rec_id);

        // STEP7
        if(rec_id.length() <= 2){
            while(rec_id.length()<3) {
                rec_id.append(rec_id.charAt(rec_id.length() - 1));
            }
        }
        System.out.println("STEP7 END: "+ rec_id);

        answer = rec_id.toString();
        return answer;
    }
}

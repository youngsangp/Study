import java.util.ArrayList;
import java.util.List;

public class fullsearch1 {
    /*
        #문제 설명
            수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

            1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
            2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
            3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

            1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

        #제한 조건
            시험은 최대 10,000 문제로 구성되어있습니다.
            문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
            가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
     */
    int checkAnswerMan1(int[] checkArray, int[] answers){
        int answerCnt = 0;
        int cnt=0;
        for(int i=0; i<answers.length; i++){
            if(cnt == checkArray.length){
                cnt=0;
            }

            if(answers[i] == checkArray[cnt]){
                answerCnt++;
            }
            cnt++;
        }
        return answerCnt;
    };

    int checkAnswerMan2(int[] checkArray, int[] answers){
        int answerCnt = 0;
        int cnt=0;
        for(int i=0; i<answers.length; i++){
            if(cnt == checkArray.length){
                cnt=0;
            }

            if(i%2==0){
                if(answers[i] == 2){
                    answerCnt++;
                }
            }else{
                if(answers[i] == checkArray[cnt]){
                    answerCnt++;
                }
                cnt++;
            }
        }
        return answerCnt;
    };

    int checkAnswerMan3(int[] checkArray, int[] answers){
        int answerCnt = 0;
        int cnt=0;
        for(int i=0; i<answers.length; i++){
            if(cnt == checkArray.length){
                cnt=0;
            }

            if(answers[i] == checkArray[cnt]){
                answerCnt++;
            }

           if(i!=0 && i%2!=0){
               cnt++;
           }
        }
        return answerCnt;
    };

    public int[] fullsearch1(int[] answers) {
        int[] answer = {};
        int[] man1 = {1,2,3,4,5}; // 배열 반복
        int[] man2 = {1,3,4,5}; // 0번째 사이사이 반복
        int[] man3 = {3,1,2,4,5}; //각 두번씩

        Integer answerCnt[] = new Integer[3];

        answerCnt[0] = checkAnswerMan1(man1, answers);
        answerCnt[1] = checkAnswerMan2(man2, answers);
        answerCnt[2] = checkAnswerMan3(man3, answers);

        List<Integer> answerList = new ArrayList();
        int maxValue = 0;

        for(int i=0; i<answerCnt.length; i++){
            if(maxValue < answerCnt[i]){
                maxValue = answerCnt[i];
                answerList.removeAll(answerList);
                answerList.add(i+1);
                continue;
            }

            if(maxValue == answerCnt[i]){
                maxValue = answerCnt[i];
                answerList.add(i+1);
            }
        }

        answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}

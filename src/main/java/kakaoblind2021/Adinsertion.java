package kakaoblind2021;

public class Adinsertion {
    int convert(String time){
        String[] timeArr = time.split(":");
        int Second = Integer.parseInt(timeArr[0])*3600 + Integer.parseInt(timeArr[1])*60 + Integer.parseInt(timeArr[2]);
        return Second;
    }

    String reconvert(long time){   //126
        System.out.println(Long.toString(time));
        long hour = time/3600;
        String hourStr = hour < 10 ? "0"+hour : Long.toString(hour);
//        System.out.println("시: "+hourStr);

        long min = (time - 3600 * hour)/60;
        String minStr = min < 10 ? "0"+min : Long.toString(min);
//        System.out.println("분: "+minStr);

        long sec = (time - 3600 * hour - 60 * min);
        String secStr = sec < 10 ? "0"+sec : Long.toString(sec);
//        System.out.println("초: "+minStr);

        return hourStr+":"+minStr+":"+secStr;
    }

    public String solution(String play_time, String adv_time, String[] logs) {
        String answer = "";

        int playTimeSec = convert(play_time);
        int advTimeSec = convert(adv_time);

        int[] playTimeArr = new int[3600*100];

        //Setting
        for(String logTime : logs){
            String[] tempTime = logTime.split("-");
            int startTime = convert(tempTime[0]);
            int endTime = convert(tempTime[1]);

            for(int i=startTime; i<endTime; i++){
                playTimeArr[i] += 1;
            }
        }

        //Checkng
        long tempVal = 0;
        for(int i=0; i<advTimeSec; i++){
            tempVal += playTimeArr[i];
        }

        long startPoint = 0;
        long val = tempVal;
        for(int i=advTimeSec; i<playTimeSec; i++){
            tempVal = tempVal + playTimeArr[i] - playTimeArr[i-advTimeSec];

            if(tempVal > val){
                startPoint = i-advTimeSec+1;
                val = tempVal;
            }
        }

        answer = reconvert(startPoint);

        return answer;
    }
}

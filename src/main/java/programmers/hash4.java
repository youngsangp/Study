package programmers;

import java.util.*;

public class hash4 {
    public int[] hash4(String[] genres, int[] plays) {
        int[] answer = {};

        Map<String, Integer> genresCountMap = new HashMap<>();
        List<genres> genresCountList = new ArrayList<genres>();

        for(int i=0; i<genres.length; i++){
            genresCountMap.put(genres[i], genresCountMap.getOrDefault(genres[i], 0) + plays[i]);
        }

        for(String genresStr : genresCountMap.keySet()){
            genresCountList.add(new genres(genresStr, genresCountMap.get(genresStr)));
        }
        
        // 장르 플레이 수 정렬
        Collections.sort(genresCountList, new Comparator<genres>() {
            @Override
            public int compare(genres o1, genres o2) {
                return Integer.compare(o2.getPlays(), o1.getPlays());
            }
        });

        //--------------------------------------------------요기 몬가 있는데 모르겠네
        List<Integer> temp = new ArrayList<>();
        for(genres key : genresCountList){
            int cnt = 0;
            int[] playsArray = new int[2];
            int[] tempArray = new int[2];

            for(int i=0; i<genres.length; i++){
                if(key.getGenres().equals(genres[i])){
                    if(cnt == 0){
                        playsArray[0] = plays[i];
                        tempArray[0] = i;
                        cnt++;
                        continue;
                    }

                    if(plays[i] > playsArray[0]){
                        playsArray[1] = playsArray[0];
                        playsArray[0] = plays[i];
                        tempArray[1] = tempArray[0];
                        tempArray[0] = i;
                    }else if(plays[i] > playsArray[1]){
                        playsArray[1] = plays[i];
                        tempArray[1] = i;
                    }
                    cnt++;
                }
            }

            temp.add(tempArray[0]);
            if(cnt>=2){
                temp.add(tempArray[1]);
            }
        }

        answer = new int[temp.size()];
        for(int i=0; i<answer.length;i++){
            answer[i] = temp.get(i).intValue();
        }
        //--------------------------------------------------

        return answer;
    }
}

class genres {
    private String genres = "";
    private int plays = 0;

    public genres(String genres, int plays){
        this.genres = genres;
        this.plays = plays;
    }

    public String getGenres() {
        return genres;
    }

    public int getPlays() {
        return plays;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public void setPlays(int plays) {
        this.plays = plays;
    }
}

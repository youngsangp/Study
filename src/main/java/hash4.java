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

        Collections.sort(genresCountList, new Comparator<genres>() {
            @Override
            public int compare(genres o1, genres o2) {
                return Integer.compare(o2.getPlays(), o1.getPlays());
            }
        });

        for(genres genresStr : genresCountList){
            for(int i=0; i<plays.length;i++){
                if(genresStr.getGenres().equals(genres[i])){

                }
            }
        }

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

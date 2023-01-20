import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int highestScore=scores.get(0);
        int leastScore= scores.get(0);
        int countBrokeBestRecord=0;
        int countBrokeWorstRecord=0;

        for(int i=1;i<scores.size();i++) {
            int score=scores.get(i);
            if(score>highestScore) {
                highestScore= score;
                countBrokeBestRecord++;
            }
            else if(score<leastScore) {
                leastScore=score;
                countBrokeWorstRecord++;
            }
        }

        return new ArrayList<Integer>(Arrays.asList(countBrokeBestRecord,countBrokeWorstRecord));
    }
}

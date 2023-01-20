import java.util.Collections;
import java.util.List;

public class MinMaxSum {

    public static void minMaxSum(List<Integer> array){
        // first I order the received array
        Collections.sort(array);

        long smallestSummatory = 0;
        long biggestSummatory = 0;

        // The excercise request to choose 4 out of 5 numbers
        for (int i = 0; i < array.size() - 1; i++) {
            smallestSummatory += array.get(i);
        }

        for (int i = 4; i > 0 ; i--) {
            biggestSummatory += array.get(i);
        }

        System.out.println(smallestSummatory + " " + biggestSummatory);

    }
}

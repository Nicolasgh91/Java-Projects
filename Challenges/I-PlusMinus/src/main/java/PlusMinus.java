import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class PlusMinus {

        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void plusMinus(List<Integer> arr) {
            // Write your code here
            float positives = 0;
            float negatives = 0;
            float zeros = 0;

            for (int i = 0; i < arr.size(); i++) {
                if ( arr.get(i) > 0){
                    positives++;
                } else if (arr.get(i) < 0) {
                    negatives++;
                } else {
                    zeros++;
                }
            }
            System.out.println(String.format("%6f",(positives / arr.size())));
            System.out.println(String.format("%6f",(negatives / arr.size())));
            System.out.println(String.format("%6f",(zeros / arr.size())));
        }
    }





import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<List<Integer>> test = new ArrayList<>();

        List<Integer> firstArr = new ArrayList<>();
        List<Integer> secondArr = new ArrayList<>();
        List<Integer> thirdArr = new ArrayList<>();

        firstArr.add(1);
        firstArr.add(2);
        firstArr.add(3);

        secondArr.add(4);
        secondArr.add(5);
        secondArr.add(6);

        thirdArr.add(9);
        thirdArr.add(8);
        thirdArr.add(9);


        test.add(0,firstArr);
        test.add(1,secondArr);
        test.add(2,thirdArr);

        System.out.println(DiagonalDifference.diagonalDifference(test));

    }
}

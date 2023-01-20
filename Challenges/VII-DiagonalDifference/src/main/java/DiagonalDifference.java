import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            firstDiagonal += arr.get(i).get(i);
        }

        for (int j = 0; j < arr.size(); j++) {
            secondDiagonal += arr.get(j).get(arr.size() - (j + 1));
        }
        return Math.abs(firstDiagonal - secondDiagonal);
    }

}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayTest = new ArrayList<Integer>();
        arrayTest.add(20);
        arrayTest.add(14);
        arrayTest.add(10);
        arrayTest.add(8);
        arrayTest.add(2);


    MinMaxSum test = new MinMaxSum();
    test.minMaxSum(arrayTest);

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws IOException {

        PlusMinus test = new PlusMinus();

        List<Integer> array = new ArrayList<>();
        array.add(0,10);
        array.add(0,8);
        array.add(0,6);
        array.add(0,4);
        array.add(0,-2);

        test.plusMinus(array);






    }
}

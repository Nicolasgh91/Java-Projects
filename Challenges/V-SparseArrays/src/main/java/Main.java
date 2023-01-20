import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add(0,"ab");
        strings.add(1,"ab");
        strings.add(2,"abc");

        List<String> queries = new ArrayList<>();
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");

        System.out.println(SparseArrays.matchingStrings(strings,queries));


    }
}

import java.util.List;

public class LonelyInteger {

    public static int lonelynteger(List<Integer> a) {
        // Write your code here
        int lonelyInteger = 0;

        for (int i = 0; i < a.size(); i++) {

            if (a.indexOf( a.get(i)) == a.lastIndexOf( a.get(i) )) {

                lonelyInteger = a.get(i);

            }
        }
        return lonelyInteger;
    }
}

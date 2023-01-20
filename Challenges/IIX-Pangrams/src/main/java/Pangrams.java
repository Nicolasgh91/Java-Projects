import java.util.TreeSet;

public class Pangrams {

    public static String pangrams(String s) {
        // Write your code here

        s=s.replaceAll(" ", "");
        s=s.toLowerCase();
        TreeSet<Character> setOfCharacters = new TreeSet<>();

        for (int i = 0; i < s.length(); i++) {
            setOfCharacters.add( s.charAt(i) );
        }

        if (setOfCharacters.size() == 26){
            return "pangram";
        } else if (setOfCharacters.size() < 26) {
            return "not pangram";
        }
        else return "not pangram";
    }
}

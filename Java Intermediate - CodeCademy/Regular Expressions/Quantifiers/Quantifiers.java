import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {

    public static void main(String[] args) {

        // It looks for words with 2 or more "a"
        Pattern pattern = Pattern.compile("(\\w*[aA]\\w*){2,}");
        Matcher matcher = pattern.matcher("Is it Bananagrams or Banana Grams?");

        int i = 0;
        while (matcher.find()){
            i++;
        }
        System.out.println(i);

        


    }







}

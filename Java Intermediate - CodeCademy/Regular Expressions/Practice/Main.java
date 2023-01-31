import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("nap time",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Every morning starts with some nap time!");

        String codecademy = matcher.replaceAll("Codecademy");
        //System.out.println(codecademy);



        Pattern patternTwo = Pattern.compile("[g]");
        Matcher matcherTwo = patternTwo.matcher("Vibrant light bloomed across the gray sky, " +
                "illuminating its grey haze in flashes amidst rolling hills of wispy gray clouds." +
                " Colors of gold, pink, and purple painted the horizon, the dull grey of the sky " +
                "overtaken by brief moments of a quiet twilight storm.");

        int amountOfMatches = 0;
        boolean nextMatch = matcherTwo.find();

        String gray = matcherTwo.replaceAll("gray");
        System.out.println(gray);













    }
}

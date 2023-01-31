import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alternation {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("grey|gray");
        Matcher matcher = pattern.matcher("Vibrant light bloomed across the gray" +
                " sky, illuminating its grey haze in flashes amidst rolling hills" +
                " of wispy gray clouds. Colors of gold, pink, and purple painted" +
                " the horizon, the dull grey of the sky overtaken by brief moments" +
                " of a quiet twilight storm.");

        while (matcher.find()){
            System.out.println(matcher.replaceAll("grey"));
        }


    }
}

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CaptureGroups {


    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\n");
        Matcher matcher = pattern.matcher("1\n2\n3\n4\n5\n6\n7\n8\n9\n10");

        int i = 0;
        while (matcher.find()){
            i++;
        }
        System.out.println(i);

        // From the defined pattern (in this case \n), will now replace them with ","
        String stringWithComma = matcher.replaceAll(",");
        System.out.println(stringWithComma);

        String previousStringAsArray = "[" + stringWithComma + "]";
        System.out.println(previousStringAsArray);



    }


}

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Grep {
    
    
    
    public static void main(String[] args) {

    String fileNameToLook;
    File f;
    Scanner scanner;
    Pattern pattern;
    Matcher matcher;
    String textLineFromFile;

        for (int i = 1; i <= 5; i++) {

            // It iterates looking for 5 files matching this name, file1, file2...
            fileNameToLook = "TestFile" + i + ".txt";

            try {
                // It will create a new file
                f = new File(fileNameToLook);
                // It will scan each file
                scanner = new Scanner(f);

            } catch (Exception e){
                System.out.println("Could't find the requested file");
                e.printStackTrace();
                return;
            }

            // Whie the scanner finds a line of text in the file, it prints it out
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());

                // The scanned line of text will be saved as a String
                textLineFromFile = scanner.nextLine();
                // It defines a pattern to search for the text just found on the file
                pattern = Pattern.compile("\\w*\\d+\\w*");
                matcher = pattern.matcher(textLineFromFile);

                if (matcher.find()){
                    System.out.println(f + ": " + textLineFromFile);
                }

            }


        }
        





    }


}

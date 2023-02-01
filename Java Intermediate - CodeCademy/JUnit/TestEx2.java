// Test imports
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
// File imports
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
// Possible exceptions to detect
import java.io.IOException;

public class TestEx2 {

    static File file;
    static FileWriter w;
    static Scanner s;

    @Before
    public void beforeEachTest() throws IOException {

        file = new File("test.txt");
        w = new FileWriter("test.txt");
        s = new Scanner(file);
    }


    @Test
    public void test1() throws IOException {

        w.write("Testing testing 1 2 3!");
        w.close();

        assertThat(s.nextLine(), equalTo("Testing testing 1 2 3!"));

    }

    @Test
    public void test2() throws IOException {

        w.write("Poking poking 4 5 6!");
        // The writer has to be closed here to save the information on the file and needs
        // to happen before the scanner tries to perform its scan.
        w.close();
        assertThat(s.nextLine(), equalTo("Poking poking 4 5 6!"));

    }

    @After
    public void afterEachTest() throws IOException {
        s.close();
    }

}
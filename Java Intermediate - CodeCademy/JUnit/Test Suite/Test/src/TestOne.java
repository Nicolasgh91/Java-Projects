import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import static org.junit.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestOne {
    String test = "Test one!";

    @Test
    public void test2() {
        MatcherAssert.assertThat(test, CoreMatchers.equalTo("Test one !"));
    }
}

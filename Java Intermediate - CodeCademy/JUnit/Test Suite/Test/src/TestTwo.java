import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import static org.junit.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestTwo {
    String test = "Test two!";

    @Test
    public void test2() {
        MatcherAssert.assertThat(test, CoreMatchers.equalTo("Test two!"));
    }
}

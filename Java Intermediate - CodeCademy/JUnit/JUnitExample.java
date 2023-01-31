import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Ignore;

import static org.junit.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class JUnitExample {
    int a;

    @Before
    public void beforeTest() {
        a = 10;
    }

    @Test
    public void test() {
        assertThat(a, equalTo(10));
    }

    @Ignore
    public void ignoredTest() {
        assertThat(a, equalTo(50));
    }

    @After
    public void afterTest() {
        a = 0;
    }
}


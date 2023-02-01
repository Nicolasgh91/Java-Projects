import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestExample {
    int a;
    int b;
    int c;

    Example ex = new Example();
    Example ex2 = new Example();

    @Before
    public void beforeEachTest(){
        a = 10;
        b = -5;
        c = 0;
    }

    @Test
    public void testIsPositive() {
        // Equal to 1 means it it looking for a match on the previous method
        // which it looks for a positive number
        assertThat(ex.isPositive(a), equalTo(1));
        // Same here, but opposite, if it's not positive and the equal is set
        // to 0 it means that a negative number will pass the test.
        assertThat(ex.isPositive(b), equalTo(0));
        // The -1 here will check for a cero resulting operation or variable.
        assertThat(ex.isPositive(c), equalTo(-1));
    }



    @Test
    public void testFactorial() {
        assertThat(ex2.factorial(4), equalTo(24));
        assertThat(ex2.factorial(5), equalTo(120));
        assertThat(ex2.factorial(1), equalTo(1));
        assertThat(ex.factorial(0), equalTo(1));
    }
}

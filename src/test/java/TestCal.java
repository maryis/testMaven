import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class TestCal {

    int i, j, expected;

    public TestCal(int i, int j, int expected) {
        this.i = i;
        this.j = j;
        this.expected = expected;
    }

    @Before
    public void testAdd() {
        System.out.println("before method call");

    }

    @After
    public void runAfter() {
        System.out.println("after method call");

    }

    @Parameterized.Parameters  // static
    public static Object[][] createCollection() {
        return new Object[][]{
                {2, 3, 5},
                {4, 5, 9},
                {10, 23, 33}
        };
    }

    @Test
    public void testMethod() {

        int actual = Calculateing.add(i, j);
        Assert.assertEquals(new Long(actual), new Long(expected));

    }
}

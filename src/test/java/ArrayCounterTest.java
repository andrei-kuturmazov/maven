import org.testng.annotations.*;

import static org.testng.Assert.*;

public class ArrayCounterTest {

    @BeforeClass
    static void setUp() {
        System.out.println("Hello world from TestNG tests");
    }

    @AfterClass
    static void tearDown() {
        System.out.println("Goodbye world from TestNG tests");
    }

    @DataProvider
    public Object[][] maxValueTest() {
        return new Object[][] {
                {3, new int[] {3}},
                {5, new int[] {5, -1, 4}},
                {-3, new int[] {-5, -3, -18}},
                {11, new int[] {5, 11, 11, 10, 0, -3}},
                {4, new int[] {2, 0, 4}}
        };
    }

    @DataProvider
    public Object[][] minValueTest() {
        return new Object[][] {
                {1, new int[] {3, 1, 1, 5, 7}},
                {-1, new int[] {1, -1, 13, 4}},
                {0, new int[] {5, 7, 19, 0}},
                {-8, new int[] {-8, -1, -2, -2}},
                {-5, new int[] {-5}}
        };
    }

    @Test(dataProvider = "maxValueTest", testName = "Find max value test")
    public void testFindMax(int result, int[] numbers) {
        assertEquals(result, ArrayCounter.findMax(numbers));
    }

    @Test(dataProvider = "minValueTest", testName = "Find min value test")
    public void testFindMin(int result, int[] numbers) {
        assertEquals(result, ArrayCounter.findMin(numbers));
    }
}
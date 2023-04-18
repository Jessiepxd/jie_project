package jieproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 3 tests to test if user entered a valid total round number which is a positive integer
 *
 * @author jie chen
 */
public class RoundValidatorTest {

    public RoundValidatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("@BeforeClass -- Beginning Unit Tests\n");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("\n@AfterClass -- Unit Test Completed");
    }

    @Before
    public void setUp() {
        System.out.println("@Before");
    }

    @After
    public void tearDown() {
        System.out.println("-----------------------");
    }

    @Test
    public void testTotalRoundNumberCheckerGood() {
        System.out.println("Testing TotalRoundNumberCheckerGood");
        String totalRound = "3";
        System.out.println("Now testing total number of round: " + totalRound);
        boolean expResult = true;
        boolean result = RoundValidator.totalRoundNumberChecker(totalRound);
        assertEquals(expResult, result);
    }

    @Test
    public void testTotalRoundNumberCheckerBad() {
        System.out.println("Testing TotalRoundNumberCheckerBad");
        String totalRound = "0";
        System.out.println("Now testing total number of round: " + totalRound);
        boolean expResult = false;
        boolean result = RoundValidator.totalRoundNumberChecker(totalRound);
        assertEquals(expResult, result);
    }

    @Test
    public void testTotalRoundNumberCheckerBoundary() {
        System.out.println("Testing TotalRoundNumberCheckerBoundary");
        String totalRound = "1";
        System.out.println("Now testing total number of round: " + totalRound);
        boolean expResult = true;
        boolean result = RoundValidator.totalRoundNumberChecker(totalRound);
        assertEquals(expResult, result);
    }
}

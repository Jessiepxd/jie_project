package jieproject;

import java.util.ArrayList;
import java.util.Arrays;
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
public class PickCardCheckerTest {

    public PickCardCheckerTest() {
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
    public void testisValidCardGood() {
        System.out.println("Testing isValidCardGood");
        String userSelectedCard = "2";
        ArrayList hand = new ArrayList(Arrays.asList("element1", "element2", "element3"));
        System.out.println("Total number of cards in hand: " + hand.size() + "; Selected card index: " + userSelectedCard);
        boolean expResult = true;
        boolean result = PickCardChecker.isValidCard(userSelectedCard, hand);
        assertEquals(expResult, result);
    }

    @Test
    public void testisValidCardBad() {
        System.out.println("Testing isValidCardBad");
        String userSelectedCard = "4";
        ArrayList hand = new ArrayList(Arrays.asList("element1", "element2", "element3"));
        System.out.println("Total number of cards in hand: " + hand.size() + "; Selected card index: " + userSelectedCard);
        boolean expResult = false;
        boolean result = PickCardChecker.isValidCard(userSelectedCard, hand);
        assertEquals(expResult, result);
    }

    @Test
    public void testisValidCardBoundary() {
        System.out.println("Testing isValidCardBoundary");
        String userSelectedCard = "3";
        ArrayList hand = new ArrayList(Arrays.asList("element1", "element2", "element3"));
        System.out.println("Total number of cards in hand: " + hand.size() + "; Selected card index: " + userSelectedCard);
        boolean expResult = true;
        boolean result = PickCardChecker.isValidCard(userSelectedCard, hand);
        assertEquals(expResult, result);
    }
}

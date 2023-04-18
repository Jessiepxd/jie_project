package jieproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 3 tests to test if user entered a username with length between 3 to 8
 *
 * @author jessie_pxd
 */
public class NameValidatorTest {

    public NameValidatorTest() {
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
    public void testIsValidNameLengthGood() {
        System.out.println("Testing isValidNameLengthGood");
        String name = "jiechen";
        System.out.println("Now testing username: " + name);
        boolean expResult = true;
        boolean result = NameValidator.isValidNameLength(name);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsValidNameLengthBad() {
        System.out.println("Testing isValidNameLengthBad");
        String name = "j c";
        System.out.println("Now testing username: " + name);
        boolean expResult = false;
        boolean result = NameValidator.isValidNameLength(name);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsValidNameLengthBoundary() {
        System.out.println("Testing isValidNameLengthBoundary");
        String name = "jc6";
        System.out.println("Now testing username: " + name);
        boolean expResult = true;
        boolean result = NameValidator.isValidNameLength(name);
        assertEquals(expResult, result);
    }
}

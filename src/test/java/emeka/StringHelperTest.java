package emeka;

import org.junit.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.Assert.*;
// this is testing with JUnit 4
public class StringHelperTest {
    private  StringHelper helper = new StringHelper();

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This is run once before the test");
    }
    @Before
    public void setup(){
//        helper = null;
        System.out.println("This is run before each test");
    }
    @Test
    public void testRemoveAInFirstTwoPosition_AInFirstTwoPositions(){
        assertEquals("BCD", helper.removeAInFirstTwoPosition("AABCD"));
    }

    @Test
    public void testRemoveAInFirstTwoPosition_AInFirstPosition(){
        assertEquals("BCD", helper.removeAInFirstTwoPosition("ABCD"));
    }

    @Test
    public void testRemoveAInFirstTwoPosition_AInSecondPosition(){
        assertEquals("BCD", helper.removeAInFirstTwoPosition("BACD"));
    }

    @Test
    public void testRemoveAInFirstTwoPosition_withoutA(){
        assertEquals("BCDF", helper.removeAInFirstTwoPosition("BCDF"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeCase(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveCase(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    @DisabledOnOs(value = OS.MAC, disabledReason = "this test is disabled for all mac systems")
    public void testAreFirstAndLastTwoCharactersTheSame_SingleChar(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_DoubleChar(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    @After
    public void teardown(){
        System.out.println("This is run after each test \n");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This is run once after the test");
    }

}
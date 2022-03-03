package emeka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * this test is written with JUnit 5
 */
class MathUtilsTest {
        MathUtils utils;
    @BeforeEach
    void setUp() {
        utils = new MathUtils();
    }

    @Test
    void addTest() {
        int a = 4;  int b = 3;
        int expectedValue = a + b;
        int actualValue = utils.add(a,b);
        assertEquals(expectedValue,actualValue,"This method adds two integers together");

    }

    @Test
    void multiply() {
    }
}
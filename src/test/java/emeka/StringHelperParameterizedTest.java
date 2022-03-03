package emeka;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.*;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

// this is testing with JUnit 4

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
    private  StringHelper helper = new StringHelper();

    private String inputs;
    private String expectedOutput;

    public StringHelperParameterizedTest(String inputs, String expectedOutput) {
        this.inputs = inputs;
        this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection<String []> testConditions(){
       String[][] expectedOutputs = {
               {"AABCD","BCD"},
               {"ABCD","BCD"},
               {"BACD","BCD"},
               {"BCDF","BCDF"}
       };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testRemoveAInFirstTwoPosition(){
        assertEquals(expectedOutput, helper.removeAInFirstTwoPosition(inputs));
        System.out.println(expectedOutput);
        System.out.println(inputs);
        System.out.println("***");
    }


}
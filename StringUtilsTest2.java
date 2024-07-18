package CS401_Summer2024_Ruben_Plascencia_assignment3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
 
@RunWith(Parameterized.class)
public class StringUtilsTest2 {
    private String input;
    private String result;

    public StringUtilsTest2(String input, String expectedOutput) {
        this.input = input;
        this.result = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {"ruben", "plascencia"},
                {"test", "TEST"},
                {"   blankspaces   ", "blankspaces"},
                {"", ""},
                {"abc123", "321cba"}
        });
    }

    @Test
    public void testConcatenate() {
        assertEquals(result, StringUtils.concatenate("world", input));
    }

    @Test
    public void testReversal() {
        assertEquals(result, StringUtils.reversal(input));
    }

    @Test
    public void testToUpperCase() {
        assertEquals(result, StringUtils.toUpperCase(input));
    }

    @Test
    public void testTrimWhitespace() {
        assertEquals(result, StringUtils.trimWhitespace(input));
    }
}
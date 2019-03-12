import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SuiteTest {

    @Test
    @DisplayName("Result is 2")
    void TestCase_001(){

        assertEquals(2,2);

    }

    @Test
    @DisplayName("assertion is true")
    void TestCase_2(){

        assertTrue(true);

    }
}

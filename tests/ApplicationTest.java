import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void testIsNameIsNotNull(){
        int expectedOutput = 36;
        int actualOutput = Application.calculateOverLappingArea(-1, -1, 10, 10, -1, 0, 3, 9);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testIfNotOverlapping(){
        // if rectangles doesn't overlapp at all, method should return zero
        int expectedOutput = 0;
        int actualOutput = Application.calculateOverLappingArea(-6,-6,-4,-4,1,1,4,4);
        assertEquals(expectedOutput, actualOutput);
    }
}
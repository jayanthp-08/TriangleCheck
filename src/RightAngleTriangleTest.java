import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RightAngleTriangleTest {

    @Test
    public void testValidRightAngledTriangle1() {
        assertEquals("It is a Right-Angled Triangle", RightAngleTriangle.rightAngleTriangle(3, 4, 5));
    }

    @Test
    public void testValidRightAngledTriangle2() {
        assertEquals("It is a Right-Angled Triangle", RightAngleTriangle.rightAngleTriangle(5, 12, 13));
    }

    @Test
    public void testInvalidRightAngledTriangle() {
        assertEquals("Its not a Right-Angled Triangle", RightAngleTriangle.rightAngleTriangle(4, 5, 6));
    }

    @Test
    public void testZeroSide() {
        assertEquals("Invalid Input, sides must be greater than zero", RightAngleTriangle.rightAngleTriangle(0, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("Its not a triangle", RightAngleTriangle.rightAngleTriangle(1, 2, 3));
    }
}

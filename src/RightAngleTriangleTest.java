import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for RightAngleTriangle (JUnit 5).
 */
public class RightAngleTriangleTest {

    @Test
    void testValidRightAngledTriangle1() {
        boolean result = RightAngleTriangle.isRightAngled(3, 4, 5);
        assertTrue(result, "3, 4, 5 should form a right-angled triangle");
    }

    @Test
    void testValidRightAngledTriangle2() {
        boolean result = RightAngleTriangle.isRightAngled(5, 12, 13);
        assertTrue(result, "5, 12, 13 should form a right-angled triangle");
    }

    @Test
    void testInvalidRightAngledTriangle() {
        boolean result = RightAngleTriangle.isRightAngled(2, 3, 4);
        assertFalse(result, "2, 3, 4 should NOT form a right-angled triangle");
    }

    @Test
    void testInvalidInputZeroSide() {
        // expect IllegalArgumentException for zero side
        assertThrows(IllegalArgumentException.class, () -> {
            RightAngleTriangle.isRightAngled(0, 12, 13);
        }, "Sides cannot be zero or negative");
    }

    @Test
    void testInvalidTriangleInequality() {
        // e.g., 1,2,3 is not a triangle (1+2 == 3)
        assertThrows(IllegalArgumentException.class, () -> {
            RightAngleTriangle.isRightAngled(1, 2, 3);
        }, "Triangle inequality violated should throw");
    }
}

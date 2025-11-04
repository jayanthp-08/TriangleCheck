import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RightAngleTriangleTest {

    @Test
    public void testValidTriangle1() {
        assertTrue(RightAngleTriangle.isRightAngled(3, 4, 5));
    }

    @Test
    public void testValidTriangle2() {
        assertTrue(RightAngleTriangle.isRightAngled(5, 12, 13));
    }

    @Test
    public void testValidTriangle3() {
        assertFalse(RightAngleTriangle.isRightAngled(0, 12, 13));
    }

    @Test
    public void testInvalidTriangle() {
        assertFalse(RightAngleTriangle.isRightAngled(1, 2, 3));
    }
}

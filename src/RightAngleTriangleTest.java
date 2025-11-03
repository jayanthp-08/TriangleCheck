import org.junit.Test;
import static org.junit.Assert.*; 
public class RightAngleTriangleTest {
    @Test
    public void testValidTriangle1() {
        boolean result = RightAngleTriangle.isRightAngled(3, 4, 5);
        assertTrue("3, 4, 5 should form a right-angled triangle", result);
    }
    @Test
    public void testValidTriangle2() {
        boolean result = RightAngleTriangle.isRightAngled(5, 12, 13);
        assertTrue("5, 12, 13 should form a right-angled triangle", result);
    }
    @Test
    public void testValidTriangle3() {
        boolean result = RightAngleTriangle.isRightAngled(0, 12, 13);
        assertTrue("0, 12, 13 should form a right-angled triangle", result);
    }
}
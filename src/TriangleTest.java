import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    @DisplayName("Valid scalene triangle: 3, 4, 5")
    void testValidScalene() {
        assertTrue(Triangle.isScalene(3, 4, 5));
    }

    @Test
    @DisplayName("Not scalene: Isosceles triangle (5, 5, 8)")
    void testIsosceles() {
        assertFalse(Triangle.isScalene(5, 5, 8));
    }

    @Test
    @DisplayName("Not scalene: Equilateral triangle (6, 6, 6)")
    void testEquilateral() {
        assertFalse(Triangle.isScalene(6, 6, 6));
    }

    @Test
    @DisplayName("Invalid triangle: violates triangle inequality (1, 2, 3)")
    void testInvalidTriangle() {
        assertThrows(IllegalArgumentException.class, () -> Triangle.isScalene(1, 2, 3));
    }

    @Test
    @DisplayName("Invalid triangle: zero or negative sides")
    void testInvalidSides() {
        assertThrows(IllegalArgumentException.class, () -> Triangle.isScalene(0, 4, 5));
        assertThrows(IllegalArgumentException.class, () -> Triangle.isScalene(-1, 4, 5));
    }

    @Test
    @DisplayName("Valid large scalene triangle: 100, 101, 150")
    void testLargeScalene() {
        assertTrue(Triangle.isScalene(100, 101, 150));
    }
}





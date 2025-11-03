import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegrationTest {

    @Test
    @DisplayName("Scalene and Equilateral behave as expected together")
    void testScaleneVsEquilateral() {
        // scalene: 3,4,5
        assertTrue(Triangle.isScalene(3,4,5));
        assertFalse(EquilateralTriangle.isEquilateral(3,4,5));

        // equilateral: 5,5,5
        assertTrue(EquilateralTriangle.isEquilateral(5,5,5));
        assertFalse(Triangle.isScalene(5,5,5));
    }

    @Test
    @DisplayName("Both modules handle invalid inputs consistently")
    void testInvalids() {
        assertThrows(IllegalArgumentException.class, () -> Triangle.isScalene(1,2,3));
        assertThrows(IllegalArgumentException.class, () -> EquilateralTriangle.isEquilateral(0,5,5));
    }
}

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest {

    // ---- Scalene vs Equilateral ----
    @Test
    @DisplayName("Scalene and Equilateral modules work correctly together")
    void testScaleneVsEquilateral() {
        // Scalene: 3,4,5
        assertTrue(Triangle.isScalene(3, 4, 5));
        assertFalse(EquilateralTriangle.isEquilateral(3, 4, 5));

        // Equilateral: 5,5,5
        assertTrue(EquilateralTriangle.isEquilateral(5, 5, 5));
        assertFalse(Triangle.isScalene(5, 5, 5));
    }

    // ---- Scalene vs Right-Angled ----
    @Test
    @DisplayName("Scalene and Right-Angled modules integration")
    void testScaleneVsRightAngled() {
        // 3,4,5 is both Scalene and Right-Angled
        assertTrue(Triangle.isScalene(3, 4, 5));
        assertTrue(RightAngledTriangle.isRightAngled(3, 4, 5));

        // 7,24,25 also right-angled & scalene
        assertTrue(Triangle.isScalene(7, 24, 25));
        assertTrue(RightAngledTriangle.isRightAngled(7, 24, 25));

        // Equilateral 5,5,5 is not right-angled
        assertFalse(RightAngledTriangle.isRightAngled(5, 5, 5));
    }

    // ---- Equilateral vs Right-Angled ----
    @Test
    @DisplayName("Equilateral and Right-Angled modules integration")
    void testEquilateralVsRightAngled() {
        // Equilateral triangle cannot be right-angled
        assertTrue(EquilateralTriangle.isEquilateral(6, 6, 6));
        assertFalse(RightAngledTriangle.isRightAngled(6, 6, 6));
    }

    // ---- Invalid Inputs ----
    @Test
    @DisplayName("Invalid inputs handled correctly by all modules")
    void testInvalidInputs() {
        // Zero or negative sides
        assertThrows(IllegalArgumentException.class, () -> Triangle.isScalene(0, 4, 5));
        assertThrows(IllegalArgumentException.class, () -> EquilateralTriangle.isEquilateral(-2, 2, 2));
        assertThrows(IllegalArgumentException.class, () -> RightAngledTriangle.isRightAngled(3, 0, 5));

        // Triangle inequality
        assertThrows(IllegalArgumentException.class, () -> Triangle.isScalene(1, 2, 3));
        assertThrows(IllegalArgumentException.class, () -> RightAngledTriangle.isRightAngled(1, 2, 3));
    }

    // ---- Multi-check (composite integration) ----
    @Test
    @DisplayName("Composite check: all modules respond correctly to multiple inputs")
    void testCompositeBehavior() {
        double[][] scaleneRightAngled = {{3, 4, 5}, {5, 12, 13}, {8, 15, 17}};
        for (double[] sides : scaleneRightAngled) {
            assertTrue(Triangle.isScalene(sides[0], sides[1], sides[2]));
            assertTrue(RightAngledTriangle.isRightAngled(sides[0], sides[1], sides[2]));
            assertFalse(EquilateralTriangle.isEquilateral(sides[0], sides[1], sides[2]));
        }
    }
}

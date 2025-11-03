import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquilateralTriangleTest {

    @Test
    public void testValidEquilateralTriangle() 
    {
        assertEquals("It is an Equilateral Triangle",EquilateralTriangle.equilateraltriangle(5, 5, 5));
    }

    @Test
    public void testZeroSide() 
    {
        assertEquals("Invalid Input,sides must be greater than zero",EquilateralTriangle.equilateraltriangle(0, 5, 5));
    }

    @Test
    public void testNegativeSide() 
    {
        assertEquals("Invalid Input,sides must be greater than zero",EquilateralTriangle.equilateraltriangle(-2, 5, 5));
    }

    @Test
    public void testNotTriangle() 
    {
        assertEquals("Its not a triangle",EquilateralTriangle.equilateraltriangle(1, 2, 3));
    }
}

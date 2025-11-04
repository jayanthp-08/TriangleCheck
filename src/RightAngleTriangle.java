import java.util.Scanner;

public class RightAngleTriangle {
   import java.util.Scanner;

/**
 * RightAngleTriangle utilities.
 * - Validates input (positive sides and triangle inequality).
 * - Uses a tolerance when checking Pythagorean relation to avoid floating point issues.
 */
public class RightAngleTriangle {

    private static final double EPSILON = 1e-9;

    /**
     * Returns true if the sides form a right-angled triangle.
     * Throws IllegalArgumentException for non-positive sides or if they don't form a valid triangle.
     */
    public static boolean isRightAngled(int a, int b, int c) {
        // Validate positive
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Sides must be positive numbers");
        }
        // Validate triangle inequality
        if (!(a + b > c && a + c > b && b + c > a)) {
            throw new IllegalArgumentException("Sides do not form a valid triangle");
        }

        double a2 = a * a;
        double b2 = b * b;
        double c2 = c * c;

        // check with tolerance
        if (Math.abs(a2 + b2 - c2) < EPSILON) return true;
        if (Math.abs(b2 + c2 - a2) < EPSILON) return true;
        if (Math.abs(c2 + a2 - b2) < EPSILON) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three side lengths (space-separated):");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        try {
            if (isRightAngled(a, b, c))
                System.out.println("Forms a right angled triangle");
            else
                System.out.println("Does not form a right angled triangle");
        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid input: " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}

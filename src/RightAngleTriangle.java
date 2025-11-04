import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        if (isRightAngled(a, b, c)) {
            System.out.println("✅ It is a right-angled triangle.");
        } else {
            System.out.println("❌ It is not a right-angled triangle.");
        }

        sc.close();
    }

    // Method to check if it's a right-angled triangle
    public static boolean isRightAngled(int a, int b, int c) {
        return (a * a + b * b == c * c) ||(a * a + c * c == b * b) ||(b * b + c * c == a * a);
    }
}



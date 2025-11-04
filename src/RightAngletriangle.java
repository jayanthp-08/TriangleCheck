import java.util.*;

public class RightAngleTriangle {

    public static String rightAngleTriangle(double a, double b, double c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return "Invalid Input, sides must be greater than zero";
        }

        if (a + b <= c || b + c <= a || c + a <= b) {
            return "Its not a triangle";
        }

        double[] sides = {a, b, c};
        Arrays.sort(sides);

        if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) {
            return "It is a Right-Angled Triangle";
        } else {
            return "Its not a Right-Angled Triangle";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        System.out.print("Enter side c: ");
        double c = sc.nextDouble();
        System.out.println(rightAngleTriangle(a, b, c));
        sc.close();
    }
}

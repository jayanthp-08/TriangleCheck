 import java.util.*;
public class RightAngleTriangle {
    public static boolean isRightAngled(double a, double b, double c) {
        return (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) ||
                (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) ||
                (Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (isRightAngled(a, b, c))
            System.out.println("Forms a right angled triangle");
        else
            System.out.println("Does not form a right angled triangle");
    }
}
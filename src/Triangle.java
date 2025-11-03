public class Triangle {

    public static boolean isValidTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 &&
               (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static boolean isScalene(int a, int b, int c) {
        if (!isValidTriangle(a, b, c)) {
            throw new IllegalArgumentException("Not a valid triangle");
        }
        return (a != b) && (b != c) && (a != c);
    }

    public static void main(String[] args) {
        System.out.println("3,4,5 → " + isScalene(3, 4, 5)); // true
        System.out.println("5,5,8 → " + isScalene(5, 5, 8)); // false
    }
}




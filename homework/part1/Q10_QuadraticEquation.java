import java.util.Scanner;

public class Q10_QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        
        if (a == 0) {
            System.out.println("Not quadratic");

        }
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            System.out.println("Root1: " + (-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("Root2: " + (-b - Math.sqrt(delta)) / (2 * a));
        } else if (delta == 0) {
            System.out.println("Root: " + (-b / (2 * a)));
        } else {
            System.out.println("Complex roots");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Q3_MultiplyFloatingPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first: ");
        double a = sc.nextDouble();
        System.out.print("Enter second: ");
        double b = sc.nextDouble();
        System.out.println("Product: " + (a * b));
        sc.close();
    }
}

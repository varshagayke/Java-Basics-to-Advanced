import java.util.Scanner;

public class Q5_QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int a = sc.nextInt();
        System.out.print("Enter divisor: ");
        int b = sc.nextInt();
        if (b != 0) {
            System.out.println("Quotient: " + (a / b));
            System.out.println("Remainder: " + (a % b));
        } else System.out.println("Error: Division by zero");
        sc.close();
    }
}

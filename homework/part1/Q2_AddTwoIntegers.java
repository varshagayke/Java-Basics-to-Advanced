import java.util.Scanner;

public class Q2_AddTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first: ");
        int a = sc.nextInt();
        System.out.print("Enter second: ");
        int b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
        sc.close();
    }
}

import java.util.Scanner;

/*
Q: Write a program to find the factorial of a number.
*/
public class T5_Factorial {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + ": " + factorial(n));
        sc.close();
    }
}

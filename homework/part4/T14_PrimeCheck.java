import java.util.Scanner;

/*
Q: Write a program to check whether a number is prime or not.
*/
public class T14_PrimeCheck {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println(num + " is " + (isPrime(num) ? "prime" : "not prime"));
        sc.close();
    }
}

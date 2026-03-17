import java.util.Scanner;

/*
Q: Write a program to calculate the sum of natural numbers.
*/
public class T4_SumNaturalNumbers {
    public static long sumNatural(int n) {
        return (long) n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " natural numbers: " + sumNatural(n));
        sc.close();
    }
}

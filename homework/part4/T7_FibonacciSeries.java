import java.util.Scanner;

/*
Q: Write a program to display the Fibonacci series.
*/
public class T7_FibonacciSeries {
    public static void fibonacci(int n) {
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count: ");
        fibonacci(sc.nextInt());
        sc.close();
    }
}

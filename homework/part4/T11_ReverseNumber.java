import java.util.Scanner;

/*
Q: Write a program to reverse a number.
*/
public class T11_ReverseNumber {
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Reversed: " + reverseNumber(num));
        sc.close();
    }
}

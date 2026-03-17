import java.util.Scanner;

/*
Q: Write a program to count the number of digits in an integer.
*/
public class T10_CountDigits {
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Number of digits: " + countDigits(num));
        sc.close();
    }
}

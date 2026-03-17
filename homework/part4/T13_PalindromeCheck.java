import java.util.Scanner;

/*
Q: Write a program to check whether a number is a palindrome.
*/
public class T13_PalindromeCheck {
    public static boolean isPalindrome(int num) {
        String str = String.valueOf(Math.abs(num));
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println(num + " is " + (isPalindrome(num) ? "palindrome" : "not palindrome"));
        sc.close();
    }
}

import java.util.Scanner;

/*
Q: Write a program to check whether a number is an Armstrong number.
*/
public class T16_ArmstrongCheck {
    public static boolean isArmstrong(int num) {
        String str = String.valueOf(num);
        int n = str.length();
        int sum = 0;
        for (char c : str.toCharArray()) {
            int digit = c - '0';
            sum += Math.pow(digit, n);
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println(num + " is " + (isArmstrong(num) ? "Armstrong" : "not Armstrong"));
        sc.close();
    }
}

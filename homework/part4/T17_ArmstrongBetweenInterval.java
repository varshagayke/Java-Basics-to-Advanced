import java.util.Scanner;

/*
Q: Write a program to display Armstrong numbers between two intervals.
*/
public class T17_ArmstrongBetweenInterval {
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
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}

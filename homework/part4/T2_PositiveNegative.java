import java.util.Scanner;

/*
Q: Write a program to check whether a number is positive or negative.
*/
public class T2_PositiveNegative {
    public static void classifyNumber(int num) {
        if (num > 0) System.out.println(num + " is positive");
        else if (num < 0) System.out.println(num + " is negative");
        else System.out.println("Number is zero");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        classifyNumber(sc.nextInt());
        sc.close();
    }
}

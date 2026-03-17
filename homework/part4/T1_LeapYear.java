import java.util.Scanner;

/*
Q: Write a program to check if a year is a leap year.
*/
public class T1_LeapYear {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.println(year + " is " + (isLeapYear(year) ? "a leap year" : "not a leap year"));
        sc.close();
    }
}

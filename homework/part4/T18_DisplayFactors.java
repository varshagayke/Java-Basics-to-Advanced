import java.util.Scanner;

/*
Q: Write a program to display all factors of a number.
*/
public class T18_DisplayFactors {
    public static void displayFactors(int num) {
        System.out.println("Factors of " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        displayFactors(sc.nextInt());
        sc.close();
    }
}

import java.util.Scanner;

/*
Q: Write a program to create a pyramid pattern.
*/
public class T22_Pyramid {
    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        pyramid(sc.nextInt());
        sc.close();
    }
}

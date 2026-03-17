import java.util.Scanner;

/*
Q: Write a program to check whether a character is an alphabet or not.
*/
public class T3_CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        System.out.println(ch + " is " + (Character.isLetter(ch) ? "an alphabet" : "not an alphabet"));
        sc.close();
    }
}

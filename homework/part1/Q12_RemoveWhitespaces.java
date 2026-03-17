import java.util.Scanner;

public class Q12_RemoveWhitespaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.println("Result: " + str.replaceAll("\\s+", ""));
        sc.close();
    }
}

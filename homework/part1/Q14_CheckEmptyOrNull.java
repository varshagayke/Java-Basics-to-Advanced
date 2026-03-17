import java.util.Scanner;

public class Q14_CheckEmptyOrNull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string (optional): ");
        String str = sc.nextLine();
        System.out.println("Empty: " + str.isEmpty());
        System.out.println("Blank: " + str.trim().isEmpty());
        sc.close();
    }
}

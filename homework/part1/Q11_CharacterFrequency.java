import java.util.Scanner;

public class Q11_CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        int count = 0;
        for (char c : str.toLowerCase().toCharArray())
            if (c == Character.toLowerCase(ch)) count++;
        System.out.println("Frequency: " + count);
        sc.close();
    }
}

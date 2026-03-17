import java.util.Scanner;

public class Q8_VowelOrConsonant {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        if (!Character.isLetter(ch)) {
            System.out.println("Error: Not an alphabet");
        } else {
            System.out.println(isVowel(ch) ? "Vowel" : "Consonant");
        }
        sc.close();
    }
}

import java.util.Scanner;

/*
Q: Write a program to count the number of vowels and consonants in a sentence.
*/
public class T20_VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine().toLowerCase();
        
        int vowels = 0, consonants = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) >= 0) vowels++;
                else consonants++;
            }
        }
        
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
        sc.close();
    }
}

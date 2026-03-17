import java.util.Scanner;
import java.util.Arrays;

/*
Q: Write a program to sort elements in lexicographical order (dictionary order).
*/
public class T21_SortLexicographical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }
        
        Arrays.sort(strings);
        System.out.println("Sorted (lexicographical):");
        for (String s : strings) System.out.println(s);
        sc.close();
    }
}

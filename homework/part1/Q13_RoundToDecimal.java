import java.util.Scanner;

public class Q13_RoundToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double num = sc.nextDouble();
        System.out.print("Enter places: ");
        int places = sc.nextInt();
        double factor = Math.pow(10, places);
        System.out.println("Result: " + Math.round(num * factor) / factor);
        sc.close();
    }
}

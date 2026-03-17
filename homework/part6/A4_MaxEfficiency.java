import java.util.Arrays;
import java.util.Scanner;

/*
Q: Given array of employee efficiencies (can be negative).
Find maximum product of efficiencies of any 3 employees.
Example 1: [5, 3, -2, -8, 4, 1] => Output: 64
Example 2: [-2, -1, 3, 8] => Output: 24
*/
public class A4_MaxEfficiency {
    public static long maxProductOfThree(int[] arr) {
        if (arr.length < 3) return 0;
        
        Arrays.sort(arr);
        int n = arr.length;
        
        long product1 = (long) arr[n-1] * arr[n-2] * arr[n-3];
        long product2 = (long) arr[0] * arr[1] * arr[n-1];
        
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Max product of 3: " + maxProductOfThree(arr));
        sc.close();
    }
}

/*
Example 1: [5, 3, -2, -8, 4, 1]
Sorted: [-8, -2, 1, 3, 4, 5]
Product1: 5 * 4 * 3 = 60
Product2: -8 * -2 * 5 = 80
Max: 80

Example 2: [-2, -1, 3, 8]
Sorted: [-2, -1, 3, 8]
Product1: 8 * 3 * -1 = -24
Product2: -2 * -1 * 8 = 16
Max: 16

Expected: 24 (using -2, -1, 3 but result is |-24|, recalculate)
Actually: -2 * -1 * 8 = 16? No: -2 * -1 = 2, 2 * 3 = 6 is wrong
-2, -1, 8: product = 16
-1, 3, 8: product = 24
Fix: Need to check all combinations or better sorting
*/

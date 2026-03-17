import java.util.Scanner;

/*
Q: Minting Mints Problem - Each child says: "My mints = (sum of all kids before me) - 1".
The first kid has n mints. Find total mints in queue of length len.
Example: n=4, len=2 => Output=7
*/
public class A3_MintingMints {
    public static long totalMints(int n, int len) {
        long[] mints = new long[len];
        mints[0] = n;
        
        for (int i = 1; i < len; i++) {
            long sumBefore = 0;
            for (int j = 0; j < i; j++) {
                sumBefore += mints[j];
            }
            mints[i] = sumBefore - 1;
        }
        
        long total = 0;
        for (long m : mints) total += m;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (first kid's mints): ");
        int n = sc.nextInt();
        System.out.print("Enter len (queue length): ");
        int len = sc.nextInt();
        System.out.println("Total mints: " + totalMints(n, len));
        sc.close();
    }
}

/*
Example: n=4, len=2
Kid 1: 4
Kid 2: (4) - 1 = 3
Total: 4 + 3 = 7
*/

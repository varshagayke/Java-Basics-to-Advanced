public class Q3_RecursionOptimized {
    public static int recursive(int n) {
        if (n <= 0) return 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (i + 2);
        }
        return sum + recursive(n - 1);
    }

    public static int iterative(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result += j + 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Recursive: " + recursive(5));
        System.out.println("Iterative: " + iterative(5));
    }
}

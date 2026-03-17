public class Q3_RecursionProblem {
    public static int specialAdd(int n) {
        if (n != 0) return (n + 2) + specialAdd(n - 1);
        return 3;
    }

    public static int extraordinaryAdd(int n) {
        if (n != 0) return specialAdd(n) + extraordinaryAdd(n - 1);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + extraordinaryAdd(5));
    }
}

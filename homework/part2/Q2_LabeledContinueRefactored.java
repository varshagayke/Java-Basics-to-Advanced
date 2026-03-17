public class Q2_LabeledContinueRefactored {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            boolean skip = false;
            for (int j = 1; j < 5; j++) {
                if (i == 3 || j == 2) {
                    skip = true;
                    break;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
            if (skip) continue;
        }
    }
}

/*
Q: What is the output of this recursive code?
class Demo {
    public static int specialAdd(int num1) {
        if (num1 != 0) {
            return (num1 + 2) + specialAdd(num1 - 1);
        } else return 3;
    }
    public static int extraordinaryAdd(int num2) {
        if (num2 != 0) {
            return specialAdd(num2) + extraordinaryAdd(num2 - 1);
        } else return 0;
    }
    public static void main(String[] args) {
        System.out.println(extraordinaryAdd(5));
    }
}
Options: A. 80  B. 52  C. 70  D. 25
*/
public class A1_RecursiveCodeAnalysis {
    public static int specialAdd(int num1) {
        if (num1 != 0) {
            return (num1 + 2) + specialAdd(num1 - 1);
        } else return 3;
    }

    public static int extraordinaryAdd(int num2) {
        if (num2 != 0) {
            return specialAdd(num2) + extraordinaryAdd(num2 - 1);
        } else return 0;
    }

    public static void main(String[] args) {
        System.out.println(extraordinaryAdd(5));
    }
}

/*
ANALYSIS:
Call trace for extraordinaryAdd(5):
- extraordinaryAdd(5) = specialAdd(5) + extraordinaryAdd(4)
- extraordinaryAdd(4) = specialAdd(4) + extraordinaryAdd(3)
- extraordinaryAdd(3) = specialAdd(3) + extraordinaryAdd(2)
- extraordinaryAdd(2) = specialAdd(2) + extraordinaryAdd(1)
- extraordinaryAdd(1) = specialAdd(1) + extraordinaryAdd(0)
- extraordinaryAdd(0) = 0

specialAdd(n) = (n+2) + (n-1+2) + (n-2+2) + ... + (1+2) + 3
specialAdd(5) = 7 + 6 + 5 + 4 + 3 + 3 = 28
specialAdd(4) = 6 + 5 + 4 + 3 + 3 = 21
specialAdd(3) = 5 + 4 + 3 + 3 = 15
specialAdd(2) = 4 + 3 + 3 = 10
specialAdd(1) = 3 + 3 = 6
specialAdd(0) = 3

extraordinaryAdd(5) = 28 + 21 + 15 + 10 + 6 + 0 = 80

OUTPUT: 80 (Option A)
*/

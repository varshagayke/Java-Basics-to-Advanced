/*
Q: What is the output of this function with a=5, b=8, c=3?
integer function f(integer a, integer b, integer c) {
    a = (b & c) + a;
    for (each c from 3 to 6) {
        a = (b + 1) & a;
        b = (12 + 6) & a;
    }
    return a * b;
}
*/
public class A5_BitwiseANDFunction {
    public static int f(int a, int b, int c) {
        a = (b & c) + a;
        for (int i = 3; i <= 6; i++) {
            a = (b + 1) & a;
            b = (12 + 6) & a;
        }
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + f(5, 8, 3));
    }
}

/*
TRACE (a=5, b=8, c=3):
Initial: a = (8 & 3) + 5 = 0 + 5 = 5

i=3: a = (9 & 5) = 1, b = (18 & 1) = 0
i=4: a = (1 & 1) = 1, b = (18 & 1) = 0
i=5: a = (1 & 1) = 1, b = (18 & 1) = 0
i=6: a = (1 & 1) = 1, b = (18 & 1) = 0

Result: a * b = 1 * 0 = 0
*/

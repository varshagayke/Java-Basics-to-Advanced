/*
Q: What is the output for a=5, b=2 with loop: for c=3 to 6, a=(c+1)&a, b=(2+c)&b?
Function fun(integer a, integer b, integer c)
for c = 3 to 6
    a = (c + 1) & a
    b = (2 + c) & b
End for
return a + b
*/
public class A2_BitwiseANDLoop {
    public static int bitwiseANDLoop(int a, int b, int c) {
        for (c = 3; c <= 6; c++) {
            a = (c + 1) & a;
            b = (2 + c) & b;
        }
        return a + b;
    }

    public static void main(String[] args) {
        int result = bitwiseANDLoop(5, 2, 6);
        System.out.println("Result: " + result);
        System.out.println("Binary: " + Integer.toBinaryString(result));
    }
}

/*
TRACE (a=5, b=2, c=6):
c=3: a = (4 & 5) = 4, b = (5 & 2) = 0
c=4: a = (5 & 4) = 4, b = (6 & 0) = 0
c=5: a = (6 & 4) = 4, b = (7 & 0) = 0
c=6: a = (7 & 4) = 4, b = (8 & 0) = 0

Result: a + b = 4 + 0 = 4
*/

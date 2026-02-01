// Demonstrate the short-circuit operators

public class SCops {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        d = 0;  // now, set d to zero
        // Since d is zero, the second operand is not evaluated.
        if (d != 0 && (n % d) == 0)     // The short-circuit operator prevents a division by zero.
            System.out.println(d + " is a factor of " + n);

        /* Now, try same thing without short-circuit operator.
            This will cause a divide-by-zero error:
            Exception in thread "main" java.lang.ArithmeticException: / by zero
                    at SCops.main(SCops.java:20)
        */
        if(d != 0 & (n % d) == 0)       // Now both expressions are evaluated, allowing a division by zero to occur
            System.out.println(d + " is a factor of " + n);
    }
}

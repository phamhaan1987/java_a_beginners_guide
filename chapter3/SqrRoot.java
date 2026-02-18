// Show square roots of 1 to 99 and the rounding error.

public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for(num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            rerr = num - sroot * sroot;     // compute rounding error

            System.out.println("Square root of " + num + " is " + sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
        }
    }
}

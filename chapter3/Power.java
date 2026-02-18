// Compute integer powers of 2.

public class Power {
    public static void main(String[] args) {
        int e, result;

        for(int i = 0; i <= 9; i++) {
            result = 1;
            e = i;
            while ( e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2 to the " + i + " power is " + result);
        }
    }
}

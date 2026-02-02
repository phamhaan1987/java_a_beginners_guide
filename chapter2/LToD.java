// Type Conversion in Assignments
/*
    an automatic type conversion will take place if:
    ● The two types are compatible.
    ● The destination type is larger than the source type
    When these two conditions are met, a widening conversion takes place.
*/

public class LToD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L;      // Automatic conversion from long to double
        System.out.println("L and D: " + L + " " + D);

        D = 100123285.0;
        // L = D; // Illegal!!! No automatic conversion from double to long.
    }
}

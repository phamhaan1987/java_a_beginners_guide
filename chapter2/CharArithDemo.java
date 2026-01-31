// Character variables can be handled like integers.
// Since char is an unsigned 16-bit type, it is possible to perform various arithmetic manipulations on a char variable

public class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch contains " + ch);

        ch++;   // increment ch
        System.out.println("ch is now " + ch);

        ch = 90;    // give ch the value Z
        System.out.println("ch is now " + ch);
    }
}

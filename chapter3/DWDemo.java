// Demonstrate the do-while loop.

public class DWDemo {
    public static void main(String[] args) 
        throws java.io.IOException {
        char ch;

        do {
            System.out.println("");
            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}

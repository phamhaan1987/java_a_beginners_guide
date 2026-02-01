// Literals
// Hexadecimal, Octal, and Binary Literals
// Character Escape Sequences
// String Literals

public class StrDemo {
    public static void main(String[] args) {
        int a = -100;       // 32 bits: –2,147,483,648 to 2,147,483,647
        long b = 12L;       // 64 bits: –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float c = 10.19F;   // 32 bits
        double d = 11.123;  // 63 bits
        byte e = 121;       // 8 bits: -128 to 127
        short f = -12345;   // 16 bits: –32,768 to 32,767
        int g = 123_45_678;         // embed one or more underscores into an integer or floating-point literal
        double h = 123_45.678_9;

        int hex = 0xFF;     // The base 16 number system is called hexadecimal and uses the digits 0 through 9 plus the letters A through F
        int oct = 011;      // The number system based on 8 is called octal, and it uses the digits 0 through 7
        int bin = 0b1100;   // an integer literal by use of binary

        char ch = '\t';     // Horizontal tab
        ch = '\'';          // Single quote
        
        System.out.println("First line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");
    }
}
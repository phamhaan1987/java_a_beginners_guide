// Side effects can be important.
// Shorthand Assignments

public class SideEffects {
    public static void main(String[] args) {
        int i;
        i = 0;

        /* Here, i is still incremented even though the if statement fails. */
        if(false & (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); // displays 1

        /* In this case, i is not incremented because the short-circuit operator skips the increment. */
        if(false && (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); // still 1 !!

        int x, y, z;
        x = y = z = 100;

        x += 10;    // x = x + 10
        x -= 100;   // x = x - 100
    }
}

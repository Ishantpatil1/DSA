import java.util.*;

public class twosumnumbers {

    public static void sum(int a, int b) {
        System.out.println(a + b);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // user input
        int b = sc.nextInt(); // user input

        sum(a,b ); // use user inputs instead of fixed values
    }
}

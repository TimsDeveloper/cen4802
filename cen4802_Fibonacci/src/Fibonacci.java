import java.util.Scanner;

public class Fibonacci {

    static int fib (int n) {
        int a = 0, b =1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {

        System.out.println("Enter an integer.");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The term in the " + n + " place of the Fibonacci sequence is " + fib(n));

    }

}

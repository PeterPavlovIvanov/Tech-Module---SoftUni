import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 50;
        long[] fibonaccies = new long[n];
        fibonaccies[0] = 0;
        fibonaccies[1] = 1;
        for (int i = 0; i < n; i++) {
            fibonaccies[i] = -1;
        }
        long fib8 = fibonacci(n,fibonaccies);
        System.out.println(fib8);


    }

    public static long fibonacci(int n,long[] fibonaccies) {
        if(fibonaccies[n] != -1){
            return fibonaccies[n];
        }
        System.out.println("Calculation fibonacci of " + n + ".");
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        long prev = fibonacci(n - 1, fibonaccies);
        long prevPrev = fibonacci(n - 2,fibonaccies);

        long result = prev + prevPrev;
        fibonaccies[n] = result;

        return result;
    }
}

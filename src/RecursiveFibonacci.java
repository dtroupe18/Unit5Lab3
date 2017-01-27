/**
 * Created by Dave on 1/19/17.
 */

class RecursiveFibonacci {
    public static void main(String[] args) {
        int x = 0;

        while (x < 50) {
            System.out.println(x +": " + fibonacci(x) + " ");
            x++;
        }

    }

    private static int fibonacci(int n) {

        // base case(s) n = 0 or 1
        if (n == 0)
            return 0;

        else if (n == 1)
            return 1;

        else
            //recursive call
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

public class fibonacciusingrecursion {
    public static int fibonacciusingrecursion(int n) {
        if (n < 2)
            return n;
        return fibonacciusingrecursion(n - 1) + fibonacciusingrecursion(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacciusingrecursion(10));
    }
}

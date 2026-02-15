public class sumofdigits {
    public static int sumofdigits(int n) {
        if (n == 0)
            return 1;
        return n % 10 * sumofdigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 550;
        System.out.println(sumofdigits(n));
    }
}

public class countGoodNumbers {
    private static long MOD = 1000000007;

    public static int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        long ans = power(5, even) * power(4, odd) % MOD;
        return (int) ans;
    }

    public static long power(long n, long exp) {
        if (exp == 0) {
            return 1;
        }
        long half = power(n, exp / 2);
        half = half * half % MOD;
        if (exp % 2 == 0) {
            return half;
        } else {
            return (half * n) % MOD;
        }
    }

    public static void main(String[] args) {
        int n = 60;
        System.out.println(countGoodNumbers(n));
    }
}

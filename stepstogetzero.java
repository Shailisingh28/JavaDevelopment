public class stepstogetzero {
    public static int stepstogetzero(int n) {
        if (n == 0)
            return 0;
        if (n % 2 == 0) {
            return 1 + stepstogetzero(n / 2);

        } else {
            return 1 + stepstogetzero(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(stepstogetzero(n));
    }
}

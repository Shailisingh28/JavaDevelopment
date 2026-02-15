public class reverse {
    static int sum = 0;

    public static void reverse(int n) {
        if (n % 10 == n) {
            System.out.print(n);
            return;
        }
        System.out.print(n % 10);
        reverse(n / 10);
    }

    public static void main(String[] args) {
        int n = 1234;
        reverse(n);
    }
}

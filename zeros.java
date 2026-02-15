public class zeros {
    static int count = 0;

    public static void zeros(int n) {
        int q = n / 10;
        if (q == 0) {
            System.out.println(count);
            return;
        }
        if (n % 10 == 0)
            count++;
        zeros(q);
    }

    public static void main(String[] args) {
        int n = 24;
        zeros(n);
    }
}

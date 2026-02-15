public class countzeros {
    public static int countzeros(int n, int count) {
        if (n == 0)
            return count;
        if (n % 10 == 0)
            count++;
        return countzeros(n / 10, count);
    }

    public static void main(String[] args) {
        int n = 0;
        if (n == 0)
            System.out.println(1);
        else
            System.out.println(countzeros(n, 0));
    }
}

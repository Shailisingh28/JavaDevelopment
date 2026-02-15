public class sumofdidgit {
    public static int sumofdidgit(int n) {
        if (n == 0) {
            return n;
        }
        return n % 10 + sumofdidgit(n / 10);
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println(sumofdidgit(n));
    }
}

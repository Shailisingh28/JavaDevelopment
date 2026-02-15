public class reverseanumber {
    public static int reverseanumber(int n, int ans) {
        if (n == 0) {
            return ans;
        }
        ans = ans * 10 + n % 10;
        return reverseanumber(n / 10, ans);
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(reverseanumber(n, 0));
    }
}

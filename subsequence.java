public class subsequence {
    public static void subsequence(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        subsequence(str.substring(1), ans + str.charAt(0));
        subsequence(str.substring(1), ans);
    }

    public static void main(String[] args) {
        String str = "ab";
        String ans = "";
        subsequence(str, ans);
    }
}

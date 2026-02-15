public class rotateStrings {
    public static boolean rotateStrings(String s, String g) {
        String ans = s + s;
        return ans.contains(g);
    }

    public static void main(String[] args) {
        String str = "abcde";
        String goal = "ab";
        System.out.println(rotateStrings(str, goal));
    }
}

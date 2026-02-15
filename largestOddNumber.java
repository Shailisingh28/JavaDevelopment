public class largestOddNumber {
    public static String largestOddNumber(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) % 2 != 0) {
                return ans.append(s, 0, i + 1).toString();
            }
        }
        return " ";
    }

    public static void main(String[] args) {
        String s = "35427";
        System.out.println(largestOddNumber(s));
    }
}

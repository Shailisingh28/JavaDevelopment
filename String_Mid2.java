public class String_Mid2 {
    public static int maxdepthparenthesese(String s) {
        int count = 0;
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                max = Math.max(count, max);
            } else if (c == ')') {
                count--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        System.out.println(maxdepthparenthesese(s));
    }
}

public class maxDepth {
    public static int maxDepth(String s) {
        int count = 0;
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                max = Math.max(max, count);
            } else if (c == ')') {
                count--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "()(())((()()))";
        System.out.println(maxDepth(s));
    }
}

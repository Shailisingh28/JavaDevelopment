public class removeoutmostparenthesis {
    public static String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ')')
                counter--;
            if (counter != 0) {
                ans.append(c);
            }
            if (c == '(')
                counter++;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "(()())";
        System.out.println(removeOuterParentheses(s));
    }
}

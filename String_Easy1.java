
public class String_Easy1 {
    public static String removeoutmostparenthesis(String s) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ')')
                counter--;
            if (counter != 0)
                sb.append(c);
            if (c == '(')
                counter++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "()(()())(())";
        System.out.println(removeoutmostparenthesis(s));
    }
}
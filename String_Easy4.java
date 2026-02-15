import java.util.Arrays;

public class String_Easy4 {
    public static String longestcommanprefixString(String s[]) {
        Arrays.sort(s);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s[i].length(); i++) {
            if (s[i].charAt(i) == s[s.length - 1].charAt(i)) {
                sb.append(s[i].charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] s = { "dog", "cat", "animal", "monkey" };
        System.out.println(longestcommanprefixString(s));
    }
}

import java.util.Arrays;

public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        StringBuilder ans = new StringBuilder();
        int start = 0;
        int end = str.length - 1;
        Arrays.sort(str);
        for (int i = 0; i < str.length; i++) {
            if (str[start].charAt(i) != str[end].charAt(i)) {
                break;
            }
            ans.append(str[start].charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str[] = { "flower", "flo" };
        System.out.println(longestCommonPrefix(str));
    }
}

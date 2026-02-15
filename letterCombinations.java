import java.util.ArrayList;
import java.util.List;

public class letterCombinations {
    public static List<String> letterCombinations(String digit) {
        List<String> ans = new ArrayList<>();
        if (digit.length() == 0)
            return ans;
        String arr[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        backtrack(0, digit, new StringBuilder(), ans, arr);
        return ans;
    }

    public static void backtrack(int index, String digit, StringBuilder current, List<String> ans, String[] arr) {
        if (index == digit.length()) {
            ans.add(current.toString());
            return;
        }
        String letters = arr[digit.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(index + 1, digit, current, ans, arr);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        String s = "23";
        System.out.println(letterCombinations(s));
    }
}

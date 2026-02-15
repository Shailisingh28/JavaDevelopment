import java.util.HashMap;

public class lengthLongestSubstring {
    public static int lengthLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            while (map.get(s.charAt(right)) > 1) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthLongestSubstring(s));
    }
}

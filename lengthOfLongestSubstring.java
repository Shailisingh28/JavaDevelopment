import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String a = "aaabbbccc";
        System.out.println(lengthOfLongestSubstring(a));
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(3);
        System.out.println(set);

    }
}

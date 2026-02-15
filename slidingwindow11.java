import java.util.HashMap;

public class slidingwindow11 {
    public static String slidingwindow11(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        int start = 0;
        int left = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                if (map.get(s.charAt(right)) > 0) {
                    count++;
                }
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
            }
            while (count == t.length()) {
                if (min > right - left + 1) {
                    min = right - left + 1;
                    start = left;
                }
                if (map.containsKey(s.charAt(left))) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                    if (map.get(s.charAt(left)) > 0) {
                        count--;
                    }
                }
                left++;
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(start, min + start);
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        System.out.println(slidingwindow11(s, t));

    }
}

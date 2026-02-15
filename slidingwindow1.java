import java.util.HashMap;

public class slidingwindow1 {
    public static int slidingwindow1(String s) {
        int left = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            while (map.get(s.charAt(right)) > 1) {
                int value = map.get(s.charAt(left)) - 1;
                map.put(s.charAt(left), value);
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(slidingwindow1(s));
    }
}

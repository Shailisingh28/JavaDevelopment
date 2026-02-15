public class SW4 {
    public static int characterReplacement(String s, int k) {
        int left = 0;
        int max_freq = 0;
        int max_window = 0;
        int arr[] = new int[26];
        for (int right = 0; right < s.length(); right++) {
            arr[s.charAt(right) - 'A']++;
            max_freq = Math.max(max_freq, arr[s.charAt(right) - 'A']);
            while (right - left + 1 - max_freq > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            max_window = Math.max(max_window, right - left + 1);
        }
        return max_window;
    }

    public static void main(String[] args) {
        String s = "ABCDEF";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }
}

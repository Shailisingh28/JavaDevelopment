public class characterReplacement {
    public static int characterReplacement(String s, int k) {
        int left = 0;
        int max_freq = 0;
        int max_window = 0;
        int arr[] = new int[26];
        for (int right = 0; right < s.length(); right++) {
            arr[s.charAt(right) - 'A']++;
            max_freq = Math.max(max_freq, arr[s.charAt(right) - 'A']);
            int window = right - left + 1;
            if (window - max_freq > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            window = right - left + 1;
            max_window = Math.max(max_window, window);
        }
        return max_window;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }
}

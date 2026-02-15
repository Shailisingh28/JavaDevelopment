public class kcharacterReplacement {
    public static int kcharacterReplacement(String s, int k) {
        int left = 0;
        int max_freq = Integer.MIN_VALUE;
        int max_window = 0;
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
            max_freq = Math.max(max_freq, arr[s.charAt(i) - 'A']);
            while (i - left + 1 - max_freq > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            max_window = Math.max(max_window, i - left + 1);
        }
        return max_window;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 1;
        System.out.println(kcharacterReplacement(s, k));
    }
}

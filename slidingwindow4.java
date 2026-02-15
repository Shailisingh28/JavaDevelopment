public class slidingwindow4 {
    public static int slidingwindow4(String s, int k) {
        int left = 0;
        int max = Integer.MIN_VALUE;
        int arr[] = new int[26];
        int max_freq = 0;
        for (int right = 0; right < s.length(); right++) {
            arr[s.charAt(right) - 'A']++;
            max_freq = Math.max(max_freq, arr[s.charAt(right) - 'A']);
            while (right - left + 1 - max_freq > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(slidingwindow4(s, k));
    }
}

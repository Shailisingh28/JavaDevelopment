public class substrings {
    public static int substrings(String s) {
        int right = 0;
        int left = 0;
        int count = 0;
        int arr[] = new int[3];
        while (right < s.length()) {
            arr[s.charAt(right) - 'a']++;
            while (arr[0] > 0 && arr[1] > 0 && arr[2] > 0) {
                count += s.length() - right;
                arr[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abcba";
        System.out.println(substrings(s));
    }
}

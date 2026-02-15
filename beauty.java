public class beauty {
    public static int beauty(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int arr[] = new int[26];
            for (int j = i; j < s.length(); j++) {
                arr[s.charAt(j) - 'a']++;
                int beauty = max(arr) - min(arr);
                sum += beauty;
            }
        }
        return sum;
    }

    private static int max(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    private static int min(int arr[]) {
        int i = 0;
        int min = Integer.MAX_VALUE;
        while (i < arr.length) {
            if (arr[i] > 0) {
                min = Math.min(arr[i], min);
            }
            i++;
        }
        return min;
    }

    public static void main(String[] args) {
        String s = "aabcbaa";
        System.out.println(beauty(s));
    }
}

public class beautySum {
    public static int beautySum(String s) {
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

    public static int max(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int min(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                min = Math.min(min, arr[i]);
        }
        return min;
    }

    public static void main(String[] args) {
        String s = "aabcbaa";
        System.out.println(beautySum(s));
    }
}

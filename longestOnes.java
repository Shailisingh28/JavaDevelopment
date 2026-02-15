public class longestOnes {
    public static int longestOnes(int arr[], int k) {
        int max = 0;
        int left = 0;
        int zeros = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (arr[left] == 0)
                    zeros--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        int k = 3;
        System.out.println(longestOnes(nums, k));
    }
}

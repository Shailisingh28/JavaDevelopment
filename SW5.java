public class SW5 {
    public static int numSubarraysWithSum(int arr[], int k) {
        int ans = 0;
        ans = count(arr, k) - count(arr, k - 1);
        return ans;
    }

    public static int count(int arr[], int k) {
        if (k < 0)
            return 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;
        while (right < arr.length) {
            sum += arr[right];
            while (sum > k) {
                sum = sum - arr[left];
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 1 };
        int goal = 0;
        System.out.println(numSubarraysWithSum(arr, goal));
    }
}

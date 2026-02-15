public class SW6 {
    public static int numberOfOddSubarrays(int arr[], int k) {
        int ans = 0;
        ans = count(arr, k) - count(arr, k - 1);
        return ans;
    }

    public static int count(int arr[], int k) {
        if (k < 0)
            return 0;
        int left = 0;
        int odd_count = 0;
        int count = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] % 2 != 0) {
                odd_count++;
            }
            while (odd_count > k) {
                if (arr[left] % 2 != 0)
                    odd_count--;
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 8, 2 };
        int k = 1;
        System.out.println(numberOfOddSubarrays(arr, k));
    }
}

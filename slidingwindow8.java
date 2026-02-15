public class slidingwindow8 {
    public static int slidingwindow8(int arr[], int k) {
        int lsum = 0;
        int rsum = 0;
        int sum = 0;
        int max = 0;
        int right = arr.length - 1;
        for (int i = 0; i < k; i++) {
            lsum += arr[i];
        }
        max = lsum;
        for (int i = k - 1; i >= 0; i--) {
            rsum += arr[right];
            lsum -= arr[i];
            sum = lsum + rsum;
            max = Math.max(max, sum);
            right--;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 7, 7, 9, 7, 7, 9 };
        int k = 7;
        System.out.println(slidingwindow8(arr, k));
    }
}

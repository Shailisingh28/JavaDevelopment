public class Slidingwindow {
    public static int Slidingwindow(int arr[], int k) {
        int left = 0, right = 0, maxlen = 0, sum = 0;
        while (right < arr.length) {
            sum += arr[right];
            while (sum > k) {
                sum = sum - arr[left];
                left++;
            }
            if (sum <= k) {
                maxlen = Math.max(maxlen, right - left + 1);
                right++;
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 7, 10 };
        int k = 14;
        System.out.println(Slidingwindow(arr, k));
    }
}

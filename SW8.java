public class SW8 {
    public static int maxScore(int arr[], int k) {
        int lsum = 0;
        int rsum = 0;
        int rindex = arr.length - 1;
        int max = 0;
        for (int i = 0; i < k; i++) {
            lsum += arr[i];
        }
        max = lsum;
        for (int i = k - 1; i >= 0; i--) {
            lsum = lsum - arr[i];
            rsum += arr[rindex];
            max = Math.max(max, lsum + rsum);
            rindex--;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 10, 1, 2, 3, 5 };
        int k = 5;
        System.out.println(maxScore(arr, k));
    }
}

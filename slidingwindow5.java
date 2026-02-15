public class slidingwindow5 {
    public static int slidingwindow5(int arr[], int goal) {
        if (goal - 1 < 1) {
            return sum(arr, goal);
        }
        return sum(arr, goal) - sum(arr, goal - 1);
    }

    public static int sum(int arr[], int goal) {
        int left = 0;
        int sum = 0;
        int subarray = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum > goal) {
                sum = sum - arr[left];
                left++;
            }
            subarray += right - left + 1;
        }
        return subarray;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 };
        int goal = 2;
        System.out.println(slidingwindow5(arr, goal));
    }
}

public class BS_R1 {
    public static int ceiling(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        if (arr[right] <= target)
            return -1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 15, 16, 71, 81, 91 };
        int target = 642;
        System.out.println(ceiling(arr, target));
    }
}

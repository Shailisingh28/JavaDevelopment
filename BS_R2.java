public class BS_R2 {
    public static int floor(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        if (arr[left] >= target)
            return -1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 15, 16, 71, 81, 91 };
        int target = 0;
        System.out.println(floor(arr, target));
    }
}

public class flooring {
    public static int flooring(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        if (arr.length == 1 || arr[left] > target)
            return -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 3, 5 };
        int target = 8;
        System.out.println(flooring(arr, target));
    }
}

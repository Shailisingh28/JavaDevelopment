public class ceiling {
    public static int ceiling(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        if (arr[right] <= target || arr.length == 1)
            return -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    // public static int ceiling(int arr[], int target) {
    // int left = 0;
    // int right = arr.length - 1;
    // int mid;
    // if (arr.length == 1 || arr[right] < target)
    // return -1;
    // while (left <= right) {
    // mid = left + (right - left) / 2;
    // if (arr[mid] == target)
    // return mid;
    // else if (arr[mid] > target) {
    // right = mid - 1;
    // } else {
    // left = mid + 1;
    // }
    // }
    // return left;
    // }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 5, 6 };
        int target = 6;
        System.out.println(ceiling(arr, target));
    }
}

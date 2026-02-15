public class BS_R4 {
    public static int infinitearray(int arr[], int target) {
        int start = 0;
        int end = 1;
        if (arr[arr.length - 1] < target)
            return -1;
        while (arr[end] < target) {
            start = end + 1;
            end = 2 * start + 1;
            if (end >= arr.length)
                end = arr.length - 1;
        }
        return binarysearch(arr, target, start, end);
    }

    public static int binarysearch(int arr[], int target, int left, int right) {
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 9;
        System.out.println(infinitearray(arr, target));
    }
}

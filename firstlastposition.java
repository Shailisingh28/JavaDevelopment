import java.util.Arrays;

public class firstlastposition {
    public static int[] findposition(int arr[], int target) {
        int start = binarysearch(arr, target, true);
        int end = binarysearch(arr, target, false);
        return new int[] { start, end };
    }

    public static int binarysearch(int arr[], int target, boolean startindex) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int ans = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (startindex) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 88;
        System.out.println(Arrays.toString(findposition(arr, target)));
    }
}

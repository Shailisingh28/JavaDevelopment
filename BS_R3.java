import java.util.Arrays;

public class BS_R3 {
    public static int[] findposition(int arr[], int target) {
        int startindex = binarysearch(arr, target, true);
        int lastindex = binarysearch(arr, target, false);
        return new int[] { startindex, lastindex };
    }

    public static int binarysearch(int arr[], int target, boolean startindex) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int ans = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] > target)
                right = mid - 1;
            else if (arr[mid] < target)
                left = mid + 1;
            else {
                ans = mid;
                if (startindex) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 7, 7, 8, 8, 9 };
        int target = 50;
        System.out.println(Arrays.toString(findposition(arr, target)));
    }
}

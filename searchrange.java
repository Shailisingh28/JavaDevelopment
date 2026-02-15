import java.util.Arrays;

public class searchrange {
    public static int[] searchrange(int arr[], int target) {
        int startindex = binarysearch(arr, target, true);
        int lasttindex = binarysearch(arr, target, false);
        return new int[] { startindex, lasttindex };

    }

    public static int binarysearch(int arr[], int target, boolean startindex) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int ans = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
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
        int arr[] = { 5, 7, 7, 8, 8, 10 };
        int target = 7;
        System.out.println(Arrays.toString(searchrange(arr, target)));
    }
}

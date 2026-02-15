public class BS_R8 {
    public static boolean find(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return true;
            if (arr[left] <= arr[mid]) {
                if (arr[left] <= target && target <= arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 0;
        System.out.println(find(arr, target));
    }
}

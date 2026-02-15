public class BS_R6 {
    public static int find(int arr[], int target) {
        int peak = peak(arr);
        int ans = binarysearch(arr, target, 0, peak);
        if (ans == -1) {
            return binarysearch(arr, target, peak + 1, arr.length - 1);
        }
        return ans;
    }

    public static int peak(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static int binarysearch(int arr[], int target, int left, int right) {
        boolean asc = arr[left] < arr[right];
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (asc) {
                if (arr[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 3, 2, 1 };
        int target = 3;
        System.out.println(find(arr, target));
    }
}

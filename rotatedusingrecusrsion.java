public class rotatedusingrecusrsion {
    public static int search(int arr[], int target, int left, int right) {
        if (left > right)
            return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target)
            return mid;
        if (arr[left] <= arr[mid]) {
            if (arr[left] <= target && target < arr[mid]) {
                return search(arr, target, left, mid - 1);
            } else {
                return search(arr, target, mid + 1, right);
            }
        } else {
            if (arr[mid] < target && target <= arr[right]) {
                return search(arr, target, mid + 1, right);
            } else {
                return search(arr, target, left, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 1, 2, 3 };
        System.out.println(search(arr, 7, 0, arr.length - 1));
    }
}

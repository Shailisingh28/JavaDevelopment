public class rotatedbsusingrecur {
    public static int rotatedbsusingrecur(int arr[], int target, int left, int right) {
        if (left > right)
            return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[left] <= arr[mid]) {
            if (arr[left] <= target && target <= arr[mid]) {
                return rotatedbsusingrecur(arr, target, left, mid - 1);
            } else {
                return rotatedbsusingrecur(arr, target, mid + 1, right);
            }
        } else {
            if (arr[mid] <= target && target <= arr[right]) {
                return rotatedbsusingrecur(arr, target, mid + 1, right);
            } else {
                return rotatedbsusingrecur(arr, target, left, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 1, 2, 3 };
        int target = 38;
        System.out.println(rotatedbsusingrecur(arr, target, 0, arr.length - 1));
    }
}

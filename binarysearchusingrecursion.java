public class binarysearchusingrecursion {
    public static int binarysearch(int arr[], int target, int left, int right) {
        if (left > right)
            return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return binarysearch(arr, target, left, mid - 1);
        return binarysearch(arr, target, mid + 1, right);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 66, 77, 88, 89 };
        int target = 666;
        System.out.println(binarysearch(arr, target, 0, arr.length - 1));
    }
}

public class BS_R5 {
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

    public static void main(String[] args) {
        int arr[] = { 2, 0 };
        System.out.println(peak(arr));
    }
}

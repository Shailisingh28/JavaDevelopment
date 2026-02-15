public class BS_R7 {
    public static int pivot(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int min = Integer.MAX_VALUE;
        int index = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[left] <= arr[mid]) {
                if (min > arr[left]) {
                    min = arr[left];
                    index = left;
                }
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 4, 5, 7, 8, 8, 1, 1, 2 };
        System.out.println(pivot(arr));
    }
}

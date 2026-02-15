public class splitarraylargestsum {
    public static int partition(int arr[], int mid) {
        int partition = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= mid) {
                sum += arr[i];
            } else {
                partition++;
                sum = arr[i];
            }
        }
        return partition;
    }

    public static int binarysearch(int arr[], int m) {
        if (m > arr.length - 1)
            return -1;
        int left = 0;
        int right = 0;
        for (int i : arr) {
            left = Math.max(i, left);
            right += i;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int partition = partition(arr, mid);
            if (partition <= m) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int m = 2;
        System.out.println(binarysearch(arr, m));
    }
}

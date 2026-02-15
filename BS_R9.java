public class BS_R9 {
    public static int partitions(int arr[], int mid) {
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
        if (m > arr.length)
            return -1;
        int left = 0;
        int right = 0;
        int mid;
        int partition = 0;
        for (int i : arr) {
            left = Math.max(left, i);
            right = right + i;
        }
        while (left <= right) {
            mid = left + (right - left) / 2;
            partition = partitions(arr, mid);
            if (partition <= m)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 67, 90 };
        int m = 2;
        System.out.println(binarysearch(arr, m));
    }
}

public class splitlargestsubarray {
    public static int splitlargestsubarray(int arr[], int k) {
        if (k > arr.length)
            return -1;
        int left = 0;
        int right = 0;
        for (int i : arr) {
            left = Math.max(i, left);
            right = right + i;
        }
        int mid;
        while (left <= right) {
            int sum = 0;
            int count = 1;
            mid = left + (right - left) / 2;
            for (int i : arr) {
                if (sum + i <= mid) {
                    sum = sum + i;
                } else {
                    sum = i;
                    count++;
                }
            }
            if (count <= k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 6;
        System.out.println(splitlargestsubarray(arr, k));
    }
}

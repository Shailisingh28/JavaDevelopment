public class bookalloaction {
    public static int bookalloaction(int arr[], int k) {
        if (k > arr.length)
            return -1;
        int left = 0;
        int right = 0;
        int mid;
        for (int i : arr) {
            left = Math.max(left, i);
            right += i;
        }
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
        int arr[] = { 15, 17, 20 };
        int k = 5;
        System.out.println(bookalloaction(arr, k));
    }
}

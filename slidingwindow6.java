public class slidingwindow6 {
    public static int slidingwindow6(int arr[], int k) {
        if (k - 1 < 0) {
            return nice(arr, k);
        }
        return nice(arr, k) - nice(arr, k - 1);
    }

    public static int nice(int arr[], int k) {
        int left = 0;
        int count = 0;
        int result = 0;
        for (int right = 0; right < arr.length; right++) {
            count += arr[right] % 2;
            while (count > k) {
                if (arr[left] % 2 != 0) {
                    count--;
                }
                left++;
            }
            result += right - left + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 };
        int k = 2;
        System.out.println(slidingwindow6(arr, k));
    }
}

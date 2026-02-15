public class slidongwindow2 {
    public static int slidingwindow2(int arr[], int k) {
        int max = Integer.MIN_VALUE;
        int left = 0;
        int flip = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 1) {
                flip++;
            }
            while (flip > k) {
                if (arr[left] != 1) {
                    flip--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        int k = 3;
        System.out.println(slidingwindow2(arr, k));
    }
}

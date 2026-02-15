public class SW2 {
    public static int longestOnes(int arr[], int k) {
        int left = 0;
        int max = 0;
        int flip = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0)
                flip++;
            while (flip > k) {
                if (arr[left] == 0)
                    flip--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 0, 1 };
        int k = 3;
        System.out.println(longestOnes(arr, k));
    }
}

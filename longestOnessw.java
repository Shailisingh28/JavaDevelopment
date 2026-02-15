public class longestOnessw {
    public static int longestOnessw(int arr[], int k) {
        int left = 0;
        int max = Integer.MIN_VALUE;
        int flip = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                flip++;
            }
            while (k < flip) {
                if (arr[left] == 1) {
                    left++;
                } else {
                    flip--;
                    left++;
                }
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        int k = 3;
        System.out.println(longestOnessw(arr, k));
    }
}

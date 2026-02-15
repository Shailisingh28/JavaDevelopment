public class searchinrange {
    public static boolean searchinrange(int[] arr, int target) {
        for (int i = 1; i <= 4; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 12, -7, 13, 14, 28 };
        int target = 3;
        System.out.println(searchinrange(arr, target));
    }
}

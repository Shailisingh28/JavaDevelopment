import java.util.Arrays;

public class searchin2d {
    // public static int[] searchin2d(int arr[][], int target) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // if (arr[i][j] == target) {
    // return new int[] { i, j };
    // }
    // }
    // }
    // return new int[] { -1, -1 };
    // }
    public static boolean searchin2d(int arr[][], int target) {
        for (int i[] : arr) {
            for (int j : i) {
                if (j == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 23, 4, 5, 67 },
                { 34, 22, 3, 4 },
                { 56, 89, 90, 7 }
        };
        int target = 89;
        // System.out.println(Arrays.toString(searchin2d(arr, target)));
        System.out.println(searchin2d(arr, target));
    }
}

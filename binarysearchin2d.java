import java.util.Arrays;

public class binarysearchin2d {
    public static int[] search(int arr[][], int target) {
        int row = 0;
        int column = arr[row].length - 1;

        while (row < arr.length && column >= 0) {

            if (arr[row][column] == target)
                return new int[] { row, column };
            else if (arr[row][column] > target) {
                column--;
            } else {
                row++;
                if (row < arr.length) {
                    column = arr[row].length - 1;
                } else {
                    break;
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9 }, { 10, 11 }, { 12 }
        };
        int target = 6;
        System.out.println(Arrays.toString(search(arr, target)));
    }
}

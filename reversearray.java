import java.util.Arrays;

public class reversearray {
    public static void reversearray(int arr[], int i, int j) {
        if (arr.length == 0 || i >= j) {
            return;
        }
        swap(arr, i, j);
        reversearray(arr, i + 1, j - 1);
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 1, 4, 6 };
        reversearray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

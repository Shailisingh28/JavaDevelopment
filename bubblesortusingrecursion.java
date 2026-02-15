import java.util.Arrays;

public class bubblesortusingrecursion {
    public static void bubblesortusingrecursion(int arr[], int i, int j) {
        if (i == arr.length - i) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        if (j == arr.length - i) {
            bubblesortusingrecursion(arr, i + 1, 1);
            return;
        }
        if (arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
        }
        j = j + 1;
        bubblesortusingrecursion(arr, i, j);
    }

    // public static void swap(int arr[], int i, int j) {
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // }

    public static void main(String[] args) {
        int arr[] = { 541, 53 };
        bubblesortusingrecursion(arr, 0, 1);
    }
}

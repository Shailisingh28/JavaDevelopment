import java.util.Arrays;

public class bubblesortrecursive {
    public static void bubblesortrecursion(int arr[], int i, int j) {
        if (i == arr.length - 1)
            return;
        if (j == arr.length - i) {
            bubblesortrecursion(arr, i + 1, 1);
            return;
        }
        if (arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
        }
        bubblesortrecursion(arr, i, j + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 9, 6 };
        bubblesortrecursion(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class selectionrecursion {
    public static int[] selectionrecursion(int arr[], int i) {
        if (i == arr.length - 1)
            return arr;
        int max_v = max_index(arr, 0, arr.length - 1 - i, 0, Integer.MIN_VALUE, 0);
        int temp = arr[max_v];
        arr[max_v] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        return selectionrecursion(arr, i + 1);
    }

    public static int max_index(int arr[], int start, int end, int i, int max, int max_index) {
        if (i == (end - start) + 1)
            return max_index;
        if (arr[i] > max) {
            max = arr[i];
            max_index = i;
        }
        return max_index(arr, start, end, i + 1, max, max_index);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 142, 100, -5, 6 };
        System.out.println(Arrays.toString(selectionrecursion(arr, 0)));
    }
}
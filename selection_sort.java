import java.util.Arrays;

public class selection_sort {
    public static int[] selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = min(arr, i, arr.length - 1);
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int min(int arr[], int start, int end) {
        int min = start;
        for (int i = start; i <= end; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 1, 2, 3 };
        System.out.println(Arrays.toString(selection_sort(arr)));
        // System.out.println(min(arr, 0, 2));
    }
}

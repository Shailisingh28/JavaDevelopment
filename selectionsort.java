import java.util.Arrays;

//finding max element
public class selectionsort {
    // public static int[] selection_sort(int arr[]) {
    // for (int i = arr.length - 1; i > 0; i--) {
    // int max = max(arr, 0, i);
    // int temp = arr[i];
    // arr[i] = arr[max];
    // arr[max] = temp;
    // }
    // return arr;
    // }

    // public static int max(int arr[], int start, int end) {
    // int max = 0;
    // for (int i = start; i <= end; i++) {
    // if (arr[max] < arr[i]) {
    // max = i;
    // }
    // }
    // return max;
    // }
    public static int[] selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = min(arr, i, arr.length - 1);
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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
        // System.out.println(max(arr, 0, 3));
    }
}

import java.util.Arrays;

public class ssort {
    public static int[] selection_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
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
        int arr[] = { 54, 11, 23, 56, 6 };
        System.out.println(Arrays.toString(selection_sort(arr)));
    }
}

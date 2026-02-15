import java.util.Arrays;

public class selectionsortrecursion {
    public static void selectionsortrecursion(int arr[], int i) {
        if (i <= 0) {
            return;
        }
        int max = max(arr, 0, i);
        int temp = arr[i];
        arr[i] = arr[max];
        arr[max] = temp;
        selectionsortrecursion(arr, i - 1);
    }

    public static int max(int arr[], int s, int e) {
        int max = Integer.MIN_VALUE;
        int max_index = -1;
        for (int i = s; i <= e; i++) {
            if (arr[i] > max) {
                max = arr[i];
                max_index = i;
            }
        }
        return max_index;
    }

    public static void main(String[] args) {
        int arr[] = { 8 };
        selectionsortrecursion(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

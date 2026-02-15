import java.util.Arrays;

public class selectionsortusingrecur {
    public static int[] selectionsortusingrecur(int arr[], int i) {
        if (i == arr.length - 1) {
            return arr;
        }
        int max = max(arr, 0, arr.length - 1 - i);
        int temp = arr[max];
        arr[max] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        return selectionsortusingrecur(arr, i + 1);
    }

    public static int max(int arr[], int start, int end) {
        int max = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 0, 65, -6 };
        System.out.println(Arrays.toString(selectionsortusingrecur(arr, 0)));
    }
}

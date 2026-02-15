import java.util.Arrays;

public class bubblesortrecursion {
    public static int[] bubblesortrecursion(int arr[], int i, int j) {
        if (i == arr.length - 1)
            return arr;
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
        j = j + 1;
        if (j == arr.length - 1 - i) {
            i = i + 1;
            j = 0;
        }
        return bubblesortrecursion(arr, i, j);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1 };
        System.out.println(Arrays.toString(bubblesortrecursion(arr, 0, 0)));
    }
}

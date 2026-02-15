import java.util.Arrays;

public class inserstionusingrecursion {
    public static void inserstionusingrecursion(int arr[], int i) {
        if (i == arr.length) {
            return;
        }
        insert(arr, i);
        inserstionusingrecursion(arr, i + 1);
    }

    private static void insert(int arr[], int j) {
        if (j == 0 || arr[j - 1] <= arr[j]) {
            return;
        }
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        insert(arr, j - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 55, 1, 2 };
        inserstionusingrecursion(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}

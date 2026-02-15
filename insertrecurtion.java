import java.util.Arrays;

public class insertrecurtion {
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
        int arr[] = { 2, 1, 4, 67, 3 };
        inserstionusingrecursion(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}

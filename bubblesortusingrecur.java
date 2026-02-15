import java.util.Arrays;

public class bubblesortusingrecur {
    public static int[] bubblesortusingrecur(int arr[], int i, int j) {
        if (i == arr.length)
            return arr;
        if (j == arr.length - i)
            return bubblesortusingrecur(arr, i + 1, 1);
        if (arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
        }
        return bubblesortusingrecur(arr, i, j + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 1, 7, 4, 0 };
        System.out.println(Arrays.toString(bubblesortusingrecur(arr, 0, 1)));
    }
}

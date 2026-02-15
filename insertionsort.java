import java.util.Arrays;

public class insertionsort {
    public static int[] insertion_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println(Arrays.toString(insertion_sort(arr)));
    }
}

import java.util.Arrays;

public class cyclesort1 {
    public static int cyclesort1(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (correct != arr.length && i != correct) {
                swap(arr, i, correct);
            } else {
                i = i + 1;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i)
                return i;
        }
        return arr.length;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1 };
        System.out.println(cyclesort1(arr));
    }
}

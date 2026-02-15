import java.util.Arrays;

public class bubblesort {
    public static int[] bubble_sort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 88, 88, 2, 3, 67 };
        System.out.println(Arrays.toString(bubble_sort(arr)));
    }
}

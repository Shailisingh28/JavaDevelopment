import java.util.Arrays;

public class Rev_Bubble {
    public static int[] bubblesort(int arr[]) {
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
        int arr[] = { 164, 34, 25, 12, 22, 11, 90 };
        System.out.println(Arrays.toString(bubblesort(arr)));
    }
}

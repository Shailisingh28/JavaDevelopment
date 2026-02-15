import java.util.Arrays;

public class Rev_Insertionsort {
    public static int[] Rev_Insertionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
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
        int arr[] = { 67, 8 };
        System.out.println(Arrays.toString(Rev_Insertionsort(arr)));
    }
}

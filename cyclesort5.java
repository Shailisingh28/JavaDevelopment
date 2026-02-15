import java.util.Arrays;

public class cyclesort5 {
    public static int[] cyclesort5(int arr[]) {
        int i = 0;
        int a[] = new int[2];
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                a[0] = arr[i];
                a[1] = i + 1;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4 };
        System.out.println(Arrays.toString(cyclesort5(arr)));
    }
}
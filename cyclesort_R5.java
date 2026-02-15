import java.util.Arrays;

public class cyclesort_R5 {
    public static int[] setmatch(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = arr[i];
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return new int[] { arr[i], i + 1 };
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        System.out.println(Arrays.toString(setmatch(arr)));

    }
}

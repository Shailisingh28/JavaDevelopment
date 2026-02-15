import java.util.Arrays;

public class cyclicsort {
    public static int[] cyclic_sort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 3, 1, 6, 7 };
        System.out.println(Arrays.toString(cyclic_sort(arr)));
    }
}

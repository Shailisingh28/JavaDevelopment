import java.util.ArrayList;
import java.util.List;

public class cyclesort2 {
    public static List<Integer> cyclesort2(int arr[]) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1 };
        System.out.println(cyclesort2(arr));
    }
}

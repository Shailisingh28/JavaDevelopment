import java.util.ArrayList;
import java.util.List;

public class cyclesort4 {
    public static List<Integer> cyclesort4(int arr[]) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                swap(arr, correct, i);
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                list.add(arr[i]);
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
        int arr[] = { 1 };
        System.out.println(cyclesort4(arr));
    }
}

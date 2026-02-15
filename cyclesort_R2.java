import java.util.ArrayList;
import java.util.List;

public class cyclesort_R2 {
    public static List findall(int arr[]) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if (arr[i] != arr[correct_index]) {
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
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

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findall(arr));
    }
}

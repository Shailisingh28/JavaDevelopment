import java.util.ArrayList;
import java.util.List;

public class findDuplicates {
    public static List<Integer> findDuplicates(int arr[]) {
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
        List<Integer> list = new ArrayList<>();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                list.add(arr[i]);
            }
        }
        return list;

    }

    public static void main(String[] args) {
        int arr[] = { 1 };
        System.out.println(findDuplicates(arr));
    }
}

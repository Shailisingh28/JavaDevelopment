import java.util.ArrayList;
import java.util.List;

public class cyclesort_R4 {
    public static List findall(int arr[]) {
        List<Integer> list = new ArrayList<Integer>();
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
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 1 };
        System.out.println(findall(arr));
    }
}

import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int arr[]) {
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
        List<Integer> list = new ArrayList<Integer>();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1 };
        System.out.println(findDisappearedNumbers(arr));
    }
}

import java.util.ArrayList;
import java.util.List;

public class linearserachusingrecur {
    public static List<Integer> linearserachusingrecur(int arr[], int target, int i, List<Integer> list) {
        if (i == arr.length) {
            if (list.isEmpty()) {
                list.add(-1);
                return list;
            } else {
                return list;
            }
        }
        if (arr[i] == target)
            list.add(i);
        return linearserachusingrecur(arr, target, i + 1, list);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 9, 1, 18, 9, 7, 9 };
        int target = 9;
        System.out.println(linearserachusingrecur(arr, target, 0, new ArrayList<>()));
    }
}

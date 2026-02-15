import java.util.ArrayList;
import java.util.List;

public class allindex {
    static List<Integer> list = new ArrayList<>();

    public static List allindex(int arr[], int index, int target) {
        if (index == arr.length) {
            if (list.isEmpty())
                list.add(-1);
            return list;
        }
        if (arr[index] == target)
            list.add(index);
        return allindex(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int arr[] = { 24, 1, 14, 6, 2, 34 };
        int target = 4;
        System.out.println(allindex(arr, 0, target));
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset {
    public static List<List<Integer>> subset(int arr[], List<Integer> list) {
        if (arr.length == 0) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(list));
            return result;
        }
        List<Integer> take = new ArrayList<>(list);
        take.add(arr[0]);
        List<List<Integer>> left = subset(Arrays.copyOfRange(arr, 1, arr.length), take);
        List<List<Integer>> right = subset(Arrays.copyOfRange(arr, 1, arr.length), list);
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2 };
        System.out.println(subset(arr, new ArrayList<>()));
    }
}

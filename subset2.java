import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset2 {
    public static List<List<Integer>> subset2(int arr[], List<Integer> list, int i) {
        if (i == arr.length) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(list));
            return ans;
        }
        list.add(arr[i]);
        List<List<Integer>> left = subset2(arr, list, i + 1);
        list.remove(list.size() - 1);
        int next = i + 1;
        while (next < arr.length && arr[i] == arr[next]) {
            next++;
        }
        List<List<Integer>> right = subset2(arr, list, next);
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2 };
        Arrays.sort(arr);
        System.out.println(subset2(arr, new ArrayList<>(), 0));
    }
}

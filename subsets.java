import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static List<List<Integer>> subset(int arr[], List<Integer> list, int i) {
        if (i == arr.length) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(list));
            return ans;
        }
        list.add(arr[i]);
        List<List<Integer>> left = subset(arr, list, i + 1);
        list.remove(list.size() - 1);
        List<List<Integer>> right = subset(arr, list, i + 1);
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(subset(arr, new ArrayList<>(), 0));
    }
}

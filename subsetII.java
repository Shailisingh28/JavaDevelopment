import java.util.ArrayList;
import java.util.List;

public class subsetII {
    public static List<List<Integer>> subsetII(int arr[], int i, List<Integer> list) {
        if (i == arr.length) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList(list));
            return ans;
        }
        list.add(arr[i]);
        List<List<Integer>> left = subsetII(arr, i + 1, list);
        list.remove(list.size() - 1);
        int next = i + 1;
        while (next < arr.length && arr[i] == arr[next]) {
            next++;
        }
        List<List<Integer>> right = subsetII(arr, next, list);
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2 };
        System.out.println(subsetII(arr, 0, new ArrayList<>()));
    }
}

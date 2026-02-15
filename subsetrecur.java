import java.util.ArrayList;
import java.util.List;

public class subsetrecur {
    public static List<List<Integer>> subset(int arr[], int i, List<Integer> ans) {
        if (i == arr.length) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList(ans));
            return result;
        }
        ans.add(arr[i]);
        List<List<Integer>> left = subset(arr, i + 1, ans);
        ans.remove(ans.size() - 1);
        List<List<Integer>> right = subset(arr, i + 1, ans);
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 8 };
        System.out.println(subset(arr, 0, new ArrayList<>()));
    }
}

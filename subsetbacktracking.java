import java.util.*;

public class subsetbacktracking {
    public static List<List<Integer>> subsetbacktracking(int arr[], int i, List<Integer> ans) {
        if (i == arr.length) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList(ans));
            return result;
        }
        ans.add(arr[i]);
        List<List<Integer>> left = subsetbacktracking(arr, i + 1, ans);
        ans.remove(ans.size() - 1);
        List<List<Integer>> right = subsetbacktracking(arr, i + 1, ans);
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        System.out.println(subsetbacktracking(arr, 0, new ArrayList<>()));
    }
}

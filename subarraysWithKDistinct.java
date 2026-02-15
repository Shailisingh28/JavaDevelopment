import java.util.HashMap;

public class subarraysWithKDistinct {
    public static int subarraysWithKDistinct(int arr[], int k) {
        int ans = count(arr, k) - count(arr, k - 1);
        return ans;
    }

    public static int count(int arr[], int k) {
        if (k < 0)
            return 0;
        int left = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.size() > k) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0)
                    map.remove(arr[left]);
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1 }, k = 1;
        System.out.println(subarraysWithKDistinct(arr, k));
    }
}

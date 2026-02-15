import java.util.HashMap;

public class SW3 {
    public static int totalFruits(int arr[]) {
        int left = 0;
        int max = 0;
        int baskets = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.size() > baskets) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0)
                    map.remove(arr[left]);
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1 };
        System.out.println(totalFruits(arr));
    }
}

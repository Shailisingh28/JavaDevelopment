import java.util.HashMap;

public class slidingwindow3 {
    public static int slidingwindow3(int arr[], int baskets) {
        int left = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.size() > baskets) {
                if (map.get(arr[left]) > 1) {
                    map.put(arr[left], map.get(arr[left]) - 1);
                } else {
                    map.remove(arr[left]);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 2, 5, 5 };
        int baskets = 3;
        System.out.println(slidingwindow3(arr, baskets));
    }
}

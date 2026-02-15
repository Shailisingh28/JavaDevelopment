import java.util.HashMap;

public class totalFruit {
    public static int totalFruit(int arr[]) {
        int left = 0;
        int max = 0;
        int right = 0;
        HashMap<Integer, Integer> basket = new HashMap<>();
        for (right = 0; right < arr.length; right++) {
            basket.put(arr[right], basket.getOrDefault(arr[right], 0) + 1);
            while (basket.size() > 2) {
                if (basket.get(arr[left]) == 1) {
                    basket.remove(arr[left]);
                } else {
                    basket.put(arr[left], basket.get(arr[left]) - 1);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 2 };
        System.out.println(totalFruit(arr));
    }
}

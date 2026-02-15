import java.util.HashMap;

public class slidingwindow10 {
    public static int slidingwindow10(int arr[], int k) {
        return distinctelement(arr, k) - distinctelement(arr, k - 1);
    }

    public static int distinctelement(int arr[], int k) {
        if (k < 1) {
            return 0;
        }
        int left = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.size() > k) {
                if (map.get(arr[left]) == 1) {
                    map.remove(arr[left]);
                } else {
                    map.put(arr[left], map.get(arr[left]) - 1);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4 };
        int k = 3;
        System.out.println(slidingwindow10(arr, k));
    }
}

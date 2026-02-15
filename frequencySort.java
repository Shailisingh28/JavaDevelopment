import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class frequencySort {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character> arr[] = new ArrayList[s.length() + 1];
        map.keySet().forEach(c -> {
            if (arr[map.get(c)] == null) {
                arr[map.get(c)] = new ArrayList<>();
            }
            arr[map.get(c)].add(c);
        });
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != null) {
                for (char c : arr[i]) {
                    for (int j = 0; j < i; j++) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbrrrrr";
        System.out.println(frequencySort(s));
    }
}

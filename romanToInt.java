import java.util.HashMap;

public class romanToInt {
    public static int romanToInt(String s) {
        int sum = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            int current_val = map.get(s.charAt(i));
            if (i < s.length() - 1 && current_val < map.get(s.charAt(i + 1))) {
                sum += (map.get(s.charAt(i + 1)) - current_val);
                i++;
            } else {
                sum += current_val;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "MCMXVI";
        System.out.println(romanToInt(s));
    }
}

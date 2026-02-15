import java.util.HashMap;

public class String_Easy5 {
    public static boolean isomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if (!map.containsKey(original)) {
                if (map.containsValue(replacement)) {
                    return false;
                }
                map.put(original, replacement);
            } else {
                char value = map.get(original);
                if (value != replacement) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "apple";
        String t = "bbnbm";
        System.out.println(isomorphic(s, t));
    }
}

import java.util.HashMap;

public class isomorphicString {
    public static boolean isomorphicString(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char replace = t.charAt(i);
            if (!map.containsKey(s.charAt(i))) {
                if (!map.containsValue(replace)) {
                    map.put(s.charAt(i), replace);
                } else {
                    return false;
                }
            } else {
                if (map.get(s.charAt(i)) != replace) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "paper";
        String t = "titl";
        System.out.println(isomorphicString(s, t));
    }
}

import java.util.HashMap;

public class isomorphic {

    public static boolean isomorphics(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {

            char original = a.charAt(i);
            char replacement = b.charAt(i);

            if (!map.containsKey(original)) {

                // check if replacement is already used
                if (map.containsValue(replacement)) {
                    return false;
                }

                map.put(original, replacement);

            } else {
                // original already mapped before
                char value = map.get(original);

                if (value != replacement) {
                    return false; // conflict
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "apple";
        String t = "bbnbm";

        System.out.println(isomorphics(s, t)); // Output: true
    }
}

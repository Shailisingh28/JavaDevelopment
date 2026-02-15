public class Anagram {
    public static boolean ValidAnagram(String s, String t) {
        // s = s.toLowerCase();
        // t = t.toLowerCase();
        // s = s.replace(" ", "");
        // t = t.replace(" ", "");

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                s1.append(Character.toLowerCase(c));
            }
        }
        for (char c : t.toCharArray()) {
            if (c != ' ') {
                s2.append(Character.toLowerCase(c));
            }
        }
        s = s1.toString();
        t = s2.toString();
        if (s.length() != t.length())
            return false;
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < t.length(); j++) {
            arr[t.charAt(j) - 'a']--;
        }
        for (int count : arr) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "eatv";
        String t = "t e a";
        System.out.println(ValidAnagram(s, t));
    }
}

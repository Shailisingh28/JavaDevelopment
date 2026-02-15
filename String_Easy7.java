public class String_Easy7 {
    public static boolean anagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int index = 0;
        StringBuilder s1 = new StringBuilder();
        StringBuilder t1 = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                s1.append(Character.toLowerCase(c));
            }
        }
        for (char c : t.toCharArray()) {
            if (c != ' ') {
                t1.append(Character.toLowerCase(c));
            }
        }
        s = s1.toString();
        t = t1.toString();
        int arr[] = new int[26];
        for (char c : s.toCharArray()) {
            index = c - 'a';
            arr[index]++;
        }
        for (char c : t.toCharArray()) {
            index = c - 'a';
            arr[index]--;
        }
        for (int i : arr) {
            if (i != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "";
        String t = "";
        System.out.println(anagram(s, t));
    }
}

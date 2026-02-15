public class anagramStrings {
    public static boolean anagramStrings(String s, String t) {
        if (s.length() != t.length())
            return false;

        int arr[] = new int[26];
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            arr[index]++;
        }
        for (char c : t.toCharArray()) {
            int index = c - 'a';
            arr[index]--;
        }
        for (int i : arr) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "u";
        String t = "";
        System.out.println(anagramStrings(s, t));
    }
}

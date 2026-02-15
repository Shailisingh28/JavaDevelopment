public class String_Easy3 {
    public static String largestoddString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) % 2 != 0) {
                if (s.charAt(0) == '0')
                    return sb.append(s, 1, i + 1).toString();
                else
                    return sb.append(s, 0, i + 1).toString();
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String str = "00214638";
        System.out.println(largestoddString(str));
    }
}

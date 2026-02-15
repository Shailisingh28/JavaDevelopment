public class string_R {
    public static void main(String[] args) {
        // System.out.printf("%s is a good girl", "shaili");
        String a = "ababa";
        // String b = "";
        // for (int i = a.length() - 1; i >= 0; i--) {
        // b += a.charAt(i);
        // }
        StringBuilder s = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            s.append(a.charAt(i));
        }
        System.out.println(a.equals(s.toString()));
        System.out.println(a == s.toString());
    }
}

public class skipstring {
    public static String skip_string(String str) {
        if (str.isEmpty())
            return "";
        if (str.startsWith("apple")) {
            return skip_string(str.substring(5));
        } else {
            return str.charAt(0) + skip_string(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "applehagtapplesh";
        System.out.println(skip_string(str));
    }
}

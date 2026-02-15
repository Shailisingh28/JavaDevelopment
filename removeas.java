public class removeas {
    public static String removeas(String str) {
        if (str.isEmpty())
            return "";
        if (str.charAt(0) != 'a') {
            return str.charAt(0) + removeas(str.substring(1));
        } else {
            return removeas(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "a";
        System.out.println(removeas(str));
    }
}

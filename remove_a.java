public class remove_a {
    public static String remove(String str) {
        if (str.length() == 0)
            return " ";
        if (str.charAt(0) != 'a') {
            return str.charAt(0) + remove(str.substring(1));
        }
        return remove(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "aaggaagat";
        System.out.println(remove(str));
        System.out.println(str);
    }
}

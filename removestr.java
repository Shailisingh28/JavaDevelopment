public class removestr {
    public static String removeString(String str, String rstr) {
        if (str.isEmpty())
            return "";
        if (!str.startsWith(rstr)) {
            return str.charAt(0) + removeString(str.substring(1), rstr);
        } else {
            return removeString(str.substring(rstr.length()), rstr);
        }
    }

    public static void main(String[] args) {
        String str = "apple";
        String rstr = "ty";
        System.out.println(removeString(str, rstr));
    }
}

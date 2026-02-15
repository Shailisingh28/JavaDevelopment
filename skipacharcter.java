public class skipacharcter {
    public static String skipacharaster(String str, int i, StringBuilder s) {
        if (i == str.length())
            return s.toString();
        if (str.charAt(i) != 'a') {
            s.append(str.charAt(i));
        }
        return skipacharaster(str, i + 1, s);
    }

    public static void main(String[] args) {
        String str = "aa";
        System.out.println(skipacharaster(str, 0, new StringBuilder()));
    }
}

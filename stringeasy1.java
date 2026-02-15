public class stringeasy1 {
    public static String stringeasy1(String str) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == ')') {
                count = count - 1;
            }
            if (count != 0) {
                sb.append(c);
            }
            if (c == '(') {
                count = count + 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "()";
        System.out.println(stringeasy1(str));
    }
}

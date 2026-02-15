public class String_Mid3 {
    public static int myAtoi(String s) {
        s = s.trim();
        int sign = 1;
        if (s.isEmpty())
            return 0;
        int i = 0;
        long ans = 0;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = s.charAt(i) == '-' ? -1 : +1;
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            ans = ans * 10 + (s.charAt(i) - '0');
            if (ans * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (ans * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            i++;
        }
        return (int) (sign * ans);
    }

    public static void main(String[] args) {
        String s = "-42";
        System.out.println(myAtoi(s));
    }
}

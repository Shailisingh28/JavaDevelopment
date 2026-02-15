public class recusionatoi {

    public static int recusionatoi(String s, int index, long ans, int sign) {
        if (s.length() == index) {
            return (int) ans * sign;
        }
        if (index == 0 && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            return recusionatoi(s, index + 1, 0, s.charAt(index) == '-' ? -1 : 1);
        }
        if (Character.isDigit(s.charAt(index))) {
            ans = ans * 10 + (s.charAt(index) - '0');
            if (ans > Integer.MAX_VALUE)
                ans = Integer.MAX_VALUE;
            else if (ans < Integer.MIN_VALUE)
                ans = Integer.MIN_VALUE;
            return recusionatoi(s, index + 1, ans, sign);
        }
        return (int) ans * sign;
    }

    public static void main(String[] args) {
        String s = "-89re8";
        int result = recusionatoi(s, 0, 0, 1);
        System.out.println(result);
    }
}

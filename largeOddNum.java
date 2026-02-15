public class largeOddNum {
    public static String largeOddNum(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) % 2 != 0) {
                int ind = 0;
                while (ind < str.length() && str.charAt(ind) == '0') {
                    ind++;
                }
                return sb.append(str.substring(ind, i + 1)).toString();
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String str = "0542378";
        System.out.println(largeOddNum(str));
    }
}

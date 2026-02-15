public class reverseWord {
    public static String reverseString(String s) {
        String arr[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (sb.length() == 0) {
                sb.append(arr[i]);
            } else {
                sb.append(" ");
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "welcome to the jungle";
        System.out.println(reverseString(s));
    }
}

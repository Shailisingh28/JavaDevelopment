public class String_Easy2 {
    public static String reverseString(String s) {
        String arr[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].length() == 0)
                continue;
            else {
                if (sb.length() == 0) {
                    sb.append(arr[i]);
                } else {
                    sb.append(" ");
                    sb.append(arr[i]);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "welcome to the jungle";
        System.out.println(reverseString(str));
    }
}

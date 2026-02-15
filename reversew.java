public class reversew {
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        String arr[] = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (sb.isEmpty()) {
                sb.append(arr[i]);
            } else {
                sb.append(" ");
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "My name is shaili singh";
        System.out.println(reverse(s));
    }
}

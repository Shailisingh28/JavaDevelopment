import java.util.Arrays;

public class commonprefix {
    public static String commonprefix(String arr[]) {
        StringBuilder sb = new StringBuilder("");
        Arrays.sort(arr);
        int i = 0;
        while (i < arr[0].length() && i < arr[arr.length - 1].length()) {
            if (arr[0].charAt(i) == arr[arr.length - 1].charAt(i)) {
                sb.append(arr[0].charAt(i));
                i++;
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String arr[] = { "flowers", "flo" };
        System.out.println(commonprefix(arr));
    }
}

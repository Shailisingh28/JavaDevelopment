public class stringeasy2 {
    public static String stringeasy2(String str) {
        String arr[] = str.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].length() == 0) {
                continue;
            }
            if (ans.isEmpty()) {
                ans.append(arr[i]);
            } else {
                ans.append(" ");
                ans.append(arr[i]);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "a good   example";
        System.out.println(stringeasy2(str));
    }
}

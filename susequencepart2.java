import java.util.ArrayList;

public class susequencepart2 {
    public static ArrayList<String> subsequencepart2(String str, String ans) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> left = subsequencepart2(str.substring(1), ans + str.charAt(0));
        ArrayList<String> right = subsequencepart2(str.substring(1), ans);
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        System.out.println(subsequencepart2(str, ans));
    }
}

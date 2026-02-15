import java.util.Arrays;

public class searchinstring {
    public static char searchinstring(String str, char target) {
        if (str.length() == 0) {
            System.out.println("empty string");
        }
        for (char c : str.toCharArray()) {
            if (target == c) {
                return c;
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        String str = "kunal";
        char target = 'K';
        // System.out.println(searchinstring(str, target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }
}

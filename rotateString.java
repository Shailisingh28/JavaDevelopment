public class rotateString {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        String temp = s + s;
        return temp.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcd";
        String goal = "cdaa";
        System.out.println(rotateString(s, goal));
    }
}

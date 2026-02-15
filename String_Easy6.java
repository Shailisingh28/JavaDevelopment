public class String_Easy6 {
    public static boolean rotate(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        String s1 = s + s;
        return s1.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "adeac";
        System.out.println(rotate(s, goal));
    }
}

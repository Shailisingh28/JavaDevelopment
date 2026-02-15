import java.util.Stack;

public class SortStack {
    public static void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        sort(stack);
        insert(stack, top);
    }

    public static void insert(Stack<Integer> stack, int top) {
        if (stack.isEmpty() || stack.peek() <= top) {
            stack.push(top);
            return;
        }
        int x = stack.pop();
        insert(stack, top);
        stack.push(x);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(60);
        s.push(45);
        s.push(400);
        s.push(5);
        s.push(5);
        sort(s);
        System.out.println(s);
    }
}

import java.util.Stack;

public class reverssestack {
    public static void reversestack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reversestack(stack);
        insertatbottom(stack, top);
    }

    public static void insertatbottom(Stack<Integer> stack, int top) {
        if (stack.isEmpty()) {
            stack.push(top);
            return;
        }
        int x = stack.pop();// 30,20,6,8
        insertatbottom(stack, top);// 89
        stack.push(x);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(20);
        stack.push(6);
        stack.push(8);
        stack.push(89);
        System.out.println(stack);
        reversestack(stack);
        System.out.println(stack);
    }
}
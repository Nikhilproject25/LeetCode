package src.stack;

public class ArrayImpl {
    private int size;
    private int top;
    private int[] stack;

    public ArrayImpl(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        ArrayImpl stack = new ArrayImpl(10);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop()); // Output: 2
        System.out.println(stack.peek()); // Output: 1
    }
}

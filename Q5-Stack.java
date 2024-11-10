import java.util.EmptyStackException;

public class Stack<T> {
    private final Object[] array;
    private int top;
    private final int capacity;

    // Constructor to initialize the stack with a given capacity
    public Stack(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
        top = -1;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to push an element onto the stack
    public void push(T element) {
        if (isFull()) {
            System.out.println("Stack overflow! Cannot push element " + element + ".");
        } else {
            array[++top] = element;
            System.out.println("Element \"" + element + "\" pushed onto the stack.");
        }
    }

    // Method to pop an element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        @SuppressWarnings("unchecked")
        T poppedElement = (T) array[top--];
        System.out.println("Element \"" + poppedElement + "\" popped from the stack.");
        return poppedElement;
    }

    public static void main(String[] args) {
        // Create a stack with capacity 5
        Stack<Integer> stack = new Stack<>(5);

        // Push some elements onto the stack
        stack.push(102);
        stack.push(204);
        stack.push(305);

        // Pop elements from the stack and print them
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

    }
}

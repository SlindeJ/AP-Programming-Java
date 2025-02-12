package CS223;

public class Stack {
    int top_of_stack = -1;
    int stack_size = 5;
    int[] array = new int[stack_size];  // create an empty array of length stack_size

    public void push(int x) {
        // error case else push to stack
        if (top_of_stack == stack_size - 1) {
            System.out.println("Error, Stack is full");
        } else {
            array[++top_of_stack] = x;
        }
    }
    public int pop() {
        // error case else return first thing and top_of_stack--
        if (top_of_stack < 0) {
            System.out.println("Error, Stack is empty");
            return -1;
        } else {
            return array[top_of_stack--];
        }
    }
    public int peek() {
        // do not remove like pop
        if (top_of_stack < 0) {
            System.out.println("Error, Stack is empty");
            return -1;
        } else {
            return array[top_of_stack];
        }
    }
    public int size() {
        return top_of_stack + 1;
    }
}

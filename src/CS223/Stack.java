package CS223;
import java.util.Arrays;

public class Stack {
    int top_of_stack = -1;
    int stack_size = 5;
    char[] array = new char[stack_size];  // create an empty array of length stack_size

    public void Push(char x) {
        // error case else push to stack
        if (top_of_stack == stack_size - 1) {
            System.out.println("Error, cannot push because stack is full");
        } else {
            array[++top_of_stack] = x;
        }
    }
    public char Pop() {
        // error case else return first thing and top_of_stack--
        if (top_of_stack < 0) {
            System.out.println("Error, cannot pop because stack is empty");
            return ' ';
        } else {
            return array[top_of_stack--];
        }
    }
    public char Peek() {
        // do not remove like pop
        if (top_of_stack < 0) {
            System.out.println("Error, cannot peak because stack is empty");
            return ' ';
        } else {
            return array[top_of_stack];
        }
    }
    public int Size() {
        return top_of_stack + 1;
    }
    public void print_stack() {
        System.out.println(Arrays.toString(array) + "\t\t" + top_of_stack + "\t" + Size()); // this was a pain
    }
}

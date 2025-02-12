package CS223;

public class Stack_demo extends Stack {
    public static void main(String[] args) {
        Stack_demo s = new Stack_demo();
        System.out.println("Stack Contents\t\tTop\tSize");
        s.print_stack();
        s.Push('C'); s.print_stack();
        s.Push('S'); s.print_stack();
        s.Push('-'); s.print_stack();
        s.Push('2'); s.print_stack();
        s.Push('2'); s.print_stack();
        s.Push('1'); s.print_stack();
        s.Pop(); s.print_stack();
        s.Pop(); s.print_stack();
        s.Pop(); s.print_stack();
        s.Push('2'); s.print_stack();
        s.Push('2'); s.print_stack();
        s.Push('2'); s.print_stack();
        s.Pop(); s.print_stack();
        s.Push('3'); s.print_stack();
        s.Pop(); s.print_stack();
        s.Pop(); s.print_stack();
        s.Pop(); s.print_stack();
        s.Pop(); s.print_stack();
        s.Pop(); s.print_stack();
        s.Pop(); s.print_stack();
        // very ugly, but works
    }
}

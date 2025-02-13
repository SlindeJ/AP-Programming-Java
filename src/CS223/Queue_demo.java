package CS223;

import java.util.Arrays;

public class Queue_demo {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.printf("%-40s %-10s %-10s %-10s \n\n", "Queue Contents", "front" , "rear" , "size" );
        q.print_Queue();
        q.Enqueue("Heywood");q.print_Queue();
        q.Dequeue();q.print_Queue();
        q.Enqueue("Kaminski");q.print_Queue();
        q.Enqueue("Hunter");q.print_Queue();
        q.Enqueue("Frank");q.print_Queue();
        q.Enqueue("Dave");q.print_Queue();
        q.Enqueue("Hal");q.print_Queue();
        q.Enqueue("Heywood");q.print_Queue();
        q.Dequeue();q.print_Queue();
        q.Dequeue();q.print_Queue();
        q.Dequeue();q.print_Queue();
        q.Enqueue("Heywood");q.print_Queue();
        q.Enqueue("Chandra");q.print_Queue();
        q.Dequeue();q.print_Queue();
        q.Dequeue();q.print_Queue();
        q.Dequeue();q.print_Queue();
        q.Dequeue();q.print_Queue();
        q.Dequeue();q.print_Queue();
        q.Enqueue("Frank");q.print_Queue();
    }
}

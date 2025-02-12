package CS223;

public class Queue {
    int front;
    int rear;
    int max_size = 5;
    int size;
    String[] q = new String[max_size];

    public void Enqueue(String x) {
        if (size == max_size) {
            System.out.println("cannot enqueue, queue is full");
        } else {
            q[rear++] = x;
            if (rear == max_size) { rear = 0; }
            size++; // MUST keep track of queue size
        }
    }
    public String Dequeue() {
        if (size == 0) {
            System.out.println("cannot dequeue, queue is empty");
            return null;
        } else {
            size--;
            String s = q[front++];  // kinda gross
            if (front == max_size) { front = 0; }
            return s;
        }
    }
    public String peek() {
        if (size == 0) {
            System.out.println("cannot peek, queue is empty");
            return null;
        }
        else {
            return q[front];
        }
    }
    public int Size(){
        return size;
    }
    public String print_Queue() {
        return "";
    }
}

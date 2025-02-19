package CS223.Assignment_1;

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

    private String FArray(String[] arr, int front, int rear, int size) {
        String arrString = "";
        while (front != rear) {
            arrString += STR."\{arr[front++]}, ";
            if (front == max_size) { front = 0; }
        }
        if (size == max_size) {     // This is disgusting
            for (int i = 0; i < size; i++) {
                arrString += STR."\{arr[front++]}, ";
                if (front == max_size) { front = 0; }
            }
        }


        if (arrString.length() > 1) { return "[" + arrString.substring(0, arrString.length() - 2) + "]"; }
        else { return "[]"; }
    }

    public void print_Queue() {
        System.out.printf("%-40s %-10s %-10s %-10s \n", FArray(q, front, rear, size), front, rear, size);       // q, front, rear, size
        // had to use google to remind myself how to format the spacing again
    }
}

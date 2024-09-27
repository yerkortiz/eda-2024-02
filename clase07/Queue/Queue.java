class Queue {
    public class Node {
        int value;
        Node next;

        public Node(int x) {
            this.value = x;
            this.next = null;
        }

        public int getValue() {
            return this.value;
        }
    }
    
    Node front;
    Node tail;

    Queue() {
        this.front = null;
    }
    
    public boolean empty(){
        return this.front == null;
    }

    public Node front(){
        return this.front;
    }
    
    public Node tail(){
        return this.tail;
    }

    public void enqueue(int x) {
        Node aux = new Node(x);
        if (empty()) {
            this.front = aux;
            this.tail = aux;
            return;
        }

        this.tail.next = aux;
        this.tail = aux;
    }

    public int dequeue() {
        int aux = -1;
        if (empty()) return aux;
        aux = front().getValue();
        if (front() == tail()) {
            this.front = null;
            this.tail = null;
        } else {
            this.front = front().next;
        }
        return aux;
    }
    public static void main(String[] args) {
    }
}

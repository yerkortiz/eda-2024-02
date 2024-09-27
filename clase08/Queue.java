package clase08;
public class Queue {
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  Node head, tail;

  public void enqueue(int data) {
    Node newNode = new Node(data);
    if (tail != null) {
      tail.next = newNode;
    } else {
      head = newNode;
    }
    tail = newNode;
  }

  public int peek() {
    return head.data;
  }

  public int dequeue() {
    int tmp = head.data;
    head = head.next;
    return tmp;
  }

  public static void main(String[] args) {
    Queue q = new Queue();

    q.enqueue(5);
    q.enqueue(3);
    q.enqueue(7);
    System.out.println(q.peek());
    q.dequeue();

    System.out.println(q.peek());
  }

}

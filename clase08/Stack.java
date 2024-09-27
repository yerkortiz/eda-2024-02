package clase08;

public class Stack {
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head;

  public void push(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  public int top() {
    return head.data;
  }

  public int pop() {
    int tmp = head.data;
    head = head.next;
    return tmp;
  }

  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(3);
    s.push(5);
    s.push(7);
    System.out.println(s.top()); // 7
    s.pop();
    System.out.println(s.top()); // 5
  }

}

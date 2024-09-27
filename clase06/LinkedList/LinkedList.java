package clase06.LinkedList;

public class LinkedList {
    Node head;
    LinkedList(){
        this.head = null;
    }

    public static class Node {
        int value;
        Node next;

        Node() {
            this.value = 0;
            this.next = null;
        }

        Node(int x) {
            this.value = x;
            this.next = null;
        }

        Node(int x, Node n) {
            this.value = x;
            this.next = n;
        }
    }

    void insertFirst(int x) {
        //está vacía.
        if (this.head==null) {
            this.head = new Node(x);
            return;
        }

        Node temp = new Node(x, this.head);
        this.head = temp;
    }

    void printList() {
        if (this.head==null) {
            System.out.println("está vacía");
            return;
        }
        Node temp = this.head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        // Node n1 = new Node(6);
        // System.out.println(n1.value);
        // System.out.println(n1.next);
        // no hay que acceder a valores de "objetos" nulos
        // System.out.println(n1.next.value);
        // 6 -> null
        // Node n2 = new Node(8);
        // System.out.println(n2.value);
        // 8 -> null
        // n1.next = n2;
        // System.out.println(n1.next.value);
        //6 -> 8 -> null;

        LinkedList l = new LinkedList();
        l.printList();
        l.insertFirst(1);
        l.printList();
        l.insertFirst(4);
        l.insertFirst(7);
        l.insertFirst(12);
        l.printList();

    }
}

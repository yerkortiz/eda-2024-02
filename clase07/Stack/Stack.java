public class Stack {
    public class Node {
        int value;
        Node next;
        
        public Node(int x){
            this.value = x;
            this.next = null;
        }

        public int getValue(){
            return this.value;
        }
    }
    
    Node top;

    Stack() {
        this.top = null;
    }

    Stack(int x) {
        this.top = new Node(x);
    }

    public void push(int x){
        Node aux = new Node(x);
        aux.next = top();
        this.top = aux;
    }

    public int pop(){
        if (empty()) 
            return -1;
        int aux = top().getValue(); 
        this.top = top().next;
        return aux;
    }

    public boolean empty(){
        return this.top == null;
    }

    public Node top(){
        return this.top;
    }

    public static void main(String[] args){
        Stack st = new Stack();
        st.push(5);
        System.out.println(st.pop());
    }
}

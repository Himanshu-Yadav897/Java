import java.util.LinkedList;

public class Linked {
    static class Node{
        int data;
        Node next;
        Node(int Newdata){
            this.data = Newdata;
            this.next = null;
        }
    }

    static class Stack{
        static Node head = null;
        
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            int top = head.data;
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();

        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();
        }

    }
}

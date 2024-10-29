
import java.util.*;
public class Question1 {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null || tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null || tail == null ){
                head = tail = newNode;
            }   
            tail.next = newNode;
            newNode = tail;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = head.data;
            if(tail == head){
                tail = head = null;
            }
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static int example(int stones[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i<stones.length; i++){
            pq.add(stones[i]);
        }

        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();

            int result = first - second;
            if(result !=  0){
                pq.add(result);
            }
        }

        if(!pq.isEmpty()){
            return pq.poll();
        }
        return 0; 
    }
     public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.err.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
        System.out.println(q.remove());
        }
    }
}

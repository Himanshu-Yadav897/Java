public class LInkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int Size; // Static variable to count the element

    public void AddFirst(int data){ // Function for adding element in the first position
        Node newNode = new Node(data);
        Size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void AddLast(int data){ // Function for adding element in the last position
        Node newNode = new Node(data);
        Size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){ // Function for printing the linked list
        Node temp = head;
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void AddMid(int idx ,int data){ // Function to insert element in the middle position
        if(idx == 0){
            AddFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Size++;
        Node temp = head;
        int i=0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        // i = idx -1 ;  temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String args[]){
        LInkedList ll = new LInkedList();
        ll.print();
        ll.AddFirst(3);
        ll.print();
        ll.AddLast(5);
        ll.print();
        ll.AddFirst(9);
        ll.print();
        ll.AddLast(7);
        ll.print();
        ll.AddMid(2, 11);
        ll.print();
        System.out.println(ll.Size);
    }
}

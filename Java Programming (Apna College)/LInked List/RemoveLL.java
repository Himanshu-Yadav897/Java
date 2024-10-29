public class RemoveLL {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void AddFirst(int data){ // Function for adding element in the first position
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void AddLast(int data){ // Function for adding element in the last position
        Node newNode = new Node(data);
        size++;
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
        size++;
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

     public int removeFirst(){    // Function remove the first element of linked list
        if(size == 0){
            System.out.println("The Linked List is empty");
            return Integer.MIN_VALUE;
            } else if(size == 1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
    }

    public int removeLast(){ // Function to remove the last element
        if(size == 0){
            System.out.println(" The Linked list is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = tail.data;
            head = tail = null;
            size =0;
            return val;
        }
        
        // prev : i = size -2
        Node prev = head;
        for(int i = 0; i< size -2; i++){
            prev = prev.next;
        }

        int val = prev.next.data; // Data of tail
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

     //Iterative
     public int IterSearch(int key) {
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Recursive Search

    public int helper(Node head , int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int RecSearch(int key){
        return helper(head , key);
    }


    public void reverse(){  // Function to reverse a linked list
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void deleteNthfromEnd(int n){
        //Calculate Size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        // Exception for delete the first element from the end
        if(n == sz){
            head = head.next;
            return;
        }
        // prev = sz -n;
        int i = 1;
        int iToFind = sz -n;
        Node prev = head;
        while(i< iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // Check if Linked list is palindrome

    public Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    } 

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        // Find middle -------> Step 1
        Node mid = findMidNode(head);

        // Reverse 2nd half -------> Step 2
        Node curr = mid;
        Node prev = null;
        Node next;
        while(curr != null){
             next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        // Check if equal ---------> Step 3
        while(right != null){
            if(left.data != right.data){
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;
    }

    // Fuction to detect if Linked list is Cycle/ Loop 

    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; // +2
            if(slow == fast){
                return true; // Cycle Exists
            }
        }
        return false; // Cycle doesn't Exists
    }

    // Function To remove the Loop/ Cycle in a Linked list
    public static void removeCycle(){
        // Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }


        // Find meeting point
        slow = head;
        Node prev = null; // Last Node
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }


        // Remove Cycle --> last.next = null
        prev.next = null;
    }

    // Zig Zag Linked List

    public void ZigZag(){
        // Find Mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse 2nd half of the linked list
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
         while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
         }


         // Alternate merging
         Node left = head;
         Node right = prev;
         Node nextL , nextR;
          while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
          }
    }
    public static void main(String args[]){
        RemoveLL Rll = new RemoveLL();
       // Rll.print();
        // Rll.AddFirst(3);
        // Rll.print();
        // Rll.AddLast(5);
        // Rll.print();
        // Rll.AddFirst(9);
        // Rll.print();
        // Rll.AddLast(7);
        // Rll.print();
        // Rll.AddMid(2, 11);
        // Rll.print();
        // Rll.removeFirst();
        // Rll.print();
        // Rll.removeLast();
        // Rll.print();
        // System.out.println("Size of Linked List is = " + Rll.size);

        // System.out.println(Rll.IterSearch(5));

        // System.out.println(Rll.RecSearch(5));
        //Rll.reverse();
        //Rll.print();
        //Rll.deleteNthfromEnd(3);
        //Rll.print();

        Rll.AddLast(1);
        Rll.AddLast(2);
        Rll.AddLast(3);
        Rll.AddLast(4);
        Rll.AddLast(5);
        // // System.out.println(Rll.checkPalindrome());
        // System.out.println(Rll.isCycle());
        //Rll.removeCycle();

        // Rll.print();
        // Rll.ZigZag();
        // Rll.print();
        System.out.println(Rll.checkPalindrome());

        

    }
}

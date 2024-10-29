public class Implementation {
    static class Queue {
        static int size;
        static int rear;
        static int arr[];

        Queue(int n) {
            size = n;
            rear = -1;
            arr = new int[n];
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == arr.length - 1) {
                System.out.println("Queue is full");
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue s = new Queue(7);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        s.add(7);
        s.remove();

        while(!s.isEmpty()){
           System.out.println(s.peek());
           s.remove(); 
        }

    }
}

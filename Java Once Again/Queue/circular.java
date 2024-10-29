public class circular {
    static class Queue{
        static int rear;
        static int front;
        static int arr[];
        static int size;

        Queue(int n){
            size = n;
            arr = new int[n];
            front = -1;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 || front == -1;
        }

        public static boolean isFull(){
            if((rear+1)%size == front){
                return true;
            }
            return false;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];

            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];
            return result;
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
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

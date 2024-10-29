import java.util.ArrayList;

public class Problem2 {
    static class Heap{

        ArrayList<Integer> arr = new ArrayList<>();


        // Add
        public void add(int data){

            arr.add(data);

            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)){
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        private void heapify(int i){
            // step 1
            int root = i;
            int left = 2*i + 1;
            int right = 2*i + 2;


            // step 2
            if(left < arr.size() && arr.get(root) > arr.get(left)){
                root = left;
            }

            if(right < arr.size() && arr.get(root) > arr.get(right)){
                root = right;
            }

            // step 3
            if(root != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(root));
                arr.set(root, temp);

                heapify(root);
            }


        }

        public int remove(){
            int data = arr.get(0);

            // Step 1
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step 2
            arr.remove(arr.size()-1);

            // step 3
            heapify(0);

            return data;
        }


        // Peek
        public int peek(){
            return arr.get(0);
        }

        // Empty
        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(3);
        pq.add(1);
        pq.add(4);
        pq.add(5);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}

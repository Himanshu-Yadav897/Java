import java.util.*;

public class Problem3 {
    static class Heap {

        static ArrayList<Integer> arr = new ArrayList<>();

        public static void insert(int data) {

          

            arr.add(data);
            int child = arr.size()-1;
            int par = (child -1)/2;

            while(arr.get(child) < arr.get(par)){
                int temp = arr.get(child);
                arr.set(child,arr.get(par));
                arr.set(par, temp);
                child = par;
                par = (child-1)/2;
            }

         
        }


        private static void heapify(int i){
            int root = i;
            int left = 2 * root +1;
            int right = 2 * root + 2;


            if(left < arr.size() && arr.get(root) > arr.get(left)){
                root = left;
            }

            if( right < arr.size() && arr.get(root) > arr.get(right)){
                root = right;
            }

            if(root != i){
                int temp = arr.get(i);
                arr.set(i,arr.get(root));
                arr.set(root, temp);

                heapify(root);
            }

        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }

            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0, arr.get((arr.size()-1)));
            arr.set(arr.size()-1, temp);

            arr.remove(arr.size()-1);


            heapify(0);
            return data;
            


        }

        public static boolean isEmpty() {
            return arr.size() == 0;
        }

        public static int peek() {
            return arr.get(0);
        }
    }
}


// Implementation of Priority Queue
import java.util.*;
public class Implement {
    public static void main(String[] args){
        

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(2);
        pq.add(1);
        pq.add(4);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}

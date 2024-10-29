import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(9);
    list.add(8);
    list.add(6);

    System.out.println(list);

    // Ascending Sorting
    Collections.sort(list);
    System.out.println(list);

    // Descending Sorting 
    Collections.sort(list , Collections.reverseOrder()); // " Collections.reverseOrder()" is a Comperator which is Function Logic
    System.out.println(list);
}
}
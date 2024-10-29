// Program to find the largest in the ArrayList
import java.util.ArrayList;
public class Max {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(6);

        int Max = Integer.MIN_VALUE;
        for(int i = 0; i<list.size(); i++){
            Max = Math.max(Max, list.get(i));
        }

        System.out.println("Maximum Number is " + Max);
    }
}

import java.util.ArrayList;

// Pair Sum 2 
// Find if any pair in a sorted & Rotated ArrayList has a target Sum
public class PairSum2 {
    public static boolean Pair(ArrayList<Integer> list , int target){
        int bp = -1;
        int n = list.size();
        for(int i =0; i<list.size();i++){
            if(list.get(i) > list.get(i+1)) // Breaking Point
            bp = i;
            break;
        }
        int lp = bp +1 ; // Smallest
        int rp = bp; // Largest

        while(lp != rp){
            // case 1
            if(list.get(rp) + list.get(lp) == target){
                return true;
            }

            // case 2
            else if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % n;
            }

            // Case 3
            // list.get(lp) + list.get(rp) > target
            else{
                rp = (n + rp -1)% n;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(Pair(list , 17));
    }
}

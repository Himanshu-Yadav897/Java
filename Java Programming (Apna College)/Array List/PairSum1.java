import java.util.ArrayList;

// Pair Sum By 2 pointer Approach
public class PairSum1 {
    public static boolean Pair(ArrayList<Integer> list , int target){
        int lp = 0; // Left Pointer
        int rp = list.size() -1; // Right Pointer
        while (lp < rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }else if( list.get(lp) + list.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(Pair(list, 15));
    }
}

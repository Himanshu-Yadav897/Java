import java.util.ArrayList;

public class PairSum2 {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();
        for(int i = 0; i <n; i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;

        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }else if(list.get(lp) + list.get(rp) > target){
                rp = (n+rp-1)%n;
            }else{
                lp = (lp+1)%n;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

       System.out.println(pairSum(list, 26)); 
    }
}

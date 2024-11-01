// Program To Solve for given n lines on X - axis, use 2 lines to form a container such that it holds maximum water.
import java.util.ArrayList;

public class StoreWater {
    public static int Water(ArrayList<Integer> height){
        int maxWater = 0;
        for(int i =0; i<height.size(); i++){
            for(int j =i+1; j<height.size();j++){
                int Height = Math.min(height.get(i), height.get(j));
                int width = j -i;
                int currwater = Height * width;
                maxWater = Math.max(maxWater, currwater);
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(Water(height));
      
    }
}

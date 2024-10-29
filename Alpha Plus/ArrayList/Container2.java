import java.util.ArrayList;

public class Container2 {
    public static int ContainerWithMostWater(ArrayList<Integer> list){
        int max = 0;
        int lp = 0;
        int rp = list.size() -1;

        while(lp < rp){
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;
            int currWater = height * width;
            max = Math.max(currWater, max);
        if(lp > rp){
            rp--;
        }else{
            lp++;
        }
    }

    return max;
    }
      public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(ContainerWithMostWater(list));
    }
}

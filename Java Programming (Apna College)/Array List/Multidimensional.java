import java.util.ArrayList;

// Program to Introduction ofMultidimensional arrayList and how to use it
public class Multidimensional {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(); 
        ArrayList<Integer> list3 = new ArrayList<>(); 

        for(int i =1; i<6; i++){
            list1.add(1*i);
            list2.add(2*i);
            list3.add(3*i);
        }
     mainList.add(list1);
     mainList.add(list2);
     mainList.add(list3);

     System.out.println(mainList);


     // Nested loop to print MainList
     for(int i =0; i<mainList.size();i++){
        ArrayList<Integer> CurrList = mainList.get(i);
        for(int j =0; j < CurrList.size(); j++){
            System.out.print(CurrList.get(j) + " ");
        }
        System.out.println();
     }

    }
}

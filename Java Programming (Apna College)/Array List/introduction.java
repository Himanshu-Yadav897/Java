// Introduction of array List and Operation of ArrayList
import java.util.ArrayList;

public class introduction {
    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>(); //  Initialization
        ArrayList<Boolean> List2 = new ArrayList<>(); //  Initialization
        ArrayList<String> List3 = new ArrayList<>(); //  Initialization

        // Add Operation
        List.add(1); // Time Complexity --> o(1)
        List.add(19);
        List.add(4);
        List.add(18);


        // Add in the middle of the program
        List.add(1,7);

        System.out.println(List);

        // Get Operation
        System.out.println(List.get(3)); // Time Compexity --> o(1)

        // Delete Operation
        List.remove(2); // Time Complexity --> o(n)
        System.out.println(List);

        // Set Operation
        List.set(2,9); // Time Complexity --> o(n)
        System.out.println(List);

        // Contain Operation
        System.out.println(List.contains(9)); // Time Complexity --> o(n)
        System.out.println(List.contains(8)); // Results are in true or false (always)


    }
}

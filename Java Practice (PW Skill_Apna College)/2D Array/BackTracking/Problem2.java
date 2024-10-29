// Subsets of a string
public class Problem2 {
    public static void find(String str, String ans, int idx){
        // Base case
        if(str.length() == idx){
            if(ans.length() != 0){
                System.out.println(ans);
            }else{
                System.out.println("null");
            }
            return;
        }
        // Yes choice
        find(str, ans+str.charAt(idx), idx+1);
        
        // No Choice
        find(str, ans, idx+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        find(str, "", 0);

    }
}

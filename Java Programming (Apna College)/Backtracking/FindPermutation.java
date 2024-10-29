// Program To Find The Permutation Of a String (n!)
public class FindPermutation {
    public static void Permutation(String str , String ans){
        // Base Case 
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // Recursion
        for(int i = 0; i< str.length(); i++){
            char curr = str.charAt(i);
            // "abcde" => "ab" + "de" = "abde";
            String NewStr = str.substring(0, i) + str.substring(i+ 1);
            Permutation(NewStr, ans + curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        Permutation(str, "");
    }
}

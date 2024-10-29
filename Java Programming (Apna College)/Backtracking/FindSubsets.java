// Program To Find The Subsets of String
public class FindSubsets {
    public static void Subsets(String str , String ans , int i ){
        // Base Case
        if( i == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        // yes choices Reursion
        Subsets(str, ans+str.charAt(i), i+1);
        // No choices Recursion
        Subsets(str, ans, i+1);
    }
    public static void main(String args[]){
      String  str = "abc";
    Subsets(str, "", 0);
    }
}

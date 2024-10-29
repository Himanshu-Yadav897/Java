// Program to find the permutation of a string 
// abc --> abc , acb, bac, bca, cab,cba   
public class Problem3 {

    public static void permutation(String str, String ans){
        // BAse CAse

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i+1);
            permutation(newStr, ans+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutation(str , "");
    }
}

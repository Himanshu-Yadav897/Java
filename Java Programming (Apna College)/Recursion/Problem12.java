// Program to Remove Duplicates in a string 
public class Problem12 {
    public static void Remove(String str , int idx, StringBuilder newStr, boolean map[]  ){
        if(currChar == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar -'a'] == true){
            Remove(str, idx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            Remove(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main (String args[]){
        String str = "appnnacollege";
        Remove(str, 0, StringBuilder (""), new boolean [26]);
        }
}

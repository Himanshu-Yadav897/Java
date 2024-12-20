// Max Length Chain of Pairs
// You rae given n p;airs of numbers. In every pair the first number is always smaller than the second
// number. A pair(c,d) can come after pair(a,b) if b<c.
// Find the longest chain which can be formed from a given set of pairs.
import java.util.*;
public class MaxLength {
    public static void main(String args[]){
        int pairs[][] = {{5,24} , {39,60} , {5,28}, {27,40} , {50,90}};

        Arrays.sort(pairs , Comparator.comparingDouble(o -> o[1]));
        int ans  = 1;
        int chainEnd = pairs[0][1];

        for(int i = 0; i< pairs.length;i++){
            if(pairs[i][0] >= chainEnd){
                ans++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println(ans);
    }
}

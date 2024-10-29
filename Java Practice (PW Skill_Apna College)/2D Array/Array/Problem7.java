// Find the square root of the given non negative value x. Round it off to the nearest floor integer value.
public class Problem7 {
    public static int Square(int target){
        int start = 0;
        int end = target;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            int value = mid *mid;
            if(value == target){
                return mid;
            } else if(value < target){
                start = mid +1;
                ans = mid;
            }else if(value > target){
                end = mid -1;
            }
        }
        return ans;

    }
    public static void main(String args[]){
        int n = 144;
        System.out.println(Square(n));
    }
}

// Check if a number is a power of tywo or not
public class PowerOfTwo {
    public static Boolean PowerOrNot(int n ){
       return (n&n-1) == 0;
    }
    public static void main(String args[]){
        System.out.println(PowerOrNot(16));
    }
}


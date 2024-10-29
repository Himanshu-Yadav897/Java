public class OddEven {
    public static void evenodd(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
    public static void main(String args[]){
        evenodd(6);
        evenodd(3);
        evenodd(12);
    }
}


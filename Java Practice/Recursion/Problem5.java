// Better Time Complexity of Math power function(self built)

public class Problem5 {
    public static int pow(int p, int q) {
        if (q == 0) {
            return 1;
        }

        int power = 1;
        power = pow(p, q / 2);
        power = power * power;

        if(q % 2 != 0){
            power = p* power;
        }

        return power;
      
    }

    public static void main(String[] args) {
        System.out.println(pow(5, 4));
        System.out.println(Math.pow(5, 4));;
    }
}

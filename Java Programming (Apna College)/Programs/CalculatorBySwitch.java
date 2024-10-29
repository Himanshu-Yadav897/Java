import java.util.*;
public class CalculatorBySwitch {
    public static void main (String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        float a = sc.nextFloat();
        System.out.println("enter b : ");
        float b = sc.nextFloat();
        System.out.println("Enter opertor  : ");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println(a + b);
                        break;
            case '-' : System.out.println(a - b);
                        break;
            case '*' : System.out.println(a * b);
                        break;
            case '/' : System.out.println(a / b);
                        break;
            case '%' : System.out.println(a % b);
                        break;
            default  : System.out.println("This is not an advanced Calculator" );


        }
    }
}

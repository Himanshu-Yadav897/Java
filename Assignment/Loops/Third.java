import java.util.*;
public class Third {
    public static void main(String args[])
    {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   System.out.println("The Multiplication of " + n );
   for(int i = 1; i <= 10; i++){
    int mul = n*i;
   System.out.println(n + "X" + i  + "=" + mul );
   }
}
}
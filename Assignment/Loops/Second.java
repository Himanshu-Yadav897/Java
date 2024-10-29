import java.util.*;
public class Second {
    public static void main(String args[])
    {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int factt = 1;
   for(int i = 1; i <= n; i++){
    factt = factt * i;
   }
System.out.println(factt);
}
}
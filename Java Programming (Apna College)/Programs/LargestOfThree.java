import java.util.*;
public class LargestOfThree {
    public static void main(String args[])
    {
   Scanner sc = new Scanner(System.in);
  int  a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  if (a >= b && a>= c){
    System.out.println("The largest of three numbers is " + a);
  }
  else if(b>=c){
    System.out.println("The largest of three number is " + b);
  }
  else{
    System.out.println("The largest of three numbers is " + c);
  }
}

}
import java.util.*;
public class First {
    public static void main(String args[])
    {
   Scanner sc = new Scanner(System.in);
   int evensum = 0;
   int oddsum = 0;
   int choice;
  do{
    System.out.println("Enter the Number: ");
    int n = sc.nextInt();
    if (n % 2==0){
        evensum = evensum + n;
    }else {
        oddsum = oddsum + n;
    }
 System.out.println("If you want to continue then press 0 and if you don't want want to continue then press 1");
  choice = sc.nextInt();

  }while( choice == 0);
 
  System.out.println("The Sum of even Number is " + evensum);
  System.out.println("The Sum of odd Number is " + oddsum);
}

}
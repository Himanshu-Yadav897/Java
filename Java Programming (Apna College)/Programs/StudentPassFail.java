import java.util.*;
public class StudentPassFail {
    public static void main(String args[])
    {
   Scanner sc = new Scanner(System.in);
  int  marks = sc.nextInt();
  String Status = (marks >= 33)? "PASS" : "FAIL";
  System.out.println(Status);
  
}

}
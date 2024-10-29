import java.util.*;
public class Third {
    public static void main(String args[])
    {
   Scanner sc = new Scanner(System.in);
  float pen  = sc.nextFloat();
  float pencil = sc.nextFloat();
  float eraser = sc.nextFloat();
  float gst =  (pen + pencil + eraser) * 0.18f;
  System.out.println("The bill is " +(pen + pencil + eraser + gst));
}

}
import java.util.Scanner;

public class zeroCounter
{
   public static void main(String[] args)
   {
      int  countZ=0, i;
      int[] arr = new int[10];
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter 10 Numbers: ");
      for(i=0; i<10; i++)
         arr[i] = scan.nextInt();
      
      for(i=0; i<10; i++)
      {
         if(arr[i]==0)
            countZ++;
      }
      System.out.println("Total Zero: " +countZ);
   }
}

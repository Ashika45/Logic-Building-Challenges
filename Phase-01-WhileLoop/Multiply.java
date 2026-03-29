// Print the multiplication table of a given number from n × 1 to n × 10. 
import java.util.Scanner;

public class Multiply
{
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the n value:");
      int n=sc.nextInt();
      int i=1;

      while(i<=10)
      {
        System.out.println(n*i+" ");
        i++;
      }
    }
}

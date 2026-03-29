//Calculate and print the sum of the first n natural numbers.
import java.util.*;

public class SumNatural
{
    public static void main(String [] args)
    {
        System.out.println("Sum of n natural numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n)
        {
            
            System.out.println(sum+i+" ");
            sum=sum+i;
            i++;
        }
    }
}
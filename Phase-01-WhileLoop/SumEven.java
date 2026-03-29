//Calculate the sum of all even numbers from 1 up to n. 
import java.util.*;

public class SumEven
{
    public static void main(String [] args)
    {
        System.out.println("sum of even numbers from 1 to n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
            
            i++;
        System.out.println(sum);
        }
    }
}
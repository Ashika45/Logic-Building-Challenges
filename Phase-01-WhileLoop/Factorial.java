//Calculate and print the factorial of a given number. 
import java.util.*;

public class Factorial
{
    public static void main(String [] args)
    {
        System.out.println("Factorial of a given number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value :");
        int n=sc.nextInt();
        int fact=1;
        while(n>=1)
        {
            fact=fact*n;
            n--;

        }
         System.out.println(fact);
    }
}
// Find and print the product of all digits of a given number. 
import java.util.*;

public class Product
{
    public static void main(String[]args)
    {
        System.out.println("print the product of all digits of a given number. ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        int prod=1;
        while(n!=0)
        {
           int temp=n%10;
           prod=prod*temp;
           n=n/10;
        }
        System.out.println(prod);
    }
}
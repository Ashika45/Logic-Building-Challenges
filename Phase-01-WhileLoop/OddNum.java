//Print all odd numbers between 1 and 100.

public class OddNum
{
    public static void main(String [] args)
    {
        System.out.println("Printing odd numbers from 01 to 100");
        int i=1;
        while(i<=100)
        {
            if(i%2!=0)
            System.out.println(i);
            i++;
        }
    }
}
//Print all even numbers between 1 and 100. 

public class EvenNum
{
    public static void main(String [] args)
    {
        System.out.println("Printing even numbers between 1 to 100");
        int i=1;
        while(i<=100)
        {
            if(i%2==0)
            System.out.println(i);
            i++;
        }
    }
}
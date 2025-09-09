//number divisible by 7 and 5
import java.util.*;
import java.lang.*;
public class Number_Not_Divisible_by_Seven
{
    public static void main(String args[])
    {
        int No;
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter number:");
        No = Sc.nextInt();

        if(No == 0)
        {
            System.out.print("Error:(As mathematically divisible zero any integer give infinite result)");
        }
        else if(No % 7 == 0 ||  No % 5 == 0)
        {
            System.out.print(+No +" is divisible by 7 and 5" );
        }
        else if(No % 7 == 0)
        {
            System.out.print( +No +" is  divisible by 7");
        }
        else if(No % 5 == 0)
        {
            System.out.print(+No +" is  divisible by 5");
        }
        Sc.close();
    }
}
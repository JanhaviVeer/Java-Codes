//print table using while loop
import java.util.*;
import java.lang.*;
public class Table_using_while
{
    public static void main(String [] args)
    {
        int No = 0 , i = 0;
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter number:");
        No = Sc.nextInt();
       
        System.out.print("\n Table of " +No +" is:\n");
         i = 1;

        while (i <= 10)
        {
            System.out.println(i + " x " + No + " = " + (i * No));
            i++;
        }
        System.out.print("\n----------------");

        Sc.close();
    }

    
}
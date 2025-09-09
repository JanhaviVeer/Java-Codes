//print table using for loop
import java.util.*;
import java.lang.*;
public class Table_Using_For
{
    public static void main(String [] args)
    {
        int No = 0;
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter Number:");
        No = Sc.nextInt();

        for(int i = 1; i <= 10; i++)
        {
             System.out.println(i + " x " + No + " = " + (i * No));
        }
        Sc.close();
    }
}
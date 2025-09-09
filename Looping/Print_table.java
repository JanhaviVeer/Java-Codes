//print table using while loop
import java.util.*;
import java.lang.*;
public class Print_table 
{
    public static void main(String args[])
    {
        int No = 0,i = 0;
        Scanner Sc = new Scanner(System.in);
        No = Sc.nextInt();

        while(i >= 10)
        {
            System.out.print(i * No);
            No ++;
        }
        System.out.print("Thanks");
        Sc.close();
    }
    
}

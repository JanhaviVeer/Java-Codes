//factorial of number
import java.util.*;
import java.lang.*;
public class factorial
{
    public static void main(String args [])
    {
        int No = 0 ,Fact = 0 ,Temp = 0;
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter number:");
        No = Sc.nextInt();

        if(No <= 0)
        {
            System.out.print("\n Invalid input");
            return;
        }

        for(Temp = No; Fact = 1; Temp > 0 ; No--)
        {
            Fact = Fact * Temp;
        }
        System.out.print("\n factorial of" +No  +"is" +Fact +" .");
    }
}
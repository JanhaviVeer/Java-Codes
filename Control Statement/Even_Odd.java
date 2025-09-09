//Even odd
import java.util.*;
import java.lang.*;
public class Even_Odd
{
    public static void main(String args[])
    {
        int No;
        Scanner Sc = new Scanner(System.in);
         
        System.out.println("Enter number:");
        No = Sc.nextInt();

        if(No == 0)
        {
            System.out.println("Given number" +No +"is neutral");
        }
        else if(No % 2 == 0)
        {
            System.out.println("Given number" +No  +"is Even");
        }
        else{
            System.out.println("Given number" +No +"is Odd");
        }
        Sc.close();
    }
}
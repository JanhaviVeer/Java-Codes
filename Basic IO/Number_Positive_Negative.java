// wap number is positive or Negative
import java.util.*;
import java.lang.*;
public class Number_Positive_Negative
{
    public static void main(String args[])
    {
        int No;
        Scanner Sc = new Scanner(System.in);

        System.out.print("ENter Number:");
        No = Sc.nextInt();

        if(No  == 0){
            System.out.print("Number is Neutral");
        }
        else if(No > 0)
        {
            System.out.println(+No  +"is Positive");
        }
        else
        {
            System.out.println(+No  +"Is Negative");
        }
        Sc.close();
    }
}
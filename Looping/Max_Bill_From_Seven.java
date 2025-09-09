
//calculate sMax bill
import java.lang.*;
import java.util.*;
public class Max_Bill_From_Seven
{
    public static void main(String [] args)
    {
        int Amount = '\0',Cnt ='\0',Max_Bill = '\0';
        Scanner Sc = new Scanner(System.in);
   
        for (Cnt= 1; Cnt <= 7; Cnt++) {
            System.out.print("Enter " + Cnt + "Bill: ");
            Amount = Sc.nextInt();

            if(Amount > Max_Bill)
            {
                Max_bill = Amount;
            }
        }
        System.out.println("Enter number:"+Max_Bill);
    }
}
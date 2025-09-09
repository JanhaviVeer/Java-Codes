//number divisible by 7
import java.util.*;
import java.lang.*;
public class Number_Divisible_by_Seven
{
    public static void main(String args[])
    {
        int No;
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter number:");
        No = Sc.nextInt();

        if(No == 0){
            System.out.print("Error:(As mathematically divisible zero any integer give infin result)");
        }
        else if(No % 7 == 0){
            System.out.print("Number is divisible by 7");
        }
        else{
            System.out.print("Number is not divisible by 7");
        }
    }
}
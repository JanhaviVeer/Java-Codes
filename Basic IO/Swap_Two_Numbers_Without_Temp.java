//Swap 2 number without third variable
import java.lang.*;
import java.util.*;
public class Swap_Two_Numbers_Without_Temp
{
    public static void main(String args[])
    {
        int No1 =80,No2 = 50;
        System.out.println("Before swapping 2 number" + " "  + No1 + " " + "and" + " "  + No2);
        
        No1 = No1 + No2;
        No2 = No1 - No2;
        No1 = No1 - No2;

        System.out.println("After swapping 2 number" +" " +No1  + " " + "and"  + " " +No2);
        System.out.println("thankyou");
    }
}